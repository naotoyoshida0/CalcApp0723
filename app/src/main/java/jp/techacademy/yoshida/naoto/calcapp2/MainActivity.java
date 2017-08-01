package jp.techacademy.yoshida.naoto.calcapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity  extends AppCompatActivity implements View.OnClickListener  {

    EditText EditText1;
    EditText EditText2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText1 = (EditText) findViewById(R.id.editText1);  //findviewidはoncreate後じゃないと動作しない
        EditText2 = (EditText) findViewById(R.id.editText2);


        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);





    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, secondActivity.class);            //遷移先を指定
        Double total = 0.0;
        String str1 = EditText1.getText().toString();
        String str2 = EditText2.getText().toString();

        if (str1.equals("")){
            Toast.makeText(this, "数字が未入力です", Toast.LENGTH_SHORT).show();
            return;
        }
        if (str2.equals("")){
            Toast.makeText(this, "数字が未入力です", Toast.LENGTH_SHORT).show();
            return;
        }

        Double num1 = Double.parseDouble(str1); // EditText1の入力を小数値に変換
        Double num2 = Double.parseDouble(str2); // EditText2の入力を小数値に変換
        if (v.getId() ==R.id.button1) {                                  //button1を押した時num1+num2をtotalに代入
            total = num1 + num2;
        }
        else if (v.getId() ==R.id.button2) {
            total = num1 - num2;
        }
        else if (v.getId() ==R.id.button3) {
            total = num1 / num2;
        }
        else if (v.getId() ==R.id.button4) {
            total = num1 * num2;
        }

        intent.putExtra("TOTAL", total);                           //TOTALを遷移
        startActivity(intent);                                            //開始

    }
}

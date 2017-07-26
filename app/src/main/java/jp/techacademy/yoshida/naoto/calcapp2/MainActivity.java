package jp.techacademy.yoshida.naoto.calcapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static jp.techacademy.yoshida.naoto.calcapp2.R.id.textView;

public class MainActivity  extends AppCompatActivity implements View.OnClickListener  {

    EditText mEditText1;
    EditText mEditText2;
    TextView mTextView;



    EditText editText1 = (EditText) findViewById(R.id.editText1);
    EditText editText2 = (EditText) findViewById(R.id.editText2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
    public void onClick(View v) {                                                             //ボタン１を押した時editText1.2の数値を足して、遷移画面でTOTAL表示
        Intent intent = new Intent(this, secondActivity.class);                                        //遷移先を指定
        Double total = 0.0;
        Double num1 = Double.parseDouble(mEditText1.getText().toString()); // EditText1の入力を小数値に変換
        Double num2 = Double.parseDouble(mEditText2.getText().toString()); // EditText2の入力を小数値に変換
        if (v.getId() ==R.id.button1) {
            total = num1 + num2;
        }
        intent.getDoubleExtra("TOTAL", total);
        startActivity(intent);
    }
}

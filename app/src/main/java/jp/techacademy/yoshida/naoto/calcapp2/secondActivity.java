package jp.techacademy.yoshida.naoto.calcapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent =getIntent();                            //インテントのオブジェクト取得
        int value1 = intent.getIntExtra("VALUE1", 0);        //値が存在しない時の初期値
        int value2 = intent.getIntExtra("VALUE2", 0);



            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(String.valueOf(value1 + value2));
        }
    }

package jp.techacademy.yoshida.naoto.calcapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static jp.techacademy.yoshida.naoto.calcapp2.R.id.textView;


public class secondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent =getIntent();                            //インテントのオブジェクト取得
        Double TOTAL = intent.getDoubleExtra("TOTAL", 0.0);       //遷移データをTOTALという値かつ初期値０で取得
        TextView textview = (TextView) findViewById(R.id.textView);
        textview.setText(String.valueOf(TOTAL));

        }
    }

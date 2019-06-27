package com.shinhoandroid.mvp.test0626;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.gavin.apt_library.BindViewTools;
import com.shinhoandroid.mvp.annotion.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BindViewTools.bind(this);

        tv.setText("ViewBind");

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                MainActivity.this.startActivity(intent);


            }
        });
    }
}

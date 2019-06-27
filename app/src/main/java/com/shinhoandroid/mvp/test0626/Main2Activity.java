package com.shinhoandroid.mvp.test0626;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.gavin.apt_library.BindViewTools;
import com.shinhoandroid.mvp.annotion.BindView;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        BindViewTools.bind(this);
        tv.setText("我是Main2Activity");
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main2Activity.this.finish();
            }
        });
    }
}

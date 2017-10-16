package com.example.unitec.calendar_htquyen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity implements OnClickListener {
    private Button btn_calender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
    }



    public void getWidget(){
        btn_calender = (Button) findViewById(R.id.btn_calender);
        btn_calender.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.btn_calender:
                startActivity(new Intent(MainActivity.this,CalenderActivity.class));
                break;

            default:
                break;
        }

    }

}
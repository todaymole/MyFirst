package com.example.helloworld;

import static java.lang.Thread.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import android.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //停留三秒

        new  Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    Thread.sleep(1000);

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {

                        }
                    });


                    Thread.sleep(1000);
                    Thread.sleep(1000);
                    Intent it=new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(it);
                    finish();



                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }


}
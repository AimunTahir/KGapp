package com.school.kgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Context ctx=MainActivity.this;
    Button btnsent,btnpic,btnwrd,btnmatch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsent=findViewById(R.id.btnsent);
        btnpic=findViewById(R.id.btnpic);
        btnwrd=findViewById(R.id.btnwrd);
        btnmatch=findViewById(R.id.btnmatch);

        btnsent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ctx, SentActivity.class));
            }
        });

        btnpic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ctx,PicActivity.class));
            }
        });

        btnwrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ctx,WrdActivity.class));
            }
        });

        btnmatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ctx,MatchActivity.class));
            }
        });
    }





}
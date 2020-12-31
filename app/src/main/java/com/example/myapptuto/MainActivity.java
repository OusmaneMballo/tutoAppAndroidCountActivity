package com.example.myapptuto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageButton mballoS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mballoS=findViewById(R.id.btn_home);
        mballoS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent countActivity=new Intent(getApplicationContext(), Counte.class);
                startActivity(countActivity);
                finish();
            }
        });
    }
}
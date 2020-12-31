package com.example.myapptuto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Counte extends AppCompatActivity {
    private ImageButton click;
    private TextView txt_nbr;
    private int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counte);
        this.click=findViewById(R.id.btn_click);
        this.txt_nbr=findViewById(R.id.nbr);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                txt_nbr.setText("Nombre de click: "+i);
            }
        });
    }
}
package com.m79196.pdmaula2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    Intent intent = getIntent();
    String valor = intent.getStringExtra("farenheit");

    public void setValor(String valor) {
        this.valor = valor;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void voltaCelsius(View view) {
        Intent intent  = new Intent(Main3Activity.this,
                Main2Activity.class);
        startActivity(intent);
    }
}

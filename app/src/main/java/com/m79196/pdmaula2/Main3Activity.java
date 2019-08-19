package com.m79196.pdmaula2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    final String TAG = "mensagem";
    private TextView texto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle extra = getIntent().getExtras();
        String  texto = extra.getString("fa");
        Toast.makeText(this,texto, Toast.LENGTH_SHORT).show();
        texto1 = (TextView) findViewById(R.id.texto);
        texto1.setText(String.valueOf(texto));

        //A activity está sendo criada
        Log.d(TAG, "onCreate");

    }
    public void voltaCelsius(View view) {
        Intent intent  = new Intent(Main3Activity.this,
                Main2Activity.class);
        startActivity(intent);
    }
}

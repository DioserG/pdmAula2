package com.m79196.pdmaula2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


    final String TAG = "CICLO";
    private EditText tempC;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tempC = findViewById(R.id.txtTempC);
        //A activity está sendo criada
        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        //A activity está prestes a se tornar visível
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        //A activity está visivel
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
        //A activity está voltando a receber o foco, depois de estar pausada.
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        //Outra activity está recebendo o foco. Esta activity ficará pausada
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        //A activity não está mais visivel mas permanece em memória
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        //A activity está prestes a ser destruída (removida da memoria).
    }

    public void calClick(View view) {
        String s = tempC.getText().toString();
        Toast.makeText(this,s, Toast.LENGTH_SHORT).show();
    }
}

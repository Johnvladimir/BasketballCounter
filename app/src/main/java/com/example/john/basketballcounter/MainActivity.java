package com.example.john.basketballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Suma1;
    private TextView Suma2;
    private int puntos;
    private int puntos2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        puntos = 0;
        puntos2 =0;

        Suma1 = findViewById(R.id.conta1);
        Suma2 = findViewById(R.id.conta2);

    }

    public void butt1(View v){
        puntos = puntos+1;
        Log.d("Mensaje","Suma de un punto");

        Suma1.setText(puntos+"");

    }

    public void butt2(View v){
        puntos = puntos+2;
        Log.d("Mensaje","Suma de dos punto");
        Suma1.setText((puntos)+"");

    }

    public void butt3(View v){
        puntos = puntos+3;
        Log.d("Mensaje","Suma de tres punto");
        Suma1.setText((puntos)+"");

    }


    public void res(View v){
        Log.d("Mensaje","Se presiono el boton reset");
        Suma1.setText(0+"");
        puntos = 0;

        Suma2.setText(0+"");
        puntos2 = 0;
    }

    public void butt4(View v){
        puntos2 = puntos2+1;
        Log.d("Mensaje","Suma de un punto");

        Suma2.setText(puntos2+"");

    }

    public void butt5(View v){
        puntos2 = puntos2+2;
        Log.d("Mensaje","Suma de un punto");

        Suma2.setText(puntos2+"");

    }

    public void butt6(View v){
        puntos2 = puntos2+3;
        Log.d("Mensaje","Suma de un punto");

        Suma2.setText(puntos2+"");

    }

}

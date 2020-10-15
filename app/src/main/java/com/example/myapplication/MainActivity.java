package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText val1, val2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val1 = (EditText) findViewById(R.id.val1txt);
        val2 = (EditText) findViewById(R.id.val2txt);
    }

    public void suma(View view)
    {
        float res = 0;
        DecimalFormat format = new DecimalFormat("0.#####");
        String val1s = val1.getText().toString();
        String val2s = val2.getText().toString();
        if(val1s.isEmpty()||val2s.isEmpty()){
            if(val1s.isEmpty())
                val1.setError("Valor no ingresado");
            if(val2s.isEmpty())
                val2.setError("Valor no ingresado");
        }
        else
        {
            float val1i = Float.valueOf(val1s);
            float val2i = Float.valueOf(val2s);
            res = val1i + val2i;
            Toast.makeText(this,"La suma da: "+ format.format((res)),Toast.LENGTH_LONG).show();
        }
    }

    public void resta (View view)
    {
        float res = 0;
        DecimalFormat format = new DecimalFormat("0.#####");
        String val1s = val1.getText().toString();
        String val2s = val2.getText().toString();
        if(val1s.isEmpty()||val2s.isEmpty()){
            if(val1s.isEmpty())
                val1.setError("Valor no ingresado");
            if(val2s.isEmpty())
                val2.setError("Valor no ingresado");
        }
        else
        {
            float val1i = Float.valueOf(val1s);
            float val2i = Float.valueOf(val2s);
            res = val1i - val2i;
            Toast.makeText(this,"La resta da: "+ format.format((res)),Toast.LENGTH_LONG).show();
        }
    }

    public void multiplicacion (View view)
    {
        float res = 0;
        DecimalFormat format = new DecimalFormat("0.#####");
        String val1s = val1.getText().toString();
        String val2s = val2.getText().toString();
        if(val1s.isEmpty()||val2s.isEmpty()){
            if(val1s.isEmpty())
                val1.setError("Valor no ingresado");
            if(val2s.isEmpty())
                val2.setError("Valor no ingresado");
        }
        else
        {
            float val1i = Float.valueOf(val1s);
            float val2i = Float.valueOf(val2s);
            res = val1i * val2i;
            Toast.makeText(this,"La multiplicación da: "+ format.format((res)),Toast.LENGTH_LONG).show();
        }
    }

    public void division (View view)
    {
        float res = 0;
        DecimalFormat format = new DecimalFormat("0.#####");
        String val1s = val1.getText().toString();
        String val2s = val2.getText().toString();
        if(val1s.isEmpty()||val2s.isEmpty()){
            if(val1s.isEmpty())
                val1.setError("Valor no ingresado");
            if(val2s.isEmpty())
                val2.setError("Valor no ingresado");
        }
        else
        {
            float val1i = Float.valueOf(val1s);
            float val2i = Float.valueOf(val2s);
            res = val1i / val2i;
            Toast.makeText(this,"La división da: "+ format.format((res)),Toast.LENGTH_LONG).show();
            //String.format("%.2f", res)
        }
    }

    public void limpiar (View view)
    {
        val1.setText("");
        val2.setText("");
        Toast.makeText(this,"Se ha limpiado la pantalla",Toast.LENGTH_LONG).show();
    }
}
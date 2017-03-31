package com.example.cecyt9.examen1_martinez_casillas_diegoalberto_6im8;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
EditText cantidad;
    Double dato;
    Double resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cantidad = (EditText) findViewById(R.id.pesos1);
    }

    public void Convertir(View v)
    {
        Intent intento = new Intent(this, Actividad2.class);
        Bundle envia = new Bundle();

        resultado = Double.parseDouble(cantidad.getText().toString());
        dato = resultado/15;

        envia.putDouble("convertido",dato);

        intento.putExtras(envia);

        startActivity(intento);





    }
}

package com.example.cecyt9.examen1_martinez_casillas_diegoalberto_6im8;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad2 extends Activity {
TextView vista;
    Double texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);


        vista = (TextView)findViewById(R.id.enviar);

        Bundle recupera = new Bundle();

        recupera.getDouble("convertido");

            texto = Double.parseDouble(vista.getText().toString());
        vista.setText("Martinez Casillas Diegoa Alberto, "+ texto);

    }

        public void Enviar(View v)
        {
            String envio = vista.getText().toString();
            Intent correos = new Intent(Intent.ACTION_SEND);
            correos.setType("text/plain");
            correos.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Examen primer parcial");
            correos.putExtra(Intent.EXTRA_TEXT, envio);
            correos.putExtra(Intent.EXTRA_EMAIL, new String[] { "eoropezag@ipn.mx"} );
            startActivity(correos);
        }



}

package com.prueba.activities_jro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DatosConfirmacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datos_confirmacion);

        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString(getResources().getString(R.string.pnombre));
        String telefono = parametros.getString(getResources().getString(R.string.ptelefono));
        String email = parametros.getString(getResources().getString(R.string.pemail));
        String descripcion = parametros.getString(getResources().getString(R.string.pdescripcion));
        String dia = parametros.getString(getResources().getString(R.string.pdia));
        String mes = parametros.getString(getResources().getString(R.string.pmes));
        String anio = parametros.getString(getResources().getString(R.string.panio));

        TextView tvNombre = (TextView) findViewById(R.id.tvNombre);
        TextView tvTelefono = (TextView) findViewById(R.id.tvTelefono);
        TextView tvEmail = (TextView) findViewById(R.id.tvEmail);
        TextView tvDescripcion  = (TextView) findViewById(R.id.tvDescripcion);
        TextView tvFecha = (TextView) findViewById(R.id.tvFecha);

        tvNombre.setText(nombre);
        tvTelefono.setText("Tel : "+telefono);
        tvEmail.setText("Fecha Nacimiento : "+dia+"/"+mes+"/"+anio);
        tvDescripcion.setText("Email : "+email);
        tvFecha.setText("Descripcion : "+descripcion);

        Button editar = (Button)findViewById(R.id.bteditar);

        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}

package com.prueba.activities_jro;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class FormularioRegistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario_registro);
        Button btsiguiente = (Button)findViewById(R.id.btSiguiente);
        btsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextInputLayout tvNombre = (TextInputLayout) findViewById(R.id.tiNombre);
                String nombre = tvNombre.getEditText().getText().toString();
                DatePicker dpFecha = (DatePicker) findViewById(R.id.dpFecha);
                TextInputLayout tvTelefono = (TextInputLayout) findViewById(R.id.tiTelefono);
                String telefono = tvTelefono.getEditText().getText().toString();
                TextInputLayout tvEmail = (TextInputLayout) findViewById(R.id.tiEmail);
                String email = tvEmail.getEditText().getText().toString();
                TextInputLayout tvDescripcion = (TextInputLayout) findViewById(R.id.tiDescripcion);
                String descripcion = tvDescripcion.getEditText().getText().toString();

                Intent i = new Intent(FormularioRegistro.this, DatosConfirmacion.class);
                i.putExtra(getResources().getString(R.string.pnombre),nombre);
                i.putExtra(getResources().getString(R.string.ptelefono),telefono);
                i.putExtra(getResources().getString(R.string.pemail),email);
                i.putExtra(getResources().getString(R.string.pdescripcion),descripcion);
                i.putExtra(getResources().getString(R.string.pdia),dpFecha.getDayOfMonth());
                i.putExtra(getResources().getString(R.string.pmes),dpFecha.getMonth());
                i.putExtra(getResources().getString(R.string.panio),dpFecha.getYear());
                startActivity(i);
            }
        });
    }

    public void siguiente(){

    }
}

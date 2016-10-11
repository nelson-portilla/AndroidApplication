package com.taller2.nelson.taller2;

import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class CrearMensajeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_mensaje);
    }
    public void buttonOnClick(View v){
        Button miboton = (Button) v;
        ((Button) v).setText("Se ha traducido :)");
        TextView lbtitulo = (TextView) findViewById(R.id.lbtitulo);
        ((TextView) lbtitulo).setText("Hola Mundo!");
    }

    public void buttonOnSendMessage(View v){
        EditText entrada = (EditText) findViewById(R.id.entradatexto);
        String texto = entrada.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        //Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra(intent.EXTRA_TEXT, texto);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Compartir Texto con...") );
    }

    public void buttonOnLlamar(View v){
        EditText entrada = (EditText) findViewById(R.id.entradatexto);
        String texto = entrada.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        //Intent intent = new Intent(this, ReceiveMessageActivity.class);
        //intent.putExtra(intent.EXTRA_TEXT, texto);
        intent.setData(Uri.parse("tel:"+texto));
        //intent.setType("text/plain");
        startActivity(intent);
    }

    public void buttonOnSalir(View v){
        System.exit(0);
    }

}

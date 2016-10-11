package com.taller2.nelson.taller2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReceiveMessageActivity extends Activity {

    public static final String EXTRA_MESSAGE = "mensaje";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent();
        String msg = intent.getStringExtra(EXTRA_MESSAGE);
        TextView lbrecibido = (TextView)findViewById(R.id.lbrecibido);
        lbrecibido.setText(msg);
    }



}

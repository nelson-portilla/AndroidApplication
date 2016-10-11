package com.example.nelsonaph.helloworld;

import android.app.Activity;
import android.os.*;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


import java.util.logging.LogRecord;


public class StopWatchExample extends Activity {
    private int seconds=0;
    private boolean running = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch_example);
        runTimer();
    }

    private void runTimer(){
        final TextView timer = (TextView) findViewById(R.id.time_view);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int horas= seconds/3600;
                int minutes=(seconds%3600)/60;
                int secs=seconds%60;
                String time= String.format("%d:%02d:%02d", horas, minutes, secs);
                timer.setText(time);
                if(running){
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });
    }

    public void OnClickStart(View v){
        running=true;
    }
    public void OnClickStop(View v){
        running=false;
    }
    public void OnClickRestart(View v){
        running=false;
        seconds=0;
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.stop_watch_example, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

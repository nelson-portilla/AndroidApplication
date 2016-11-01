package com.example.nelsonaph.listview;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKNo = "drinkNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        int drinkNo=(Integer)getIntent().getExtras().get(EXTRA_DRINKNo);
        Drink drink = Drink.drinks[drinkNo];
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceID());
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(drink.getName());
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(drink.getDescription());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drink, menu);
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

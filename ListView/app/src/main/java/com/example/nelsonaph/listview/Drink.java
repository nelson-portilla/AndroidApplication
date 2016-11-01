package com.example.nelsonaph.listview;

/**
 * Created by nelsonaph on 1/11/16.
 */
public class Drink {
    private String name;
    private String description;
    private int imageResourceID;

    public Drink(String name, String desc, int image) {
        this.name=name;
        this.description=desc;
        this.imageResourceID=image;
    }

    public static final Drink [] drinks = {
            new Drink("Late", "A couple of espresso shots with steamed milk", R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getImageResourceID(){
        return imageResourceID;
    }
    public String toString(){
        return this.name;
    }



}

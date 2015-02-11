package com.bartinder.bartinder;

import java.util.*;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout touch = (RelativeLayout) findViewById(R.id.touch);
        final TextView drinkText = (TextView) findViewById(R.id.drink);
        final TextView recipeText = (TextView) findViewById(R.id.recipe);

        final ArrayList<Drink> drinkList = new ArrayList<Drink>();

        // Initializes drinks here
        Drink drink1 = new Drink("Alabama Slammer",
                "1/2 ounce vodka\n" +
                        "1/2 ounce Southern Comfort\n" +
                        "1/2 ounce amaretto\n" +
                        "Orange juice");
        drinkList.add(drink1);

        Drink drink2 = new Drink("Anejo Highball",
                "1 1/2 Anejo rum\n" +
                        "1/2 ounce orange curaco\n" +
                        "1/2 ounce lime juice\n" +
                        "2 dashes of Angostura bitters\n" +
                        "2 ounces ginger beer\n" +
                        "Lime wheel for garnish\n" +
                        "Orange slice for garnish");
        drinkList.add(drink2);

        Drink drink3 = new Drink("Bay Breeze",
                "2 ounces vodka\n" +
                        "Cranberry juice\n" +
                        "Pineapple juice\n" +
                        "Lime wedge for garnish");
        drinkList.add(drink3);

        Drink drink4 = new Drink("Black & Tan",
                "8 ounces Guinness Stout beer\n" +
                        "8 ounces pale ale beer");
        drinkList.add(drink4);

        Drink drink5 = new Drink("Bloody Mary",
                "3 ounces tomato juice\n" +
                        "1 1/2 ounces vodka\n" +
                        "1/2 ounce lemon juice\n" +
                        "1 dash of Worcester sauce\n" +
                        "Celery salt\n" +
                        "Ground pepper\n" +
                        "Hot pepper sauce to taste\n" +
                        "Horseradish to taste (optional)\n" +
                        "Celery stalk and/or pickle spear for garnish\n" +
                        "Lemon and/or lime wedge for garnish");
        drinkList.add(drink5);


        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // gets a random drink from drinkList
                Random rand = new Random();
                int randomNumber = rand.nextInt((5));
                Drink q = drinkList.get(randomNumber);
                drinkText.setText(q.getDrink());
                recipeText.setText(q.getRecipe());
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

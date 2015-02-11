package com.bartinder.bartinder;

// Contains the drinks name and recipe
public class Drink {
    public String drink;
    public String recipe;


    public Drink(String drink, String recipe){
        super();

        this.drink = drink;
        this.recipe = recipe;

    }

    public String getDrink() {
        return drink;
    }

    public String getRecipe() {
        return recipe;
    }
}

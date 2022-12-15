package com.example.myapplication.model;

import java.util.ArrayList;
import java.util.List;

public class ItemsData implements ItemData{

    private List<FoodItem> item;

    public ItemsData(){
        item = new ArrayList<>();
        item.add(new FoodItem("Classic Burger","Burgers",30));
        item.add(new FoodItem("Cheese Burger","Burgers",30));
        item.add(new FoodItem("Double Burger","Burgers",30));
        item.add(new FoodItem("Mushrom Burger","Burgers",30));
        item.add(new FoodItem("Chiken Burger","Burgers",30));
        item.add(new FoodItem("BBQ Burger","Burgers",30));
        item.add(new FoodItem("Crispy Burger","Burgers",30));

    }

    @Override
    public List<String> getCategories() {
        List<String> cat = new ArrayList<>();
        cat.add("Burgare");
        cat.add("Drink");
        cat.add("Hot Drink");
        return  cat;
    }

    @Override
    public List<FoodItem> getItems(String cat) {
        List<FoodItem> result = new ArrayList<>();
        for (FoodItem it : item) {
            if(it.getCat().equals(cat)){
                result.add(it);
            }
        }
        return  result;
    }
}

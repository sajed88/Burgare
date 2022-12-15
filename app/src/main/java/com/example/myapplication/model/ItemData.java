package com.example.myapplication.model;

import java.util.List;

public interface ItemData {
    List<String> getCategories();
    List<FoodItem> getItems(String cat);

}

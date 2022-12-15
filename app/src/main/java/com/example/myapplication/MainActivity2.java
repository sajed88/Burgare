package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.myapplication.model.FoodItem;
import com.example.myapplication.model.ItemData;
import com.example.myapplication.model.ItemsData;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private Spinner sp;
    private Button btn;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sp = findViewById(R.id.sp);
        btn = findViewById(R.id.button);
        listView = findViewById(R.id.listV);

        ItemData data = new ItemsData() ;
        List<String> cats = data.getCategories();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,cats);
        sp.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = sp.getSelectedItem().toString();
                List<FoodItem> res = data.getItems(str);
                ArrayAdapter<FoodItem> adapterItems = new ArrayAdapter<FoodItem>(MainActivity2.this,
                        android.R.layout.simple_list_item_1,res);
            }
        });
    }
}
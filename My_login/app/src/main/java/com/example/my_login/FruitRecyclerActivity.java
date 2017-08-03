package com.example.my_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FruitRecyclerActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_recycler);

        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapterRecycler adapter = new FruitAdapterRecycler(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0;i < 2;i++){
            Fruit apple = new Fruit("Apple",R.drawable.apple);
            fruitList.add(apple);

            Fruit Banana = new Fruit("Banana",R.drawable.banana);
            fruitList.add(Banana);

            Fruit Orange = new Fruit("Orange",R.drawable.orange);
            fruitList.add(Orange);

            Fruit Watermelon = new Fruit("Watermelon",R.drawable.watermelon);
            fruitList.add(Watermelon);

            Fruit Pear = new Fruit("Pear",R.drawable.pear);
            fruitList.add(Pear);

            Fruit Grape = new Fruit("Grape",R.drawable.grape);
            fruitList.add(Grape);

            Fruit Pineapple = new Fruit("Pineapple",R.drawable.pineapple);
            fruitList.add(Pineapple);

            Fruit Strawberry = new Fruit("Strawberry",R.drawable.strawberry);
            fruitList.add(Strawberry);

            Fruit Cherry = new Fruit("Cherry",R.drawable.cherry);
            fruitList.add(Cherry);

            Fruit Mango = new Fruit("Mango",R.drawable.mango);
            fruitList.add(Mango);
        }
    }
}

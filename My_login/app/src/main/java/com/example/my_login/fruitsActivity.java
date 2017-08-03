package com.example.my_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class fruitsActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

//    private String[] data = {"Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango",
//            "Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        initFruits();
        FruitAdapter adapter= new FruitAdapter(fruitsActivity.this,R.layout.activity_fruits,fruitList);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(fruitsActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        //点击listView中每个子项
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Fruit fruit = fruitList.get(position);
                Toast.makeText(fruitsActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
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

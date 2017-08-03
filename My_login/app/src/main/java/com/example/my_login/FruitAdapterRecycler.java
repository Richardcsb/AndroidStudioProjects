package com.example.my_login;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by cs on 17-8-2.
 */

public class FruitAdapterRecycler extends RecyclerView.Adapter<FruitAdapterRecycler.ViewHolder>{

    private List<Fruit> mFruitList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
        public ViewHolder(View view){
            super(view);
            fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
            fruitName = (TextView) view.findViewById(R.id.fruit_name);
        }
    }
    public FruitAdapterRecycler(List<Fruit> fruitList){
        mFruitList = fruitList;
    }
   @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_fruits,parent,false);
       ViewHolder holder = new ViewHolder(view);
       return holder;
   }
   @Override
    public void onBindViewHolder(ViewHolder holder,int position){
       Fruit fruit = mFruitList.get(position);
       holder.fruitImage.setImageResource(fruit.getImageId());
       holder.fruitName.setText(fruit.getName());
   }
   @Override
    public int getItemCount(){
       return mFruitList.size();
   }
}

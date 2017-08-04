package com.example.databasetest;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MyDatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new MyDatabaseHelper(this,"BookStore.db",null,2);
    }

    public void createOnClick(View view) {
        dbHelper.getWritableDatabase();
    }

    public void adddataOnClick(View view) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        //开始组装第一条数据
        values.put("name","The Da vinci Code");
        values.put("author","Dan Brown");
        values.put("pages",454);
        values.put("price",16.96)   ;
        db.insert("Book",null,values);//插入第一条数据
        values.clear();
        //开始组装第二条数据
        values.put("name","The Lost Symbol");
        values.put("author","Dan Brown");
        values.put("pages",510);
        values.put("price",19.95);
        db.insert("Book",null,values);//插入第二条数据
    }

    public void updataOnClick(View view) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("price",10.99);
        db.update("Book",values,"name = ?",new String[]{
                "The Da Vinci Code"
        });

    }

    public void deletedataOnClick(View view) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        db.delete("Book","pages > ?",new String[]{"500"});
    }

    public void querydataOnClick(View view) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        //查询Book表中所有的数据
        Cursor cursor = db.query("Book",null,null,null,null,null,null);
        if(cursor.moveToFirst()){
            do{
                //遍历Cursor对象,取出数据并打印
                String name = cursor.getString(cursor.getColumnIndex("name"));
                String author = cursor.getString(cursor.getColumnIndex("author"));
                int pages = cursor.getInt(cursor.getColumnIndex("pages"));
                double price = cursor .getDouble(cursor.getColumnIndex("price"));
                Log.d("MainActivity","book name is "+name);
                Log.d("MainActivity","book author is "+author);
                Log.d("MainActivity","book pages is "+pages);
                Log.d("MainActivity","book price is "+price);
            }while(cursor.moveToNext());
        }
        cursor.close();
    }
}

package com.example.sihproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TypeFarmer extends AppCompatActivity {

    private RecyclerView r1;
    private FruitAdapter fruitAdapter;
    private ArrayList<Fruits> fruits;
    CardView c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_farmer);
        c1 = findViewById(R.id.card_view);
        initComponents();
        fruits = prepareData();
        fruitAdapter = new FruitAdapter(fruits,TypeFarmer.this);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(TypeFarmer.this);
        r1.setLayoutManager(linearLayoutManager);
        r1.setAdapter(fruitAdapter);
    }
    public void initComponents(){
        r1 = findViewById(R.id.rvFarmer);
    }
    public ArrayList<Fruits> prepareData(){
        ArrayList<Fruits> fruits =new ArrayList<Fruits>();
        Fruits fru = new Fruits();
        fru.id=1;
        fru.name1 = "VEGETABLES";
        fru.vegetables12 = new ArrayList<Vegetables>();
        Vegetables vegis1 = new Vegetables();
        vegis1.id = 1;
        vegis1.name = "Tomato";
        vegis1.imageUrl = R.drawable.tomato;

        Vegetables vegis2 = new Vegetables();
        vegis2.id = 2;
        vegis2.name = "Brinjal";
        vegis2.imageUrl = R.drawable.brinjal;

        Vegetables vegis3 = new Vegetables();
        vegis3.id = 3;
        vegis3.name = "Cabbage";
        vegis3.imageUrl = R.drawable.cabbage;

        Vegetables vegis4 = new Vegetables();
        vegis4.id = 4;
        vegis4.name = "Carrot";
        vegis4.imageUrl = R.drawable.carrot;

        Vegetables vegis5 = new Vegetables();
        vegis5.id =5;
        vegis5.name = "LadyFinger";
        vegis5.imageUrl = R.drawable.ladyfinger;

        Vegetables vegis6 = new Vegetables();
        vegis6.id = 6;
        vegis6.name = "Cauliflower";
        vegis6.imageUrl = R.drawable.cauliflower;

        Vegetables vegis7 = new Vegetables();
        vegis7.id = 7;
        vegis7.name = "Potato";
        vegis7.imageUrl = R.drawable.potato;

        Vegetables vegis8 = new Vegetables();
        vegis8.id = 8;
        vegis8.name = "Radish";
        vegis8.imageUrl = R.drawable.radish;

        Vegetables vegis9 = new Vegetables();
        vegis9.id = 9;
        vegis9.name = "Bitter Gourd";
        vegis9.imageUrl = R.drawable.bittergourd;

        Vegetables vegis10 = new Vegetables();
        vegis10.id = 10;
        vegis10.name = "Bottle Gourd";
        vegis10.imageUrl = R.drawable.bottlegourd;

        fru.vegetables12.add(vegis1);
        fru.vegetables12.add(vegis2);
        fru.vegetables12.add(vegis3);
        fru.vegetables12.add(vegis4);
        fru.vegetables12.add(vegis5);
        fru.vegetables12.add(vegis6);
        fru.vegetables12.add(vegis7);
        fru.vegetables12.add(vegis8);
        fru.vegetables12.add(vegis9);
        fru.vegetables12.add(vegis10);

        Fruits fru1 = new Fruits();
        fru1.id= 1;
        fru1.name1 = "FRUITS";
        fru1.vegetables12 = new ArrayList<Vegetables>();

        Vegetables vegis11 = new Vegetables();
        vegis11.id = 1;
        vegis11.name = "Mango";
        vegis11.imageUrl = R.drawable.mango1;

        Vegetables vegis12 = new Vegetables();
        vegis12.id = 2;
        vegis12.name = "Guava";
        vegis12.imageUrl = R.drawable.guava;

        Vegetables vegis13 = new Vegetables();
        vegis13.id = 3;
        vegis13.name = "Pomegranate";
        vegis13.imageUrl = R.drawable.pomegra;

        Vegetables vegis14 = new Vegetables();
        vegis14.id = 1;
        vegis14.name = "Apple";
        vegis14.imageUrl = R.drawable.apple;

        Vegetables vegis15 = new Vegetables();
        vegis15.id = 1;
        vegis15.name = "Pine Apple";
        vegis15.imageUrl = R.drawable.pineapple;

        Vegetables vegis16 = new Vegetables();
        vegis16.id = 1;
        vegis16.name = "Orange";
        vegis16.imageUrl = R.drawable.orange;

        Vegetables vegis17 = new Vegetables();
        vegis17.id = 1;
        vegis17.name = "Grapes";
        vegis17.imageUrl = R.drawable.grape;

        Vegetables vegis18 = new Vegetables();
        vegis18.id = 1;
        vegis18.name = "Strawberry";
        vegis18.imageUrl = R.drawable.strawberry;

        Vegetables vegis19 = new Vegetables();
        vegis19.id = 1;
        vegis19.name = "Water Melon";
        vegis19.imageUrl = R.drawable.watermelon;

        Vegetables vegis20 = new Vegetables();
        vegis20.id = 1;
        vegis20.name = "Kiwi";
        vegis20.imageUrl = R.drawable.kiwi;

        fru1.vegetables12.add(vegis11);
        fru1.vegetables12.add(vegis12);
        fru1.vegetables12.add(vegis13);
        fru1.vegetables12.add(vegis14);
        fru1.vegetables12.add(vegis15);
        fru1.vegetables12.add(vegis16);
        fru1.vegetables12.add(vegis17);
        fru1.vegetables12.add(vegis18);
        fru1.vegetables12.add(vegis19);
        fru1.vegetables12.add(vegis20);

        Fruits fru2 = new Fruits();
        fru2.id= 1;
        fru2.name1 = "CROPS";
        fru2.vegetables12 = new ArrayList<Vegetables>();

        Vegetables vegis21 = new Vegetables();
        vegis21.id = 1;
        vegis21.name = "Cotton";
        vegis21.imageUrl = R.drawable.cotton;

        Vegetables vegis22 = new Vegetables();
        vegis22.id = 2;
        vegis22.name = "Wheat";
        vegis22.imageUrl = R.drawable.wheat;

        Vegetables vegis23 = new Vegetables();
        vegis23.id = 3;
        vegis23.name = "Oats";
        vegis23.imageUrl = R.drawable.oats;

        Vegetables vegis24 = new Vegetables();
        vegis24.id = 1;
        vegis24.name = "Suger Cane";
        vegis24.imageUrl = R.drawable.sugarcane;

        Vegetables vegis25 = new Vegetables();
        vegis25.id = 1;
        vegis25.name = "Maize";
        vegis25.imageUrl = R.drawable.maize;

        Vegetables vegis26 = new Vegetables();
        vegis26.id = 1;
        vegis26.name = "Ground Nut";
        vegis26.imageUrl = R.drawable.groundnut;

        Vegetables vegis27 = new Vegetables();
        vegis27.id = 1;
        vegis27.name = "Oil Seeds";
        vegis27.imageUrl = R.drawable.oilseeds;

        Vegetables vegis28 = new Vegetables();
        vegis28.id = 1;
        vegis28.name = "Coffee";
        vegis28.imageUrl = R.drawable.coffee;

        Vegetables vegis29 = new Vegetables();
        vegis29.id = 1;
        vegis29.name = "Tobacco";
        vegis29.imageUrl = R.drawable.tobacco;

        Vegetables vegis30 = new Vegetables();
        vegis30.id = 1;
        vegis30.name = "Rice";
        vegis30.imageUrl = R.drawable.rice1;

        fru2.vegetables12.add(vegis21);
        fru2.vegetables12.add(vegis22);
        fru2.vegetables12.add(vegis23);
        fru2.vegetables12.add(vegis24);
        fru2.vegetables12.add(vegis25);
        fru2.vegetables12.add(vegis26);
        fru2.vegetables12.add(vegis27);
        fru2.vegetables12.add(vegis28);
        fru2.vegetables12.add(vegis29);
        fru2.vegetables12.add(vegis30);

        fruits.add(fru);
        fruits.add(fru1);
        fruits.add(fru2);

        return fruits;
    }
}

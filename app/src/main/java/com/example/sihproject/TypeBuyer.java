package com.example.sihproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TypeBuyer extends AppCompatActivity {

    private RecyclerView r1;
    private FruitAdapter1 fruitAdapter;
    private ArrayList<Fruits1> fruits;
    CardView c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_buyer);
        c1 = findViewById(R.id.card_view);
        initComponents();
        fruits = prepareData();
        fruitAdapter = new FruitAdapter1(fruits,TypeBuyer.this);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(TypeBuyer.this);
        r1.setLayoutManager(linearLayoutManager);
        r1.setAdapter(fruitAdapter);
    }
    public void initComponents(){
        r1 = findViewById(R.id.rvFarmer1);
    }
    public ArrayList<Fruits1> prepareData(){
        ArrayList<Fruits1> fruits =new ArrayList<Fruits1>();
        Fruits1 fru = new Fruits1();
        fru.id1=1;
        fru.name11 = "VEGETABLES";
        fru.vegetables121 = new ArrayList<Vegetables1>();
        Vegetables1 vegis1 = new Vegetables1();
        vegis1.id1 = 1;
        vegis1.name1 = "Tomato";
        vegis1.imageUrl1 = R.drawable.tomato;

        Vegetables1 vegis2 = new Vegetables1();
        vegis2.id1 = 2;
        vegis2.name1 = "Brinjal";
        vegis2.imageUrl1 = R.drawable.brinjal;

        Vegetables1 vegis3 = new Vegetables1();
        vegis3.id1 = 3;
        vegis3.name1 = "Cabbage";
        vegis3.imageUrl1 = R.drawable.cabbage;

        Vegetables1 vegis4 = new Vegetables1();
        vegis4.id1 = 4;
        vegis4.name1 = "Carrot";
        vegis4.imageUrl1 = R.drawable.carrot;

        Vegetables1 vegis5 = new Vegetables1();
        vegis5.id1 =5;
        vegis5.name1 = "LadyFinger";
        vegis5.imageUrl1 = R.drawable.ladyfinger;

        Vegetables1 vegis6 = new Vegetables1();
        vegis6.id1 = 6;
        vegis6.name1 = "Cauliflower";
        vegis6.imageUrl1 = R.drawable.cauliflower;

        Vegetables1 vegis7 = new Vegetables1();
        vegis7.id1 = 7;
        vegis7.name1 = "Potato";
        vegis7.imageUrl1 = R.drawable.potato;

        Vegetables1 vegis8 = new Vegetables1();
        vegis8.id1 = 8;
        vegis8.name1 = "Radish";
        vegis8.imageUrl1 = R.drawable.radish;

        Vegetables1 vegis9 = new Vegetables1();
        vegis9.id1 = 9;
        vegis9.name1 = "Bitter Gourd";
        vegis9.imageUrl1 = R.drawable.bittergourd;

        Vegetables1 vegis10 = new Vegetables1();
        vegis10.id1 = 10;
        vegis10.name1 = "Bottle Gourd";
        vegis10.imageUrl1 = R.drawable.bottlegourd;

        fru.vegetables121.add(vegis1);
        fru.vegetables121.add(vegis2);
        fru.vegetables121.add(vegis3);
        fru.vegetables121.add(vegis4);
        fru.vegetables121.add(vegis5);
        fru.vegetables121.add(vegis6);
        fru.vegetables121.add(vegis7);
        fru.vegetables121.add(vegis8);
        fru.vegetables121.add(vegis9);
        fru.vegetables121.add(vegis10);

        Fruits1 fru1 = new Fruits1();
        fru1.id1= 1;
        fru1.name11 = "FRUITS";
        fru1.vegetables121 = new ArrayList<Vegetables1>();

        Vegetables1 vegis11 = new Vegetables1();
        vegis11.id1 = 1;
        vegis11.name1 = "Mango";
        vegis11.imageUrl1 = R.drawable.mango1;

        Vegetables1 vegis12 = new Vegetables1();
        vegis12.id1 = 2;
        vegis12.name1 = "Guava";
        vegis12.imageUrl1 = R.drawable.guava;

        Vegetables1 vegis13 = new Vegetables1();
        vegis13.id1 = 3;
        vegis13.name1 = "Pomegranate";
        vegis13.imageUrl1 = R.drawable.pomegra;

        Vegetables1 vegis14 = new Vegetables1();
        vegis14.id1 = 1;
        vegis14.name1 = "Apple";
        vegis14.imageUrl1 = R.drawable.apple;

        Vegetables1 vegis15 = new Vegetables1();
        vegis15.id1 = 1;
        vegis15.name1 = "Pine Apple";
        vegis15.imageUrl1 = R.drawable.pineapple;

        Vegetables1 vegis16 = new Vegetables1();
        vegis16.id1 = 1;
        vegis16.name1 = "Orange";
        vegis16.imageUrl1 = R.drawable.orange;

        Vegetables1 vegis17 = new Vegetables1();
        vegis17.id1 = 1;
        vegis17.name1 = "Grapes";
        vegis17.imageUrl1 = R.drawable.grape;

        Vegetables1 vegis18 = new Vegetables1();
        vegis18.id1 = 1;
        vegis18.name1 = "Strawberry";
        vegis18.imageUrl1 = R.drawable.strawberry;

        Vegetables1 vegis19 = new Vegetables1();
        vegis19.id1 = 1;
        vegis19.name1 = "Water Melon";
        vegis19.imageUrl1 = R.drawable.watermelon;

        Vegetables1 vegis20 = new Vegetables1();
        vegis20.id1 = 1;
        vegis20.name1 = "Kiwi";
        vegis20.imageUrl1 = R.drawable.kiwi;

        fru1.vegetables121.add(vegis11);
        fru1.vegetables121.add(vegis12);
        fru1.vegetables121.add(vegis13);
        fru1.vegetables121.add(vegis14);
        fru1.vegetables121.add(vegis15);
        fru1.vegetables121.add(vegis16);
        fru1.vegetables121.add(vegis17);
        fru1.vegetables121.add(vegis18);
        fru1.vegetables121.add(vegis19);
        fru1.vegetables121.add(vegis20);

        Fruits1 fru2 = new Fruits1();
        fru2.id1= 1;
        fru2.name11 = "CROPS";
        fru2.vegetables121 = new ArrayList<Vegetables1>();

        Vegetables1 vegis21 = new Vegetables1();
        vegis21.id1 = 1;
        vegis21.name1 = "Cotton";
        vegis21.imageUrl1 = R.drawable.cotton;

        Vegetables1 vegis22 = new Vegetables1();
        vegis22.id1 = 2;
        vegis22.name1 = "Wheat";
        vegis22.imageUrl1 = R.drawable.wheat;

        Vegetables1 vegis23 = new Vegetables1();
        vegis23.id1 = 3;
        vegis23.name1 = "Oats";
        vegis23.imageUrl1 = R.drawable.oats;

        Vegetables1 vegis24 = new Vegetables1();
        vegis24.id1 = 1;
        vegis24.name1 = "Suger Cane";
        vegis24.imageUrl1 = R.drawable.sugarcane;

        Vegetables1 vegis25 = new Vegetables1();
        vegis25.id1 = 1;
        vegis25.name1 = "Maize";
        vegis25.imageUrl1 = R.drawable.maize;

        Vegetables1 vegis26 = new Vegetables1();
        vegis26.id1 = 1;
        vegis26.name1 = "Ground Nut";
        vegis26.imageUrl1 = R.drawable.groundnut;

        Vegetables1 vegis27 = new Vegetables1();
        vegis27.id1 = 1;
        vegis27.name1 = "Oil Seeds";
        vegis27.imageUrl1 = R.drawable.oilseeds;

        Vegetables1 vegis28 = new Vegetables1();
        vegis28.id1 = 1;
        vegis28.name1 = "Coffee";
        vegis28.imageUrl1 = R.drawable.coffee;

        Vegetables1 vegis29 = new Vegetables1();
        vegis29.id1 = 1;
        vegis29.name1 = "Tobacco";
        vegis29.imageUrl1 = R.drawable.tobacco;

        Vegetables1 vegis30 = new Vegetables1();
        vegis30.id1 = 1;
        vegis30.name1 = "Rice";
        vegis30.imageUrl1 = R.drawable.rice1;

        fru2.vegetables121.add(vegis21);
        fru2.vegetables121.add(vegis22);
        fru2.vegetables121.add(vegis23);
        fru2.vegetables121.add(vegis24);
        fru2.vegetables121.add(vegis25);
        fru2.vegetables121.add(vegis26);
        fru2.vegetables121.add(vegis27);
        fru2.vegetables121.add(vegis28);
        fru2.vegetables121.add(vegis29);
        fru2.vegetables121.add(vegis30);

        fruits.add(fru);
        fruits.add(fru1);
        fruits.add(fru2);

        return fruits;
    }
}

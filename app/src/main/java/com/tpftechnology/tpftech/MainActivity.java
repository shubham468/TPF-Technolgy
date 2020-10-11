package com.tpftechnology.tpftech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.tpftechnology.tpftech.Adapters.NewsAdapter;
import com.tpftechnology.tpftech.Models.NewsResponse;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    // for only five items i have used text views inside card view
    CardView wallstreet,techcrunch,apple_market,us_business,bitcoin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        wallstreet=findViewById(R.id.wallstreet);
        techcrunch=findViewById(R.id.techcrunch);
        apple_market=findViewById(R.id.apple_market);
        us_business=findViewById(R.id.us_business);
        bitcoin=findViewById(R.id.bitcoin);


        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "bitcoin", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,NewsDetailPage.class);
                startActivity(intent);
            }
        });
        us_business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "US news", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,NewsDetails1.class);
                startActivity(intent);
            }
        });
        apple_market.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Apple market", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,NewsDetails2.class);
                startActivity(intent);
            }
        });
        techcrunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "techcrunch", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,NewsDetails3.class);
                startActivity(intent);
            }
        });
        wallstreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "wallstreet", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,NewsDetails4.class);
                startActivity(intent);
            }
        });

    }
}
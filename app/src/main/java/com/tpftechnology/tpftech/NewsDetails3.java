package com.tpftechnology.tpftech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.tpftechnology.tpftech.Adapters.NewsAdapter;
import com.tpftechnology.tpftech.Models.Article;
import com.tpftechnology.tpftech.Models.NewsResponse;
import com.tpftechnology.tpftech.ViewModel.ViewModel;

import java.util.ArrayList;

public class NewsDetails3 extends AppCompatActivity {
    RecyclerView recyclerNewsheading;
    NewsAdapter newsAdapter;
    ViewModel viewModel;
    ArrayList<Article> articleArrayList;
    ProgressBar newsdetailProgress;

    private static String api="f0679576ea454e75a3004ec93a02234c";
    private static String sources="techcrunch";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details3);
        viewModel= ViewModelProviders.of(this).get(ViewModel.class);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {finish();
            }
        });
        recyclerNewsheading=findViewById(R.id.recyclerNewsheading);
        newsdetailProgress = findViewById(R.id.newsdetailProgress);



        viewModel.getheadlinetechcrunch(api,sources).observe(this, new Observer<NewsResponse>() {
            @Override
            public void onChanged(NewsResponse newsResponse) {
                newsdetailProgress.setVisibility(View.GONE);
                articleArrayList=newsResponse.getArticles();
                newsAdapter=new NewsAdapter(getApplicationContext(),articleArrayList);
                recyclerNewsheading.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                recyclerNewsheading.setAdapter(newsAdapter);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
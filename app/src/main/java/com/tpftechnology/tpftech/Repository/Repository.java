package com.tpftechnology.tpftech.Repository;

import android.util.Log;

import com.tpftechnology.tpftech.Models.NewsResponse;
import com.tpftechnology.tpftech.Network.RetroInstance;
import com.tpftechnology.tpftech.Network.ServiceEndPoint;

import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {

    public Repository(){
    }

    public ServiceEndPoint serviceEndPoint = RetroInstance.create(ServiceEndPoint.class);
    private static final String TAG = "Repository";
    private static Repository instance = null;

    public static MutableLiveData<NewsResponse> newsResponseMutableLiveData = new MutableLiveData<>();

    public static Repository getInstance() {
        if(instance == null){
            instance = new Repository();
        }
        return instance;
    }


    public MutableLiveData<NewsResponse> getHeadlinesbitcoin(String apikey,String q,String from,String sortBy){
        Call<NewsResponse> call=serviceEndPoint.newsheadlinesbitcoin(apikey,q,from,sortBy);
        call.enqueue(new Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                if (response.isSuccessful()){
                    newsResponseMutableLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {
                Log.d(TAG, "onFailure: , code "+ t.getMessage());
            }
        });
        return newsResponseMutableLiveData;
    }

    public MutableLiveData<NewsResponse> getHeadlinesbusiness(String apikey,String country,String category){
        Call<NewsResponse> call=serviceEndPoint.newsheadlinesbusiness(apikey,country,category);
        call.enqueue(new Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                if (response.isSuccessful()){
                    newsResponseMutableLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {
                Log.d(TAG, "onFailure: , code "+ t.getMessage());
            }
        });
        return newsResponseMutableLiveData;
    }

    public MutableLiveData<NewsResponse> getHeadlinesmentioningApple(String apikey,String q,String from,String to,String sortBy){
        Call<NewsResponse> call=serviceEndPoint.newsheadlinesmentioningApple(q,from,to,sortBy,apikey);
        call.enqueue(new Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                if (response.isSuccessful()){
                    newsResponseMutableLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {
                Log.d(TAG, "onFailure: , code "+ t.getMessage());
            }
        });
        return newsResponseMutableLiveData;
    }

    public MutableLiveData<NewsResponse> getHeadlinesTechCrunch(String apikey,String sources){
        Call<NewsResponse> call=serviceEndPoint.newsheadlinesTechCrunch(sources,apikey);
        call.enqueue(new Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                if (response.isSuccessful()){
                    newsResponseMutableLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {
                Log.d(TAG, "onFailure: , code "+ t.getMessage());
            }
        });
        return newsResponseMutableLiveData;
    }

    public MutableLiveData<NewsResponse> getHeadlinesWallStreetJourna(String domain,String apikey){
        Call<NewsResponse> call=serviceEndPoint.newsheadlinesWallStreetJournal(domain,apikey);
        call.enqueue(new Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                if (response.isSuccessful()){
                    newsResponseMutableLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {
                Log.d(TAG, "onFailure: , code "+ t.getMessage());
            }
        });
        return newsResponseMutableLiveData;
    }



}

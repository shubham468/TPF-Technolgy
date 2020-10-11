package com.tpftechnology.tpftech.Network;

import com.tpftechnology.tpftech.Models.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ServiceEndPoint {


    @GET("v2/everything")
    Call<NewsResponse> newsheadlinesbitcoin(@Query("apiKey") String apiKey,@Query("q") String q,@Query("from") String from,@Query("sortBy") String sortBy);

    @GET("v2/top-headlines")
    Call<NewsResponse> newsheadlinesbusiness(@Query("apiKey") String apiKey,@Query("country") String country,@Query("category") String category);

    @GET("v2/everything")
    Call<NewsResponse> newsheadlinesmentioningApple(@Query("q") String q,@Query("from") String from,@Query("to") String to,@Query("sortBy") String sortBy,@Query("apiKey") String apiKey);

    @GET("v2/everything")
    Call<NewsResponse> newsheadlinesTechCrunch(@Query("sources") String sources,@Query("apiKey") String apiKey);

    @GET("v2/everything")
    Call<NewsResponse> newsheadlinesWallStreetJournal(@Query("domains") String domains,@Query("apiKey") String apiKey);
}

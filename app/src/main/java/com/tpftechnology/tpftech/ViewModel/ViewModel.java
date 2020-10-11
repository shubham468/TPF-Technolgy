package com.tpftechnology.tpftech.ViewModel;

import com.tpftechnology.tpftech.Models.NewsResponse;
import com.tpftechnology.tpftech.Repository.Repository;

import androidx.lifecycle.MutableLiveData;

public class ViewModel extends androidx.lifecycle.ViewModel {

    private Repository repository = Repository.getInstance();
    public final String TAG = "VIEWMODEL";

    public MutableLiveData<NewsResponse> getheadlinebitcoin(String api,String q,String from,String sortBy) {
        return repository.getHeadlinesbitcoin(api,q,from,sortBy);
    }

    public MutableLiveData<NewsResponse> getheadlinebusiness(String api,String country,String category) {
        return repository.getHeadlinesbusiness(api,country,category);
    }
    public MutableLiveData<NewsResponse> getheadlineApple(String api,String q,String from,String to,String sortBy) {
        return repository.getHeadlinesmentioningApple(api,q,from,to,sortBy);
    }
    public MutableLiveData<NewsResponse> getheadlinetechcrunch(String api,String source) {
        return repository.getHeadlinesTechCrunch(api,source);
    }
    public MutableLiveData<NewsResponse> getheadlinewallstreet(String api,String domain) {
        return repository.getHeadlinesWallStreetJourna(domain,api);
    }



}

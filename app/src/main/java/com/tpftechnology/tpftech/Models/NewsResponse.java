
package com.tpftechnology.tpftech.Models;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

public class NewsResponse {

    @Expose
    private ArrayList<Article> articles;
    @Expose
    private String status;
    @Expose
    private Long totalResults;

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}

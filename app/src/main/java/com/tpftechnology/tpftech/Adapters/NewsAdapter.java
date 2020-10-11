package com.tpftechnology.tpftech.Adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.tpftechnology.tpftech.Models.Article;
import com.tpftechnology.tpftech.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {
    Context context;
    ArrayList<Article> articleArrayList;

    public NewsAdapter(Context context, ArrayList<Article> articleArrayList) {
        this.context = context;
        this.articleArrayList = articleArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_news_elements,parent, false);
        ViewHolder myViewHolder = new ViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.ViewHolder holder, int position) {
        if (articleArrayList.get(position)!= null){
            if (articleArrayList.get(position).getUrlToImage()!=null){
                Picasso.get()
                        .load(articleArrayList.get(position).getUrlToImage())
                        .noPlaceholder()
                        .into(holder.bannerimage);
            }
            if (articleArrayList.get(position).getTitle()!=null){
                holder.title.setText(articleArrayList.get(position).getTitle());
            }
            if (articleArrayList.get(position).getAuthor()!=null){
                holder.author.setText(articleArrayList.get(position).getAuthor());
            }
            if (articleArrayList.get(position).getDescription()!=null){
                holder.description.setText(articleArrayList.get(position).getDescription());
            }
            if (articleArrayList.get(position).getContent()!=null){
                holder.content.setText(articleArrayList.get(position).getContent());
            }
        }
    }

    @Override
    public int getItemCount() {
        return articleArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView bannerimage;
        TextView content,description,author,title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bannerimage=itemView.findViewById(R.id.bannerimage);
            content=itemView.findViewById(R.id.content);
            description=itemView.findViewById(R.id.description);
            author=itemView.findViewById(R.id.author);
            title=itemView.findViewById(R.id.title);
        }
    }
}

package com.cqgmy.together.recycleview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder>{
    private List<Fruit> myFruit;
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public ViewHolder(View view){
            super(view);
        }
    }
    @Override
    public void onBindViewHolder(@NonNull FruitAdapter.ViewHolder holder, int position, @NonNull List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }


    public FruitAdapter(List<Fruit> myFruit) {
        this.myFruit = myFruit;
    }

}

package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public  class   ItemListApdater extends RecyclerView.Adapter<ItemListApdater.ItemViewHolder>{

    private final ArrayList<ItemList> list;
    private LayoutInflater inflater;

    public ItemListApdater (Context context,ArrayList<ItemList> list){
        inflater= LayoutInflater.from(context);
        this.list= list;
    }
    @NonNull
    @Override
    public ItemListApdater.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View  itemView= inflater.inflate(R.layout.viewitem,parent,false);

        return new ItemViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemListApdater.ItemViewHolder holder, int position) {
        ItemList item= list.get(position);
        holder.img.setImageResource(item.getImg());
        holder.tvProductName.setText(item.getProductName().toString());
        holder.ratingBar.setRating(item.getRating());
        holder.tvQuantity.setText(item.getQuantity()+"");
        holder.tvPrice.setText(item.getPrice()+"");
        holder.tvDiscount.setText(item.getDiscount()+"");

    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        public  final ItemListApdater mAdapter;
        public final ImageView img;
        public final TextView tvProductName;
        public final RatingBar ratingBar;
        public final TextView tvQuantity;
        public final TextView tvPrice;
        public final TextView tvDiscount;

        public ItemViewHolder(@NonNull View itemView, ItemListApdater mAdapter) {
            super(itemView);

            img = itemView.findViewById(R.id.img);
            tvProductName = itemView.findViewById(R.id.productName);
            ratingBar = itemView.findViewById(R.id.ratingBar);
            tvQuantity = itemView.findViewById(R.id.tvQuantity);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvDiscount = itemView.findViewById(R.id.tvDiscount);
            this.mAdapter = mAdapter;
        }
    }


}

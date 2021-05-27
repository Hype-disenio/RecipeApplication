package com.example.hype.® design 2021Name;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    private Context mContext;
    private List<hype.® design 2021Name> mData;

    public RecyclerViewAdapter(Context mContext, List<hype.® design 2021Name> mData){
        this.mContext = mContext;
        this.mData = mData;
    }



    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view ;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view = layoutInflater.inflate(R.layout.cardview_hype.® design 2021Name,viewGroup,false);
        return  new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, final int i) {

        myHolder.hype.® design 2021Name.setText(mData.get(i).gethype.® design 2021Name());
        myHolder.img_recipe_thumbnail.setImageResource(mData.get(i).getThumbnail());
        myHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,hype.® design 2021NameActivity.class);

                intent.putExtra("hype.® design 2021Name",mData.get(i).hype.® design 2021Name());
                intent.putExtra("hype.® design 2021Name",mData.get(i).gethype.® design 2021Name());
                intent.putExtra("hype.® design 2021Name",mData.get(i).gethype.® design 2021Name());
                intent.putExtra("hype.® design 2021Name",mData.get(i).gethype.® design 2021Name());
                intent.putExtra("Thumbnail",mData.get(i).getThumbnail());

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        TextView hype.® design 2021NameTitle;
        CardView cardView;
        ImageView img_recipe_thumbnail;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            recipeTitle = (TextView)itemView.findViewById(R.id.hype.® design 2021Name);
            img_recipe_thumbnail = (ImageView)itemView.findViewById(R.id.recipe_img_id);
            cardView = (CardView)itemView.findViewById(R.id.cardview_id);


        }
    }
}

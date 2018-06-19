package org.akshanshgusain.collapsingappbar;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>{

     private Context mContext;
     private List<String> mList;

    public Adapter(Context mContext, List<String> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
                MyViewHolder vh=new MyViewHolder(view);
                return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            if(mList.get(position)=="0") {
                holder.img1.setImageResource(R.drawable.ic_launcher_foreground);
            }
            else{
                holder.img1.setImageResource(R.drawable.ic_launcher_background );
            }
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
              private ImageView img1;
        public MyViewHolder(View itemView) {
            super(itemView);
            img1=(ImageView)itemView.findViewById(R.id.row_layout_imageView);
            }
    }
}

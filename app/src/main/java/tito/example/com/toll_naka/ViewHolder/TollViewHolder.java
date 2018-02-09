package tito.example.com.toll_naka.ViewHolder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import tito.example.com.toll_naka.Interface.ItemClickListener;
import tito.example.com.toll_naka.R;

/**
 * Created by tito on 8/2/18.
 */

public class TollViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView name;
    public ImageView img;
    public TextView address;
    public ItemClickListener itemClickListener;


    public TollViewHolder(View itemView, TextView name, ImageView img, TextView address, ItemClickListener itemClickListener) {
        super(itemView);
        this.name = name;
        this.img = img;
        this.address = address;
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false);

    }

    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener=itemClickListener;
    }


}

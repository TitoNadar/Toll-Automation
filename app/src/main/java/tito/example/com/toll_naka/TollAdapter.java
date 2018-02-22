package tito.example.com.toll_naka;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import tito.example.com.toll_naka.Model.Tolls;

/**
 * Created by tito on 22/2/18.
 */

public class TollAdapter extends RecyclerView.Adapter<TollAdapter.MyViewHolder> {

    private Context mContext;
    private List<Toll> tollsList;




    public interface ItemClickListener {
        void onClick(View view, int position, boolean isLongClick);

    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private TextView name;
        private ImageView img;
        private TextView address;
        private CardView cv;
        private ItemClickListener itemClickListener;





        public MyViewHolder(View view) {
            super(view);
            cv=(CardView) view.findViewById(R.id.cardview);
            name = (TextView) view.findViewById(R.id.toll_name);
            address = (TextView) view.findViewById(R.id.address);
            img = (ImageView) view.findViewById(R.id.image);

            itemView.setOnClickListener(this);

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


    public TollAdapter(Context mContext, List<Toll> tollsList) {
        this.mContext = mContext;
        this.tollsList = tollsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_item, parent, false);


        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Toll toll = tollsList.get(position);
        holder.name.setText(toll.getName());
        holder.address.setText(toll.getAddress());
        Picasso.with(mContext).load(toll.getImg()).into(holder.img);
        // loading album cover using Glide library
        // Glide.with(mContext).load(toll.getImg()).into(holder.img);


        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {

                Intent i =new Intent();
                i.setClass(mContext, Details.class);


                Toll toll=tollsList.get(position);
                String a = toll.getName();
                String b =toll.getAddress();
                i.putExtra("name", a);
                i.putExtra("add", b);
                mContext.startActivity(i);




            }


        });



    }




    @Override
    public int getItemCount() {
        return tollsList.size();
    }




}


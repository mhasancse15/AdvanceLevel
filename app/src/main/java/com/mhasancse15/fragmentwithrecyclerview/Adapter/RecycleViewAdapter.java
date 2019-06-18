package com.mhasancse15.fragmentwithrecyclerview.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.mhasancse15.fragmentwithrecyclerview.Model.Contact;
import com.mhasancse15.fragmentwithrecyclerview.R;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {


    Context context;
    List<Contact> mData;
    Dialog dialog;

    public RecycleViewAdapter(Context context, List<Contact> mData) {
        this.context = context;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view;
        view= LayoutInflater.from(context).inflate(R.layout.item_contact,parent,false);
        final MyViewHolder vHolder=new MyViewHolder(view);

        //Dialog init
        dialog=new Dialog(context);
        dialog.setContentView(R.layout.dialog_conatc);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


        vHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "item Click"+String.valueOf(vHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();

                TextView dialogNameTv=dialog.findViewById(R.id.dialogNameTV);
                TextView dialogPhoneTv=dialog.findViewById(R.id.dialogPhoneTV);
                ImageView dialogImg=dialog.findViewById(R.id.dialogImg);
                dialogNameTv.setText(mData.get(vHolder.getAdapterPosition()).getName());
                dialogPhoneTv.setText(mData.get(vHolder.getAdapterPosition()).getPhone());
                dialogImg.setImageResource(mData.get(vHolder.getAdapterPosition()).getImage());
                dialog.show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvName.setText(mData.get(position).getName());
        holder.tvPhone.setText(mData.get(position).getPhone());
        holder.img.setImageResource(mData.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tvName;
        private TextView tvPhone;
        private ImageView img;
        private LinearLayout linearLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName=itemView.findViewById(R.id.contactNameTV);
            tvPhone=itemView.findViewById(R.id.contactNumberTV);
            img=itemView.findViewById(R.id.img_contact);
            linearLayout=itemView.findViewById(R.id.conatctItemID);

        }
    }


}

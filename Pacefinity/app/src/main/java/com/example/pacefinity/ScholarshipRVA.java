package com.example.pacefinity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ScholarshipRVA extends RecyclerView.Adapter<ScholarshipRVA.rvHolder>{
    Context context;
    ArrayList<ScholarshipJava> scholarships;
    public ScholarshipRVA(Context context, ArrayList<ScholarshipJava> scholarships){
        this.context = context;
        this.scholarships = scholarships;
    }

    @NonNull
    @Override
    public ScholarshipRVA.rvHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycview,parent,false);
        return new ScholarshipRVA.rvHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ScholarshipRVA.rvHolder holder, int position) {
        holder.sName.setText(scholarships.get(position).getScholarship());
        holder.sMoney.setText(scholarships.get(position).getMoney());
        holder.sReq.setText(scholarships.get(position).getRequirement());
        holder.sLink.setText(scholarships.get(position).getLinks());
        holder.sOI.setText(scholarships.get(position).getOtherinfo());
    }

    @Override
    public int getItemCount() {
        return scholarships.size();
    }

    public static class rvHolder extends RecyclerView.ViewHolder{
        TextView sName,sMoney,sReq,sLink,sOI;
        public rvHolder(@NonNull View itemView){
            super(itemView);
            sName = itemView.findViewById(R.id.names);
            sMoney = itemView.findViewById(R.id.monies);
            sReq = itemView.findViewById(R.id.require);
            sLink = itemView.findViewById(R.id.linkers);
            sOI = itemView.findViewById(R.id.other);
        }
    }
}

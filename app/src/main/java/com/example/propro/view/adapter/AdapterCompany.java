package com.example.propro.view.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.propro.model.Company;

import java.util.List;

import main.com.pro.R;

public class AdapterCompany extends RecyclerView.Adapter<AdapterCompany.AdapterCompanyHolder> {

    private List<Company> companies;

    public AdapterCompany(List<Company> companies) {
        this.companies = companies;
    }

    @NonNull
    @Override
    public AdapterCompanyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_company, viewGroup,false);
        return new AdapterCompanyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCompanyHolder h, int i) {
        Company company = companies.get(i);
        h.txtId.setText(String.valueOf(company.getId()));
        h.txtName.setText(company.getName());
    }


    @Override
    public int getItemCount() {
        return companies.size();
    }

    class AdapterCompanyHolder extends RecyclerView.ViewHolder {
        private TextView txtName;
        private TextView txtId;

        public AdapterCompanyHolder(@NonNull View itemView) {
            super(itemView);
            txtId = (TextView) itemView.findViewById(R.id.txtId);
            txtName = (TextView) itemView.findViewById(R.id.txtName);
        }
    }
}

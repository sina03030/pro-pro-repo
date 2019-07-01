package com.example.propro.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.propro.utility.Utility;
import com.example.propro.view.adapter.AdapterCompany;

import main.com.pro.R;

public class ActivityMain extends AppCompatActivity {

    private RecyclerView rcyCompany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        rcyCompany = (RecyclerView) findViewById(R.id.rcyCompany);
        rcyCompany.setHasFixedSize(true);
        rcyCompany.setLayoutManager(new LinearLayoutManager(ActivityMain.this));
        rcyCompany.setAdapter(new AdapterCompany(Utility.getCompanies()));

    }
}

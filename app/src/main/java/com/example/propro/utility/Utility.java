package com.example.propro.utility;

import com.example.propro.model.Company;

import java.util.ArrayList;
import java.util.List;

public class Utility {


    public static List<Company> getCompanies() {
        List<Company> companies = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Company company = new Company();
            company.setId(i);
            company.setName("Name " + i);
            company.setType(0);
            companies.add(company);
        }
        return companies;
    }
}

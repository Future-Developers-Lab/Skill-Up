package com.skillup.dto;

import lombok.Getter;

@Getter
public class CompanyDTO {
    Long company_id;
    String company_name;
    String company_size;
    String website;

    @Override
    public String toString() {
        return "CompanyDTO{" +
                "company_id=" + company_id +
                ", company_name='" + company_name + '\'' +
                ", company_size='" + company_size + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}

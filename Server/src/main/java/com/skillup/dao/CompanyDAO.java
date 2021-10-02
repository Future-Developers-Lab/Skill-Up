package com.skillup.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "COMPANIES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long company_id;
    private String company_name;
    private String company_size;
    @OneToOne(cascade = CascadeType.ALL)
    private AddressDAO address;
    private String website;

    @Override
    public String toString() {
        return "CompanyDAO{" +
                "company_id=" + company_id +
                ", company_name='" + company_name + '\'' +
                ", company_size='" + company_size + '\'' +
                ", address=" + address +
                ", website='" + website + '\'' +
                '}';
    }
}

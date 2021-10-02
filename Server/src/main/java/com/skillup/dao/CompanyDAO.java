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
    private String company_id;
    private String company_name;
    private String company_size;
    @OneToOne
    private AddressDAO address;
    private String website;
}

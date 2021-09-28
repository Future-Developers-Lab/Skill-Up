package com.skillup.demo.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESSES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressDAO {
    private String country;
    private float lng;
    private float lat;
}

package com.skillup.dao;

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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    private float lng;
    private float lat;

    @Override
    public String toString() {
        return "AddressDAO{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", lng=" + lng +
                ", lat=" + lat +
                '}';
    }
}

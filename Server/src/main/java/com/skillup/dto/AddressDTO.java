package com.skillup.dto;

import lombok.Getter;

@Getter
public class AddressDTO {
    Long id;
    String country;
    float lng;
    float lat;

    @Override
    public String toString() {
        return "AddressDTO{" +
                "address_id=" + id +
                ", country='" + country + '\'' +
                ", lng=" + lng +
                ", lat=" + lat +
                '}';
    }
}

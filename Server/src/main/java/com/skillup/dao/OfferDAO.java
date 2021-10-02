package com.skillup.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "OFFERS")
public class OfferDAO {
//    private static long IdCreator = 1; //temporary

    //USE it when we prepare db
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;

    public OfferDAO(String title, String description) {
        this.title = title;
        this.description = description;
    }
}

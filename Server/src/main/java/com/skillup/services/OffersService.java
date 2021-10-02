package com.skillup.services;

import com.skillup.dao.OfferDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffersService {

    public List<OfferDAO> getAllOffers() {
        return List.of(
                new OfferDAO("Title 1", "Description 1"),
                new OfferDAO("Title 2", "Description 2"),
                new OfferDAO("Title 3", "Description 3"),
                new OfferDAO("Title 4", "Description 4"),
                new OfferDAO("Title 5", "Description 5"),
                new OfferDAO("Title 6", "Description 6"),
                new OfferDAO("Title 7", "Description 7")
        );
    }
}

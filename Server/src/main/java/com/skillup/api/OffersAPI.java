package com.skillup.api;

import com.skillup.dao.OfferDAO;
import com.skillup.services.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OffersAPI {

    private final OffersService offersService;

    @Autowired
    public OffersAPI(OffersService offersService) {
        this.offersService = offersService;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    String helloWorld() {
        return "Hello World";
    }

    @RequestMapping(path = "/offers", method = RequestMethod.GET)
    List<OfferDAO> getAllOffers() {
        return offersService.getAllOffers();
    }
}

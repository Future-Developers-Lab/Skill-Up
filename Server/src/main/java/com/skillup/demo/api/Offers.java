package com.skillup.demo.api;

import com.skillup.demo.dao.OfferDAO;
import com.skillup.demo.services.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Offers {

    private final OffersService offersService;

    @Autowired
    public Offers(OffersService offersService) {
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

package com.skillup.api;

import com.skillup.dao.AddressDAO;
import com.skillup.dto.AddressDTO;
import com.skillup.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequestMapping(path = "/address")
public class AddressAPI {
    @Autowired
    private AddressService addressService;

    @RequestMapping(path = "/{company_id}", method = RequestMethod.GET)
    public Optional<AddressDAO> getAddressByCompanyId(@PathVariable Long company_id) {
        return addressService.getAddress(company_id);
    }

    public AddressDAO saveAddress(@PathVariable Long company_id, @RequestBody AddressDTO addressDTO){
        return addressService.saveAddress(addressDTO, company_id);
    }
}

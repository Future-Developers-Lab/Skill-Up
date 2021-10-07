package com.skillup.api;

import com.skillup.dao.AddressDAO;
import com.skillup.dto.AddressDTO;
import com.skillup.dto.CompanyDTO;
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

    @RequestMapping(path = "", method = RequestMethod.POST)
    public AddressDAO saveAddress(@RequestBody AddressDTO addressDTO) {
        return addressService.saveAddress(addressDTO).get();
    }

//    public AddressDAO saveAddress(@PathVariable Long company_id, @RequestBody AddressDTO addressDTO){
//        return addressService.saveAddress(addressDTO, company_id);
//    }
}

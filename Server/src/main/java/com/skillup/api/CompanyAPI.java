package com.skillup.api;

import com.skillup.dao.CompanyDAO;
import com.skillup.dto.CompanyDTO;
import com.skillup.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyAPI {

    @Autowired
    private CompanyService companyService;

    @RequestMapping(path = "/company", method = RequestMethod.POST)
    public CompanyDAO saveCompany(@RequestBody CompanyDTO companyDTO) {
        return companyService.saveCompany(companyDTO);
    }

    @RequestMapping(path = "/company/{id}", method = RequestMethod.PUT)
    public CompanyDAO updateCompany(@PathVariable Long id, @RequestBody CompanyDTO companyDTO) {
        return companyService.updateCompany(id, companyDTO);
    }
}

package com.skillup.api;

import com.skillup.dao.CompanyDAO;
import com.skillup.dto.CompanyDTO;
import com.skillup.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/company")
public class CompanyAPI {

    @Autowired
    private CompanyService companyService;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public CompanyDAO getCompanyById(@PathVariable Long id){
        return companyService.getCompanyById(id);
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public CompanyDAO saveCompany(@RequestBody CompanyDTO companyDTO) {
        return companyService.saveCompany(companyDTO);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public CompanyDAO updateCompany(@PathVariable Long id, @RequestBody CompanyDTO companyDTO) {
        return companyService.updateCompany(id, companyDTO);
    }
}

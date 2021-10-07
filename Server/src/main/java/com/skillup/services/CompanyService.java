package com.skillup.services;

import com.skillup.dao.CompanyDAO;
import com.skillup.dto.CompanyDTO;
import com.skillup.repository.CompanyRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyDAO getCompanyById(Long company_id){
        return companyRepository.findById(company_id).get();
    }

    public CompanyDAO saveCompany(CompanyDTO companyDTO) {
        CompanyDAO companyToSave = convertToDAO(companyDTO);
        return companyRepository.save(companyToSave);
    }

    public CompanyDAO updateCompany(Long company_id, CompanyDTO companyDTO) {
         return companyRepository.findById(company_id).map(company -> {
            company.setCompany_name(companyDTO.getCompany_name());
            company.setWebsite(companyDTO.getWebsite());
            return companyRepository.save(company);
        })
        .orElseGet(()->{
            CompanyDAO companyNotExist = convertToDAO(companyDTO);
            companyNotExist.setId(company_id);
            return companyRepository.save(companyNotExist);
        });
    }

    private CompanyDAO convertToDAO(CompanyDTO companyDTO) {
        return modelMapper.map(companyDTO, CompanyDAO.class);
    }
}

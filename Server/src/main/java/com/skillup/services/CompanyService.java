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

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyDTO saveCompany(CompanyDTO companyDTO) {
        logger.info("Saved Company: " + convertToDAO(companyDTO));
        return companyDTO;
    }

    private CompanyDTO convertToDAO(CompanyDTO companyDTO) {
        CompanyDAO companyDAO = modelMapper.map(companyDTO, CompanyDAO.class);
        companyRepository.save(companyDAO);
        return companyDTO;
    }
}

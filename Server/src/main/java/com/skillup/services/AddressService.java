package com.skillup.services;

import com.skillup.dao.AddressDAO;
import com.skillup.dao.CompanyDAO;
import com.skillup.dto.AddressDTO;
import com.skillup.repository.AddressRepository;
import com.skillup.repository.CompanyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CompanyRepository companyRepository;

    public Optional<AddressDAO> saveAddress(AddressDTO addressDTO, Long company_id) {
        return companyRepository.findById(company_id).map(company -> {
            company.setAddress(convertToDAO(addressDTO));
            return companyRepository.save(company).getAddress();
        }).orElseGet(()->{
            return Optional.empty();
        });
    }

    public Optional<AddressDAO> getAddress(Long company_id){
        return companyRepository.findById(company_id).map(CompanyDAO::getAddress);
    }

    private AddressDAO convertToDAO(AddressDTO addressDTO) {
        return modelMapper.map(addressDTO, AddressDAO.class);
    }
}

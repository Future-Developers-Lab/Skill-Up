package com.skillup.services;

import com.skillup.dao.AddressDAO;
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
    private CompanyRepository companyRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Optional<AddressDAO> saveAddress(AddressDTO addressDTO) {
        System.out.println(addressDTO);
        System.out.println(convertToDAO(addressDTO));
        return companyRepository.findById(convertToDAO(addressDTO).getId()).map(company -> {
            company.setAddress(convertToDAO(addressDTO));
            return companyRepository.save(company).getAddress();
        });
    }

    private AddressDAO convertToDAO(AddressDTO addressDTO) {
        return modelMapper.map(addressDTO, AddressDAO.class);
    }
}

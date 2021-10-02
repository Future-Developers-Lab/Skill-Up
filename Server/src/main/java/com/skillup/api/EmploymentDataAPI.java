package com.skillup.api;

import com.skillup.utils.selectFormsData.DataLists;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/employment")
public class EmploymentDataAPI {

    @RequestMapping(path = "/seniority", method = RequestMethod.GET)
    public List<String> seniority() {
        return DataLists.getSeniority();
    }

    @RequestMapping(path = "/type", method = RequestMethod.GET)
    public List<String> typeOfEmployment() {
        return DataLists.getTypeOfEmployment();
    }

    @RequestMapping(path = "/hours", method = RequestMethod.GET)
    public List<String> hoursOfEmployment() {
        return DataLists.getHoursOfEmployment();
    }

    @RequestMapping(path = "/place", method = RequestMethod.GET)
    public List<String> placeOfEmployment() {
        return DataLists.getPlaceOfEmployment();
    }
}

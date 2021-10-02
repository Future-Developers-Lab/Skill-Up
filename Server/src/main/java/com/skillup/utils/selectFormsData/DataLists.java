package com.skillup.utils.selectFormsData;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class DataLists {
    private static final String TRAINEE = "TRAINEE";
    private static final String JUNIOR = "JUNIOR";
    private static final String MID = "MID";
    private static final String SENIOR = "SENIOR";

    private static final String MANDATORY_CONTRACT = "MANDATORY CONTRACT";
    private static final String PERMANENT = "PERMANENT";
    private static final String B2B = "B2B";

    private static final String FULL_TIME = "FULL TIME";
    private static final String PART_TIME = "PART TIME";
    private static final String FREELANCE = "FREELANCE";

    private static final String FULLY_REMOTE = "FULLY REMOTE";
    private static final String PARTLY_REMOTE = "PARTLY REMOTE";
    private static final String OFFICE = "OFFICE";


    @Getter private final static List<String> seniority = new ArrayList<>(List.of(
            TRAINEE, JUNIOR, MID, SENIOR
    ));
    @Getter private final static List<String> typeOfEmployment = new ArrayList<>(List.of(
            MANDATORY_CONTRACT, PERMANENT, B2B
    ));
    @Getter private final static List<String> hoursOfEmployment = new ArrayList<>(List.of(
            FULL_TIME, PART_TIME, FREELANCE
    ));
    @Getter private final static List<String> placeOfEmployment = new ArrayList<>(List.of(
            FULLY_REMOTE, PARTLY_REMOTE, OFFICE
    ));


}

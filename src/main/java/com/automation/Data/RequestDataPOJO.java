package com.automation.Data;

import java.io.IOException;

import static com.automation.utils.JsonUtils.readFileAsString;

public class RequestDataPOJO {
    private String ratingDate;
    private String rateAsOfDate;
    private String yearRoofInstalled;
    private String roofType;
    private String state;
    private String yearBuilt;
    private String fipsCode;
    private String locationID;

    public RequestDataPOJO(String key) {
        String file = "src/main/java/com/automation/Data/TestData/RequestTemplate.json";
        String json = null;
        try {
            json = readFileAsString(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(json);
        this.fipsCode = "";
    }

    public String getRatingDate() {
        return ratingDate;
    }

    public void setRatingDate(String ratingDate) {
        this.ratingDate = ratingDate;
    }

    public String getRateAsOfDate() {
        return rateAsOfDate;
    }

    public void setRateAsOfDate(String rateAsOfDate) {
        this.rateAsOfDate = rateAsOfDate;
    }

    public String getYearRoofInstalled() {
        return yearRoofInstalled;
    }

    public void setYearRoofInstalled(String yearRoofInstalled) {
        this.yearRoofInstalled = yearRoofInstalled;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getFipsCode() {
        return fipsCode;
    }

    public void setFipsCode(String fipsCode) {
        this.fipsCode = fipsCode;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }



}

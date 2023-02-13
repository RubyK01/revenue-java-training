package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;



@Getter
@Setter
public class Screening {
//    int ScreeningID;
//    Patient patient;
//    String DateOfScreening;
//    Boolean result;
//
//    public Screening(int screeningID, Patient patient, String dateOfScreening, Boolean result) {
//        ScreeningID = screeningID;
//        this.patient = patient;
//        DateOfScreening = dateOfScreening;
//        this.result = result;
//    }
//
//    public Screening() {
//
//    }
//
//    public int getScreeningID() {
//        return ScreeningID;
//    }
//
//    public void setScreeningID(int screeningID) {
//        ScreeningID = screeningID;
//    }
//
//    public Patient getPatient() {
//        return patient;
//    }
//
//    public void setPatient(Patient patient) {
//        this.patient = patient;
//    }
//
//    public String getDateOfScreening() {
//        return DateOfScreening;
//    }
//
//    public void setDateOfScreening(String dateOfScreening) {
//        DateOfScreening = dateOfScreening;
//    }
//
//    public Boolean getResult() {
//        return result;
//    }
//
//    public void setResult(Boolean result) {
//        this.result = result;
//    }
    private int id;

    private char diagnosis;

    private double radiusMean;

    private double textureMean;

    private double perimeterMean;

    private double areaMean;

    private double smoothnessMean;

    private double compactnessMean;

    private double concavityMean;

    private double concavePointsMean;

    private double symmetryMean;

    private double fractalDimensionMean;

    private double radiusSe;

    private double textureSe;

    private double perimeterSe;

    private double areaSe;

    private double smoothnessSe;

    private double compactnessSe;

    private double concavitySe;

    private double concavePointsSe;

    private double symmetrySe;

    private double fractalDimensionSe;

    private double radiusWorst;

    private double textureWorst;

    private double perimeterWorst;

    private double areaWorst;

    private double smoothnessWorst;

    private double compactnessWorst;

    private double concavityWorst;

    private double concavePointsWorst;

    private double symmetryWorst;

    private double fractalDimensionWorst;

    private char groupId;
}

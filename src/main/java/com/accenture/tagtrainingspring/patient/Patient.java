package com.accenture.tagtrainingspring.patient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@Setter
@Getter
@Component
public class Patient {
//    String patientName, DOB, patientGender;
//    int patientID;
//
//    public Patient(String patientName, String DOB, String patientGender, int patientID) {
//        this.patientName = patientName;
//        this.DOB = DOB;
//        this.patientGender = patientGender;
//        this.patientID = patientID;
//    }
//
//    public Patient() {
//    }
//
//    public String getPatientName() {
//        return patientName;
//    }
//
//    public void setPatientName(String patientName) {
//        this.patientName = patientName;
//    }
//
//    public String getDOB() {
//        return DOB;
//    }
//
//    public void setDOB(String DOB) {
//        this.DOB = DOB;
//    }
//
//    public String getPatientGender() {
//        return patientGender;
//    }
//
//    public void setPatientGender(String patientGender) {
//        this.patientGender = patientGender;
//    }
//
//    public int getPatientID() {
//        return patientID;
//    }
//
//    public void setPatientID(int patientID) {
//        this.patientID = patientID;
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

    public Patient() {
    }
}

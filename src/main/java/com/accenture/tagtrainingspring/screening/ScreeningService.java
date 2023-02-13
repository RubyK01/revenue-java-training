package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;
import org.h2.engine.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScreeningService {
    @Autowired
//    public ScreeningService(ScreeningDatabase database) {
//        Database = database;
//    }

    public boolean isPatientScreening(Patient Patient, Screening Screening){
        boolean appointment;
//        if(Patient.getPatientName().equals(Screening.getPatient().getPatientName()) && !Screening.getDateOfScreening().equalsIgnoreCase("N/A")){
        if (Patient.getId() == Screening.getId()){
            appointment = true;
        }
        else{
            appointment = false;
        }
        return appointment;
    }

    public List getScreenings(){
//        String message = "";
//        for (int i = 0; i < database.getScreeningList().size(); i++){
//            String messageAdd = database.getScreeningList().get(i).toString();
//            String messageAdd2 = messageAdd + database.getScreeningList().get(i+1).toString();
//            message = messageAdd + messageAdd2;
//        }
//        return database.getScreeningList();
        return null;
    }
}

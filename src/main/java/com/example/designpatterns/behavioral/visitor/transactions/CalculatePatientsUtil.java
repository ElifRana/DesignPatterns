package com.example.designpatterns.behavioral.visitor.transactions;

import com.example.designpatterns.behavioral.visitor.ministryOfHealth.EnumPatient;
import com.example.designpatterns.behavioral.visitor.ministryOfHealth.EnumPatientCondition;
import com.example.designpatterns.behavioral.visitor.ministryOfHealth.Hospital;
import com.example.designpatterns.behavioral.visitor.ministryOfHealth.Patient;

import java.util.List;

public class CalculatePatientsUtil {

    public static int calculateNumberOfPatients(Hospital hospital, EnumPatient enumPatient) {

        List<Patient> patientList = hospital.getPatientList();

        int numberOfPatients = 0;
        for (Patient patient : patientList) {

            if (enumPatient.equals(patient.getPatient())) {
                numberOfPatients++;
            }
        }
        return numberOfPatients;
    }

    public static int calculateNumberOfPatients(Hospital hospital, EnumPatient enumPatient, EnumPatientCondition enumPatientCondition) {

        List<Patient> patientList = hospital.getPatientList();

        int numberOfPatients = 0;
        for (Patient patient : patientList) {

            if (enumPatient.equals(patient.getPatient())) {
                if (enumPatientCondition.equals(patient.getEnumPatientCondition())){

                    numberOfPatients++;
                }
            }
        }
        return numberOfPatients;
    }
}

package Visitor.Services;

import Visitor.Government.Disease;
import Visitor.Government.Hospital;
import Visitor.Government.Patient;
import Visitor.Government.PatientSituation;

import java.util.List;

public class CalculatePatientCountUtil {

    public static int calculatePatienteCount(Hospital hospital, Disease disease){

        List<Patient> patients = hospital.getPatients();
        int patientCount = 0;

        for (Patient patient : patients) {
            if (disease.equals(patient.getDisease()))
                patientCount++;
        }

        return patientCount;
    }

    public static int calculatePatienteCount(Hospital hospital, Disease disease, PatientSituation patientSituation){

        List<Patient> patients = hospital.getPatients();
        int patientCount = 0;

        for (Patient patient : patients) {
            if (disease.equals(patient.getDisease()) && patientSituation.equals(patient.getPatientSituation()))
                patientCount++;
        }

        return patientCount;
    }

}

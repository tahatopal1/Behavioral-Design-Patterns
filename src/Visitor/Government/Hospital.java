package Visitor.Government;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String name;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        patients = new ArrayList<>();
    }

    public String accept(Visitor visitor){
        return visitor.visitHospital(this);
    }

    public void addPatient(Patient patient){
        patients.add(patient);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}

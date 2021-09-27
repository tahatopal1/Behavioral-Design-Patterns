package Visitor.Government;

public class Patient {

    private String name;
    private Disease disease;
    private PatientSituation patientSituation;

    public Patient(String name, Disease disease, PatientSituation patientSituation) {
        this.name = name;
        this.disease = disease;
        this.patientSituation = patientSituation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public PatientSituation getPatientSituation() {
        return patientSituation;
    }

    public void setPatientSituation(PatientSituation patientSituation) {
        this.patientSituation = patientSituation;
    }
}

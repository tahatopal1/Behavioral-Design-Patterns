package Visitor;

import Visitor.Government.*;
import Visitor.Services.*;

public class App {
    public static void main(String[] args) {

        Patient ahmet = new Patient("Ahmet", Disease.COVID, PatientSituation.SERIOUSLY_ILL);
        Patient mehmet = new Patient("Ahmet", Disease.COVID, PatientSituation.SERIOUSLY_ILL);
        Patient fatma = new Patient("Ahmet", Disease.COVID, PatientSituation.SERIOUSLY_ILL);
        Patient nese = new Patient("Ahmet", Disease.COVID, PatientSituation.SERIOUSLY_ILL);

        Hospital capa = new Hospital("Çapa");
        capa.addPatient(ahmet);
        capa.addPatient(mehmet);
        capa.addPatient(fatma);
        capa.addPatient(nese);

        City istanbul = new City("İstanbul");
        istanbul.addHospital(capa);

        Country country = new Country("Turkey");
        country.addCity(istanbul);
        printReport(country);
    }

    private static void printReport(Country country) {

        CovidPatientCountVisitor visitor = new CovidPatientCountVisitor();
        String patientCount = visitor.visitCountry(country);

        CovidPatientDeathCountVisitor covidPatientDeathCountVisitor = new CovidPatientDeathCountVisitor();
        String covidPatientDeathCount = covidPatientDeathCountVisitor.visitCountry(country);

        CovidPatientPneumoniaCountVisitor covidPatientPneumoniaCountVisitor = new CovidPatientPneumoniaCountVisitor();
        String covidPatientPneumoniaCount = covidPatientPneumoniaCountVisitor.visitCountry(country);

        CovidSeriouslyIllCountVisitor covidSeriouslyIllCountVisitor = new CovidSeriouslyIllCountVisitor();
        String covidSeriouslyIllCount = covidSeriouslyIllCountVisitor.visitCountry(country);

        CovidPatientRecoveryCountVisitor covidPatientRecoveryCountVisitor = new CovidPatientRecoveryCountVisitor();
        String covidPatientRecoveryCount = covidPatientRecoveryCountVisitor.visitCountry(country);

        System.out.println("Patient count: " + patientCount);
        System.out.println("Death count: " + covidPatientDeathCount);
        System.out.println("Pneumonia count: " + covidPatientPneumoniaCount);
        System.out.println("Seriously Ill count: " + covidSeriouslyIllCount);
        System.out.println("Recovery count: " + covidPatientRecoveryCount);
    }
}

package Visitor.Services;

import Visitor.Government.*;

import java.util.List;

public class CovidPatientDeathCountVisitor implements Visitor {

    @Override
    public String visitHospital(Hospital hospital) {
        int patientCount = calculatePatientCount(hospital);
        return String.valueOf(patientCount);
    }

    @Override
    public String visitCity(City city) {
        int patientCount = calculatePatientCount(city);
        return String.valueOf(patientCount);
    }

    @Override
    public String visitCountry(Country country) {
        int patientCount = calculatePatientCount(country);
        return String.valueOf(patientCount);
    }

    private int calculatePatientCount(Hospital hospital) {
        return CalculatePatientCountUtil.calculatePatienteCount(hospital, Disease.COVID, PatientSituation.DEATH);
    }

    private int calculatePatientCount(City city) {

        List<Hospital> hospitals = city.getHospitals();
        int patientCount = 0;

        for (Hospital hospital : hospitals) {
            patientCount += calculatePatientCount(hospital);
        }

        return patientCount;
    }

    private int calculatePatientCount(Country country) {

        List<City> cities = country.getCities();
        int patientCount = 0;

        for (City city : cities)
            patientCount += calculatePatientCount(city);

        return patientCount;


    }
}

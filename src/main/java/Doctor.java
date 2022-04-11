import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

@Setter @Getter
public class Doctor {
    String name;
    String cureEmergency;
    boolean cure;
    String whichDoctor;
    String firstStageOfEmergency = "not urgent, something that is used for big amount of time";
    String secondStageOfEmergency = "urgent, using has to be fast";
    String thirdStageOfEmergency = "very urgent, using at max speed almost without restrictions";
    Patient patient = Patient.create();
    ArrayList<Integer> graphicOfReceptions = new ArrayList<>();

    protected Doctor(String name, String cureEmergency, boolean cure) {
        this.name = name;
        this.cureEmergency = cureEmergency;
        this.cure = cure;
    }

    protected Doctor() {
    }


    public static Doctor create() {
        Doctor doctor = new Doctor();
        return doctor;
    }

    public void getPrescriptionFromFamilyDoctor() {
        switch (Objects.requireNonNull(whichDoctor)) {
            case "AnalyzerBeforeSurgeon" -> {
                AnalyzerBeforeSurgeon analyzerBeforeSurgeon = AnalyzerBeforeSurgeon.create(AnalyzerBeforeSurgeon.name);
            }
            case "Ophthalmologist" -> {
                Ophthalmologist ophthalmologist = new Ophthalmologist(Ophthalmologist.name, Ophthalmologist.cureEmergency, Ophthalmologist.cure);
            }
            case "Surgeon" -> {
                AnalyzerBeforeSurgeon analyzerBeforeSurgeon = AnalyzerBeforeSurgeon.create(AnalyzerBeforeSurgeon.name);
                System.out.println("Firstly it has to be checked by analyzer");
            }
            case "FamilyDoctor" -> {
                System.out.println("It is own prescription");
                FamilyDoctor familyDoctor = FamilyDoctor.create();
            }
//            default -> {
//                System.out.println("It is own prescription");
//                FamilyDoctor familyDoctor = FamilyDoctor.create();
//            }
        }
    }

    public void getSurgeonPrescription(){
        Surgeon surgeon = Surgeon.create(Surgeon.name);
        surgeon.sendPrescriptionAfterSurgery(surgeon.conclusion, patient.doctor);
    }

    public String  sendPrescriptionOfFamilyDoctor(String conclusion, String whichDoctor) {
        getWhichDoctor();
        return conclusion;
    }


    public void sortTimetable() {
        graphicOfReceptions.add(patient.seeDoctorAndReasonForSeeing(patient.symptoms, patient.timeOfSeeing));
        for (int i = 0; i < graphicOfReceptions.size(); i++) {
            graphicOfReceptions.stream()
                    .sorted()
                    .forEach(System.out::println);
            if (patient.timeOfSeeing == graphicOfReceptions.get(i)) {
                patient.setTimeOfSeeing(patient.timeOfSeeing + 1);
            }
        }


    }
}

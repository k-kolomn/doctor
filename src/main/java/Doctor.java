import java.util.ArrayList;
import java.util.Comparator;

public class Doctor {
    // TODO: 28.03.2022 remake prescriptions of doctors, they can send only one pres., if they  want to send it to another doctor just add there "whichDoctor" and choice if they want or not
    String name;
    String cureEmergency;
    boolean cure;
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

    public Doctor() {}


    public static Doctor create() {
        Doctor doctor = new Doctor();
        return doctor;
    }

    public void getPrescriptionFromFamilyDoctor(){
        String whichDoctor = "There is only own prescription of family doctor";
          switch(whichDoctor){
              case "AnalyzerBeforeSurgeon":{
                        AnalyzerBeforeSurgeon analyzerBeforeSurgeon = AnalyzerBeforeSurgeon.create(AnalyzerBeforeSurgeon.name);
              } break;
              case "Ophthalmologist":{
                  Ophthalmologist ophthalmologist = new Ophthalmologist(Ophthalmologist.name, Ophthalmologist.cureEmergency, Ophthalmologist.cure);
              } break;
              case "Surgeon": {
                  AnalyzerBeforeSurgeon analyzerBeforeSurgeon = AnalyzerBeforeSurgeon.create(AnalyzerBeforeSurgeon.name);
                  System.out.println("Firstly it has to be checked by analyzer");
              } break;
              case "FamilyDoctor":{
                  System.out.println("It is owen prescription");
                  FamilyDoctor familyDoctor = FamilyDoctor.create();
              }
          }
    }


    public String sendPrescriptionOfFamilyDoctor(String conclusion) {

        return conclusion;
    }
    public void sortGraphic() {
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

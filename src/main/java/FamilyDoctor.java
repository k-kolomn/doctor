import java.util.ArrayList;

public class FamilyDoctor extends Doctor implements DoctorMethod {

    private static String name;
    private static String cureEmergency;
    private static boolean cure;
    Patient patient = Patient.create();
    Doctor doctor = new Doctor();
    ArrayList<Integer> graphic = new ArrayList<>();
    protected FamilyDoctor(String name,String cureEmergency, boolean cure) {
        super(name, cureEmergency,cure);
    }

    @Override
    public String sendOwnPrescription(String conclusion, String whichDoctor) {
        if (patient.symptoms.equals(firstStageOfEmergency)){
            cureEmergency = firstStageOfEmergency;
            sendOwnPrescription(conclusion, "Family Doctor");
        } else if (patient.symptoms.equals(secondStageOfEmergency) && patient.symptoms.equals("Heart Attacks") || patient.symptoms.equals("Stomach Aches")){
            cureEmergency =  secondStageOfEmergency;
            sendOwnPrescription(conclusion,  "AnalyzerBeforeSurgeon");
        } else if (patient.symptoms.equals(thirdStageOfEmergency) && patient.symptoms.equals("Head Aches")){
            cureEmergency = thirdStageOfEmergency;
            sendOwnPrescription( conclusion,  "Ophthalmologist");
            sendOwnPrescription(conclusion, "AnalyzerBeforeSurgeon");
        }
        if (!cure){
            sendOwnPrescription(conclusion, String.valueOf(doctor));
        } else {
            sendOwnPrescription(conclusion ,  String.valueOf(doctor));
        }
        return conclusion;

    }

    public static FamilyDoctor create(){
        FamilyDoctor familyDoctor = new FamilyDoctor(name, cureEmergency, cure);

        return familyDoctor;
    }



}

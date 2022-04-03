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
            sendOwnPrescription(" ", " ");
        } else if (patient.symptoms.equals(secondStageOfEmergency)){
            cureEmergency =  secondStageOfEmergency;
            sendOwnPrescription(" ",  " ");
        } else {
            cureEmergency = thirdStageOfEmergency;
            sendOwnPrescription(" ",  " ");
        }
        if (!cure){
            sendOwnPrescription(" ",  " ");
        } else {
            sendOwnPrescription("Doctor has cure" ,  "");
        }
        return conclusion;

    }

    public static FamilyDoctor create(){
        FamilyDoctor familyDoctor = new FamilyDoctor(name, cureEmergency, cure);

        return familyDoctor;
    }



}

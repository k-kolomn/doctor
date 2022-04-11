import java.util.ArrayList;

public class AnalyzerBeforeSurgeon extends Doctor implements DoctorMethod{

    static String name;
    static boolean cure;
    static String cureEmergency;
    boolean surgery = false;
    Patient patient = Patient.create();
    Doctor doctor = new Doctor();
    Surgeon surgeon = new Surgeon(Surgeon.name);
    ArrayList<Integer> graphic = new ArrayList<>();
    protected AnalyzerBeforeSurgeon(String name,String cureEmergency, boolean cure) {
        super(name,cureEmergency ,cure);
    }



    @Override
    public String sendOwnPrescription(String conclusion,String whichDoctor) {
        if (doctor.sendPrescriptionOfFamilyDoctor(conclusion, whichDoctor).equals(doctor.firstStageOfEmergency)){
            sendOwnPrescription(conclusion, whichDoctor);
        } else if (doctor.sendPrescriptionOfFamilyDoctor( conclusion, whichDoctor).equals(doctor.secondStageOfEmergency)){
            sendOwnPrescription(conclusion, whichDoctor);
        } else {
            sendOwnPrescription(conclusion, whichDoctor);
        }
        if (!cure){
            sendOwnPrescription( conclusion,  String.valueOf(surgeon));
        } else {
            sendOwnPrescription("Doctor has cure" , String.valueOf(this));
        }
        if (!cure){
            sendOwnPrescription(conclusion, String.valueOf(surgeon));
            surgery = true;
        } else {
            sendOwnPrescription("Doctor has cure", String.valueOf(this));
        }
        return  conclusion;
    }

    public static AnalyzerBeforeSurgeon create(String name){
        AnalyzerBeforeSurgeon analyzerBeforeSurgeon = new AnalyzerBeforeSurgeon(name, cureEmergency ,cure);

        return analyzerBeforeSurgeon;
    }

}

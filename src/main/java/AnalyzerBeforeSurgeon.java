import java.util.ArrayList;

public class AnalyzerBeforeSurgeon extends Doctor implements DoctorMethod{

    static String name;
    boolean cure;
    String cureEmergency;
    Patient patient = Patient.create();
    Doctor doctor = new Doctor();
    Surgeon surgeon = new Surgeon(Surgeon.name);
    ArrayList<Integer> graphic = new ArrayList<>();
    protected AnalyzerBeforeSurgeon(String name,String cureEmergency, boolean cure) {
        super(name,cureEmergency ,cure);
    }



    @Override
    public String sendOwnPrescription(String conclusion,String whichDoctor) {
        if (doctor.sendOwnPrescription(conclusion ).equals(doctor.firstStageOfEmergency)){
            sendOwnPrescription(" ", "" );
        } else if (doctor.sendOwnPrescription(conclusion).equals(doctor.secondStageOfEmergency)){
        sendOwnPrescription(" ", " ");
        } else {
            sendOwnPrescription(" " , " ");
        }
        if (!cure){
            sendOwnPrescription( " ",  String.valueOf(surgeon));
        } else {
            sendOwnPrescription("Doctor has cure" , String.valueOf(this));
        }
        if (!cure){
            sendOwnPrescription(" ", String.valueOf(surgeon));
        } else {
            sendOwnPrescription("Doctor has cure", String.valueOf(this));
        }
        return  conclusion;

    }

    public static AnalyzerBeforeSurgeon create(String name){
        AnalyzerBeforeSurgeon analyzerBeforeSurgeon = new AnalyzerBeforeSurgeon(name, this.cure);

        return analyzerBeforeSurgeon;
    }

}

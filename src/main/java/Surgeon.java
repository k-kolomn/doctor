import java.util.*;

public class Surgeon {
    static String name;
    String typeOfSurgery;
    String conclusion;
    Map <String, Integer> timetable = new HashMap <String, Integer>();
    AnalyzerBeforeSurgeon analyzerBeforeSurgeon = AnalyzerBeforeSurgeon.create(AnalyzerBeforeSurgeon.name);
    Patient patient = Patient.create();

    protected Surgeon(String name){
        this.name = name;
    }

    public static Surgeon create(String name){
        Surgeon surgeon = new Surgeon(name);
        return surgeon;
    }

    public void conductSurgery(){
        if (analyzerBeforeSurgeon.surgery) conductSurgery();
        timetable.put(typeOfSurgery, patient.timeOfSeeing);
    }
    public String sendPrescriptionAfterSurgery(String conclusion, Doctor doctor){
        doctor.getSurgeonPrescription();
        return conclusion;
    }
}



public class Pediatric extends Doctor implements DoctorMethod {
    String name;
    String cureEmergency;
    boolean cure;
// TODO: 
    protected Pediatric(String name, String cureEmergency, boolean cure){
        super(name, cureEmergency,cure);
    }
    @Override
    public String sendOwnPrescription(String conclusion, String whichDoctor) {
        return conclusion;
        
    }
}

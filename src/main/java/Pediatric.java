

public class Pediatric extends Doctor implements DoctorMethod {
  static String name;
  static String cureEmergency;
  static boolean cure;

    protected Pediatric(String name, String cureEmergency, boolean cure){
        super(name, cureEmergency,cure);
    }
    @Override
    public String sendOwnPrescription(String conclusion, String whichDoctor) {
        return conclusion;
    }


}

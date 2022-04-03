

public class Pediatric extends Doctor implements DoctorMethod {
    String name;

    @Override
    public String sendOwnPrescription(String conclusion, String whichDoctor) {
        return conclusion;
    }
}

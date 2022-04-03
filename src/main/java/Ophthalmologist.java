import java.util.ArrayList;

public class Ophthalmologist extends Doctor implements DoctorMethod{
    static String name;
    static String cureEmergency;
    static boolean cure;
    ArrayList<Integer> graphic = new ArrayList<>();
    FamilyDoctor familyDoctor =FamilyDoctor.create();


    protected Ophthalmologist(String name, String cureEmergency,boolean cure) {
        this.name = name;
        this.cure = cure;
        this.cureEmergency = cureEmergency;
        }

        public static Ophthalmologist create(){
        Ophthalmologist ophthalmologist = new Ophthalmologist(name, cureEmergency, cure);

            return ophthalmologist;
        }

    @Override
    public String sendOwnPrescription(String conclusion, String whichDoctor) {
        return conclusion;
    }
}

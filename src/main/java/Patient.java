public class Patient {
    String name;
    int age;
    String surname;
    String symptoms;
    int timeOfSeeing;
    Doctor doctor = Doctor.create();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getTimeOfSeeing() {
        return timeOfSeeing;
    }

    public void setTimeOfSeeing(int timeOfSeeing) {
        this.timeOfSeeing = timeOfSeeing;
    }

    private Patient() {
    }

    public static Patient create() {
        Patient patient = new Patient();

        return patient;
    }

    public int seeDoctorAndReasonForSeeing(String symptoms, int timeOfSeeing){
        switch (symptoms){
            case "Eye problems":{
                Ophthalmologist ophthalmologist = new Ophthalmologist(Ophthalmologist.name, Ophthalmologist.cureEmergency, Ophthalmologist.cure);
                ophthalmologist.graphic.add(timeOfSeeing);
            } break;
            case "Cold":{
                FamilyDoctor familyDoctor = FamilyDoctor.create();
                familyDoctor.graphic.add(timeOfSeeing);
            } break;
            case "Heart problems":
            case "Stomach": {
                FamilyDoctor familyDoctor = FamilyDoctor.create();
                AnalyzerBeforeSurgeon analyzerBeforeSurgeon = AnalyzerBeforeSurgeon.create(AnalyzerBeforeSurgeon.name);
                familyDoctor.graphic.add(timeOfSeeing);
                analyzerBeforeSurgeon.graphic.add(timeOfSeeing);
            } break;
        }
        if (age < 18){
            Pediatric pediatric = new Pediatric();
        }




        return timeOfSeeing;
    }

}

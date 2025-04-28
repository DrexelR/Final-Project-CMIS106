public class Patient {
    public Patient (int id) {
        patientID = id;
    }
    public String toString() {
        return String.format("Patient ID: %d", patientID );
    }
    private int patientID;
}

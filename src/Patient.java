public class Patient {
    public Patient (int id) {
        patientID = id;
    }
    public String toString() {
        return String.format("Patient ID: %d", patientID );
    }
    private int patientID;
    private Observation[] observations = new Observation[1];
    public void alerts (int currentTime) {
        for (int i = 0; i < observations.length; i++){
            if (observations[i].dangerous()){
                System.out.println("Alert at time" + currentTime + "patient " + patientID + " " + observations[i].data());
            }
        }
    }
}

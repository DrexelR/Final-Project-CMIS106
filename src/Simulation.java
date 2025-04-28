public class Simulation {
    public void run() {

    }

    public void setup() {
        Patient[] patients = new Patient[100];
        for (int i = 0; i < patients.length; i++) {
// create a new Patient object and store in patients[i]
            patients[i] = new Patient(i);
        }
    }

    public void process() {

    }
}

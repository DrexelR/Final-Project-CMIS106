import java.util.Random;

abstract class Observation {
    abstract public void sample();
    abstract public boolean dangerous();
    abstract public String data();

    static protected Random random() {return rng;}
    static private Random rng = new Random();
}

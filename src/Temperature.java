class Temperature extends Observation {
    public void sample () {
        celsiusValue = 36.0 + 2.2 * random().nextDouble();
    }
    public boolean dangerous() {
        return (celsiusValue > 38.0);
    }
    public String data() {
        return "Temp: "+ celsiusValue + " C";
    }
    public Temperature () {}

    private double celsiusValue;
}

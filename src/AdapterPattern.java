public class AdapterPattern implements Metr{
    private Centimeter centimeter;

    public AdapterPattern(Centimeter centimeter) {
        this.centimeter = centimeter;
    }

    @Override
    public void getValue() {
        centimeter.convertToMeter();
    }
}
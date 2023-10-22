public class Main {
    public static void main(String[] args) {
        Centimeter centimeter = new Centimeter();
        Metr metr = new AdapterPattern(centimeter);

        metr.getValue();
    }
}
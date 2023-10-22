import java.util.Scanner;

public class Centimeter {
    Scanner scanner = new Scanner(System.in);
    public void convertToMeter() {
        System.out.print("Enter how many CM need to be converted to meter: ");
        float CM = scanner.nextInt();
        float M = CM/100;
        System.out.println("It's "+M+" Meter");
    }
}
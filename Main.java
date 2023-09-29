import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sourceUnit = scanner.nextInt();
        int targetUnit = scanner.nextInt();
        //Handle Length Conversion
        System.out.println("Length Conversion:");
        System.out.println("1. Nanometers");
        System.out.println("2. Microns");
        System.out.println("3. Millimeters");
        System.out.println("4. Centimeters");
        System.out.println("5. Meters");
        System.out.println("6. Kilometers");
        System.out.println("7. Inches");
        System.out.println("8. Feet");
        System.out.println("9. Yards");
        System.out.println("10. Miles");
        System.out.println("11. Nautical Miles");
        System.out.print("Enter the source length unit (1/2/3/4/5/6/7/8/9/10/11): ");
        sourceUnit = scanner.nextInt();
        System.out.print("Enter the length value: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the target length unit (1/2/3/4/5/6/7/8/9/10/11): ");
        targetUnit = scanner.nextInt();
        System.out.println("Converted volume: " + Converter.convertLength(length, sourceUnit, targetUnit));


    }
}

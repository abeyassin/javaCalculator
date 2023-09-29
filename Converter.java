public class Converter {
    //Centimeters: Meters length / 100; Feet length * 0.0328084; Inches length * 0.393701;
    //Feet: Meters length *  0.3048; Centimeters length * 30.48; Inches length * 12;
    //Inches: Meters length * 0.0254; Centimeters length * 2.54; Feet length * 0.0833333;
    public static double convertLength(double length, int sourceUnit, int targetUnit) {
        switch (sourceUnit) {
            case 1: // Nanometers
                switch (targetUnit) {
                    case 1: // Nanometers
                        return length;
                    case 2: // Micrometer
                        return length / 1000;
                    case 3: // Millimeter
                        return length / 1000000;
                    case 4: // Centimeters
                        return length / 10000000;
                    case 5: // Meters
                        return length / 1000000000;
                    case 6: // Kilometers
                        return length / 1000000000000;
                    case 7 : // Inches
                        return length / 25400000;
                    case 8: // Feet
                        return length / 304800000;
                    case 9: // Yards
                        return length / 914400000;
                    case 10: //Miles
                        return length / 1609000000000;
                    case 11: // Nautical Mile
                        return length / 1852000000000;
                }

                break;
        }
        return 0.0; // Default if units are not recognized
    }

}

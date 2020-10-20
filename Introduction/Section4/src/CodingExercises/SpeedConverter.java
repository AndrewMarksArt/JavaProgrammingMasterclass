package CodingExercises;

public class SpeedConverter {
    public static void main(String[] args){
        printConversion(10.5);
    }

    public static long toMPH(double kph){
        if (kph < 0) {
            return -1;
        }

        return Math.round(kph/1.609);
    }

    public static void printConversion(double kph){
        if (kph <0 ) {
            System.out.println("invalid kph value");
        } else {
            long mph = toMPH(kph);
            System.out.println(kph + "km/h = " + mph + " mi/h");
        }

    }
}

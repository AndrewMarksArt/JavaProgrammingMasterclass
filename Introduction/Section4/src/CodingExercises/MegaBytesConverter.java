package CodingExercises;

public class MegaBytesConverter {

    public static void main(String[] args){
        printMBandKB(5000);

    }

    public static void printMBandKB(int kb) {
        if (kb < 0) {
            System.out.println("Invalid Value");
        } else {
            long mb = convertKBtoMB(kb);
            int leftOver = kb % 1024;
            System.out.println(kb +" KB = " + mb +" MB and "+ leftOver +" KB");
        }
    }

    public static long convertKBtoMB (int kb) {
        if ( kb < 0) {
            return -1;
        }
        return kb / 1024;
    }
}

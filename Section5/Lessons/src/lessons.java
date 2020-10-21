public class lessons {
    public static void main(String[] args) {
        switchStatements();
    }

    public static void switchStatements(){
        // without switch statements --> gets messy fast
        int value = 1;
        if (value==1){
            System.out.println("value = 1");
        } else if (value==2) {
            System.out.println("value = 2");
        } else {
            System.out.println("not 1 or 2");
        }

        //using a switch statement
        char switchValue = 'A';

        switch (switchValue) {
            case 'A':
                System.out.println("Value = A");
                break;
            case 'B':
                System.out.println("value = B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("was C, D, or E");
                System.out.println("it was a " + switchValue);
                break;
            default:
                System.out.println("not A, B, C, D, or E");
                break;
        }

    }
}

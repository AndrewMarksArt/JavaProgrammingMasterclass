public class challenges {
    public static void main(String[] args) {
        dayOfWeek(3);
    }

    public static void dayOfWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Today is Sunday");
                break;
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Please try again with a vaild number 0-6");
                break;
        }
    }
}

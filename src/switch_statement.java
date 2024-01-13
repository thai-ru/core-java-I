public class switch_statement {
    public static void main(String[] args) {
        int weekDayCode = 0;

        String weekDays = switch (weekDayCode) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "not valid";
        };

        System.out.println(weekDays);
    }
}

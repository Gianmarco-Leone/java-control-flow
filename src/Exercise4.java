// Use an array of days of the week, enhanced ‘for-loop’ and if/else to create the following output.
// We eat pot roast on Sunday
// We eat spaghetti on Monday
// We eat tacos on Tuesday
// We eat chicken on Wednesday
// We eat meatloaf on Thursday
// We eat hamburgers on Friday
// We eat pizza on Saturday

public class Exercise4 {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (String day: daysOfWeek) {
            switch (day) {
                case "Sunday":
                    System.out.println("We eat pot roast on Sunday");
                    break;
                case "Monday":
                    System.out.println("We eat spaghetti on Monday");
                    break;
                case "Tuesday":
                    System.out.println("We eat tacos on Tuesday");
                    break;
                case "Wednesday":
                    System.out.println("We eat chicken on Wednesday");
                    break;
                case "Thursday":
                    System.out.println("We eat meatloaf on Thursday");
                    break;
                case "Friday":
                    System.out.println("We eat hamburgers on Friday");
                    break;
                case "Saturday":
                    System.out.println("We eat pizza on Saturday");
                    break;
                default:
                    System.out.println("I don't eat");
                    break;
            }
        }
    }
}

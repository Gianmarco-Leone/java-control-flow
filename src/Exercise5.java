// Repeat exercise #4 but instead of switch/case, use if/else.

public class Exercise5 {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (String day: daysOfWeek) {
            if ("Sunday".equals(day)) {
                System.out.println("We eat pot roast on Sunday");
            } else if ("Monday".equals(day)) {
                System.out.println("We eat spaghetti on Monday");
            } else if ("Tuesday".equals(day)) {
                System.out.println("We eat tacos on Tuesday");
            } else if ("Wednesday".equals(day)) {
                System.out.println("We eat chicken on Wednesday");
            } else if ("Thursday".equals(day)) {
                System.out.println("We eat meatloaf on Thursday");
            } else if ("Friday".equals(day)) {
                System.out.println("We eat hamburgers on Friday");
            } else { // Qui non serve un else if perchè è l'ultima opzione rimasta
                System.out.println("We eat pizza on Saturday");
            }
        }
    }
}

// Iterate over all the days of the week in an array and add up the total number of characters
// in all the days of the week. E.g., “Sunday”=6, “Monday”=6, etc. therefore, answer should
// be 50.

public class Exercise7 {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int totalStringChar = 0;

        for (String day : daysOfWeek) {
            System.out.println(day.length());
            totalStringChar = totalStringChar + day.length();
//            totalStringChar+=day.length(); // forma breve
        }
        System.out.println(totalStringChar);
    }
}

// Write a method in 4 lines of code (not including method name/signature & curly braces) that
// outputs the days of the week, one per line, using a regular ‘for-loop’ and an array.
// 1. Do it again using the enhanced ‘for-loop’.
// 2. Do it again but make every other output line fully capitalized.
// Sunday
// MONDAY
// Tuesday
// WEDNESDAY
// etc…
// 3. Do it again but use only 4 lines of code (not including method and curly braces of method.

import org.w3c.dom.ls.LSOutput;

public class Exercise1 {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//        for (int i = 0; i < daysOfWeek.length; i++) {
//            System.out.println(daysOfWeek[i]);
//        }

//        for (String day: daysOfWeek) {
//            System.out.println(day);
//        }

//        for (int i = 0; i < daysOfWeek.length; i++) {
//            if (i % 2 == 0) {
//                System.out.println(daysOfWeek[i]);
//            } else {
//                System.out.println(daysOfWeek[i].toUpperCase());
//            }
//        }

        for (int i = 0; i < daysOfWeek.length; i++) {
            String text = (i % 2 == 0) ? (daysOfWeek[i]) : daysOfWeek[i].toUpperCase();
            System.out.println(text);
        }
    }
}

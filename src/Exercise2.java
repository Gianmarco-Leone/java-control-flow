// Repeat all parts of exercise #1, but use ‘while-loop’ instead of ‘for-loop’ (where applicable).

public class Exercise2 {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int i = 0;
//        while (i < daysOfWeek.length) {
//            System.out.println(daysOfWeek[i]);
//            i++;
//        }

//        while (i < daysOfWeek.length) {
//            if (i % 2 == 0) {
//                System.out.println(daysOfWeek[i++]);
//            } else {
//                System.out.println(daysOfWeek[i++].toUpperCase());
//            }
//        }

        while (i < daysOfWeek.length) {
            String output = (i % 2 == 0) ? daysOfWeek[i++] : daysOfWeek[i++].toUpperCase();
            System.out.println(output);
        }
    }
}

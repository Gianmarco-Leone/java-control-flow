// Do #2 again but use a ‘do-while-loop’.

public class Exercise3 {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int i = 0;
//        do {
//            System.out.println(daysOfWeek[i]);
//            i++;
//        } while (i < daysOfWeek.length);

//        do {
//            if (i % 2 == 0) {
//                System.out.println(daysOfWeek[i++]);
//            } else {
//                System.out.println(daysOfWeek[i++].toUpperCase());
//            }
//        } while (i < daysOfWeek.length);

        do {
            String output = (i % 2 == 0) ? daysOfWeek[i++] : daysOfWeek[i++].toUpperCase();
            System.out.println(output);
        } while (i < daysOfWeek.length);
    }
}

// Repeat exercise #5 but use newer switch expression with as little repetition as possible
//      1. Add a private method that can capitalize the first letter of each word of the meal. So,
//      instead of “We eat spaghetti on Sunday”, it would print, “We eat Spaghetti on Sunday”.
//      Do not just capitalize the meal names yourself. Let your new method do it for you.
//      2. Improve on 6.1 to make it smart enough to output: “We eat Pot Roast on Sunday”, i.e.,
//      it should capitalize each word of a multi-word meal name.

public class Exercise6 {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (String day : daysOfWeek) {
            String meal = switch (day) {
                case "Sunday" -> "pot roast";
                case "Monday" -> "spaghetti";
                case "Tuesday" -> "tacos";
                case "Wednesday" -> "chicken";
                case "Thursday" -> "meatloaf";
                case "Friday" -> "hamburgers";
                default -> "pizza";
            };
//            System.out.printf("We eat %s on %s.%n", meal, day); // Soluzione base
//            System.out.printf("We eat %s on %s.%n", capitalize(meal), day); // Soluzione 6.1
            System.out.printf("We eat %s on %s.%n", capitalizeMoreWord(meal), day); // Soluzione 6.2
        }

    }
    private static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    private static String capitalizeMoreWord(String meal) {
//        Genero array dalla parola che mi arriva con limitatori gli spazi
        String[] words = meal.split(" ");
//        Aggiungo +1 perchè dopo aggiungerò uno "spazio" ad entrambe le parole.
//        Esempio: "pot roast", è lungo 9 char, se aggiungo uno spazio ad entrambe le parole ottengo
//        "pot " & "roast ", lungo 10 char.
//        Se invece non aggiungo nessuno spazio mi ritorna "PotRoast", e non è ciò che richiede la traccia.
        StringBuilder sb = new StringBuilder(meal.length() + 1);
        for (String word : words) {
            sb.append(capitalize(word)).append(" ");
        }
//        Rimuovo spazio esterno
        String result = sb.toString().strip();
        return result;
    }
}

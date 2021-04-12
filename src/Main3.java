import java.util.*;

public class Main3 {

    public static void main(String[] args) {

        List<String> colors = Arrays.asList("Red", "Blue", "Green", "Green", "Black", "Red",
                "Yellow", "Orange", "Magenta", "Magenta", "Magenta");

        System.out.println("Исходный список:");
        for (String s: colors) {
            System.out.println(s);
        }

        System.out.println("\nКоличество повторов:");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : colors) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String, Integer> e : wordsCount.entrySet()) {
            System.out.println(e.getKey() + " — " + e.getValue());
        }

        System.out.println("\nСписок без повторов: ");
        Set<String> unique = new HashSet<>(colors);
        for (String s: unique) {
            System.out.println(s);
        }
    }

}
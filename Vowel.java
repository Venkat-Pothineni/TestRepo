/* String starts with vowel & end with vowel */
import java.util.*;
import java.util.stream.Collectors;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        List<String> li = List.of("america", "ireland","africa", "england", "asia", "Apple", "ideA");
        li = li.stream().filter(e-> e.matches("^[AEIOUaeiou].*[aeiouAEIOU]$")).collect(Collectors.toList());
        li.forEach(System.out::println);
    }
}
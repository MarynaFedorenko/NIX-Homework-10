package nix.data;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOfStringsWithWords {

    private static void print(List<String> strings){
        System.out.print("List of strings: ");
        for(int i=0; i<strings.size();i++) System.out.print("  "+strings.get(i));
        System.out.println();
    }

    public static void task(List<String> stringOfWords){
        print(stringOfWords);
        List<String> words = new ArrayList<>();
        for(int i=0; i<stringOfWords.size(); i++) {
            String[] temp = stringOfWords.get(i).split("\\s+");
            for (int j=0; j<temp.length; j++)
                words.add(temp[j].toLowerCase());
        }
        words = words.stream()
                .filter(s-> IntStream
                        .range(0, s.length()/2)
                        .noneMatch(i->s.charAt(i) != s.charAt(s.length()-i-1)))
                .collect(Collectors.toList());
        System.out.print("Found palindroms: ");
        for(int i=0; i<words.size();i++) System.out.print("  "+words.get(i));
        System.out.println();



    }
}

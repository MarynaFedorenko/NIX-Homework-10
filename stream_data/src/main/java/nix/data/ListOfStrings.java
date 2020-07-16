package nix.data;

import java.time.Year;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ListOfStrings {
    private static void print(List<String> strings, Pattern regex){
        System.out.print("String: ");
        for(int i=0; i<strings.size();i++) System.out.print("  "+strings.get(i));
        System.out.println();
        System.out.println("Regex: "+ regex);
    }

    public static void task(List<String> strings, Pattern regex){
        print(strings, regex);
        List<String> result = strings.stream()
                .map(s->{
                 s = s.replaceAll(regex.toString(), "");
                 return s;})
                .collect(Collectors.toList());
        System.out.print("Result string: ");
        for(int i=0; i<result.size();i++) System.out.print("  "+result.get(i));
        System.out.println();

    }
}

package nix;

import nix.data.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Random;
import java.util.function.UnaryOperator;
import java.util.regex.*;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("____________Task 1______________");
        Double [] doubles = {2.3, -13.5, 5.5, 10.7, 9.0};
        ArrayOfDoubles.task(doubles);

        System.out.println("____________Task 2______________");
        Year[] years = {Year.of(2000), Year.of(1994), Year.of(1999),Year.of(1976)};
        YearsCollection.task(years);

        System.out.println("____________Task 3______________");
        List<String> strings = new ArrayList<>();
        strings.add("Повсе1дневная 8прак7тика");
        strings.add("показывает, что дальнейшее");
        strings.add("разв5итие различных3 форм 2деятельности");
        strings.add("играет4 важную р9оль");
        strings.add("в формировании позиций");
       Pattern regex = Pattern.compile("\\d");
        ListOfStrings.task(strings, regex);

        System.out.println("____________Task 4______________");
        List<String> stringOfWords = new ArrayList<>();
        stringOfWords.add("Madam wanted");
        stringOfWords.add("to show her level of stats");
        stringOfWords.add("which made a wow effect on Anna");
        stringOfWords.add("yesterday at noon");
        ListOfStringsWithWords.task(stringOfWords);

        System.out.println("____________Task 5______________");
        Random random = new Random();
        SequenceOfPrimeNumbers.task(3+random.nextInt(15));

        System.out.println("____________Task 6______________");
        Collection<LocalDate> birthdays = new ArrayList<>();
        birthdays.add(LocalDate.of(2001,2,28));
        birthdays.add(LocalDate.of(1999,2,11));
        birthdays.add(LocalDate.of(1976,5,23));
        birthdays.add(LocalDate.of(1958,7,14));
        birthdays.add(LocalDate.of(1958,7,3));
        BirthdaysOfStaff.task(birthdays);


        System.out.println("____________Task 7______________");
        int [] integers = new int [10];
        for(int i=0; i<integers.length; i++)
            integers[i] = -10 + random.nextInt(20);
        ArrayOfIntegers.task(integers);

        System.out.println("____________Task 8______________");
        List<UnaryOperator<Integer>> unaryOperators = new ArrayList<>();
        unaryOperators.add(x -> x * x);
        unaryOperators.add(x -> x + x);
        unaryOperators.add(x -> x * 2);
        System.out.println("Unary operators: x * x,  x + x, x * 2");
        int numb = 10+random.nextInt(20);
        ListOfUnaryOperators.task(unaryOperators, numb);


    }
}

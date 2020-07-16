package nix.data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayOfIntegers {

    public static void print(int [] integers){
        System.out.print("Array of integers: ");
        for(int i=0; i<integers.length; i++)
            System.out.print("  "+ integers[i]);
        System.out.println();
    }

    public static void task(int [] integers){
        print(integers);
        int [] countable = Arrays.stream(integers)
                .filter(elem-> elem%2 ==0)
                .toArray();
        int [] uncountable = Arrays.stream(integers)
                .filter(elem-> elem%2 !=0)
                .toArray();
        System.out.print("Countable elements: ");
        for(int i=0; i<countable.length; i++)
            System.out.print("  "+ countable[i]);
        System.out.println();
        System.out.print("Array of integers: ");
        for(int i=0; i<uncountable.length; i++)
            System.out.print("  "+ uncountable[i]);
        System.out.println();
    }
}

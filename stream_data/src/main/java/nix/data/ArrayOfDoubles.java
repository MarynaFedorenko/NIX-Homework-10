package nix.data;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayOfDoubles {
    private static void print(Double [] arr){
        System.out.print("Array: ");
        for(int i=0; i<arr.length;i++) System.out.print("  "+arr[i]);
        System.out.println();
    }

    public static void task (Double [] arr){
        print(arr);
        System.out.println("Max element: "+ Arrays.stream(arr).mapToDouble(Double::doubleValue).max().getAsDouble());
        System.out.println("Min element: "+ Arrays.stream(arr).mapToDouble(Double::doubleValue).min().getAsDouble());
        System.out.println("Average of array: "+ Arrays.stream(arr).mapToDouble(Double::doubleValue).average().orElse(Double.NaN));
        System.out.println("Sum of all elements: "+Arrays.stream(arr).mapToDouble(Double::doubleValue).sum());

    }
}

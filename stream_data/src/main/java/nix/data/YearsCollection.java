package nix.data;

import java.time.Year;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class YearsCollection {
    private static void print(Year[] years){
        System.out.print("Years: ");
        for(int i=0; i<years.length;i++) System.out.print("  "+years[i]);
        System.out.println();
    }

    public static void task(Year[] years){
        print(years);
        List<Year> yearsList = Arrays.asList(years);
        yearsList = yearsList.stream()
                .filter(year-> year.getValue()%4==0 && (year.getValue()%100 != 0 ||(year.getValue()%100 == 0 && year.getValue()%400 == 0)))
                .sorted()
                .collect(Collectors.toList());
        System.out.println("YearsList: "+ yearsList);

    }

}

package nix.data;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
public class BirthdaysOfStaff {

    private static void print(Collection<LocalDate> birthdays){
        System.out.print("Birthdays: ");
        for(int i=0; i<birthdays.size(); i++){
            System.out.println(birthdays);
        }
    }

    public static void task(Collection<LocalDate> birthdays){
        print(birthdays);
        Map<Month, Long> result = birthdays
                .stream()
                .collect(groupingBy(LocalDate::getMonth, counting()));
        System.out.print("Days of birth in each month: "+result);
        System.out.println();
    }
}

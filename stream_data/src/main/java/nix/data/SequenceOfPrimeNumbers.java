package nix.data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SequenceOfPrimeNumbers {

    public static void task(int count){
        List<BigInteger> sequence = Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE)).limit(count).collect(Collectors.toList());
        System.out.print("Sequence: ");
        for(int i=0; i<sequence.size(); i++){
            System.out.print("  "+sequence.get(i));
        }
        System.out.println();
    }
}

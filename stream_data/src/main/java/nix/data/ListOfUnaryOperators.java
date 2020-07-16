package nix.data;

import java.util.List;
import java.util.function.UnaryOperator;

public class ListOfUnaryOperators {

    public static void task(List<UnaryOperator<Integer>> unaryOperators, int numb){

        UnaryOperator<Integer> union = unaryOperators.stream()
                .reduce(s -> s, (a, b) -> s -> b.apply(a.apply(s)));
        Integer result = union.apply(numb);;
        System.out.println("Number = "+numb+"   result = "+result);
    }

}

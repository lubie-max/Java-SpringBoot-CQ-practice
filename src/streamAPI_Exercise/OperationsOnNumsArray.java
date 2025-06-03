package streamAPI_Exercise;

import java.util.List;
import java.util.Optional;

public class OperationsOnNumsArray {

    public static void main(String[] args) {


        List<Integer> nums = List.of(9, 10 , 1, 2,6, 7, 8, 3, 4, 5);

        List<Integer> evenNums = nums.stream()
                .filter(i -> i % 2 == 0)
                .toList();


        System.out.println("Even Numbers ::: ");
        evenNums.forEach(System.out::println);


// Max Element
        System.out.println("############################");
        Optional<Integer> mxNum =  nums.stream()
                .max(Integer::compare);

        System.out.println("Max Number" + " - > " + mxNum);

        System.out.println("############################");

//        total sum of nums

        Integer totalSum = nums.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Total Sum - > " + totalSum);




    }
}

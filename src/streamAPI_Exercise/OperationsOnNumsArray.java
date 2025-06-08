package streamAPI_Exercise;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OperationsOnNumsArray {

    public static void main(String[] args) {


        List<Integer> nums = List.of(9, 10 , 1, 2,6, 7, 8, 10 , 3, 4, 1, 5 , 99);

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


//        sort elements


        System.out.println("Sorted Element : " );

        List<Integer> sortedElm = nums.stream()
                .sorted()
                .toList();

        System.out.println(sortedElm);


//        Count Element greater than 5


        List<Integer> greaterThan5  = nums.stream()
                .filter(i -> i >5 )
                .toList()
                ;

        System.out.println("Elements > 5 :: " + greaterThan5);

        Long countOfGreaterThan5 = greaterThan5.stream()
                .count();

        System.out.println(">5 Count :: " + countOfGreaterThan5);


//        Get Distinct Elements.

        List<Integer> distinctElm = nums.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println("Distinct Elements :: " + distinctElm);

//        get the sum of the array.

        int total = nums.stream()
                .reduce(0 , Integer::sum)
                ;

        System.out.println("Sum of nums Array :: " + total);


//        Find any Element from the nums list

        Optional<Integer> anyElmnt = nums.stream()
                .findAny();

        System.out.println("Any Element from the nums :: " + anyElmnt);


//        Check all numbers from nums are possitive :


        boolean allPositive = nums.stream()
                .allMatch(i -> i>0);

        System.out.println("all positive : " + allPositive);

//

        List<Integer> ages1 = Arrays.asList(11, 33, 44, 55, 33);
        List<Integer> ages = Arrays.asList(11, 33, 44, 55, 33);

        List<String> names = Arrays.asList("lubna", "salona");
        List<String> names1 = Arrays.asList("lubna", "salona");


        boolean ifSame = names1.stream()
                .equals(names);

        System.out.println("if ages1 == ages :: " + ifSame);



    }
}

package streamAPI_Exercise;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.stream.Collectors;

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

// Find first


        Optional<Integer> first = nums.stream()
                .findFirst();

        System.out.println("First elmt of nums :: " + first);


//        Nested Map

        List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1,2,5,5), Arrays.asList(4,5,7,8));

        List<Integer> flattenedList = nestedList.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println("Flattend List :: " + flattenedList);



//        Peak elmnt

        List<Integer> peak = nums.stream()
                .peek(System.out::println)
                .toList();

//        System.out.println(peak);


//        Limiting and Sorting


        List<Integer> limitTo4 = nums.stream()
                .sorted(Comparator.reverseOrder())
                .limit(4)
                .sorted()
                .toList();



        System.out.println("Limiting to 4th "+ limitTo4);


//        Skipping Elements

        List<Integer> skippedElm = nums.stream()
                .skip(5)
                .toList();

        System.out.println("Skipped first 5 elemnts : " + skippedElm);


//        Remove Duplicates


        Set<Integer> uniqNums = nums.stream()
                .collect(Collectors.toSet());

        System.out.println("uniq nums : "+ uniqNums);


//        Statastics for objs

        IntSummaryStatistics summaryStatistics = nums.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics()
                ;

        System.out.println("Summary Stats for nums : " + summaryStatistics);



    }
}

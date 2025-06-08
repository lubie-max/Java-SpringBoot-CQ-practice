package streamAPI_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OperationsOnStringArray {

    public static void main(String[] args) {



        List<String> languages = Arrays.asList("Python", "java", "cpp","sqL");
        ArrayList<String> l = new ArrayList<>();
        l.add("p");l.add("j"); l.add("c");

//        Uppercase the element of  list

        List<String> upperCase = languages.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Uppercase :: ");
        upperCase.forEach( System.out::println);


        List<String> fullnames = Arrays.asList("Lubna Shaikh", "Salona Shaikh", "Mahek Shaikh");


        List<String> names = fullnames.stream()
                .map(e -> e.split(" ")[0])
                .toList();

        System.out.println("First name :: " + names);



    }
}

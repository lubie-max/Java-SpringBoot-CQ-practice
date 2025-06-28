package FAQ;

import java.util.HashMap;
import java.util.stream.Stream;

public class HashMapAdvanceForLoop {



    public static void main(String[] args) {

        HashMap<Integer, String>  ageAndName = new HashMap<>();

        ageAndName.put(22, "Salona Shaikh");

        ageAndName.put(24 , "Lubna Shaikh");

        System.out.println(ageAndName);
        ageAndName.forEach((x, y) -> System.out.println(x + " : This is Age of "+ y) );



    }
}

package FAQ;

import java.util.HashMap;
import java.util.Map;

public class CountWords {


    public  Map<String , Integer> countWords(String str){

        String [] words = str.split(" ");
        Map<String , Integer> wordCount = new HashMap<>();

        for(String word : words){
           wordCount.put(word , wordCount.getOrDefault(word , 0)+1 );
        }

        return  wordCount;

    }
}

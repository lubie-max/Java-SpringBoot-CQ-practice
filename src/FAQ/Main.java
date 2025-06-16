package FAQ;

public class Main {

    public static void main(String[] args) {


        ReverseString reverseString = new ReverseString() ;

        String reversedS =  reverseString.reverseString("Lubna");

        System.out.println(reversedS);


        CountWords cw = new CountWords();

        System.out.println("Count - > " + cw.countWords("Lubna sayyadnur shaikh shaikh"));
        System.out.println("10"+1);




    }
}

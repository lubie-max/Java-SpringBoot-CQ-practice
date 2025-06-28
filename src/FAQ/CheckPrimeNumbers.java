package FAQ;

public class CheckPrimeNumbers {
    public static void main(String[] args) {

        boolean result =  checkPrime(18);

        System.out.println( result);


    }

    private static boolean checkPrime(int i) {

        if (i== 1 ) {
            return  false ;
        }
        if (i== 2 || i == 3){
            return true;
        }


        for(int j = 2 ; j <= i*i ; j++){
            if(j== i){
                continue;
            }
            if(i%j == 0 ){
                return false;
            }
        }

        return true;
    }


}

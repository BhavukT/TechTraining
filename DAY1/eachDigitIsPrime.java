//import java.util.*;
public class eachDigitIsPrime{
    public static void main(String[] args){
        int res = smallerPrime(15);
        System.out.println(res);
    }
    public static int count(int n){
        int count = 0;
        while(n != 0 ){
            n = n/10;
            count++; 
        }
        return count;
    }
    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
 
        return true;
    }
    public static int smallerPrime(int n) {
        boolean flag = true;
        int test = n-1;
        //int answer;
        //int numDigit = count(n);
        while(test > 1) {
            int numDigitTest = count(test);
            for(int i=1; i<=numDigitTest; i++){
                if(test <= 1){
                    break;
                }
                int endDigits = test % (int) Math.pow(10, i);
                int firstDigit = endDigits / (int) Math.pow(10, i-1);
                if(isPrime(firstDigit)){
                    continue;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag == false){
                test--;
            }
            else{
                return test;
            }
        }
        return -1;
    }
}


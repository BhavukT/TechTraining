import java.util.*;
public class Swapped {
    public static void main(String[] args){
        int res = swapFirstAndLast(01234);
        System.out.println(res);
    }
    public static int count(n){
        int count = 0;
        while(n != 0 ){
            n = n/10;
            count++;
        }
        return count;
    }
    public static int swapFirstAndLast(int n){
        int lDigit = n % 10;
        int numOfDigit = count(n);
        int fDigit = n / Math.pow(10, numOfDigit-1);
        int swappedNum = lDigit;
        swappedNum = lDigit + Math.pow(10,numOfDigit);
        swappedNum = swappedNum + n % Math.pow(10,numOfDigit-1);
        swappedNum = swappedNum - lDigit;
        swappedNum = swappedNum + fDigits;
        return swappedNum;
    }
}


public class swapFirstAndLast{
    public static void main(String[] args){
        int result = 
    }
    public static int count(int n){
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
        int fDigit = n /(int) Math.pow(10, numOfDigit);
        int swappedNum = lDigit;
        swappedNum = lDigit +(int) Math.pow(10,numOfDigit);
        swappedNum = swappedNum + n %(int) Math.pow(10,numOfDigit-1);
        swappedNum = swappedNum - lDigit;
        swappedNum = swappedNum + fDigit;
        return swappedNum;
    }
}
import java.util.*;
public class ThreeSum {
    public static void main(String[] args){
        //Array for checking
        int[] smallAns = {1, 2, 2, 3};
        checkSum(80, smallAns);
    }
    public static void checkSum(int tar, int[] arr){
        Arrays.sort(arr);
        int lenOfArray = arr.length;
        List<int[]> smallList = new ArrayList<>();
        //Loop for fixed element
        for(int i=0; i<lenOfArray-2; i++){
            int left = i+1;
            int right = lenOfArray-1;
            //Loop for checking subarray
            while(left < right){
                //if sum is equal to target
                if((arr[i] + arr[left] + arr[right]) == tar){
                    smallList.add(new int[] {arr[i], arr[left], arr[right]});
                    left++;
                    right--;
                }
                //if sum is less than target
                else if((arr[i] + arr[left] + arr[right]) < tar){
                    left++;
                }
                //if sum is greater than target
                else{
                    right--;
                }
            }
        }
        //Intialize 2D Array for storing smallAnswer
        int[][] answer = new int[smallList.size()][];
        for(int i=0; i<smallList.size(); i++){
            answer[i] = smallList.get(i);
        }
        //Print 2D Array
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<3; j++){
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        //System.out.println(pair);
        }
    }
}

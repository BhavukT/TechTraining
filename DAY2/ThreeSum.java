import java.util.*;
public class ThreeSum {
    public static void main(String[] args){
        int[] sans = {1,2,3,4,5};
        checkSum(8, sans);
    }
    public static void checkSum(int tar, int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        List<int[]> pair = new ArrayList<>();
        for(int i=0; i<n-2; i++){
            int left = i+1;
            int right = n-1;
            while(left < right){
                if((arr[i] + arr[left] + arr[right]) == tar){
                    pair.add(new int[] {arr[i], arr[left], arr[right]});
                    left++;
                    right--;
                }
                else if((arr[i] + arr[left] + arr[right]) < tar){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        int[][] ans = new int[pair.size()][];
        for(int i=0; i<pair.size(); i++){
            ans[i] = pair.get(i);
        }

        for(int i=0; i<ans.length; i++){
            for(int j=0; j<3; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        //System.out.println(pair);
        }
    }
}


//import java.util.Array;
//import java.util.ArrayList;
import java.util.*;
public class RemoveDuplicates{
    public static void main(String[] args){
        int arg[] = {1, 2, 2, 3, 4, 5};
        int n = arg.length;
        n = removeDuplicatesArray(arg, n);
        for(int i=0; i<n; i++){
            System.out.print(arg[i] + " ");
        }
    }
    public static int removeDuplicatesArray(int[] arr, int n){
        Arrays.sort(arr);
        int j=0;
        //int[] temp = new int[n];
        for(int i=0; i<n-1; i++){
            if(arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];
        return j;
        
    }
}
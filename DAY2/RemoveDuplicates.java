
//import java.util.Array;
//import java.util.ArrayList;
import java.util.*;
public class RemoveDuplicates{
    public static void main(String[] args){
        int arg[] = {1, 5, 6, 4, 4, 3, 3};
        int upSize = arg.length;
        upSize = removeDuplicatesArray(arg, upSize);
        //Loop to print Array
        for(int i=0; i<upSize; i++){
            System.out.print(arg[i] + " ");
        }
    }
    public static int removeDuplicatesArray(int[] arr, int idx){
        Arrays.sort(arr);
        int exPtr=0;//Extra Pointer

        //Array Iterator Loop
        for(int i=0; i<idx-1; i++){
            if(arr[i] != arr[i+1]){
                arr[exPtr++] = arr[i];
            }
        }
        //To save end element
        arr[exPtr++] = arr[idx-1];
        return exPtr;
    }
}
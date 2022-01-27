//import java.util.Collection;
//import java.util.*;

public class RotateMatrix {
    public static void main(String[] args){
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateImage(arr);
    }

    public static void rotateImage(int[][] arr){
        //Transpose
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //Reverse
        for(int i = 0; i < arr.length; i++){
            int li = 0;//Left Index
            int ri = arr[i].length-1;//Right Index

            while(li < ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }
        //Print
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

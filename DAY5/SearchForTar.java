public class SearchForTar {
    public static void main(String[] args){
        int[][] arr = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        //Function Called
        searchIn2D(arr, 3);
    }

    public static void searchIn2D(int[][] arr, int tar){
        int length = arr.length-1;
        int smallest = arr[0][0];
        int largest = arr[length][length];
        //Check for illegal target
        if(tar < smallest && tar > largest){
            return;
        }
        int rowIdx = 0;
        int colIdx = length;
        //Loop For Iterating

        while(rowIdx < length && colIdx >= 0){
            //Target Present
            if(arr[rowIdx][colIdx] == tar){
                System.out.println("Present");
                return;
            }
            //Smaller Target
            //Else loop
            else if(arr[rowIdx][colIdx] <= tar){
                rowIdx++;
            }
            //Large Target
            else{
                colIdx--;
            }
        }
        System.out.println("Not present");
    }
}

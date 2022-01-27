public class PrintArraySpiral{
    public static void main(String[] args){
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //Function Call
        printArrayClockWise(arr);
        printArrayAntiClockWise(arr);
    }

    public static void printArrayClockWise(int[][] arr){
        //Top Pointer
        int top = 0;
        //Down Pointer
        int down = arr.length-1;
        //Left Pointer
        int left = 0;
        //Right Pointer
        int right = arr.length-1;
        //Direction Decider
        int dir = 0;
        //Loop for Traversal for clockWise
        while(top <= down && left <= right){
            //Travel in Left to Right
            if(dir == 0){
                for(int i = left; i <= right; i++){
                    System.out.print(arr[top][i] + " ");
                }
                top++;
            }
            //Travel in Top to Down
            else if(dir == 1){
                for(int i = top; i <= down; i++){
                    System.out.print(arr[i][right] + " ");
                }
                right--;
            }
            //Travel in Right to Left
            else if(dir == 2){
                for(int i = right; i >= left; i--){
                    System.out.print(arr[down][i] + " ");
                }
                down--;
            }
            //Travel in Down to Top
            else if(dir == 3){
                for(int i = down ; i >= top; i--){
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
        System.out.println();
    }

    public static void printArrayAntiClockWise(int[][] arr){
        //Top Pointer
        int top = 0;
        //Down Pointer
        int down = arr.length-1;
        //Left Pointer
        int left = 0;
        //Right Pointer
        int right = arr.length-1;
        //Direction Decider
        int dir = 0;
        //Loop for Traversal for anti clockWise
        while(top <= down && left <= right){
            //Travel in Right to Left
            if(dir == 0){
                for(int i = right; i >= left; i--){
                    System.out.print(arr[top][i] + " ");
                }
                top++;
            }
            //Travel in Top to Down
            else if(dir == 1){
                for(int i = top; i <= down; i++){
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
            //Travel in Left to Right
            else if(dir == 2){
                for(int i = left; i <= right; i++){
                    System.out.print(arr[down][i] + " ");
                }
                down--;
            }
            //Travel in Down to Top
            else if(dir == 3){
                for(int i = down ; i >= top; i--){
                    System.out.print(arr[i][right] + " ");
                }
                right--;
            }
            dir = (dir + 1) % 4;
        }
    }
}
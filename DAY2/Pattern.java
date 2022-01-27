public class Pattern {
    public static void main(String[] args){
        draw(5);
    }
    public static void draw(int size){
        //Should be greater than 4
        if(size < 4){
            return;
        }
        //Should be odd number
        if(size%2==0){
            return;
        }
        else{
            int ptr1 = 0;// First Pointer
            int ptr2 = size;//Second Pointer

            for(int i=0; i<=size; i++){
                for(int j=0; j<=size; j++){
                    //First Index
                    if(j == ptr1){
                        System.out.print("\\");
                    }
                    //Last Index
                    else if(j == ptr2){
                        System.out.print("/");
                    }
                    //Middle Elements
                    else{
                        System.out.print("*");
                    }
                }
                ptr1++;
                ptr2--;
                System.out.println();
            }
        }
        
    }
}

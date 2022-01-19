public class Pattern {
    public static void main(String[] args){
        draw(5);
    }
    public static void draw(int n){
        if(n < 4){
            return;
        }
        int ptr1 = 0;
        int ptr2 = n;

        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                if(j == ptr1){
                    System.out.print("\\");
                }
                else if(j == ptr2){
                    System.out.print("/");
                }
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

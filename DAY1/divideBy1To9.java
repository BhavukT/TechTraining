//import java.util.*;
public class divideBy1To9{
    public static void main(String[] args){
        int res = divideBy1To9();
        System.out.print(res);
    }
    public static int divideBy1To9() {
        int num = 10;
        boolean flag = true; 
        while(num > 0){
            for(int i = 2; i < 10; i++){
                if(num % i == 0){
                    flag = false;
                    break;
                }
                else{
                    continue;
                }
            }
            if(flag == false){
                num++;
            }
            else{
                break;
            }
        }
        return num;
    }
}

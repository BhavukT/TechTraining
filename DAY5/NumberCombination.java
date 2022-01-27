import java.util.*;
class NuberCombination{

    public static void main(String[] args){


    }
    //Predefinded Array
    static String[] codes = {"","ZYA","BO","UP","QWE", "RTY", "TRE", "OPI", "ASD", "FGH", "GHJ", "JKL","L"};

    public static ArrayList<String> getSmallAns(String str){
        //123
        char ch = str.charAt(0);//1
        String ros = str.substring(1);//23

        //Result for next Position
        ArrayList<String> recResult = getSmallAns(ros);
        //Result for this position
        ArrayList<String> myResult = new ArrayList<String>();

        String myCodes = codes[ch - '0']; //This character
        for(int i=0; i<myCodes.length(); i++){
            char chCode = myCodes.charAt(i);

            for(String rstr: recResult){
                myResult.add(chCode, rstr);
            }
        }
        return myResult;
    }

}
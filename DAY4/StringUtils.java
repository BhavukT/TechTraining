import java.util.*;

public class StringUtils {
    public static void main(String[] args) {
        String str = "Bhavuk Is a good Boy";
        // 1.int result = countChar(str, 'a');
        // 2.String result = substring(str, 1, 6);
        // 6.String result = reverseString(str);
        // .7.String result = reverseVowels(str);
        // .4boolean result = hasPattern(str, "bc");
        String[] result = split(str, ' ');
        for(String smallAns : result){
            System.out.println(smallAns);
        }
        //System.out.println(result);

    }

    // Count Char
    public static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    // Substring from starting pointer to ending pointer
    public static String substring(String str, int start, int end) {
        // Checking for length of the string
        if (str.length() == 0) {
            return "Not Possible";
        }
        if (str.length() == 1) {
            return "Not Possible";
        }
        // Checking for spaces
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                return "Not Possible";
            }
        }
        String result = " ";
        for (int i = start; i <= end; i++) {
            // System.out.println(str.charAt(i));
            result += str.charAt(i);
        }
        return result;
    }
    //Split String
    public static String[] split(String str,char ch){
        //String c = toString(ch);
        int countWord = countChar(str, ch);
        int idx = 0;
        String[] result = new String[countWord];
        String temp = " ";
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) != ch){
                temp = temp + str.charAt(i);
            }
            else{
                result[idx] = temp;
                idx++;
                temp = " ";
            }
        }
        return result;
    }
    // Patern Matching
    public static Boolean hasPattern(String str,String pattern){
        int lenPattern = pattern.length();
        int lenStr = str.length();

        for(int i = 0; i < lenStr; i++){
            int count = 1;
            for(int j = 0; j < lenPattern; j++){
                if(str.charAt(i) == pattern.charAt(j)){
                    i++;
                    j++;
                    count++;
                }
                else{
                    break;
                }
            }
            if(count == lenPattern){
                return true;
            }
        }
        return false;
    }
    //All Words Containg Character
    public static Boolean allWordsContainsChar(String str,char ch){
        String[] combinations = split(str, " ");
        boolean flag = false;
        for(String ans : combinations){
            for(int i=0; i<ans.length(); i++){
                if(ans.charAt(i) == ch){
                    flag = true;
                }
            }
            if(flag == true){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    // Reverse String
    public static String reverseString(String str) {
        // Checking for length of the string
        if (str.length() == 0) {
            return "Not Possible";
        }
        if (str.length() == 1) {
            return "Not Possible";
        }
        // Checking for spaces
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                return "Not Possible";
            }
        }
        // Reversing String
        String result = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    // Reverse Vowels
    public static String reverseVowels(String str) {
        char[] arr = str.toCharArray();
        String result = " ";
        int right = arr.length-1;
        int left = 0;
        while(left < right){
            //Both Vowels
            if(checkVowel(arr[left]) && checkVowel(arr[right])){
                //Swapping
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            //Left is Vowel
            else if(checkVowel(arr[left]) && checkVowel(arr[right]) == false){
                right--;
            }
            //Right is Vowel
            else if(checkVowel(arr[left]) == false && checkVowel(arr[right])){
                left++;
            }
            //Both are not Vowel
            else{
                left++;
                right--;
            }
        }
        result = arr.toString();
        return result;
    }
    //Check Vowels
    public static boolean checkVowel(char ch){
        if(ch == 'A' && ch == 'E' && ch == 'I' && ch == 'O' && ch == 'U'){
            return true;
        }
        return false;
    }
}
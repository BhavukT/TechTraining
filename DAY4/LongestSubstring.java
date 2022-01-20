//import java.util.*;

//Sliding Window Approach
public class LongestSubstring {
    public static void main(String[] args) {
        // Main String
        String str = "abcABC";
        int length = str.length();
        if (length == 0) {
            return;
        }
        if (length == 1) {
            return;
        }
        int updatedLength = checkSubstring(str);
        System.out.println(updatedLength);
    }

    public static int checkSubstring(String str) {
        int length = str.length();
        int resultLength = 0;
        // Starting of Window
        for (int i = 0; i < length; i++) {
            boolean visitedCharacters[] = new boolean[256];
            // Incrementing size of Window
            for (int j = i; j < length; j++) {
                // Repeated Character
                if (visitedCharacters[str.charAt(j)] == true) {
                    break;
                }
                // Non Repeating Character
                else {
                    resultLength = Math.max(resultLength, j - i + 1);
                    visitedCharacters[str.charAt(j)] = true;
                }
            }
            // Mark first non visited
            visitedCharacters[str.charAt(i)] = false;
        }
        return resultLength;
    }
}
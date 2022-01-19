public class IsvalidString {
    public static
    public boolean isNameValid(String name){
        int count = 0; 
        String test = " ";
        for(int i=0; i<name.length(); i++){
         if(name.charAt(i) == 'A' && name.charAt(i) == 'E' && name.charAt(i) == 'I' && name.charAt(i) == 'O'&& name.charAt(i) == 'U'){
         count++;
        }
        if(name.charAt(i) == 'S' && name.charAt(i) == 'T'){
         test += name.charAt(i);
        }
       }
       
       for(int i=0; i<test.length(); i++){
        if(test.charAt(i) == 'S' && test.charAt(i+1) == 'T' && test.charAt(i+2) == 'S'){
         return false;
        }
       } 
       if(count > 1){
        return false;
       }
       return true;
       }
}

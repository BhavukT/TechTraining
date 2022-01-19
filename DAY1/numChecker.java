public class numChecker {
    public static void main(String[] args){
    
    }
    public boolean isNameValid(String name){
        int count = 0; 
        String res = " ";
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i) == 'A' && name.charAt(i) == 'E' && name.charAt(i) == 'I' && name.charAt(i) == 'O'&& name.charAt(i) == 'U'){
                count++;
            }
            if(name.charAt(i) == 'S' && name.charAt(i) == 'T'){
                res += name.charAt(i);
            }
        }
        
        for(int i=0; i<res.length(); i++){
            if(res.charAt(i) == 'S' && res.charAt(i+1) == 'T' && res.charAt(i+2) == 'S'){
                return false;
            }
        } 
        if(count > 1){
            return false;
        }
        return true;
    }
}

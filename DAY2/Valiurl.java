

    public class validURL {
        public static void main(String[] args){
            String url = "https://www.google.com";
            if(checkValidUrl(url)){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    
        public static boolean checkValidUrl(String url){
            String regex = "((http|https)://)(www.)?"
                  + "[a-zA-Z0-9@:%._\\+~#?&//=]"
                  + "{2,256}\\.[a-z]"
                  + "{2,6}\\b([-a-zA-Z0-9@:%"
                  + "._\\+~#?&//=]*)";
                
            Pattern p = Pattern.compile(regex);
    
            if(url == null){
                return false;
            }
    
            Matcher m = p.matcher(url);
    
            return m.matches();
    
        }
    }
    


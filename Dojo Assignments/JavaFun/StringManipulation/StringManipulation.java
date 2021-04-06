

public class StringManipulation {
    public String trimAndConcat(String string1 , String string2 ){
        String res = string1.trim() + string2.trim();
        return res;
    }

    public Integer getIndexOrNull(String str, char letter){
        int number = str.indexOf(letter);
        if (number == -1){
            
            return null;
        }
        return number;
    }

    public Integer getIndexOrNull(String str1, String str2){
        int number = str1.length()- str2.length();
        if(number<=0){
            return null;
        }
        
        return number;

    }

    public String concatSubstring(String str1, int int1, int int2, String str2){
        String firstconcat = str1.substring(int1,int2);
        String concat = firstconcat+str2;

        return concat;
    }
}

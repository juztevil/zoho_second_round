import java.util.*;
class removePalindromeInString{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println(printTheString(scan.nextLine()));
        scan.close();
    }
    public static String printTheString(String s){
        String returnStr="",currentStr="";
        for(int i=0;i<s.length();++i){
            if(s.charAt(i)==' '){
                if(!amIPalindrome(currentStr)){
                    returnStr+=(currentStr+" ");
                    currentStr="";
                    continue;
                }
                else{
                    currentStr="";
                    continue;
                }
            }
            else
            currentStr+=s.charAt(i);
        }
        if(!amIPalindrome(currentStr))
        returnStr+=currentStr;
        return returnStr;
    }
    public static boolean amIPalindrome(String s){
        if(s.length()==1)
        return true;
        for(int i=0;i<s.length();++i){
            if(!(s.charAt(i)==s.charAt(s.length()-i-1)))
            return false;
            if(i>=s.length()-i)
            return true;
        }
        return true;
    }
}

/*
    output
    he did a good deed
    he good 

    a lone madam isi malayalam and a autua is
    lone and is
*/
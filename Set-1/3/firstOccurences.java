import java.util.*;
class firstOccurences{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println(printTheFirstOccurences(scan.nextLine(),scan.nextLine()));
        scan.close();
    }
    public static String printTheFirstOccurences(String first,String second){
        int[] indexes = new int[second.length()];
        for(int i=0;i<indexes.length;++i)
        indexes[i]=findTheIndexes(first,second.charAt(i));
        int min=find(indexes,-1), max=find(indexes,1);
        String str="";
        for(int i=min;i<=max;++i)
        str+=first.charAt(i);
        return str;
    }
    public static int findTheIndexes(String s,char ch){
        for(int i=0;i<s.length();++i){
            if((ch+"").equals(s.charAt(i)+""))
            return i;
        }
        return 0;
    }
    public static int find(int[] arr,int code){
        int value=arr[0];
        if(code==-1){
            for(int i=1;i<arr.length;++i){
                if(value>arr[i])
                value=arr[i];
            }
        }
        else{
            for(int i=0;i<arr.length;++i){
                if(value<arr[i])
                value=arr[i];
            }
        }
        return value;
    }
}

/*
    Output
    programs>javac firstOccurences.java

    programs>java firstOccurences
    ZOHOCORPORATION
    PORT
    OHOCORPORAT

    programs>
*/
import java.util.*;
class longestSequenceBetweenCharacter{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println(longestSequence(scan.nextLine()));
        scan.close();
    }
    public static int longestSequence(String s){
        ArrayList<Integer> length=new ArrayList<Integer>();
        ArrayList<String> chars=new ArrayList<String>();
        for(int i=0;i<s.length();++i){
            if(!amIThere(chars,s.charAt(i))){
                chars.add(s.charAt(i)+"");
                int destination=location(s,s.charAt(i),-1);
                int start=i+1;
                if(length.size()==0)
                length.add(destination-start);
                else{
                    if(destination-start > length.get(0))
                    length.set(0,destination-start);
                }
            }
        }
        return length.get(0);
    }
    public static int location(String s,char ch,int code){
        int location=0;
        if(code==1){}
        else{
            for(int i=s.length()-1;i>=0;--i){
                if(s.charAt(i)==ch){
                    location=i;
                    break;
                }
            }
        }
        return location;
    }
    public static boolean amIThere(ArrayList<String> li,char ch){
        for(int i=0;i<li.size();++i){
            if((ch+"").equals(li.get(i)))
            return true;
        }
        return false;
    }
}

/*
    Output
    abcccccbba
    8

    aaaaaaaa
    6
*/
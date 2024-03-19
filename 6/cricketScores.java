import java.util.*;
class cricketScores{
    public static void main(String args){
        Scanner scan=new Scanner(System.in);
        System.out.println(getTheScores(scan.nextLine()));
        scan.close();
    }
    String getTheScores(String s){
        int p1Score=0, p2Score=0, p1BallFaced=0, p2BallFaced=0, striker=1, extras=0;
        for(int i=0;i<s.length();++i){
            int run=runs(s.charAt(i));
            if(i==0){
                if(run==10)
                ++extras;
                else{
                    p1Score+=run;
                    ++p1BallFaced;
                    striker=whoIsInStrike(s.charAt(i),striker);
                    continue;
                }
            }
            if(striker==1){
                if(run==10)
                ++extras;
                else{
                    p1+=runs(s.charAt(i));
                    ++p1BallFaced;
                    striker=whoIsInStrike(s.charAt(i),striker);
                }
            }
            else{
                p2+=runs(s.charAt(i));
                ++p2BallFaced;
                striker=whoIsInStrike(s.charAt(i));
            }
        }
        public static int runs(char ch){
            if(Character.isLetter(ch))
            return 10;
            return (Character.isDigit(ch))?Integer.parseInt(ch+""):0;
        }
        public static
    }
}
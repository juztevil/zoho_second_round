import java.util.*;
class cricketScores{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the period: ");
        System.out.println(getTheScores(scan.nextLine()));
        scan.close();
    }
    public static String getTheScores(String s){
        int extras=0, p1Score=0, p1BallsFaced=0, p2Score=0, p2BallFaced=0, striker=1;

        for(int i=0;i<s.length();++i){
            int run=runs(s.charAt(i));
            if(i==0){
                if(run==10)
                ++extras;
                else{
                    p1Score+=run;
                    ++p1BallsFaced;
                }
                striker=whoIsInTheStrike(run,striker);
                continue;
            }
            if(striker==1){
                if(run==10)
                ++extras;
                else{
                    p1Score+=run;
                    ++p1BallsFaced;
                }
                striker=whoIsInTheStrike(run,striker);
            }
            else{
                if(run==10)
                ++extras;
                else{
                    p2Score+=run;
                    ++p2BallFaced;
                }
                striker=whoIsInTheStrike(run,striker);
            }
        }
        return "P1="+p1Score+"("+p1BallsFaced+")  "+"P2="+p2Score+"("+p2BallFaced+")  extras="+extras;
    }
    public static int runs(char runs){
        if(runs=='W' || runs=='N')
        return 10;
        if(runs=='.')
        return 0;
        return Integer.parseInt(runs+"");
    }
    public static int whoIsInTheStrike(int run,int striker){
        int nonStriker=0;
        if(striker==1)
        nonStriker=2;
        else
        nonStriker=1;
        return run%2==0 ? striker : nonStriker;
    }
}

/*
    Manually calculated

    WW.421..34N6552..1
    p1 = 0 4 2 1 4 6 5 2 0 0 1 	25(11)
    p2 = 0 0 3 5			    8(4)
    extras = 111			    3


    output
    programs>javac cricketScores.java

    programs>java cricketScores
    Enter the period: 1.2.436W1.N.21
    P1=8(3)  P2=12(9)  extras=2

    programs>java cricketScores
    Enter the period: WW.421..34N6552..1
    P1=25(11)  P2=8(4)  extras=3
*/
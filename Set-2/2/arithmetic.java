import java.util.*;
class arithmetic{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        printTheArithmeticResults(scan.nextInt(),scan.nextInt());
        scan.close();
    }
    public static void printTheArithmeticResults(int n,int m){
        String arithmetic="+-*/";
        System.out.println("RESULTS");
        for(int i=0;i<arithmetic.length();++i){
            switch(arithmetic.charAt(i)){
                case '+' -> System.out.println(n+m);
                case '-' -> System.out.println(n+(-m));
                case '*' -> {
                    int result=0;
                    for(int j=0;j<n;++j)
                    result+=m;
                    System.out.println(result);
                }
                case '/' -> {
                    int quotient=0;
                    while(n>=m){
                        n=n+(-m);
                        ++quotient;
                    }
                    System.out.println(quotient);
                }
                default ->{}
            }
        }
    }
}

/*
    Output
    12
    4
    RESULTS
    16
    8
    48
    3


    12
    12
    RESULTS
    24
    0
    144
    1

    3
    4
    RESULTS
    7
    -1
    12
    0


    2
    2
    RESULTS
    4
    0
    4
    1


    3
    9
    RESULTS
    12
    -6
    27
    0

    9
    3
    RESULTS
    12
    6
    27
    3
*/
import java.util.*;
class matrixDiagonalSum{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<arr.length;++i){
            for(int j=0;j<arr[i].length;++j)
            arr[i][j]=scan.nextInt();
        }
        printTheArray(arr);
        System.out.println(greatestf2(arr));
        scan.close();
    }
    public static int greatestf2(int[][] arr){
        int firstDiagonal=sum(arr,1), secondDiagonal=sum(arr,2);
        return firstDiagonal>secondDiagonal?firstDiagonal:secondDiagonal;
    }
    public static int sum(int[][] arr,int code){
        int sum=0;
        if(code==1){
            for(int i=0;i<arr.length;++i){
                for(int j=0;j<arr[i].length-i;++j)
                sum+=arr[i][j];
            }
        }
        else{
            int increaser=0;
            for(int i=arr.length-1;i>=0;--i){
                for(int j=arr[i].length-1;j>=increaser;--j)
                sum+=arr[i][j];
                ++increaser;
            }
        }
        return sum;
    }
    public static void printTheArray(int[][] arr){
        for(int i=0;i<arr.length;++i){
            for(int j=0;j<arr[i].length;++j)
            System.out.print(arr[i][j]+"  ");
            System.out.println();
        }
    }
}

/*
    manual Output
    1 2 3 4
    5 6 7 8
    9 10 11 12
    13 14 15 16

    leftDiagonal=60 rightDiagonal=110
*/

/*
    4
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    11
    12
    13
    14
    15
    16
    1  2  3  4
    5  6  7  8
    9  10  11  12
    13  14  15  16
    110



    3
    1
    2
    3
    4
    5
    6
    7
    8
    9
    1  2  3
    4  5  6
    7  8  9
    38
*/
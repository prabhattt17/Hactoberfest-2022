import java.util.*;

class Test{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt();

        int ans=sum(num1,num2);
        System.out.println(ans);
    }
    public static int sum(int a,int b){
        return a+b;
    }
}
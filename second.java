import java.util.Scanner;

public class second {
    public static void sum(int x,int y){
        int z=x+y;
        System.out.println("The sum is:"+z);

    }
    public static void  main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int a=sc.nextInt();

        System.out.print("Enter number");
        int b = sc.nextInt();
        sum(a,b);

    }
}

import java.util.Scanner;
public class fibonacchi_series {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Fibonacci series :");
        System.out.print("Enter n :");
        int n=sc.nextInt();

        int a=0,b=1,c;

        //Swaping logic  of Fibonacci series :
            System.out.println("logic 2 :");
            for (int j = 0; j <=n ; j++) {
            c=a+b;
            a=b;
            b=c;
            c=a;
        //logic  end

            //printintg fibonacchi series :
            System.out.println(j+" :"+c);
        }




    }

}
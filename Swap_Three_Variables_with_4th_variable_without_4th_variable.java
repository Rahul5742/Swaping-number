public class Swap_Three_Variables_with_4th_variable_without_4th_variable {

    public static void main(String[] args) {
        System.out.println("Swap_Three_Variables_with_4th_variable_without_4th_variable:\n");
        System.out.println("case 1 :without 4th variable :");
    //case 1: without 4th variable
        int a=2,b=3,c=5;
    //Swaping logic of without 4th variable:
        a=b;
        b=c;
        c=a;
    //Swaping without 4th variablr output:
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        System.out.println("c :"+c);

System.out.println();

    System.out.println("case2: using 4th variable :");
    //case 2: using 4th variable
        int a1=2,b1=3,c1=5,d1;
    //Swaping logic of using 4th variable:
        d1=a1;
        a1=b1;
        b1=c1;
        c1=d1;
    //Swaping using 4th variablr output:
        System.out.println("a1 :"+a1);
        System.out.println("b1 :"+b1);
        System.out.println("c1 :"+c1);
    }
}

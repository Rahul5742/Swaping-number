public class Swap_Two_Integers_Using_XOR_Operator {
    public static void main(String[] args) {

        System.out.println("Swap Two Integers Using XOR Operator");
        int x = 8, y = 12;
        //swaping xor operator logic :
        x=x^y;
        y=x^y;
        x=x^y;
        //output :
        System.out.println("Before swap: x = " + x + ", y = " + y);



    }
}
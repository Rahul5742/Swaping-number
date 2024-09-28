public class Swaping_number_without_using_3rd_variable {
    public static void main(String[] args) {
        System.out.println("Swaping number without 3rd variable :");

        int a=10,b=20;
        //Swaping logic : without 3rd variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a :"+a);
        System.out.println("b :"+b);


    }

}


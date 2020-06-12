package calc;

public class Calculator {
    public static int add (int a, int b){
        return a+b;
    }
    public static int subtract (int a, int b){
        return a-b;
    }
    public static int multiply  (int a, int b){
        return a*b;
    }
    public static double divide  (int a, int b){
        if(b==0){
            System.out.println("Second argument equals zero");
            return 0;
        } else {
            return  (double) a / b;
        }
    }

}

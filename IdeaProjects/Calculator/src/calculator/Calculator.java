package calculator;

public class Calculator {
    
    public static void main(String[] args) {
       int a = 6;
       int b = 2;
       sum(a, b);
       multiple(a, b);
       subtraction(a, b);
       division(a, b);
    }
    
   static void sum(int a, int b) {       
       int c = a + b;
       System.out.println(c);       
   }
   
   static void multiple(int a, int b) {
       int c = a * b;
       System.out.println(c);
   }
   
   static void subtraction(int a, int b) {
       int c = a - b;
       System.out.println(c);
   }
   
   static void division(int a, int b) {
       int c = a / b;
       System.out.println(c);
   }
   
}

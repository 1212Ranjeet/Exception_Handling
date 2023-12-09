package ExceptionHandling;

public class CatchingException {
     static void fun1(){
            int a = 5;
            int b = 0;

            int c = a/b;
            System.out.println(c);
        }
    public static void main (String args[]){
       fun1();
    }
    
}

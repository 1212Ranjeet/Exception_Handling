package ExceptionHandling;

public class ThrowingException {
    public static void main(String args[]){
        try{
        int a = 5;
        int b = 0;

        int c = a/b;
        System.out.println(c);
        }catch(ArithmeticException e ){
            System.out.println(e.getMessage() + " Occured, Please check your code");
        }
    }
    
}

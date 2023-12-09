package ExceptionHandling;

public class ArrayIndexException {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            System.out.println(a[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Index Should be in the range of O to SizeofAraay");
        }
        finally{
            System.out.println("Sorry for Inconvineance");
        }
    }
    
}

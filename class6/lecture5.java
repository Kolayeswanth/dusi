// Exceptions Handling in Java
// try{
//      code part which can raise excpetion
//  }
//  == code between try and catch is called protected code ==
//  == code won't execute if written between the try and catch block and doesn't compile ==
// catch(Exception_name variable_name){
//      code to handle the exception
//  }


public class lecture5 {
    public static void main(String[] args){
        String str = null;
        try{
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("Exception caught: "+e);
        }

        int a = 10;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("Result: "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught: "+e);
        }
        // when we don't know the name of the exception then we can directly call Exception
        catch(Exception e){
            System.out.println("Exception un-known"+e);
        }
        System.out.println("Program continues after exception handling.");
    }
    
}

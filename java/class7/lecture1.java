// if finally block contains return statement then control will be transferred to finally block only. it doesn't matter whether exception is raised or not.

public class lecture1 {
    int test(){
        try{
            int x = 10/0;
            return 10;
        }
        catch(Exception e){
            return 15;
        }
        finally{
            return 20;
        }
    }
    public static void main(String[] args){
        lecture1 obj = new lecture1();
        System.out.println(obj.test());
    }
    
}

// litterals always create blocks in a constant pool while objects create blocks in a non constant pool.
// .equals method will verify reference when object was created using a package but we can override it in the package to verify values.
// In case of strings, .equals method is already overridden to compare values.
public class lecture1 {
    public static void main(String[] args){
        String str1 = "hello"; // litteral
        String str2 = "hello";// litteral
        String str3 = new String("hello"); // object
        String str4 = new String("hello"); // object

        // == operator compares the references of the objects
        System.out.println(str1==str2); // true
        System.out.println(str3==str4); // false
        
        // .equals() method compares the values of the objects
        System.out.println(str3.equals(str2)); // true
    }
}

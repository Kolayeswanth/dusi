// method overriding example

class payment{
    void pay(){
        System.out.println("Payment done using cash");
    }
}
class upi extends payment{
    @Override
    void pay(){
        System.out.println("Payment done using UPI");
    }
}

class creditcard extends payment{
    @Override
    void pay(){
        System.out.println("Payment done using credit card");
    }
}

public class lecture2 {
    public static void main(String[] args){
        payment p1 = new payment();
        p1.pay(); // this will call pay method of payment class

        payment p2 = new upi();
        p2.pay(); // this will call pay method of upi class due to method overriding

        payment p3 = new creditcard();
        p3.pay(); // this will call pay method of creditcard class due to method overriding
    }
}

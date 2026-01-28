// print the following pattern using nested loops



public class Task7 {
    public static void main(String[] args){

        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
                
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //         1
        //       1 2
        //     1 2 3
        //   1 2 3 4
        // 1 2 3 4 5
        for(int i=1; i<=5; i++){
            for(int j=5; j>i; j--){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k + " ");
            }
            
            System.out.println();
        }
        //      1
        //     1 2
        //    1 2 3
        //   1 2 3 4
        //  1 2 3 4 5
        for(int i =1; i<=5;i++){
            for(int j =i;j<=5;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        //     1
        //    212
        //   32123
        //  4321234
        // 543212345
        for(int i =1; i<=5;i++){
            for(int j =i;j<=5;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            for(int j = 1;j<=i;j++){

                if(j==1) continue;
                System.out.print(j);
            }
            System.out.println();
        }


    }
    
}

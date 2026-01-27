// Exam marks average using arrays

public class task1{
    public static void main(String[] args){
        int[] marks = {80,80,76,91,67,69};
        int avg = 0;

        for(int i = 0; i <= marks.length-1; i++){
            avg+= marks[i];
        }
        //total marks
        System.out.println("Total marks are:" +avg);
        //average marks
        System.out.println("Average is:"+(avg/marks.length));

    }

}
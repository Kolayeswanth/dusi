public class lecture4 {
    public static void main(String[] args){
        lecture2 student1 = new lecture2("1", "Alice");
        lecture2 student2 = new lecture2("2", "Bob");
        lecture2 student3 = new lecture2("3", "Charlie");

        lecture3 classRoom = new lecture3();
        classRoom.addStudent(student1);
        classRoom.addStudent(student2);
        classRoom.addStudent(student3);

        System.out.println("Total Students: " + classRoom.getTotalStudents());
        classRoom.displayStudents();

        classRoom.removeStudent(student2);
        System.out.println("After removing Bob:");
        classRoom.displayStudents();

        System.out.println("Contains Alice: " + classRoom.containsStudent(student1));
        System.out.println("Contains Bob: " + classRoom.containsStudent(student2));

        classRoom.clearAllStudents();
        System.out.println("After clearing all students, total: " + classRoom.getTotalStudents());
        
    }
    
}

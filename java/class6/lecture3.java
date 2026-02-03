// lecture 2 continution part is in this code.

// collection framework
import java.util.ArrayList;
import java.util.Collection;

public class lecture3 {
    // collection is used because it can store multiple objects dynamically.
    private Collection<lecture2> students;
    public lecture3(){
        students = new ArrayList<>();
    }
    public void addStudent(lecture2 student){
        students.add(student);
    }

    public void removeStudent(lecture2 student){
        students.remove(student);
    }

    public void displayStudents(){
        for(lecture2 student : students){
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
        }
    }
    public int getTotalStudents(){
        return students.size();
    }

    public boolean containsStudent(lecture2 student){
        return students.contains(student);
    }

    public void clearAllStudents(){
        students.clear();
    }
    
}

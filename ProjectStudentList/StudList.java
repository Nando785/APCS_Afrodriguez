import java.util.*;
/**
 * Write a description of class StudList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudListRunner

{
    public static String getGreeting(){
     System.out.println("To add a student type: 1");
     System.out.println("To delete a student type: 2");
     System.out.println("To print a student record a student type: 3");
     System.out.println("To search for a student type: 4");
     System.out.println("To delete all students type: 5");
     return "To leave type: Bye";
    }
    // instance variables - replace the example below with your own
    private int x;
    ArrayList<Student> studList = new ArrayList<Student>();
    /**
     * Constructor for objects of class StudList
     */
    public StudList()
    {
        // initialise instance variables
        x = 0;
    }
    /**
     * An example of a method - replace this comment with your own
     */
    public void addStudent(String fullName)
    {
          
    }
    public void deleteStudent(){
    
    }
    public void printStudent(){
    
    }
    public void searchStudent(){
    
    }
    public void clear(){
    
    }
    
}

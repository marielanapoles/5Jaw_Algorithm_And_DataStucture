
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marielanapoles
 */
public class Sorting {
    
    public static void bubbleSortStudent(ArrayList<Student> students) {
        Student t;
        for(int x = 0; x<= students.size()-2; x++ ){
            for(int i = 0; i<= students.size()-2; i++) {
                if(students.get(i).Name.compareTo(students.get(i+1).Name)>0) {
                     t = students.get(i);
                     students.set(i, students.get(i+1));
                     students.set(i+1, t);
                }
            }
        }
    }
    
    public static void selectionSortEnrollment(ArrayList<Enrollment> enrollments) {
        for(int i = 0; i< enrollments.size(); i++) {
            int pos = i;
            for(int j = i; j<enrollments.size(); j++) {
                if(enrollments.get(i).enrollmentId < enrollments.get(pos).enrollmentId) {
                    pos = j;
                }
                
                Enrollment min = enrollments.get(pos);
                enrollments.set(pos, enrollments.get(i));
                enrollments.set(i, min);
                
            }
        }
    }
    
    public static void selectionSortCourse(ArrayList<Course> courses) {
        for(int i = 0; i< courses.size(); i++) {
            int pos = i;
            for(int j = i; j<courses.size(); j++) {
                if(courses.get(i).Cost < courses.get(pos).Cost) {
                    pos = j;
                }
                
                Course min = courses.get(pos);
                courses.set(pos, courses.get(i));
                courses.set(i, min);
            }
        }
    }
    
    
}

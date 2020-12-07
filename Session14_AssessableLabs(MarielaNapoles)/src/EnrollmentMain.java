/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marielanapoles
 */
import com.sun.org.apache.xpath.internal.operations.Bool;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import static javafx.scene.input.KeyCode.T;



public class EnrollmentMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("----------------------------");
        System.out.println("EQUALS METHOD");
        System.out.println("----------------------------");
        Person p1 = new Person("Mariela", "mgn@email.com", "0412345678");
        Person p2 = new Person("Mariela", "amgn@email.com", "0456910053");
        Person p3 = new Person("Aru", "aru@email.com", "0401111991");
        Person p4 = new Person("Haute", "haute@yahoo.com", "0417420076");
        
        System.out.println("Person equal method test");
        System.out.println("Mariela, mgn@email.com == Mariela, amgn@email.com     result: "+ p1.equals(p2));
        System.out.println("Mariela, mgn@email.com == Mariela, mgn@email.com      result:" + p1.equals(p1));
        
        
        LocalDate date = java.time.LocalDate.now();
        LocalDate date2 = java.time.LocalDate.of(2020, 10, 04);
        LocalDate date3 = java.time.LocalDate.of(2020, 11, 28);
        
        Student student1 = new Student(1236, "SD", date, p1.Name, p1.Email, p1.TelNum);
        Student student2 = new Student(9900, "WDM", date2, p1.Name, p1.Email, p1.TelNum);
        Student student3 = new Student(3234, "SD", date, p3.Name, p3.Email, p3.TelNum);
        Student student4 = new Student(5613, "NS", date3, p4.Name, p4.Email, p4.TelNum);
        
        System.out.println("\nStudent equal method test...");
        System.out.println("Mariela, SD == Mariela, WDM     result: " + student1.equals(student2));
        System.out.println("Mariela, SD == Mariela, SD      result: " + student1.equals(student3));
        
        
        Enrollment e1 = new Enrollment(900, student1, date, "sem1", "NG" );
        Enrollment e2 = new Enrollment(851, student3, date2, "sem1", "NG");
        Enrollment e3 = new Enrollment(105, student4, date2, "sem1", "NG");
        Enrollment e4 = new Enrollment(789, student2, date, "sem1", "NG");
        Enrollment e6 = new Enrollment(100, student4, date2, "sem2", "NG");
        Enrollment e5 = new Enrollment(343, student3, date2, "sem2", "NG");
        
        System.out.println("\nEnrollment equal method test...");
        System.out.println("Enrollment1 == Enrollment1      result: " + e1.equals(e1));
        System.out.println("Enrollment2 == Enrollment3      result: " + e2.equals(e3));
        
        System.out.println("\n\n----------------------------");
        System.out.println("COMPARATORS");
        System.out.println("----------------------------");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        //unsorted list
        System.out.println("Before Sorting Student Id..");
        for (Student s: students) {
            System.out.println(s.StudentId + " -- Program: " + s.Program + " Student Name: " + s.Name );
        }
        //sort by Id
        System.out.println("After Sorting Student Id..");
        Collections.sort(students);
        for (Student s: students) {
            System.out.println(s.StudentId + " -- Program: " + s.Program + " Student Name: " + s.Name );
        }
        
        ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();
        enrollments.add(e2);
        enrollments.add(e1);
        enrollments.add(e3);
        enrollments.add(e4);
        enrollments.add(e5);
        enrollments.add(e6);
        
        //unsorted list
        System.out.println("\nBefore Sorting Enrollment Id..");
        for (Enrollment e: enrollments) {
            System.out.println(e.enrollmentId + " -- Date enrolled: " + e.dateEnrolled + " Student Name: " + e.student.Name );
        }
        //sort by Id
        System.out.println("After Sorting Enrollment Id..");
        Collections.sort(enrollments);
        for (Enrollment e: enrollments) {
            System.out.println(e.enrollmentId + " -- Date enrolled: " + e.dateEnrolled + " Student Name: " + e.student.Name );
        }
        
        
        ArrayList<Course> courses = new ArrayList<Course>();
        Course c1 = new Course("C100", "Advanced Java", 700.00);
        Course c2 = new Course("C200", "Advanced PHP",  350.00);
        Course c3 = new Course("C700", "Network Security", 659.00);
        Course c4 = new Course("C501", "Basic UI Design", 1100.00);
        Course c5 = new Course("C110", "Basic UI Design", 1100.00, e3);
        Course c6 = new Course("C110", "Basic UI Design", 1100.00, e2);
        Course c7 = new Course("C110", "Basic UI Design", 1100.00, e1);
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        courses.add(c4);
        courses.add(c5);
        courses.add(c6);
        courses.add(c7);
        System.out.println("\nBefore Sorting Course Prices...");
        for(Course c: courses) {
            System.out.println("$" + String.valueOf(c.Cost) + "--" + c.CourseCode + " " + c.CourseName);
        }
        System.out.println("After Sorting Course Prices...");
        Collections.sort(courses);
        for(Course c: courses) {
            System.out.println("$" + String.valueOf(c.Cost) + "--" + c.CourseCode + " " + c.CourseName);
        }
        
        System.out.println("\n\n----------------------------");
        System.out.println("Search");
        System.out.println("----------------------------");
        System.out.println("Linear Search Integer...");
        System.out.println("Student (1121) found at: "+ 
                            SearchAlgorithims.linearSearchStudent(students, 1121));
        System.out.println("Student (5613) found at: "+ 
                            SearchAlgorithims.linearSearchStudent(students, 5613));
        System.out.println("\nLinear Search Student Enrolled in Course...");
        System.out.println("Students enrolled for (C110): \n" +
                            SearchAlgorithims.linearSearchEnrolledinCourse(courses, "C110"));
        System.out.println("\nBinary Search Enrollment...");
       
        System.out.println("Enrollment no. 105 found at index: " + SearchAlgorithims.BinarySearchEnrollment(enrollments, 789));
        System.out.println("Enrollment no. 789 found at index: " + SearchAlgorithims.BinarySearchEnrollment(enrollments, 89));
        
        System.out.println("\n\n----------------------------");
        System.out.println("Sorting");
        System.out.println("----------------------------");
        //Sort Student
        Sorting.bubbleSortStudent(students);
        System.out.print("Bubble Sort StudentId in ascending order...\n");
        for(Student s: students) {
            System.out.println(s.Name );
        }
        //Sort Enrollment
        Sorting.selectionSortEnrollment(enrollments);
        System.out.println("\nSelect Sort Enrollment Id in ascending order...");
        for(Enrollment e: enrollments) {
            System.out.println(e.enrollmentId + " -- " + "Name: "+ e.student.Name);
        }
        //Sort Courses
        Sorting.selectionSortCourse(courses);
        System.out.println("\nSelect Sort Course Cost in ascending order...");
        for(Course c: courses) {
            System.out.println("$" + c.Cost + " -- (" + c.CourseCode +") " + c.CourseName);
        }
        
        
        System.out.println("\n\n----------------------------");
        System.out.println("Linked List");
        System.out.println("----------------------------");
        Node first = new Node(3);
        Node middle = new Node(5);
        first.setNext(middle);
        Node last = new Node(7);
        middle.setNext(last);
        //Node.printList(first);
        
        Node s1 = new Node(student1);
        Node s2 = new Node(student2);
        Node s3 = new Node(student3);
        Node s4 = new Node(student4);
        Student s5 = new Student();
        LinkedList<Student> sLinkedList = new LinkedList<Student>();
        sLinkedList.addFirst(s1);
        sLinkedList.addLast(s2);
        sLinkedList.addLast(s3); 
        sLinkedList.addLast(s4);
        System.out.println("Adding items to Linked List...Count: (" + sLinkedList.count + ")");
        LinkedList.printList(s1);
        
        System.out.println("\nRemoving First item to Linked List... " );
        sLinkedList.removeLast();
        LinkedList.printList(s1);
        System.out.println("Count: (" + sLinkedList.count + ")");
        
        System.out.println("\nResult Contains LinkedList...");
        System.out.println("(s5)" + sLinkedList.contains(s5));
        
        
        System.out.println("\n\n----------------------------");
        System.out.println("Doubly Linked List");
        System.out.println("----------------------------");
        Node n1 = new Node(c1);
        Node n2 = new Node(c2);
        Node n3 = new Node(c3);
        Node n4 = new Node(c4);
        Node n5 = new Node(c6);
        LinkedList<Course> cDLinkedList = new LinkedList<Course>();
        cDLinkedList.addFirst(n1);
        cDLinkedList.addLast(n2);
        cDLinkedList.addLast(n3); 
        cDLinkedList.addLast(n4);
        System.out.println("Adding items to Linked List...Count: (" + cDLinkedList.count + ")");
        cDLinkedList.printList(n1);
        
        System.out.println("\nRemoving First item to Linked List... " );
        cDLinkedList.removeLast();
        LinkedList.printList(n1);
        System.out.println("Count: (" + cDLinkedList.count + ")");
        
        System.out.println("\nResult Contains LinkedList...");
        System.out.println("(s5)" + cDLinkedList.contains(c6));
        
        
        System.out.println("\n\n----------------------------");
        System.out.println("Doubly Linked List");
        System.out.println("----------------------------");
        
        
    }
    
}

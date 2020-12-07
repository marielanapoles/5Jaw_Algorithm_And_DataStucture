/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marielanapoles
 */
public class CourseTest {
    
        LocalDate date = java.time.LocalDate.of(2020, 10, 04);
        Person p1 = new Person("CHillin","telnum", "email");
        Student s1 = new Student(444, "SD", date, p1.Name, p1.Email, p1.TelNum );
        Enrollment e1 = new Enrollment(670, s1, date, "sem1", "ng");
        Course c1 = new Course("C499", "UX Design", 890.0);
        Course c2 = new Course("C499", "CISCO1", 890.0);
    
    public CourseTest() {
        
    
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCourseCode method, of class Course.
     */
    @Test
    public void testGetCourseCode() {
        LocalDate date = java.time.LocalDate.of(2020, 10, 04);
        Person p1 = new Person("CHillin","telnum", "email");
        Student s1 = new Student(444, "SD", date, p1.Name, p1.Email, p1.TelNum );
        Enrollment e1 = new Enrollment(670, s1, date, "sem1", "ng");
        Course c1 = new Course("C499", "UX Design", 890.0);
        Course c2 = new Course("C534", "CISCO1", 890.0);
        
        System.out.println("getCourseCode");
        Course instance = c1;
        String expResult = "C499";
        String result = instance.getCourseCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCourseCode method, of class Course.
     */
    @Test
    public void testSetCourseCode() {
        LocalDate date = java.time.LocalDate.of(2020, 10, 04);
        Person p1 = new Person("CHillin","telnum", "email");
        Student s1 = new Student(444, "SD", date, p1.Name, p1.Email, p1.TelNum );
        Enrollment e1 = new Enrollment(670, s1, date, "sem1", "ng");
        Course c1 = new Course("C499", "UX Design", 890.0);
        Course c2 = new Course("C082", "CISCO1", 890.0);
        
        System.out.println("setCourseCode");
        String CourseCode = "C222";
        Course instance = c2;
        instance.setCourseCode(CourseCode);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCourseName method, of class Course.
     */
    @Test
    public void testGetCourseName() {
        LocalDate date = java.time.LocalDate.of(2020, 10, 04);
        Person p1 = new Person("CHillin","telnum", "email");
        Student s1 = new Student(444, "SD", date, p1.Name, p1.Email, p1.TelNum );
        Enrollment e1 = new Enrollment(670, s1, date, "sem1", "ng");
        Course c1 = new Course("C499", "UX Design", 890.0);
        Course c2 = new Course("C499", "CISCO1", 890.0);
        
        System.out.println("getCourseName");
        Course instance = c1;
        String expResult = "UX Design";
        String result = instance.getCourseName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCourseName method, of class Course.
     */
    @Test
    public void testSetCourseName() {
        LocalDate date = java.time.LocalDate.of(2020, 10, 04);
        Person p1 = new Person("CHillin","telnum", "email");
        Student s1 = new Student(444, "SD", date, p1.Name, p1.Email, p1.TelNum );
        Enrollment e1 = new Enrollment(670, s1, date, "sem1", "ng");
        Course c1 = new Course("C499", "UX Design", 890.0);
        Course c2 = new Course("C499", "CISCO1", 890.0);
        
        System.out.println("setCourseName");
        String CourseName = "Net Sec";
        Course instance = c2;
        instance.setCourseName(CourseName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCost method, of class Course.
     */
    @Test
    public void testGetCost() {
        LocalDate date = java.time.LocalDate.of(2020, 10, 04);
        Person p1 = new Person("CHillin","telnum", "email");
        Student s1 = new Student(444, "SD", date, p1.Name, p1.Email, p1.TelNum );
        Enrollment e1 = new Enrollment(670, s1, date, "sem1", "ng");
        Course c1 = new Course("C499", "UX Design", 890.0);
        Course c2 = new Course("C499", "CISCO1", 890.0);
        
        System.out.println("getCost");
        Course instance = c1;
        double expResult = 890.0;
        double result = instance.getCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCost method, of class Course.
     */
    @Test
    public void testSetCost() {
        LocalDate date = java.time.LocalDate.of(2020, 10, 04);
        Person p1 = new Person("CHillin","telnum", "email");
        Student s1 = new Student(444, "SD", date, p1.Name, p1.Email, p1.TelNum );
        Enrollment e1 = new Enrollment(670, s1, date, "sem1", "ng");
        Course c1 = new Course("C499", "UX Design", 890.0);
        Course c2 = new Course("C499", "CISCO1", 890.0);
        
        System.out.println("setCost");
        double Cost = 750;
        Course instance = c1;
        instance.setCost(Cost);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEnrollment method, of class Course.
     */
    @Test
    public void testGetEnrollment() {
        LocalDate date = java.time.LocalDate.of(2020, 10, 04);
        Person p1 = new Person("CHillin","telnum", "email");
        Student s1 = new Student(444, "SD", date, p1.Name, p1.Email, p1.TelNum );
        Enrollment e1 = new Enrollment(670, s1, date, "sem1", "ng");
        Course c1 = new Course("C499", "UX Design", 890.0);
        Course c2 = new Course("C499", "CISCO1", 890.0);
        
        System.out.println("getEnrollment");
        Course instance = new Course("C499", "CISCO1", 890.0);
        Enrollment expResult = null;
        Enrollment result = instance.getEnrollment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEnrollment method, of class Course.
     */
    @Test
    public void testSetEnrollment() {
        LocalDate date = java.time.LocalDate.of(2020, 10, 04);
        Person p1 = new Person("CHillin","telnum", "email");
        Student s1 = new Student(444, "SD", date, p1.Name, p1.Email, p1.TelNum );
        Enrollment e1 = new Enrollment(670, s1, date, "sem1", "ng");
        Course c1 = new Course("C499", "UX Design", 890.0);
        Course c2 = new Course("C499", "CISCO1", 890.0);
        
        
        System.out.println("setEnrollment");
        Enrollment enrollment = e1;
        Course instance = c1;
        instance.setEnrollment(enrollment);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        LocalDate date = java.time.LocalDate.of(2020, 10, 04);
        Person p1 = new Person("CHillin","telnum", "email");
        Student s1 = new Student(444, "SD", date, p1.Name, p1.Email, p1.TelNum );
        Enrollment e1 = new Enrollment(670, s1, date, "sem1", "ng");
        Course c1 = new Course("C499", "UX Design", 890.0);
        Course c2 = new Course("C499", "CISCO1", 890.0);
        
        
        System.out.println("toString");
        Course instance = c2;
        String expResult = "Course{CourseCode=C499, CourseName=CISCO1, Cost=890.0, enrollment=null}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Course.
     */
    @Test
    public void testCompareTo() {
        LocalDate date = java.time.LocalDate.of(2020, 10, 04);
        Person p1 = new Person("CHillin","telnum", "email");
        Student s1 = new Student(444, "SD", date, p1.Name, p1.Email, p1.TelNum );
        Enrollment e1 = new Enrollment(670, s1, date, "sem1", "ng");
        Course c1 = new Course("C499", "UX Design", 890.0);
        Course c2 = new Course("C499", "CISCO1", 890.0);
        
        
        System.out.println("compareTo");
        Course course = c1;
        Course instance = c2;
        int expResult = 0;
        int result = instance.compareTo(course);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

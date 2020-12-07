/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marielanapoles
 */
public class Course implements Comparable<Course>{
    
    /**
     *
     */
    public String CourseCode;

    /**
     *
     */
    public String CourseName;

    /**
     *
     */
    public double Cost;
    Enrollment enrollment;

    /**
     *
     * @return
     */
    public String getCourseCode() {
        return CourseCode;
    }

    /**
     *
     * @param CourseCode
     */
    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    /**
     *
     * @return
     */
    public String getCourseName() {
        return CourseName;
    }

    /**
     *
     * @param CourseName
     */
    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    /**
     *
     * @return
     */
    public double getCost() {
        return Cost;
    }

    /**
     *
     * @param Cost
     */
    public void setCost(double Cost) {
        this.Cost = Cost;
    }

    /**
     *
     * @return
     */
    public Enrollment getEnrollment() {
        return enrollment;
    }

    /**
     *
     * @param enrollment
     */
    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    /**
     *
     * @param CourseCode
     * @param CourseName
     * @param Cost
     * @param e
     */
    public Course(String CourseCode, String CourseName, double Cost, Enrollment e) {
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.Cost = Cost;
        this.enrollment = e;
    }
    
    /**
     *
     * @param CourseCode
     * @param CourseName
     * @param Cost
     */
    public Course(String CourseCode, String CourseName, double Cost) {
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.Cost = Cost;
    }

    
    @Override
    public String toString() {
        return "Course{" + "CourseCode=" + CourseCode + ", CourseName=" + CourseName + ", Cost=" + Cost + ", enrollment=" + enrollment + '}';
    }

    
    @Override
    public int compareTo(Course course) {
        int c1 = (int)course.Cost;
        int c2 = (int) this.Cost; 
        
        return c2-c1;
    }
    
    
}

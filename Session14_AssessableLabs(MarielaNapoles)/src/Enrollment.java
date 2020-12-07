
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marielanapoles
 */
public class Enrollment implements Comparable<Enrollment>{
    
    public LocalDate dateEnrolled;
    Student student;
    public String grade;
    public String semester;
    public int enrollmentId;
    
    public int getEnrollmentId() {
        return enrollmentId;
    }
    
    public void setEnrollmentId(int e) {
        this.enrollmentId = e;
    }

    public LocalDate getDateEnrolled() {
        return dateEnrolled;
    }

    public void setDateEnrolled(LocalDate dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Enrollment(int id, Student student, LocalDate dateEnrolled, String semester, String grade) {
        this.student = new Student(student.StudentId, student.Program, student.DateRegistered, student.Name, student.Email, student.TelNum);
        this.enrollmentId = id;
        this.dateEnrolled = dateEnrolled;
        this.grade = grade;
        this.semester = semester;
        
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.dateEnrolled);
        hash = 79 * hash + Objects.hashCode(this.student);
        hash = 79 * hash + Objects.hashCode(this.grade);
        hash = 79 * hash + Objects.hashCode(this.semester);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Enrollment other = (Enrollment) obj;
        if (!Objects.equals(this.grade, other.grade)) {
            return false;
        }
        if (!Objects.equals(this.semester, other.semester)) {
            return false;
        }
        if (!Objects.equals(this.dateEnrolled, other.dateEnrolled)) {
            return false;
        }
        if (!Objects.equals(this.student, other.student)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enrollment{" + "dateEnrolled=" + dateEnrolled + ", student=" + student + ", grade=" + grade + ", semester=" + semester + '}';
    }
    
    @Override
    public int compareTo(Enrollment enrollment) {
        return this.enrollmentId - enrollment.enrollmentId;
    }
    
    public int compareTo(int i) {
        return this.enrollmentId - i;
    }
    
    
}

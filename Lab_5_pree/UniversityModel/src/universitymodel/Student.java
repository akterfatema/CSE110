/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymodel;

import java.util.ArrayList;

/**
 *
 * @author Fatema
 */
public class Student {
 private int studentId;
    private String studentName;
    private double studentCGPA;
    private ArrayList<Course> courseListForStudent = new ArrayList<Course>();
    public Student() {
    }
    public Student(int studentId, String studentName, double studentCGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudentCGPA() {
        return studentCGPA;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentCGPA(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }

    public ArrayList<Course> getCourseListForStudent() {
        return courseListForStudent;
    }

    public void setCourseListForStudent(ArrayList<Course> courseListForStudent) {
        this.courseListForStudent = courseListForStudent;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + ", studentCGPA=" + studentCGPA + '}'+"\n";
    }

   
    
//  add courses for a student
  /* public void addCourse(Course course){
        */
    public void diplayCoursesForStudent(){
        System.out.println("Information: \n studentID:" + studentId + " studentName:" + studentName + " srudentCGPA:" + studentCGPA);

        for (int i = 0; i < courseListForStudent.size(); i++) {
            System.out.print(courseListForStudent.get(i).toString());
        }
    }
}

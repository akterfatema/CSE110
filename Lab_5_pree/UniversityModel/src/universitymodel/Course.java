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
public class Course {

    private String courseId, courseTitle;
    private double credit;
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private ArrayList<Faculty> facultyList = new ArrayList<Faculty>();
    private ArrayList<Course> courseList = new ArrayList<Course>();
    private int numberOfStudents;

    public Course() {
    }

    public Course(String courseId, String courseTitle, double credit, int numberOfStudents) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public double getCredit() {
        return credit;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Faculty> getFacultyList() {
        return facultyList;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void setFacultyList(ArrayList<Faculty> facultyList) {
        this.facultyList = facultyList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "Course: " + "courseId=" + courseId + ", courseTitle=" + courseTitle + ", credit=" + credit + ", numberOfStudents=" + numberOfStudents + "\n";
    }

//addStudent
    public void addStudent(Student stu) {
        studentList.add(stu);

    }
//dropStudent
    public void dropStudent(int student_id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == student_id) {
                studentList.remove(i);
            }

        }
    }
//updateStudent
    public void updateStudent(int Id, double CGPA) {
        for (int j = 0; j < studentList.size(); j++) {
            if (Id == studentList.get(j).getStudentId()) {
                studentList.get(j).setStudentCGPA(CGPA);
            }

        }
    }
//printStudent
    public void printStudentList() {
        System.out.print(studentList);
    }
//addFaculty
    public void addFaculty(Faculty facultyInformation) {
        facultyList.add(facultyInformation);
    }

  //dropFaculty
    public void dropFaculty(int facultyId) {
        for (int i = 0; i < facultyList.size(); i++) {
            if (facultyList.get(i).getFacultyId() == facultyId) {
                facultyList.remove(i);
            }

        }
    }
//updateFaculty
    public void updateFaculty(int facultyId, String facultyPosition) {
        for (int i = 0; i < facultyList.size(); i++) {
            if (facultyList.get(i).getFacultyId() == facultyId) {
                facultyList.get(i).setFacultyPosition(facultyPosition);
            }
        }
    }
//printFaculty
    public void printFacultyList() {
        System.out.println(facultyList);
    }
//add Course

    public void addCourse(Course courseInformation) {
        courseList.add(courseInformation);
    }
//dropCourse
    public void dropCourse(String courseId) {
        for (int i = 0; i < studentList.size(); i++) {
            if (courseList.get(i).getCourseId().equalsIgnoreCase(courseId)) {
                courseList.remove(i);
            }

        }
    }
//updateCourse
    public void updateCourse(String courseId, int numberOfStudents) {
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseId().equalsIgnoreCase(courseId)) {
                courseList.get(i).setNumberOfStudents(numberOfStudents);
            }
        }
    }
//printCourseList
    public void printCourseList() {
        System.out.println(courseList);
    }

 //printDisplay in search for whether a student takes a course and  print search for whether a faculty teaches a course
    
    public void Display1(){
        System.out.println("Information: \n"+ "CourseId: "+courseId+" CourseTitle: "+courseTitle+ " Credit: "+credit);
    }
  
//printAddStudentInCourse
    public void displayAddStudentInCourse() {
        System.out.println("Information: \nCourseId:" + courseId + " CourseTitle: " + courseTitle + " Credit: " + credit);
        for (int i = 0; i < studentList.size(); i++) {
            System.out.print(studentList.get(i).toString());
        }
        System.out.println("");
    }

    //display add faculty to a course
     public void displayAddFacultyToCourse() {
        System.out.println("Details information: \nCourseId:" + courseId + " CourseTitle: " + courseTitle + " Credit: " + credit);
        for (int i = 0; i < facultyList.size(); i++) {
            System.out.print(facultyList.get(i).toString());
        }
        System.out.println("");
    }
     
  
}

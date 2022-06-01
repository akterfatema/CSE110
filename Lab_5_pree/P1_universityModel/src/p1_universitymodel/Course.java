/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_universitymodel;

import java.util.ArrayList;

/**
 *
 * @author Fatema
 */
public class Course {

    private String courseId;
    private String courseTitle;
    private double credit;
    private int numberOfStudents;
    private ArrayList<Student> student = new ArrayList<Student>();
    private ArrayList<Course> course = new ArrayList<Course>();
    private ArrayList<Faculty> faculty = new ArrayList<Faculty>();

    public Course() {
    }

    public Course(String courseId, String courseTitle, double credit, int numberOfStudents) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
        this.numberOfStudents = numberOfStudents;

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

    public ArrayList<Student> getStudent() {
        return student;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public ArrayList<Faculty> getFaculty() {
        return faculty;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }

    public void setFaculty(ArrayList<Faculty> faculty) {
        this.faculty = faculty;
    }

    public ArrayList<Course> getCourse() {
        return course;
    }

    public void setCourse(ArrayList<Course> course) {
        this.course = course;
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

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", courseTitle=" + courseTitle + ", credit=" + credit + ", numberOfStudents=" + numberOfStudents + '}';
    }

    //add drop of student
    public void addStudent(Student objStudent) {
        student.add(objStudent);
    }

    public void dropStudent(int Id) {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getStudentId() == Id) {
                student.remove(i);
            }

        }
    }
    //add drop course

    public void addCourse(Course objCourse) {
        course.add(objCourse);
    }

    public void dropCourse(String id) {
        for (int i = 0; i < course.size(); i++) {
            if (courseId == id) {
                course.remove(i);
            }

        }
    }

    //faculty add drop
    public void addFaculty(Faculty objFaculty) {
        faculty.add(objFaculty);
    }

    public void dropFaculty(int id) {
        for (int i = 0; i < faculty.size(); i++) {
            if (faculty.get(i).getFacultyId() == id) {
                faculty.remove(i);
            }

        }

    }

    //update
    public void updateStudent(int s_id, double cgpa) {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getStudentId() == s_id) {
                student.get(i).setStudentCGPA(cgpa);
            }

        }

    }

    public void updateCourse(String c_Id, int numberOfStudents) {
        for (int i = 0; i < course.size(); i++) {
            if (course.get(i).getCourseId().equalsIgnoreCase(c_Id)) {
                course.get(i).setNumberOfStudents(numberOfStudents);
            }
        }
    }

    public void updateFaculty(int f_id, String f_position) {
        for (int i = 0; i < faculty.size(); i++) {
            if (faculty.get(i).getFacultyId() == f_id) {
                faculty.get(i).setFacultyPosition(f_position);
            }
        }
    }

    //addStudent in course
    public void addStudentForCourse(String c_id, int s_id) {
        for (int i = 0; i < course.size(); i++) {
            if (course.get(i).getCourseId().equalsIgnoreCase(c_id)) {
                for (int j = 0; j < student.size(); j++) {
                    if (student.get(j).getStudentId() == s_id) {
                        course.get(i).student.add(student.get(j));
                        System.out.println("Student added in course!\n");
                        course.get(i).displayForAddStudentForCourse();

                    }
                }

            }
        }

    }
    //addStudentInCourseDisplay

    public void displayForAddStudentForCourse() {
        System.out.println("Course Id:" + courseId + " Course title: " + courseTitle + " Credit: " + credit);
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i).toString());
        }
        System.out.println("");
    }

    //printStudentList
    public void printStudentList() {
        System.out.println(student);
    }

    //printCourseLIst
    public void printCourseList() {
        System.out.println(course);
    }

    //printfacultyList
    public void printFacultylist() {
        System.out.println(faculty);
    }

}

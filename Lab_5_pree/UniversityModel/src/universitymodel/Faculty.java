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
public class Faculty {
     private int facultyId;
    private String facultyName, facultyPosition;
 private ArrayList<Course> courseListForFaculty = new ArrayList<Course>();
    public Faculty() {
    }
    public Faculty(int facultyId, String facultyName, String facultyPosition) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }

  

    public ArrayList<Course> getCourseListForFaculty() {
        return courseListForFaculty;
    }

    public void setCourseListForFaculty(ArrayList<Course> courseListForFaculty) {
        this.courseListForFaculty = courseListForFaculty;
    }

    @Override
    public String toString() {
        return "Faculty{" + "facultyId=" + facultyId + ", facultyName=" + facultyName + ", facultyPosition=" + facultyPosition  + '}'+"\n";
    }

    

    public int getFacultyId() {
        return facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getFacultyPosition() {
        return facultyPosition;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setFacultyPosition(String facultyPosition) {
        this.facultyPosition = facultyPosition;
    }
    
   //display addCourseForFAculty
     public void displayAddCourseForFaculty() {
        System.out.println("Details information: \nFacultyId:" + facultyId + " facultyName: " + facultyName + "facultyPosition: " + facultyPosition);
        for (int i = 0; i < courseListForFaculty.size(); i++) {
            System.out.print(courseListForFaculty.get(i).toString());
        }
        System.out.println("");
    } 
    
}

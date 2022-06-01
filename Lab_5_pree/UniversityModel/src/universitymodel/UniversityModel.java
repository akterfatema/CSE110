/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymodel;

import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class UniversityModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner af = new Scanner(System.in);
        Student student = new Student();
        Faculty faculty = new Faculty();
        Course course = new Course();
        /*
 //student input
       
        System.out.println("Enter the student number: ");
        int studentNumber = af.nextInt();
            System.out.println("Enter student id,name,cgpa: ");
        for (int i = 0; i < studentNumber; i++) {
            int id = af.nextInt();
            String name = af.next();
            double cgpa = af.nextDouble();
            student = new Student(id, name, cgpa);
            course.addStudent(student);

        }
        //course input
        System.out.println("Enter the course number: ");
        int courseNumber = af.nextInt();
            System.out.println("Enter course id,title,credit and numberOfStudent: ");
        for (int i = 0; i < courseNumber; i++) {
            String id = af.next();
            String title = af.next();
            double credit = af.nextDouble();
            int numberOfStudent = af.nextInt();
            course = new Course(id, title, credit, numberOfStudent);
            course.addCourse(course);

        }

        //faculty input
        System.out.println("Enter the faculty number: ");
        int facultyNumber = af.nextInt();
            System.out.println("Enter faculty id,name,position: ");
        for (int i = 0; i < facultyNumber; i++) {
            int id = af.nextInt();
            String name = af.next();
            String position = af.next();
            faculty = new Faculty(id, name, position);
            course.addFaculty(faculty);
        }
         */
        //application   
        boolean f = true;
        while (f == true) {
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Print");
            System.out.println("5. Search");
            System.out.println("6. Add students in a course");
            System.out.println("7. Add courses for a student");
            System.out.println("8. Add a faculty for a course");
            System.out.println("9. Add courses for a faculty");
            System.out.println("10. exit");
            System.out.println("Please enter a number:");
            int num = af.nextInt();

            //add  all
            if (num == 1) {
                System.out.println("a. Add a student");
                System.out.println("b. Add a faculty");
                System.out.println("c. Add a course");
                System.out.print("please enter a letter: ");
                char ch = af.next().charAt(0);
                //student add
                if (ch == 'a') {
                    System.out.print("Enter student id, name , cgpa: ");
                    int sId = af.nextInt();
                    String sName = af.next();
                    double CGPA = af.nextDouble();
                    Student s = new Student(sId, sName, CGPA);
                    course.addStudent(s);
                    System.out.println("Student added successfully");
                } //add a faculty
                else if (ch == 'b') {
                    System.out.print("Enter facultyID, facultyName and facultyPosition: ");
                    int fId = af.nextInt();
                    String fName = af.next();
                    String fPosition = af.next();
                    Faculty faculty1 = new Faculty(fId, fName, fPosition);
                    course.addFaculty(faculty1);
                    System.out.println("Faculty Added successfully");
                } //add a course
                else if (ch == 'c') {
                    System.out.println("Enter courseId, courseTitle, credit, number of students: ");
                    String cId = af.next();
                    String cTitle = af.next();
                    double credit = af.nextDouble();
                    int numberOFStudents = af.nextInt();
                    Course course1 = new Course(cId, cTitle, credit, numberOFStudents);
                    course.addCourse(course1);
                    System.out.println("Course added successfully");
                }

            } //delete all
            else if (num == 2) {

                System.out.println("a. delete a student");
                System.out.println("b. delete a faculty");
                System.out.println("c. delete a course");
                System.out.print("please enter a letter: ");
                char ch = af.next().charAt(0);
                //deleteStudent
                if (ch == 'a') {
                    System.out.print("Enter the student id: ");
                    int id = af.nextInt();
                    course.dropStudent(id);
                    System.out.println("Student deleted successfully");
                } //deleteFaculty
                else if (ch == 'b') {
                    System.out.print("Enter the facultyID: ");
                    int fid = af.nextInt();
                    course.dropFaculty(fid);
                    System.out.println("Faculty deleted successfully");
                } //deleteCourse
                else if (ch == 'c') {
                    System.out.print("Enter course id: ");
                    String courseId = af.next();
                    course.dropCourse(courseId);
                    System.out.println("Course deleted successfully");

                }
            } // updateAll
            else if (num == 3) {
                System.out.println("a. update a student's cgpa");
                System.out.println("b. update a faculty");
                System.out.println("c. update a course");
                System.out.print("Please enter a letter: ");
                char ch = af.next().charAt(0);
                //updateStudentCGPA
                if (ch == 'a') {
                    System.out.print("Enter student's id and updated cgpa: ");
                    int id = af.nextInt();
                    double ucgpa = af.nextDouble();
                    course.updateStudent(id, ucgpa);
                    System.out.println(" Student's CGPA has updated successfully");
                } //updateFacultyPosition
                else if (ch == 'b') {
                    System.out.print("Enter faculty's id and updated position");
                    int fid = af.nextInt();
                    String fPosition = af.nextLine();
                    course.updateFaculty(fid, fPosition);
                    System.out.println("Faculty position updated successfully");
                    break;
                } //updateNumberOf Student in a course
                else if (ch == 'c') {
                    System.out.print("Enter course id and updated number of students: ");
                    String cId = af.next();
                    int numberOFStudents = af.nextInt();
                    course.updateCourse(cId, numberOFStudents);
                    System.out.println("Course updated successfully");
                    break;
                }
            } //print
            else if (num == 4) {
                System.out.println("a.	Print all students\n"
                        + "b.	Print all course\n"
                        + "c.	Print all faculties\n"
                        + "d.	Print information of a student\n"
                        + "e.	Print information of a course\n"
                        + "f.	Print information of a faculty\n"
                        + "g.	Print student list and faculty information of a course\n"
                        + "h.	Print courses taken by a student");
                System.out.print("please enter a letter: ");
                char c = af.next().charAt(0);
                //printAllStudent
                if (c == 'a') {
                    course.printStudentList();
                } //printAllCourse
                else if (c == 'b') {
                    course.printCourseList();
                } //printAllFaculty
                else if (c == 'c') {
                    course.printFacultyList();
                } //print information of a student
                else if (c == 'd') {
                    System.out.println("Enter Students's Id: ");
                    int sId = af.nextInt();
                    for (int i = 0; i < course.getStudentList().size(); i++) {
                        if (course.getStudentList().get(i).getStudentId() == sId) {
                            System.out.println(course.getStudentList().get(i));
                        }
                    }
                } //print information of a course
                else if (c == 'e') {
                    System.out.println("Enter course Id: ");
                    String cId = af.next();
                    for (int i = 0; i < course.getCourseList().size(); i++) {
                        if (course.getCourseList().get(i).getCourseId().equalsIgnoreCase(cId)) {
                            System.out.println(course.getCourseList().get(i));
                        }
                    }
                } //print information of a faculty
                else if (c == 'f') {
                    System.out.println("Enter faculty Id: ");
                    int fId = af.nextInt();
                    for (int i = 0; i < course.getFacultyList().size(); i++) {
                        if (course.getFacultyList().get(i).getFacultyId() == fId) {
                            System.out.println(course.getFacultyList().get(i));
                        }
                    }

                } //	Print student list and faculty information of a course
                else if (c == 'g') {
                    System.out.println("Enter course Id: ");
                    String cId = af.next();
                    for (int i = 0; i < course.getCourseList().size(); i++) {
                        if (course.getCourseList().get(i).getCourseId().equalsIgnoreCase(cId)) {
                            for (int j = 0; j < course.getCourseList().get(i).getStudentList().size(); j++) {
                                System.out.println(course.getCourseList().get(i).getStudentList().get(j));
                            }
                            for (int j = 0; j < course.getCourseList().get(i).getFacultyList().size(); j++) {
                                System.out.println(course.getCourseList().get(i).getFacultyList());
                            }
                        }
                    }
                } //Print courses taken by a student  
                else if (c == 'h') {
                    System.out.println("Enter Students's Id: ");
                    int sId = af.nextInt();
                    for (int i = 0; i < course.getCourseList().size(); i++) {
                        for (int j = 0; j < course.getCourseList().get(i).getStudentList().size(); j++) {
                            if (course.getCourseList().get(i).getStudentList().get(j).getStudentId() == sId) {
                                System.out.println("The student has taken this courses");
                                course.getCourseList().get(i).Display1();
                            }
                        }
                    }

                }

            } //search
            else if (num == 5) {
                System.out.println("a.	Search a Student\n"
                        + "b.	Search a Course\n"
                        + "c.	Search a Faculty\n"
                        + "d.	Search whether a student takes a course\n"
                        + "e.	Search whether a faculty teaches a course\n"
                        + "f.	Search courses taken by a student\n"
                        + "g.	Search courses taught by a faculty");
                System.out.print("please enter a letter: ");

                char c = af.next().charAt(0);
                //search a student
                if (c == 'a') {
                    System.out.println("Enter Students's Id: ");
                    int sId = af.nextInt();
                    for (int i = 0; i < course.getStudentList().size(); i++) {
                        if (course.getStudentList().get(i).getStudentId() == sId) {
                            System.out.println(course.getStudentList().get(i));
                        }
                    }
                } //search a course
                else if (c == 'b') {
                    System.out.println("Enter course Id: ");
                    String cId = af.next();
                    for (int i = 0; i < course.getCourseList().size(); i++) {
                        if (course.getCourseList().get(i).getCourseId().equalsIgnoreCase(cId)) {
                            System.out.println(course.getCourseList().get(i));
                        }
                    }
                } //search a faculty
                else if (c == 'c') {
                    System.out.println("Enter faculty Id: ");
                    int fId = af.nextInt();
                    for (int i = 0; i < course.getFacultyList().size(); i++) {
                        if (course.getFacultyList().get(i).getFacultyId() == fId) {
                            System.out.println(course.getFacultyList().get(i));
                        }
                    }

                } //Search whether a student takes a course
                else if (c == 'd') {
                    System.out.println("Enter student's id: ");
                    int sId = af.nextInt();
                    int count = 0;
                    for (int i = 0; i < course.getCourseList().size(); i++) {
                        for (int j = 0; j < course.getCourseList().get(i).getStudentList().size(); j++) {
                            if (course.getCourseList().get(i).getStudentList().get(j).getStudentId() == sId) {
                                count++;
                            }
                        }
                    }
                    System.out.println("The student has taken " + count + " courses.");
                } //Search whether a faculty teaches a course
                else if (c == 'e') {
                    System.out.println("Enter faculty's Id: ");
                    int fId = af.nextInt();
                    int count = 0;
                    for (int i = 0; i < course.getCourseList().size(); i++) {
                        for (int j = 0; j < course.getCourseList().get(i).getFacultyList().size(); j++) {
                            if (course.getCourseList().get(i).getFacultyList().get(j).getFacultyId() == fId) {
                                count++;
                            }
                        }
                    }
                    System.out.println("The faculty has taught " + count + " courses.");
                } // search courses taken by a student
                else if (c == 'f') {
                    System.out.println("Enter Students's Id: ");
                    int sId = af.nextInt();
                    for (int i = 0; i < course.getCourseList().size(); i++) {
                        for (int j = 0; j < course.getCourseList().get(i).getStudentList().size(); j++) {
                            if (course.getCourseList().get(i).getStudentList().get(j).getStudentId() == sId) {
                                System.out.println("The student has taken this courses");
                                course.getCourseList().get(i).Display1();
                            }
                        }
                    }

                } //	Search courses taught by a faculty
                else if (c == 'g') {
                    System.out.println("Enter faculty's Id: ");
                    int fId = af.nextInt();
                    for (int i = 0; i < course.getCourseList().size(); i++) {
                        for (int j = 0; j < course.getCourseList().get(i).getFacultyList().size(); j++) {
                            if (course.getCourseList().get(i).getFacultyList().get(j).getFacultyId() == fId) {
                                System.out.println("The faculty has taught this courses");
                                course.getCourseList().get(i).Display1();
                            }
                        }
                    }

                }
            } // Add students in a course
            else if (num == 6) {
                System.out.print("Enter course id: ");
                String cId1 = af.next();
                System.out.print("Enter the student's id: ");
                int sId1 = af.nextInt();

                for (int i = 0; i < course.getCourseList().size(); i++) {
                    if (course.getCourseList().get(i).getCourseId().equalsIgnoreCase(cId1)) {
                        for (int j = 0; j < course.getStudentList().size(); j++) {
                            if (course.getStudentList().get(j).getStudentId() == sId1) {
                                course.getCourseList().get(i).getStudentList().add(course.getStudentList().get(j));
                                System.out.println("Student added in course successfully");
                                course.getCourseList().get(i).displayAddStudentInCourse();

                            }
                        }

                    }
                }

            } //Add courses for a student
            else if (num == 7) {
                System.out.print("Enter the student's id: ");
                int sId2 = af.nextInt();
                System.out.print("Enter a course Id: ");
                String cId2 = af.next();

                for (int i = 0; i < course.getStudentList().size(); i++) {
                    if (course.getStudentList().get(i).getStudentId() == sId2) {
                        for (int j = 0; j < course.getCourseList().size(); j++) {
                            if (course.getCourseList().get(j).getCourseId().equalsIgnoreCase(cId2)) {
                                course.getStudentList().get(i).getCourseListForStudent().add(course.getCourseList().get(j));
                                System.out.println("Course added for the student successfully");
                                course.getStudentList().get(i).diplayCoursesForStudent();
                            }
                        }
                    }
                }

            } //add a faculty for a course
            else if (num == 8) {
                System.out.print("Enter a course Id: ");
                String cId3 = af.next();
                System.out.print("Enter the faculty's id: ");
                int fId2 = af.nextInt();

                for (int i = 0; i < course.getCourseList().size(); i++) {
                    if (course.getCourseList().get(i).getCourseId().equalsIgnoreCase(cId3)) {
                        for (int j = 0; j < course.getFacultyList().size(); j++) {
                            if (course.getFacultyList().get(j).getFacultyId() == fId2) {
                                course.getCourseList().get(i).getFacultyList().add(course.getFacultyList().get(j));
                                System.out.println("faculty added for a course  successfully");
                                course.getCourseList().get(i).displayAddFacultyToCourse();
                            }
                        }
                    }
                }
            } //Add courses for a faculty
            else if (num == 9) {
                System.out.print("Enter the faculty's id: ");
                int fId3 = af.nextInt();
                System.out.print("Enter a course Id: ");
                String cId4 = af.next();

                for (int i = 0; i < course.getFacultyList().size(); i++) {
                    if (course.getFacultyList().get(i).getFacultyId() == fId3) {
                        for (int j = 0; j < course.getCourseList().size(); j++) {
                            if (course.getCourseList().get(j).getCourseId().equalsIgnoreCase(cId4)) {
                                course.getFacultyList().get(i).getCourseListForFaculty().add(course.getCourseList().get(j));
                                System.out.println("courses added for a faculty  successfully");
                                course.getFacultyList().get(i).displayAddCourseForFaculty();
                            }
                        }
                    }
                }

            } else if (num == 10) {
                f = false;
                System.out.println("Thanks");
            }

        }
    }

}

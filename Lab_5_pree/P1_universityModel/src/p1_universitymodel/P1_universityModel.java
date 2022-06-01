/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_universitymodel;

import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class P1_universityModel {

    public static void main(String[] args) {
        Scanner af = new Scanner(System.in);
        Student student=new Student();
        Faculty faculty=new Faculty();
        Course course = new Course();

        //student input
       /*
        System.out.println("Enter the student number: ");
        int studentNumber = af.nextInt();
        for (int i = 0; i < studentNumber; i++) {
            System.out.println("Enter student id,name,cgpa: ");
            int id = af.nextInt();
            String name = af.next();
            double cgpa = af.nextDouble();
            student = new Student(id, name, cgpa);
            course.addStudent(student);

        }
        //course input
        System.out.println("Enter the course number: ");
        int courseNumber = af.nextInt();
        for (int i = 0; i < courseNumber; i++) {
            System.out.println("Enter course id,title,credit and numberOfStudent: ");
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
        for (int i = 0; i < facultyNumber; i++) {
            System.out.println("Enter faculty id,name,position: ");
            int id = af.nextInt();
            String name = af.next();
            String position = af.next();
            faculty = new Faculty(id, name, position);
            course.addFaculty(faculty);

        }
 */
        //Application
        boolean f = true;
        while (f == true) {

            System.out.println("1.add");
            System.out.println("2.delete");
            System.out.println("3.update");
            System.out.println("4.Display");
            System.out.println("5.add a student in a course");
            System.out.println("6.exit");
            int num = af.nextInt();

            //for add
            if (num == 1) {
                System.out.println("a. add a student");
                System.out.println("b. add a course");
                System.out.println("c. add a faculty");
                char ch = af.next().charAt(0);
                if (ch == 'a') {
                    System.out.println("Enter student id,name,cgpa: ");
                    int id = af.nextInt();
                    String name = af.next();
                    double cgpa = af.nextDouble();
                    student = new Student(id, name, cgpa);
                    course.addStudent(student);
                    System.out.println("Student added successfully");

                } else if (ch == 'b') {
                    System.out.println("Enter course id,title,credit and numberOfStudent: ");
                    String id = af.next();
                    String title = af.next();
                    double credit = af.nextDouble();
                    int numberOfStudent = af.nextInt();
                    course = new Course(id, title, credit, numberOfStudent);
                    System.out.println("Course added successfully");
                } else if (ch == 'c') {
                    System.out.println("Enter faculty id,name,position: ");
                    int id = af.nextInt();
                    String name = af.next();
                    String position = af.next();
                    faculty = new Faculty(id, name, position);
                    course.addFaculty(faculty);
                    System.out.println("Faculty added successfully");
                }

            } //for delete 
            else if (num == 2) {
                System.out.println("a. drop student");
                System.out.println("b. drop course");
                System.out.println("c. drop faculty");
                char ch = af.next().charAt(0);

                if (ch == 'a') {
                    System.out.println("Enter the student id: ");
                    int id = af.nextInt();
                    course.dropStudent(id);
                    System.out.println("student drop successfully");
                } else if (ch == 'b') {
                    System.out.println("Enter the course id: ");
                    String id = af.next();
                    course.dropCourse(id);
                    System.out.println("course drop successfully");
                } else if (ch == 'c') {
                    System.out.println("Enter the faculty id: ");
                    int id = af.nextInt();
                    course.dropFaculty(id);
                    System.out.println("faculty drop successfully");
                }
            } //for update 
            else if (num == 3) {
                System.out.println("a. update student's CGPA");
                System.out.println("b. update numberOfStudent of course");
                System.out.println("c. update faculty designation");
                char ch = af.next().charAt(0);
                if (ch == 'a') {
                    System.out.println("Enter student id and updated CGPA : ");
                    int s_id = af.nextInt();
                    double cgpa = af.nextDouble();
                    course.updateStudent(s_id,cgpa);
                        System.out.println("Student information updated successfully");

                }

                if (ch == 'b') {
                    System.out.println("Enter course id and updated numberOfStudent: ");
                    String c_id = af.next();
                    int numberOfStudent = af.nextInt();
                 course.updateCourse(c_id,numberOfStudent);
                    
                    System.out.println("course information updated successfully");

                }
                if (ch == 'c') {
                    System.out.println("Enter faculty id updated faculty Position: ");
                    int f_id = af.nextInt();
                    String f_position = af.next();
                    course.updateFaculty(f_id,f_position);
                    System.out.println("faculty information updated successfully");

                }

            } 
            
            //display
           else if (num==4) {
                for (int i = 0; i < course.getStudent().size(); i++) {
                    System.out.println(course.getStudent().get(i).toString());
                }
                for (int i = 0; i < course.getCourse().size(); i++) {
                    System.out.println(course.getCourse().get(i).toString());
                }
                for (int i = 0; i < course.getFaculty().size(); i++) {
                    System.out.println(course.getFaculty().get(i).toString());
                }
           
            }
            
            else if (num==5) {
//add a student in a course
                System.out.println("Enetr the course id: ");
                String c_id=af.next();
                System.out.println("Enter the student id: ");
                int s_id=af.nextInt();
                course.addStudentForCourse(c_id,s_id);
               /* for (int i = 0; i < course.getCourse().size(); i++) {
                    if (course.getCourse().get(i).getCourseId().equalsIgnoreCase(c_id)) {
                        for (int j = 0; j < course.getStudent().size(); j++) {
                            if (course.getStudent().get(j).getStudentId()==s_id) {
                                course.getCourse().get(i).addStudentForCourse(course.getStudent().get(j));
                                course.getCourse().get(i).displayForAddStudentForCourse();
                                System.out.println("student added in course successfully");
                                break;
                            }
                        }
                           break;
  
                    }
                    
                }
                
             
                    }*/
            }
//for exit
            else if (num == 6) {
                System.out.println("Thanks");
                f = false;
            }
        //printAllList
        course.printStudentList();
        course.printCourseList();
        course.printFacultylist();   
        }
     
    }

}

package kz.bitlab.springboot.sprint.controller;

import kz.bitlab.springboot.sprint.db.Music;
import kz.bitlab.springboot.sprint.db.Student;

import java.util.ArrayList;

public class DBManager {
    private static final ArrayList<Student> students = new ArrayList<>();

    private static Long id = 3L;

    static {
        students.add(new Student(1L, "Berik", "Serik", 91, 'A'));
        students.add(new Student(2L, "Assan", "Yessen", 49, 'F'));
    }
    public static ArrayList<Student> getStudents(){
        return students;
    }

    public static void addStudent(Student student){
        student.setId(id);
        id++;
        int exam = student.getExam();
        if(exam >= 90) {
            student.setMark('A');
        }
        else if(exam < 50) {
            student.setMark('F');
        }
        else if(exam < 60) {
            student.setMark('D');
        }
        else if(exam < 75) {
            student.setMark('C');
        }
        else if(exam < 90) {
            student.setMark('B');
        }
        students.add(student);
    }
}

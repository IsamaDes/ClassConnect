package org.example.SchoolProject.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    public static List<Student> listOfStudent = new ArrayList<>();
    public List<AdmittedStudent>;
    private int studentIdNumber;
    LocalDate enrollmentDate;

    @Override
    public String toString() {
        return "Student{" +
                "studentIdNumber=" + studentIdNumber +
                ", enrollmentDate=" + enrollmentDate +
                ", gpa=" + gpa +
                ", score=" + score +
                ", roomNumber=" + roomNumber +
                ", testScore=" + testScore +
                '}';
    }

    public static List<Student> getListOfStudent() {
        return listOfStudent;
    }

    public static void setListOfStudent(List<Student> listOfStudent) {
        Student.listOfStudent = listOfStudent;
    }

    public int getStudentIdNumber() {
        return studentIdNumber;
    }

    public void setStudentIdNumber(int studentIdNumber) {
        this.studentIdNumber = studentIdNumber;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getTestScore() {
        return testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }

    private double gpa;

//    public Student(int studentIdNumber, LocalDate enrollmentDate, double gpa, int score, int roomNumber, int testScore) {
//        this.studentIdNumber = studentIdNumber;
//        this.enrollmentDate = enrollmentDate;
//        this.gpa = gpa;
//        this.score = score;
//        this.roomNumber = roomNumber;
//        this.testScore = testScore;
//    }

    int score;
    int roomNumber;
    int testScore;
}

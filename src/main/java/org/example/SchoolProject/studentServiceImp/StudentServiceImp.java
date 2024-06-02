package org.example.SchoolProject.studentServiceImp;

import org.example.SchoolProject.entity.Student;
import org.example.SchoolProject.entity.Teacher;
import org.example.SchoolProject.studentServices.StudentServices;

public class StudentServiceImp implements StudentServices {
    @Override
    public Student takeCourse(Teacher teacher, Student student) {
        return student;
    }

    @Override
    public Student takeExam(Student student, Teacher teacher) {
        return student;
    }
}

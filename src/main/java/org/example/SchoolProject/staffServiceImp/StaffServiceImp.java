package org.example.SchoolProject.staffServiceImp;

import org.example.SchoolProject.entity.Applicant;
import org.example.SchoolProject.entity.Principal;
import org.example.SchoolProject.entity.Student;
import org.example.SchoolProject.entity.Teacher;
import org.example.SchoolProject.staffServices.StaffService;

public class StaffServiceImp implements StaffService {

    @Override
    public Student takeCourse(Teacher teacher, Student student) {
        if (student.getScore() >= 50) {
            Student.listOfStudent.add(student);
        }
        return student;
    }

//    @Override
//    public Teacher teachCourse(Teacher teach, Principal principal) {
//
//    }

    @Override
    public String expel(Student student) {
        if (student.getGpa() >= 3.5 && student.getGpa() <= 5.0) {
            Student.listOfStudent.add(student);
            return "First Class gotten";
        } else if(student.getGpa() > 2.0 && student.getGpa() < 3.5) {
            return "Second Class gotten";
        } else {
            return "Student Failed - Expelled";
        }
    }

    @Override
    public void admitAge(Principal principal, Applicant applicant, Student student) {
        if (applicant.getAge() >= 18) {
            listOfApplicant.add(applicant);
        }
    }
}
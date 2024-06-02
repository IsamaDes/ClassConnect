package org.example.SchoolProject.staffServices;

import org.example.SchoolProject.entity.Applicant;
import org.example.SchoolProject.entity.Principal;
import org.example.SchoolProject.entity.Student;
import org.example.SchoolProject.entity.Teacher;

public interface StaffService {
    Student takeCourse(Teacher teacher, Student student);

    //Teacher teachCourse(Teacher teach, Principal principal);
    String expel(Student student);
    void admitAge(Principal principal, Applicant applicant);

    void admitAge(Principal principal, Applicant applicant, Student student);
}

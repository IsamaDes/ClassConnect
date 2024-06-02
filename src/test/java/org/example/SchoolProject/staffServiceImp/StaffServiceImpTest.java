package org.example.SchoolProject.staffServiceImp;

import org.example.SchoolProject.entity.Applicant;
import org.example.SchoolProject.entity.Principal;
import org.example.SchoolProject.entity.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffServiceImpTest {
    StaffServiceImp staffService = new StaffServiceImp();
    @Test
    void expelTestOne() {
        Student student = new Student();
        student.setGpa(4.0);
        assertEquals("First Class gotten",staffService.expel(student));
    }
    @Test
    void expelTestTwo() {
        Student student = new Student();
        student.setGpa(2.5);
        assertEquals("Second Class gotten",staffService.expel(student));
    }
    @Test
    void expelTestThree() {
        Student student = new Student();
        student.setGpa(1.5);
        assertEquals("Student Failed - Expelled",staffService.expel(student));
    }

    @Test
    public void admitAge() {
        Applicant applicant = new Applicant();
        applicant.setAge(17);
        assertequals()
    }
}



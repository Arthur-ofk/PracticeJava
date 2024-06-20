package org.m.practice.Service;

import org.m.practice.Entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> GetAllStudents();
    Student saveStudent(Student student);
}

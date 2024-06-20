package org.m.practice.Service.Implement;

import org.m.practice.Entities.Student;
import org.m.practice.Repository.StudentRepository;
import org.m.practice.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository _studentRepository;

    public StudentServiceImpl(StudentRepository _studentRepository) {
        super();
        this._studentRepository = _studentRepository;
    }

    @Override
    public List<Student> GetAllStudents() {
          return _studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return _studentRepository.save(student);
    }
}

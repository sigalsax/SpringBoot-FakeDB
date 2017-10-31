package com.sigal.Dao;

import com.sigal.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    // return students in hashmap
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}

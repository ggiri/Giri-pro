package com.gigo.demo.dao;

import java.util.List;
import java.util.UUID;

import com.gigo.demo.model.Student;

public interface StudentDao {

	int insertNewStudent(UUID studentId, Student student);

	Student selectStudentById(UUID studentId);

	List<Student> selectAllStudents();

	int updateStudentById(UUID studentId, Student updatedStudent);

	int deleteStudentById(UUID studentId);
}

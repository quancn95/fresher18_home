package com.fre18.qnt.service;

import java.util.List;

import com.fre18.qnt.entity.Student;

public interface StudentService {
	void save(final Student student);

	Student findById(final int id);

	void delete(final Student student);

	List<Student> findAll();
}

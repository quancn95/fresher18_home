package com.fre18.qnt.dao;

import java.util.List;

import com.fre18.qnt.entity.Student;
 
public interface StudentDao {

	void save(final Student student);

	Student findById(final int id);

	void delete(final Student student);

	List<Student> findAll();
}

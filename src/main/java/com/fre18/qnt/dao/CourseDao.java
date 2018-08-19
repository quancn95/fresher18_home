package com.fre18.qnt.dao;

import java.util.List;

import com.fre18.qnt.entity.Course;

public interface CourseDao {
	void save(final Course course);

	Course findById(final int id);

	void delete(final Course course);

	List<Course> findAll();
}

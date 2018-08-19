package com.fre18.qnt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.fre18.qnt.dao.CourseDao;
import com.fre18.qnt.entity.Course;
import com.fre18.qnt.service.CourseService;

@Service
@ComponentScan({"com.fre18.qnt.daoimpl"})
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public void save(Course course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
	}

	@Override
	public Course findById(int id) {
		// TODO Auto-generated method stub
		return courseDao.findById(id);
	}

	@Override
	public void delete(Course course) {
		// TODO Auto-generated method stub
		courseDao.delete(course);
	}

	@Override
	public List<Course> findAll() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

}

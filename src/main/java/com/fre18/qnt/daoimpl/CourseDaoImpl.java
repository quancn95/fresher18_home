package com.fre18.qnt.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fre18.qnt.dao.CourseDao;
import com.fre18.qnt.entity.Course;

@Repository
@Transactional
public class CourseDaoImpl implements CourseDao {

	@Autowired
	private SessionFactory  sessionFactory;
	
	@Override
	public void save(Course course) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.save(course);
	}

	@Override
	public Course findById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(Course.class, id);
	}

	@Override
	public void delete(Course course) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(course);
	}

	@Override
	public List<Course> findAll() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("From Course", Course.class).getResultList();
	}

}

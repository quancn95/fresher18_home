package com.fre18.qnt.springboothib;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.fre18.qnt.dao.CustomerDao;
import com.fre18.qnt.entity.Course;
import com.fre18.qnt.entity.Customer;
import com.fre18.qnt.entity.Student;
import com.fre18.qnt.service.CourseService;
import com.fre18.qnt.service.CustomerService;
import com.fre18.qnt.service.StudentService;

@SpringBootApplication
@ComponentScan({ "com.fre18.qnt.springboothib","com.fre18.qnt.service","com.fre18.qnt.serviceimpl" })
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class,
		DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class SpringboothibApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringboothibApplication.class, args); 
	}

	 
	@Autowired
	private CustomerService customerService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private CourseService courseService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Customer customer = customerService.findById(1);
		System.out.println(customer.getName()); */
		
		Student student1 = new Student("Quan", 20);
		Student student2 = new Student("Binh", 20);
		Student student3 = new Student("Linh", 20);
		Course course1 = new  Course("Java", 500);
		Course course2 = new  Course("PHP", 500);
		
		/*studentService.save(student1);
		studentService.save(student2);
		studentService.save(student3);*/
		List<Student> students = studentService.findAll();
		for (Student item : students) {
			System.out.println(item.getStudentName());
		}

		/*courseService.save(course1);
		courseService.save(course2);*/
		List<Course> courses = courseService.findAll();
		for (Course item : courses) {
			System.out.println(item.getCourseName());
		}
	}
}

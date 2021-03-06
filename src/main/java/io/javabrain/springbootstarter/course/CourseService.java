package io.javabrain.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(){
		List<Course> courses=new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id) {
		//return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
		return courseRepository.findOne(id);
	}
	
	public void addCourse(Course course){
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		courseRepository.delete(id);
	}
}

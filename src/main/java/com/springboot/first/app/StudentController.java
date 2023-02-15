package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	//Following will return a object of type STIDENT (in jSON Format)
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Devesh", "Tiwary");
	}
	
	
	//Following will return a list of STUDENT Objects (in jSON Format)
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> studentList= new ArrayList<Student>();
		
		studentList.add(new Student("Devesh", "Tiwary"));
		studentList.add(new Student("Bhaskar", "Mishra"));
		studentList.add(new Student("Anchit", "Chandra"));
		studentList.add(new Student("Alok", "Jha"));
		studentList.add(new Student("Ankit", "Singh"));
		studentList.add(new Student("Neel Vijay", "Singh"));
		
		return studentList;
	} 
	
	//Get Student object by PathVariable
	@GetMapping("/getStudentByPathVariable/{firstName}/{lastName}")
	public Student getStudentByPathVariable(@PathVariable("firstName") String firstName, 
			@PathVariable("lastName") String lastNAme) {
		return new Student(firstName, lastNAme);
	}
	
	//GET Call to handle Query Parameters 
	@GetMapping("/getStudentNameByQueryParam")
	public Student getStudentByQueryParam(@RequestParam(name ="firstName") String firstName, 
										  @RequestParam(name ="lastName")String lastName) {
		return new Student(firstName,lastName);
	}
	

}

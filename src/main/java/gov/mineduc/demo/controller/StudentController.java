package gov.mineduc.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gov.mineduc.demo.domaine.Student;
import gov.mineduc.demo.service.IStudentService;

//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	IStudentService studentService;

//	@GetMapping("/student")
// public Student getStudent(Student student) {	
//		
//	 return student;
// }
	
	@PostMapping("/saveStudent")
	public Student saveStudent( @RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/getStudents")
	public List<Student> getStudents(){
		return studentService.getStudents();
	}
	
	@GetMapping("/getStudent/{sid}")
	public Optional<Student> getStudentById(@PathVariable String sid){
		return studentService.getStudentById(sid);
	}
	
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
	
	@PostMapping("/deleteStudent")
	public String deleteStudent(@RequestBody Student student) {
		if(studentService.deleteStudent(student)){
			return "Student deleted successfuly";
		}
		
		return "Student not found !!!";
	}
	

}

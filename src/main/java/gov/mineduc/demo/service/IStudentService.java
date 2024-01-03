package gov.mineduc.demo.service;

import java.util.List;
import java.util.Optional;

import gov.mineduc.demo.domaine.Student;

public interface IStudentService {
	
	public Student saveStudent(Student student);
	
	public List<Student> getStudents();
	
public Optional<Student> getStudentById(String sid);
	
	public Student updateStudent(Student student);
	
	public boolean deleteStudent(Student student);
}

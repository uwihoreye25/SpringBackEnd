package gov.mineduc.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import gov.mineduc.demo.dao.IStudentRepo;
import gov.mineduc.demo.domaine.Student;

@Service
public class StudentService implements IStudentService {
	
	@Autowired
	private IStudentRepo studentDao;


	@Override
	public Student saveStudent(Student student) {
		return studentDao.save(student);
	}


	@Override
	public List<Student> getStudents() {
		return studentDao.findAll();
	}
	
	
	@Override
	public Optional<Student> getStudentById(String sid) {
		return studentDao.findById(sid);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentDao.save(student);
	}

	@Override
	public boolean deleteStudent(Student student) {
		
		Optional<Student> studentToDelete=studentDao.findById(student.getSid());
		if(studentToDelete.isPresent()) {
		studentDao.delete(student);
		return true;
	}else {
		return false;
	}
	
	}
	
	

}

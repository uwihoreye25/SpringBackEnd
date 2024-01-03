package gov.mineduc.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import gov.mineduc.demo.domaine.Student;

public interface IStudentRepo extends JpaRepository<Student, String>{

}

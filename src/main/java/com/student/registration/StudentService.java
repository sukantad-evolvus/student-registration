package com.student.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  @Autowired
  StudentRepository studentRepository;

  public Student save(Student student){

    return studentRepository.save(student);
  }

 public Student getStudentsById(long id)   {
  
return studentRepository.findById(id).get();  
} 

 public Student update(Student students){
  
	 Student s = studentRepository.save(students); 
	 return s;
}  


  public void delete(long id){
  studentRepository.deleteById(id);  
}  

}

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

 public Student getStudentsById(int id)   {
  
return studentRepository.findById(id).get();  
} 

 public void update(Student students, int id){
  
studentRepository.save(students);  
}  


  public void delete(int id){
  
studentRepository.deleteById(id);  
}  

}

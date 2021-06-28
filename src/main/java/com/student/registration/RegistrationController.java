package com.student.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationController {
  @Autowired
  StudentService studentService;

  @PostMapping
  public String register(Student student){
    Student s = studentService.save(student);
    return "Successfully registered with ID: "+s.getId();
  }

@GetMapping("/students/{id}")  
private Student getStudents(@PathVariable("id") int id)   
{  
return studentService.getStudentsById(id);  
}  

@PutMapping("/students")  
private Student update(@RequestBody Student students)   
{  
	Student s = studentService.update(students);  
	return s;  
} 

@DeleteMapping("/students/{id}")  
private void deleteStudent(@PathVariable("id") long id)   
{  
studentService.delete(id);  
}  


}

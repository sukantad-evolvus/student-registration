package com.student.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationController {
  @Autowired
  StudentService studentService;

  @PostMapping("/students")
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
studentService.saveOrUpdate(students);  
return students;  
} 

@DeleteMapping("/students/{id}")  
private void deleteStudent(@PathVariable("id") int id)   
{  
studentService.delete(id);  
}  


}

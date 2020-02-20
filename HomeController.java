  package com.web.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Student;
import com.web.service.ServiceInterface;

@CrossOrigin("*")
@RestController
public class HomeController 
{
	@Autowired
	ServiceInterface si;

@RequestMapping("/saveData/{rollno}/{name}/{addr}/{username}/{password}")
public String registerdata(@PathVariable("rollno")int rollno,@PathVariable("name")String name,@PathVariable("addr")String addr,
		@PathVariable("username")String username,@PathVariable("password")String password)
{
	
	Student s=new Student();
	s.setRollno(rollno);
	s.setName(name);
	s.setAddr(addr);
	s.setUsername(username);
	s.setPassword(password);
	
	si.savedata(s);
			
	return "saved successfully";
	
	
}
@RequestMapping("/getAllData")
public List<Student> getAllData() {
	List<Student>list=si.getAllData();
	
	return list;
}
@RequestMapping("/getSingleData/{username}/{password}")
public List<Student> getSingleData(@PathVariable("username")String username,@PathVariable("password")String password){
	
	
	List<Student> list=si.getSingleData(username, password);
	return list;
	
}
@RequestMapping("/deletbyid/{rollno}")
public void delet(@PathVariable("rollno")int rollno) {
	si.deletedata(rollno);
}
@RequestMapping("/editbyid/{rollno}")
public Student edit(@PathVariable("rollno")int rollno)
{
	Student s=si.editdata(rollno);
	return s;
	
}
}
	


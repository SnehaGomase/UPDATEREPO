package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Student;
import com.web.repository.HomeRepository;
@Service

public class ServiceInterfaceImpl  implements ServiceInterface

{
	@Autowired
	HomeRepository hr;

	public int savedata(Student s) {
 	
		 hr.save(s);
		 return 1;
	}


	public List<Student> getAllData() {
		List<Student> data=(List<Student>) hr.findAll();
		return data;
	}


	@Override
	public List<Student> logincheck(String uname, String pass) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Student> getSingleData(String un, String pw) {
		List<Student> list=hr.findAllByUsernameAndPassword(un, pw);
		return list;
	}


	@Override
	public void deletedata(int did) {
		hr.deleteById(did);
		
	}


	@Override 
	public Student editdata(int id) {
		Student s=hr.findById(id).get();
		return s;
	}


	@Override
	public void updatedata(Student st) {
		// TODO Auto-generated method stub
		
	}


	/*
	 * public List<Student> getSingleData(String un, String pw) {
	 * List<Student>list=hr.findAllByUsernameAndPassword(un, pw); return list; }
	 * 
	 * 
	 * public void deletedata(int did) { hr.deleteById(did);
	 * 
	 * }
	 * 
	 * 
	 * public Student editdata(int id) { Student s=hr.findById(id).get(); return s;
	 * 
	 * }
	 * 
	 * 
	 * public void updatedata(Student st) { hr.save(st);
	 * 
	 * }
	 */



		
		
		
	}


	
	
	
	
	
     




package com.web.service;

import java.util.List;

import com.web.model.Student;

public interface ServiceInterface 

{
public List<Student> logincheck(String uname, String pass);
public int savedata(Student s);
public List<Student> getAllData();
public List<Student> getSingleData(String un,String pw);
public void deletedata(int did);
public Student editdata(int id);
public void updatedata(Student st);
}

package com.qfedu.service;
import java.util.List;
import com.qfedu.pojo.Student;
public interface StudentService {
	int register(Student student);
	boolean login(Student student);
	List<Student> queryAll();
	void  del(String number);
	void update(Student student);
	List<Student> findOne(Student student);
}
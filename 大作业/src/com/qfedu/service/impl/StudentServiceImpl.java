package com.qfedu.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qfedu.dao.StudentDao;
import com.qfedu.pojo.Student;
import com.qfedu.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao dao;
	@Override
	public int register(Student student) {
		// TODO Auto-generated method stub
		return dao.insert(student);
	}

	@Override
	public boolean login(Student student) {
		// TODO Auto-generated method stub
		List<Student> stu=dao.selectStudent(student);
		if(stu.isEmpty()) return false;
		else return true;
	}
	public List<Student> queryAll() {
		return dao.selectAll();
	}
public void del(String number) {
 dao.delete(number);
}
public void update(Student student) {
	dao.update(student);
}
public List<Student> findOne(Student student) {
	return  dao.selectOne(student);
}
}

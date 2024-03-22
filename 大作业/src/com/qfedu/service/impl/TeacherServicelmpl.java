package com.qfedu.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qfedu.dao.TeacherDao;
import com.qfedu.pojo.Teacher;
import com.qfedu.service.TeacherService;
@Service
public class TeacherServicelmpl implements TeacherService {
	@Autowired
	private TeacherDao dao;
	@Override
	public int register(Teacher teacher) {
		// TODO Auto-generated method stub
		return dao.insert(teacher);
	}

	@Override
	public boolean login(Teacher teacher) {
		// TODO Auto-generated method stub
		List<Teacher> stu=dao.selectStudent(teacher);
		if(stu.isEmpty()) return false;
		else return true;
	}
	public List<Teacher> queryAll() {
		return dao.selectAll();
	}
public void del(String tsid) {
  dao.delete(tsid);
}
public void update(Teacher teacher) {
	dao.update(teacher);
}
public List<Teacher> findOne(Teacher teacher) {
	return  dao.selectOne(teacher);
}
}

package com.qfedu.service;
import java.util.List;

import com.qfedu.pojo.Teacher;
public interface TeacherService {
	int register(Teacher teacher);
	boolean login(Teacher teacher);
	List<Teacher> queryAll();
	void  del(String tsid);
	void update(Teacher teacher);
	List<Teacher> findOne(Teacher teacher);
}
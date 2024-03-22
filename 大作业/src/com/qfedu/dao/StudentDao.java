package com.qfedu.dao;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.qfedu.pojo.Student;
public interface StudentDao {
	@Insert("insert into student(sname,ssex,sclass,slearn,number) values(#{sname},#{ssex},#{sclass},#{slearn},#{number})")
	int insert(Student student);	
	@Select("select * from student where sname= #{sname} and number= #{number}")
	@ResultType(Student.class)
	List<Student> selectStudent(Student student);
	@Select("select * from student")
	@ResultType(Student.class)
	List<Student> selectAll();
	@Delete("delete  from student where number= #{number}")
	void delete(String number);
	@Update("update student set sname=#{sname},ssex=#{ssex},sclass=#{sclass},slearn=#{slearn},number=#{number} where number=#{number}")
	void update(Student student);
	@Select("select * from student where number= #{number}")
	@ResultType(Student.class)
	List<Student> selectOne(Student student);
}

package com.qfedu.dao;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.qfedu.pojo.Teacher;
public interface TeacherDao {
	@Insert("insert into teacher(tsubject,tscore,tmes,tsid,tname) values(#{tsubject},#{tscore},#{tmes},#{tsid},#{tname})")
	int insert(Teacher teacher);	
	@Select("select * from teacher where tname= #{tname} and tsid= #{tsid}")
	@ResultType(Teacher.class)
	List<Teacher> selectStudent(Teacher teacher);
	@Select("select * from teacher")
	@ResultType(Teacher.class)
	List<Teacher> selectAll();
	@Delete("delete  from teacher where tsid= #{tsid}")
	void delete(String tsid);
	@Update("update teacher set tsubject=#{tsubject},tscore=#{tscore},tmes=#{tmes},tsid=#{tsid},tname=#{tname} where tsid=#{tsid}")
	void update(Teacher teacher);
	@Select("select * from teacher where tsid= #{tsid}")
	@ResultType(Teacher.class)
	List<Teacher> selectOne(Teacher teacher);
}

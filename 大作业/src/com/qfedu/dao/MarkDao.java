package com.qfedu.dao;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.qfedu.pojo.Mark;
public interface MarkDao {
	@Insert("insert into mark(mname,mark,mtid,mmid) values(#{mname},#{mark},#{mtid},#{mmid})")
	int insert(Mark mark);	
	@Select("select * from mark")
	@ResultType(Mark.class)
	List<Mark> selectAll();
	@Delete("delete  from mark where mtid=#{mtid} and mmid= #{mmid}  ")
	void delete(Mark mark);
	@Update("update mark set mname=#{mname},mark=#{mark},mtid=#{mtid},mmid=#{mmid} where mmid=#{mmid}")
	void update(Mark mark);
	@Select("select * from mark where mmid= #{mmid} ")
	@ResultType(Mark.class)
	List<Mark> selectOne(Mark mark);
}

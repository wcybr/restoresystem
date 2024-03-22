package com.qfedu.service;
import java.util.List;
import com.qfedu.pojo.Mark;
public interface MarkService {
	int register(Mark mark);
	List<Mark> queryAll();
	void  del(Mark mark);
	void update(Mark mark);
	List<Mark> findOne(Mark mark);
}
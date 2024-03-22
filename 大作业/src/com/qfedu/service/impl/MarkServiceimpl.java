package com.qfedu.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qfedu.dao.MarkDao;
import com.qfedu.pojo.Mark;
import com.qfedu.service.MarkService;
@Service
public class MarkServiceimpl implements MarkService {
	@Autowired
	private MarkDao dao;
	public int register(Mark mark) {
		return dao.insert(mark);
	}
	public List<Mark> queryAll() {
		return dao.selectAll();
	}
public void del(Mark mark) {
 dao.delete(mark);
}
public void update(Mark mark) {
	dao.update(mark);
}
public List<Mark> findOne(Mark mark) {
	return  dao.selectOne(mark);
}
}

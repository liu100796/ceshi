package biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.SortDao;
import entity.sort;
import biz.SortBiz;
@Service
public class SortBizImpl implements SortBiz {

	@Autowired
	private SortDao sortDao;
	
	

	public List<sort> findtype() {
		
		return sortDao.findtype();
	}

}

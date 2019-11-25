package dao;

import java.util.List;

import entity.sort;

/**
 * 
 *@ClassName: SortDao
 *@Description: TODO
 *@author 15280
 *@data 2019年11月20日 下午3:18:34
 */
public interface SortDao {
	
	/*查询所有类别*/
	public List<sort> findtype();
	
	
	
}

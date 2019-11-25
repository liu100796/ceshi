package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Books;

/**
 * 
 *@ClassName: BooksDao
 *@Description: TODO
 *@author 15280
 *@data 2019年11月20日 下午2:43:43
 */
public interface BooksDao {
	
	/*addbook添加*/
	public int addbook(Books books );
	
	/*修改图书*/
	public int updatebook();
	
	/*查找所有图书*/
	public List<Books> findbooks();
	
	/*删除图书*/
	public int deletebook(int id);
	
	   /**
     * 获取总记录数
     * @return
     */
	public int getCount();
	
	
public List<Books> fenye(@Param("index")int totalCoun,@Param("pageSize")int pageSize);
	
}

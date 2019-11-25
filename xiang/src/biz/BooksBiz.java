package biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Books;
import entity.sort;

/**
 * 
 *@ClassName: BooksBiz
 *@Description: TODO
 *@author 15280
 *@data 2019年11月20日 下午2:46:20
 */

public interface BooksBiz {
	
	/*addbook添加*/
	public int addBook(Books books );
	
	/*修改图书*/
	public int updateBook();
	
	/*查找所有图书*/
	public List<Books> findBooks();
	
	/*删除图书*/
	public int deletebook(int id);
	
	   /**
     * 获取总记录数
     * @return
     */
	public int getCount();
	
	public List<Books>  fenye( int  index,int pageSize);
	
	
	
}

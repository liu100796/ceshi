package biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biz.BooksBiz;
import dao.BooksDao;
import entity.Books;
import entity.sort;

/**
 * 
 *@ClassName: BooksBizImpl
 *@Description: TODO
 *@author 15280
 *@data 2019年11月20日 下午2:47:25
 */
@Service
public class BooksBizImpl implements BooksBiz {
	@Autowired
	 private BooksDao booksDao;

	@Override
	public int addBook(Books books ) {
		// TODO Auto-generated method stub
		return booksDao.addbook(books );
	}

	@Override
	public int updateBook() {
		// TODO Auto-generated method stub
		return booksDao.updatebook();
	}

	@Override
	public List<Books> findBooks() {
		// TODO Auto-generated method stub
		return booksDao.findbooks();
	}

	@Override
	public int deletebook(int id) {
		// TODO Auto-generated method stub
		return booksDao.deletebook(id);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return booksDao.getCount();
	}

	@Override
	public List<Books> fenye( int  index,int pageSize) {
		// TODO Auto-generated method stub
		return booksDao.fenye(  index,pageSize);
	}

	
	


}

package entity;

import java.util.Date;



	/**
	 * 
	 *@ClassName: Books
	 *@Description: TODO
	 *@author 15280
	 *@data 2019年11月20日 下午2:37:18
	 */
public class Books {
	/*图书编号*/
	private int id;
	
	/*图书名称*/
	private String name;
	
	/*图书类别*/
	private int sortid;
	
	/*图书类别名称*/
	private String sortname;
	
	
	public String getSortname() {
		return sortname;
	}

	public void setSortname(String sortname) {
		this.sortname = sortname;
	}

	/*图书作者*/
	private String author;
	
	/*购满时间*/
	private String butyime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSortid() {
		return sortid;
	}

	public void setSortid(int sortid) {
		this.sortid = sortid;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getButyime() {
		return butyime;
	}

	public void setButyime(String butyime) {
		this.butyime = butyime;
	}

	
	
	
}

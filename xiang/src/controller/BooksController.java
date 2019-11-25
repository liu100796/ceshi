package controller;


import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import biz.BooksBiz;
import entity.Books;
import entity.PageBean;

@Controller
public class BooksController {
     @Autowired
	 private  BooksBiz booksBiz;
     
     
     @RequestMapping("/findall")
     public  String findall(Map map,@RequestParam(value = "currNo", required=false )  Integer currNo){
    	   if(currNo==null){
    	    	 int pageSize=4;
    	    	 int totalCount=booksBiz.getCount();
    	    	 map.put("totalCount", totalCount);
    	         PageBean p=new PageBean();
    	         p.setTotalCount(totalCount);
    	         p.setPageSize(pageSize);
    	         int totalPage =p.getTotalPage();
    	         map.put("totalPage", totalPage);
    	         currNo =1;
    	         map.put("currNo", currNo);
    	         int index=(currNo-1)*pageSize;
    	        List<Books>   books=booksBiz.fenye(index, pageSize);
    	        map.put("books", books); 
    	          return "index";     
    	   }else {
		    	 int pageSize=4;
		    	 int totalCount=booksBiz.getCount();
		    	 map.put("totalCount", totalCount);
		    	 PageBean p=new PageBean();
		         p.setTotalCount(totalCount);
		         p.setPageSize(pageSize);
		         int totalPage =p.getTotalPage();         
		         map.put("totalPage", totalPage);   
		         map.put("currNo", currNo);         
		         int index=(currNo-1)*pageSize;     
		         List<Books>   books=booksBiz.fenye(index, pageSize);
	    	        map.put("books", books);  
		          return "index";
		} 
}
     
     @RequestMapping("/delbook")
     @ResponseBody
     public  String delbook(int id){
    	 String msg=null;
  		try {
  			booksBiz.deletebook(id); 
  			 msg = "{\"msg\":\"true\"}";
  		} catch (Exception e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  			msg = "{\"msg\":\"false\"}";
  		}
  		return msg;
     }
     
     
    
     
     
     @RequestMapping("/add")
     public  String addbook(Books books){
    	booksBiz.addBook(books);
    	 return "MyJsp";
     }
     
}    
	


package controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.sort;
import biz.SortBiz;

@Controller
public class SortController {
		
	@Autowired
	private SortBiz sortBiz;
	
	
	 @RequestMapping("/addbook")
     public  String tianjian(Map map){
	 List<sort> sorts=sortBiz.findtype();
    	 map.put("sorts", sorts);
    	 return "addbook";
     }
}

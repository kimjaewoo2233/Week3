package com.example.settingweb_boot.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.settingweb_boot.service.StatisticService;


@Controller
public class settingTest {
	    
		@Autowired
		private StatisticService service;		//Autowirde에서 주입을 받는데 왜 주입 받는 것이 인터페이스로 적었는데 자동으로  implement한 클래스가 주입되는지
	
		
		@ResponseBody
		@RequestMapping("/sqlyearStatistic")
		public Map<String,Object> sqltest(String year) throws Exception{
			return service.yearloginNum(year);
		}
		
	    @RequestMapping("/test") 
	    public ModelAndView test() throws Exception{ 
	        ModelAndView mav = new ModelAndView("test"); 
	        mav.addObject("name", "devfunpj"); 
	        List<String> resultList = new ArrayList<String>(); 
	        resultList.add("!!!HELLO WORLD!!!"); 
	        resultList.add("설정 TEST!!!"); 
	        resultList.add("설정 TEST!!!"); 
	        resultList.add("설정 TEST!!!!!"); 
	        resultList.add("설정 TEST!!!!!!"); 
	        mav.addObject("list", resultList); 
	        return mav; 
	    }
	 
}

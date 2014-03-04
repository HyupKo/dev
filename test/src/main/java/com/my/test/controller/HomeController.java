package com.my.test.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.test.model.TestModel;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Desc : index
	 * 
	 * @method	index
	 * @param request
	 * @param response
	 * @return {@link String}
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(HttpServletRequest request, HttpServletResponse response) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance();
		String formattedDate = dateFormat.format(date);
		
		request.setAttribute("serverTime", formattedDate );
		
		return "index";
	}
	
	/**
	 * Desc : test xml.
	 * 
	 * @method	testXml
	 * @param request
	 * @return {@link List}
	 */
	@RequestMapping(value="/test", method=RequestMethod.GET, produces={"application/json", "application/xml"})
	@ResponseBody
	public TestModel testXml(HttpServletRequest request) {
		logger.info("XML Area.");
		List<TestModel> list = new ArrayList<TestModel>();
		list.add(new TestModel());
		list.add(new TestModel("Test1", "This is test result1", 1));
		list.add(new TestModel("Test2", "This is test result2", 2));
		list.add(new TestModel("Test3", "This is test result3", 3));
		list.add(new TestModel("Test4", "This is test result4", 4));
		// return list;
		return new TestModel();
	}
}

package v2.mvc.spring.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vc.mvc.spring.blog.service.BlogService;

@Controller
public class BlogController {
	
	@Autowired
	BlogService blogService;
	
	@RequestMapping(value="/create", method = RequestMethod.GET)
	public String create() {
		return "blog/create";
	}

}

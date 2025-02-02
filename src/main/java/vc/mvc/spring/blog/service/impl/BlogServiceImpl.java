package vc.mvc.spring.blog.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import vc.mvc.spring.blog.dao.BlogDAO;
import vc.mvc.spring.blog.service.BlogService;

public class BlogServiceImpl implements BlogService {

	private BlogDAO blogDAO;
	
	@Autowired
	public BlogServiceImpl(BlogDAO blogDAO) {
	    this.blogDAO = blogDAO;
	}
	
	@Override
	public int create(Map<String, Object> map) {
		int seq = this.blogDAO.insert(map);
	    return seq;
	}

}

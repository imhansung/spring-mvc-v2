package v2.mvc.spring.blog.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import v2.mvc.spring.blog.dao.BlogDAO;
import v2.mvc.spring.blog.service.BlogService;

@Service
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

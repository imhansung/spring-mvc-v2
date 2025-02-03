package v2.mvc.spring.blog.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import v2.mvc.spring.blog.dao.BlogDAO;
import v2.mvc.spring.blog.mapper.BlogMapper;
import v2.mvc.spring.blog.service.BlogService;
import v2.mvc.spring.blog.vo.BlogEditRequestVO;
import v2.mvc.spring.blog.vo.BlogListRequestVO;
import v2.mvc.spring.blog.vo.BlogListResponseVO;

@Service
public class BlogServiceImpl implements BlogService {

	private BlogDAO blogDAO;
	//@Autowired
	private BlogMapper blogMapper;
	
	@Autowired
	public BlogServiceImpl(BlogDAO blogDAO, BlogMapper blogMapper) {
	    this.blogDAO = blogDAO;
	    this.blogMapper = blogMapper;
	}
	
	@Override
	public int create(Map<String, Object> map) {
		int seq = this.blogDAO.insert(map);
	    return seq;
	}

	@Override
	public Map<String, Object> read(int blogContSeq) {
		Map<String, Object> blogCont = this.blogDAO.selectOne(blogContSeq);
	    return blogCont;
	}
	
	@Override
	public boolean edit(BlogEditRequestVO blogEditRequestVO) {
	    int affectRowsCount = this.blogDAO.update(blogEditRequestVO);
	    return affectRowsCount > 0;
	}
	
	@Override
	public boolean delete(int blogContSeq) {
	    return this.blogMapper.delete(blogContSeq) > 0;
	}
	
	@Override
	public List<BlogListResponseVO> list(BlogListRequestVO blogListRequestVO) {
	    List<BlogListResponseVO> result = this.blogMapper.selectList(blogListRequestVO);
	    return result;
	}

}

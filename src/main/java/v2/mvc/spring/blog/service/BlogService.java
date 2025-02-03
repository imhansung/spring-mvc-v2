package v2.mvc.spring.blog.service;

import java.util.List;
import java.util.Map;

import v2.mvc.spring.blog.vo.BlogEditRequestVO;
import v2.mvc.spring.blog.vo.BlogListRequestVO;
import v2.mvc.spring.blog.vo.BlogListResponseVO;

public interface BlogService {
	int create(Map<String, Object> map);

	Map<String, Object> read(int blogContSeq);

	boolean edit(BlogEditRequestVO blogEditRequestVO);

	boolean delete(int blogContSeq);

	List<BlogListResponseVO> list(BlogListRequestVO blogListRequestVO);
}

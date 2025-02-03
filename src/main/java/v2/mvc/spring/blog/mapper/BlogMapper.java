package v2.mvc.spring.blog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import v2.mvc.spring.blog.vo.BlogListRequestVO;
import v2.mvc.spring.blog.vo.BlogListResponseVO;

@Mapper
public interface BlogMapper {
	int delete(int blgContSeq);
	List<BlogListResponseVO> selectList(BlogListRequestVO blogListRequestVO);
}

package v2.mvc.spring.blog.mapper;

import org.apache.ibatis.annotations.Mapper;

import v2.mvc.spring.blog.vo.CommentInsertVO;

@Mapper
public interface CommentMapper {
	int insert(CommentInsertVO commentInsertVO);

}

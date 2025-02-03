package v2.mvc.spring.blog.service;

import v2.mvc.spring.blog.vo.CommentAddRequestVO;
import v2.mvc.spring.blog.vo.CommentResponseVO;

public interface CommentService {

	CommentResponseVO add(CommentAddRequestVO commentAddRequestVO);

}

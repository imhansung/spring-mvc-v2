package v2.mvc.spring.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import v2.mvc.spring.blog.service.CommentService;
import v2.mvc.spring.blog.vo.CommentAddRequestVO;
import v2.mvc.spring.blog.vo.CommentResponseVO;

@Controller
@RequestMapping("/comment")
public class CommentController {
 
    @Autowired
    private CommentService commentService;
 
    @PostMapping("/add")
    @ResponseBody
    public CommentResponseVO add(CommentAddRequestVO commentAddRequestVO) {
        return this.commentService.add(commentAddRequestVO);
    }
}

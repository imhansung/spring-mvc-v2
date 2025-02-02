package vc.mvc.spring.blog.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BlogDAO {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

}

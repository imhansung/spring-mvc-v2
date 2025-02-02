package v2.mvc.spring.blog.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BlogDAO {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int insert(Map<String, Object> map) {
	    int result = this.sqlSessionTemplate.insert("TB_BLG_CONT.insert", map);
	    if (result > 0 && map.containsKey("seq_blg_cont")) {
	    	Object obj = map.get("seq_blg_cont");
	    	return obj instanceof Number ? ((Number) obj).intValue() : -1;
	    }
	 
	    return -1;
	}

}

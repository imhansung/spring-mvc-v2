package v2.mvc.spring.blog.service;

import java.util.Map;

public interface BlogService {
	int create(Map<String, Object> map);

	Map<String, Object> read(int blogContSeq);
}

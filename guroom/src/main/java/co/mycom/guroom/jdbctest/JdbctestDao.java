package co.mycom.guroom.jdbctest;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class JdbctestDao {
	@Inject
	private SqlSession sqlSession;
	private static final String Namespace = "co.mycom.guroom.mappers.testMapper";
	
	public List<String> jdbcTest() throws Exception {
		return sqlSession.selectList(Namespace+".jdbctest");
	}
}

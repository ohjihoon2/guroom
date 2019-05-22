package co.mycom.guroom.jdbctest;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class JdbctestService {

	@Inject
	private JdbctestDao dao;
	
	public List<String> jdbctest() throws Exception {
		return dao.jdbcTest();
	}

}

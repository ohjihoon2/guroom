package co.mycom.guroom.jdbctest;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jdbctestController {
	@Inject
	private JdbctestService service;
	
	@RequestMapping("/jdbctest")
	public void jdbctest() throws Exception{
		List<String> noticeList = service.jdbctest();
		System.out.println(String.valueOf(noticeList));
	}
}

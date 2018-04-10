package sun.framework.file.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sun.framework.file.service.IRemoteService;

@RestController
public class TestController {

	@Autowired
	private IRemoteService service;
	
	@RequestMapping("/userNames")
	public List<String> userNames(){
		
		System.err.println("方法被调用1");
		return service.userNames();
	}
}

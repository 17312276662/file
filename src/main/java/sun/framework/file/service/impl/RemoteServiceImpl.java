package sun.framework.file.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import sun.framework.file.service.IRemoteService;

@Service
public class RemoteServiceImpl implements IRemoteService {

	@Autowired
	private RestTemplate restTemplate;
	@SuppressWarnings("unchecked")
	@Override
	public List<String> userNames() {
		try {
			
			List<String> names = restTemplate.getForObject("http://xinhua-oa/oa/userNames", List.class);
			return names;
		}catch(Exception e) {
			
			e.printStackTrace();
			return null;
		}
	}

}

package ssk.server.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ssk.server.service.InitData;


@Controller
@RequestMapping(value = "/ssk")
public class SSKLaunchController {
	
	@Autowired
	private InitData initData;
	
	HttpHeaders headers = new HttpHeaders();
	
	private static final Logger logger = LoggerFactory.getLogger(SSKLaunchController.class);
	
	private static Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
	
	
	
	
	@RequestMapping(value = "/init",  method = { RequestMethod.GET  }, produces="application/json")
	@ResponseBody
	ResponseEntity<String> home() {
		HttpStatus status = HttpStatus.OK;
		/*HttpStatus status;
		JsonObject result = new JsonObject();
		if(initData.getElasticSearchHealth()){
			
			result.addProperty("", "");
		}
		else{
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}*/
		return new ResponseEntity<>(gson.toJson("content: OK"), this.headers, status);
	}
}

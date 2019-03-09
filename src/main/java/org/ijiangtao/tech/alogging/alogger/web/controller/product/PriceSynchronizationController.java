package net.ijiangtao.tech.alogging.alogger.web.controller.product;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;

/**
 * 
   *  价格信息同步请求
 * 
 * @author ijiangtao
 */
@Api(value = "PriceSynchronizationController")
@RestController
public class PriceSynchronizationController {

	@PostMapping(name="/product/price")
	public void sync() {
		
	}
	
}

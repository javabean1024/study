package com.tedu.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 用于通知Feign组件对该接口进行代理(不需要编写接口实现)，
 * name属性指定我们要调用哪个服务。使用者可直接通过@Autowired注入。
 * @author Administrator
 *
 */
@FeignClient(value="provider")
public interface EurekaServiceFeign {
	
	@RequestMapping(value="/hello/{name}")
	/**
	 * 表示在调用该方法时需要向/group/{groupId}发送GET请求。
	 * @param name
	 * @return
	 */
	public String hello(@PathVariable("name") String name);
}

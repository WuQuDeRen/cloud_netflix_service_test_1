package com.fj.boot.app.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fj.boot.app.domain.PersonDO;
import com.fj.boot.app.service.PersonService;
import com.fj.boot.app.system.context.ApplicationContextHolder;

@RestController
public class TestController {

	@Autowired
	private DiscoveryClient client;

	@Autowired
	private PersonService personService;

	@RequestMapping(value = "/test/get_1", method = RequestMethod.GET)
	public String get(@RequestParam String name) {
		System.out.println("aaaf efefe fefeji fefe 飞机");
		return "get";
	}

	@RequestMapping(value = "/test/post_1", method = RequestMethod.POST)
	public String post(@RequestParam String name, @RequestBody PersonDO personDto) {
		return "post";
	}

//	@RequestMapping(value = "/test/{id}")
//	public String test(@ModelAttribute("id") Integer id) {
//		if (id == 1) {
//			throw new RuntimeException("入参1");
//		}
//		return "aaa";
//	}

	@RequestMapping(value = "/test/body")
	public String getBody() {
		ApplicationContext applicationContext = ApplicationContextHolder.getApplicationContext();
		ApplicationContext parentApplicationContext = applicationContext.getParent();
		BeanFactory parentBeanFactory = applicationContext.getParentBeanFactory();
		ConfigurableApplicationContext a = null;
		return "....";
	}

	@RequestMapping(value = "/test/query", method = RequestMethod.GET)
	public Object query(@RequestParam("param") Integer param) {
		return personService.query(param);
	}

	@RequestMapping(value = "/test/app")
	public String testApp() {
		ApplicationContext applicationContext = ApplicationContextHolder.getApplicationContext();
		ApplicationContext parentApplicationContext = applicationContext.getParent();
		BeanFactory parentBeanFactory = applicationContext.getParentBeanFactory();
		ConfigurableApplicationContext a = null;

		System.out.println("fe");
		return "....";
	}
}

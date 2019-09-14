package com.fj.service1.test;

import com.fj.service1.app.dao.PersonDao;
import com.fj.service1.app.domain.PersonDO;
import com.fj.service1.app.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RunWith(SpringRunner.class)
//@SpringBootTest
//@ContextConfiguration
public class BootAppApplicationTests {

	@Value("${jdbc.url}")
	private String jdbcUrl;

	@Autowired
	private PersonDao personDao;

	@Autowired
	private PersonService personService;

	@Test
	public void contextLoads() {

	}

	@Test
	public void test() {
		int a = 23;
		List<PersonDO> personList = personDao.query();
		System.out.println(personList);
		List<PersonDO> testList = personDao.query();

	}


	public static void main(String[] args) throws ParseException {
//		AtomicBoolean active = new AtomicBoolean();
//		System.out.println(JSON.toJSONString(active.get()));
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		format.parse("2019-05-31 12:00:00");

	}

	@Test
	public void testSession() {
		personService.query();
	}

	@Test
	public void testSessionTwo() {
		personService.queryTwo();
	}


	@Test
	public void testCollection() {
		List<PersonDO> personDOS = personDao.listPerson();
		System.out.println(personDOS);

	}


}

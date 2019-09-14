package com.fj.service1.app.service.impl;

import com.fj.service1.app.dao.PersonDao;
import com.fj.service1.app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;

	@Override
	public Object query(Integer param) {
		if (param == 1) {
			return personDao.query();
		}
		return personDao.queryInt();
	}

	@Override
	public void query() {
		personDao.queryByDynamicId(12);
		personDao.query();
	}

	@Transactional
	@Override
	public void queryTwo() {
		personDao.queryByDynamicId(12);
		personDao.query();
	}

}

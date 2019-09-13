package com.fj.boot.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fj.boot.app.dao.PersonDao;
import com.fj.boot.app.service.PersonService;
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

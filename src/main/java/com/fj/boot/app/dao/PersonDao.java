package com.fj.boot.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fj.boot.app.domain.PersonDO;

//@Mapper
public interface PersonDao {

	List<PersonDO> query();

	default int queryInt() {
		return 12;
	} ;

	List<PersonDO> queryById(@Param("id") Integer id);

	List<PersonDO> queryByDynamicId(@Param("id") Integer id);

	List<PersonDO> listPerson();
}

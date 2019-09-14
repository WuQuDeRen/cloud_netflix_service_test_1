package com.fj.service1.app.dao;


import com.fj.service1.app.domain.PersonDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

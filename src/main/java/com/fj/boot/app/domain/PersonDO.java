package com.fj.boot.app.domain;

import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("PersonDO")
public class PersonDO {

	private Integer id;
	private String name;
	private Integer age;

	private String personNo;

	private List<TMaxMin> tMaxMinList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<TMaxMin> gettMaxMinList() {
		return tMaxMinList;
	}

	public void settMaxMinList(List<TMaxMin> tMaxMinList) {
		this.tMaxMinList = tMaxMinList;
	}

	public String getPersonNo() {
		return personNo;
	}

	public void setPersonNo(String personNo) {
		this.personNo = personNo;
	}
}

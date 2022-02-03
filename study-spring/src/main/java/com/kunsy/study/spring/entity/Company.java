package com.kunsy.study.spring.entity;

import java.math.BigDecimal;

public class Company {
	String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	String name;
	String addr;
	Integer age;
	BigDecimal bdPower;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public BigDecimal getBdPower() {
		return bdPower;
	}

	public void setBdPower(BigDecimal bdPower) {
		this.bdPower = bdPower;
	}
}

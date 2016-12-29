package com.ha.qagenerator.model.req;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;


public class VcardReqModel {
	@NotNull
	private String name;
	@NotNull
	private String mnumber;	
	private String addr;
	private String title;
	@Email
	private String email;
	private String company;
	private String website;
	private String note;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMnumber() {
		return mnumber;
	}
	
	public void setMnumber(String mnumber) {
		this.mnumber = mnumber;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
}

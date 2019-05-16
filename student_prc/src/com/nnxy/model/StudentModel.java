package com.nnxy.model;

public class StudentModel {
	private int id;
	private String uername;
	private String password;
	private int sex;
	private String love;
	
	public StudentModel(int id, String uername, String password, int sex, String love) {
		super();
		this.id = id;
		this.uername = uername;
		this.password = password;
		this.sex = sex;
		this.love = love;
	}

	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", uername=" + uername + ", password=" + password + ", sex=" + sex + ", love="
				+ love + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUername() {
		return uername;
	}

	public void setUername(String uername) {
		this.uername = uername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getLove() {
		return love;
	}

	public void setLove(String love) {
		this.love = love;
	}

}

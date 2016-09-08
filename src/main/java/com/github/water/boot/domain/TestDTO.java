package com.github.water.boot.domain;
/** 
* @Author : water  
* @Date   : 2016年9月8日 
* @Desc   : TODO
* @version: V1.0
*/
public class TestDTO {
	
	private String id;
	
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TestDTO(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public TestDTO() {
		super();
	}
	
	

}

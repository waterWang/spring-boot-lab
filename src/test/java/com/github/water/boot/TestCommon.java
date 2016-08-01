package com.github.water.boot;

public class TestCommon {

	public static void main(String[] args) {
		String str = "{'ac25d20536fc45b6b7cac7da0d303b34':'{\'name\':\'产地\',\'822c61f3e05c4ae6afab24464a10a3e7\':\'新疆\'}','attrIdasd':'{\'name\':\'asd\',\'attrValueIdasdf\':\'asdf\'}'}";
		str = str.replace("attrIdasd", "1");
		System.out.println(str);

	}
	
	private String name;

	public TestCommon(String name) {
		super();
		this.name = name;
	}
	
}

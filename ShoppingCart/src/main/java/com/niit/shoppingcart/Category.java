package com.niit.shoppingcart;

import org.springframework.stereotype.Component;

@Component
public class Category {
private String id;
private String name;
private String Desc;
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
public String getDesc() {
	return Desc;
}
public void setDesc(String desc) {
	Desc = desc;
}

}

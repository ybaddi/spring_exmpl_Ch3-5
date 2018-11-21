package com.springExmpl.beans;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.springExmpl.Ibeans.IArticleData;

import java.util.Date;
import java.util.Map;

import javax.annotation.PostConstruct; 
import javax.annotation.PreDestroy;

public class ArticleDataBean implements IArticleData{
	
	Logger  logger = Logger.getLogger(this.getClass().getName());
	
	private int id;
	private String name;
	private Double price;
	private Map<String, String> mapProperty;
	
	
	
	
	public Map<String, String> getMapProperty() {
		return mapProperty;
	}
	public void setMapProperty(Map<String, String> mapProperty) {
		this.mapProperty = mapProperty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	

	public double initPrice() {
		System.out.println("init price");
		this.setPrice(6.0);
		return this.getPrice();
	}


	public void destroy() throws Exception {
		System.out.println("destroy");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
		
	}
	
	
	

}

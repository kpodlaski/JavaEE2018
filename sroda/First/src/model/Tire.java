package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tire {
	
	@JsonProperty("prod")
	private String producer;
	private String name;
	private String size;
	
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return String.format("Tire [%s, %s, %s]", producer, name, size);
	}
	

}

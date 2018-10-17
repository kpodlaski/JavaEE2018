package model;

public class Radio {

	private String producer;
	private String name;
	private boolean climatic;
	
	
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
	public boolean isClimatic() {
		return climatic;
	}
	public void setClimatic(boolean climatic) {
		this.climatic = climatic;
	}
	@Override
	public String toString() {
		return String.format("Radio [%s, %s, %s]", producer, name, climatic);
	}
	
	
}

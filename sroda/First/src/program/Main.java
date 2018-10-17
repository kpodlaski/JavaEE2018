package program;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Car;
import model.Radio;
import model.Tire;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Radio r = new Radio();
		r.setName("A423");
		r.setProducer("Blaupunkt");
		r.setClimatic(true);
		
		Tire t = new Tire();
		t.setName("Frigo");
		t.setProducer("Dêbica");
		t.setSize("175/90");
		
		Car car = new Car();
		car.setRadio(r);
		car.getTires()[0]=t;
		
		t = new Tire();
		t.setName("Frigo");
		t.setProducer("Dêbica");
		t.setSize("175/90");
		
		car.getTires()[1]=t;
		
		t = new Tire();
		t.setName("Frigo");
		t.setProducer("Dêbica");
		t.setSize("175/90");
		
		car.getTires()[2]=t;
		
		t = new Tire();
		t.setName("Frigo");
		t.setProducer("Dêbica");
		t.setSize("175/90");
		
		car.getTires()[3]=t;
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(r);
		System.out.println(json);
		System.out.println("============");
		json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(car);
		System.out.println(json);
		
		Car c2 = mapper.readValue(json,Car.class);
		System.out.println(c2);
	}

}

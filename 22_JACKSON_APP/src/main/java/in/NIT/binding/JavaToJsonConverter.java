package in.NIT.binding;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception {
		
		Address ad = new Address();
		ad.setCity("Bhubaneswar");
		ad.setState("Odisha");
		ad.setCountry("India");
		
		Customer c = new Customer();
		c.setId(101);
		c.setName("Manas");
		c.setEmail("sahoo@134gmail.com");
		c.setPhno(98408430);
		c.setAddrs(ad);
		
		//Converted java object to JSON
		ObjectMapper  mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"),  c);
		System.out.println("JSON file created");
	}
}

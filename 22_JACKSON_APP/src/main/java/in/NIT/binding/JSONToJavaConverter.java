package in.NIT.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONToJavaConverter {

	public static void main(String[] args) throws Exception{
		File f = new File("Customer.Json");
		
		//Converting JSON to Java Object
		ObjectMapper om = new ObjectMapper();
		Customer  c = om.readValue(f, Customer.class);
		System.out.println(c);
	}
}

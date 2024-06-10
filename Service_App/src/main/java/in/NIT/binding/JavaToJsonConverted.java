package in.NIT.binding;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverted {

	public static void main(String[] args) throws Exception {
		
		Address add = new Address();
		add.setCity("HI-Tech City");
		add.setState("Hyderabad");
		add.setCountry("India");
		
		Customer cu = new Customer();
		cu.setCid(101);
		cu.setCname("Vikash");
		cu.setCemail("sahoovikash3838@gmail.com");
		cu.setCphno(984848395);
		cu.setAddrs(add);
		
		//Converted Java Obj to Json
		 ObjectMapper mapper = new ObjectMapper();
		 mapper.writeValue(new File("customer.json"),cu);
		 System.out.println("JSON File Created");
	}
}

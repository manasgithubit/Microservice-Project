package in.NIT.binding;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConverted {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        File f = new File("customer.json");
        //Converted Json to Java Object
        ObjectMapper om = new ObjectMapper();
        Customer c = om.readValue(f, Customer.class);
        System.out.println(c);
	}
}

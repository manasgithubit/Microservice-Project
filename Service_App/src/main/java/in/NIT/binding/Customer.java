package in.NIT.binding;

import lombok.Data;

@Data
public class Customer {

	private Integer Cid;
	private String Cname;
	private String Cemail;
	private long Cphno;
	private Address addrs;
}

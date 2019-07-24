package client;

import javax.xml.ws.BindingProvider;

import com.demo.ws.Emp;
import com.demo.ws.Empws;
import com.demo.ws.EmpwsService;

public class TestEmpWS {

	public static void main(String[] args) {
		EmpwsService service=new EmpwsService();
		Empws port=service.getEmpwsPort();
		BindingProvider bp=(BindingProvider)port;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:9090/Emp/saveEmp");
		Emp e=new Emp();
		e.setId(100);
		e.setName("john");
		e.setSalary(2876);
		e.setCity("Bangalore");
		
		System.out.println(port.saveEmp(e));
		
		
	}

}

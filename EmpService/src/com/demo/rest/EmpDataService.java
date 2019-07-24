package com.demo.rest;

import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.demo.entity.Emp;
@Path("/emp")
public class EmpDataService {
	static HashMap<Integer, Emp> empDb= new HashMap<Integer, Emp>();
	public EmpDataService() {
		empDb.put(100, new Emp(100, "vish", "bang", 8900));
		empDb.put(101, new Emp(101, "ish", "ang", 900));
		empDb.put(102, new Emp(102, "vsh", "ng", 800));
		empDb.put(103, new Emp(103, "vih", "g", 890));
		empDb.put(104, new Emp(104, "vis", "abang", 80));
		empDb.put(105, new Emp(105, "vkish", "bbang", 8100));
		empDb.put(106, new Emp(106, "vjish", "cbang", 8700));
		empDb.put(107, new Emp(107, "vishh", "dbang", 8600));
		empDb.put(108, new Emp(108, "vigsh", "ebang", 8900));
		
	}
	@GET
	@Path("/find/{id}")
	//@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Produces({"application/json","application/xml"})
	public Response findEmp(@PathParam("id")
	int id) {
		if(empDb.containsKey(id)) {
			return Response.ok(empDb.get(id)).build();
		}
		else {
			return Response.status(404).build();
			
		}
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("save")
	public Response save(Emp e) {
		if(empDb.containsKey(e.getEmpId())) {
			return Response.ok("EmployeeExist").build();
		}
		else {
			empDb.put(e.getEmpId(), e);
			return Response.ok("Employee Saved Successfully").build();
			
		}
	}
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("update")
	public Response update(Emp e) {

			 empDb.put(e.getEmpId(), e);
			 return Response.ok("Employee updated Successfully").build();
			
	}
	
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	@Path("delete")
	public Response delete(@QueryParam("id")int id) {
		if(empDb.containsKey(id)) {
			empDb.remove(id);
			return Response.ok("Employee removed").build();
		}else {
			
			return Response.ok("Employee not found!!").build();
			
		}
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("listAll")
	public Response listAll() {
		return Response.ok(empDb.values()).build();
	}
	

}

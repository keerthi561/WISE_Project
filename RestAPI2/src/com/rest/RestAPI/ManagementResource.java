package com.rest.RestAPI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.dto.Management;

import com.ts.dao.ManagementDAO;
@Path("ManagementResource")
public class ManagementResource {
	@Path("getManagementByUserId/{userId}")
    @GET    
    @Produces(MediaType.APPLICATION_JSON)
	 public Management getManagementByUserId(@PathParam("userId") String userId) {
		System.out.println("Management Resource id"+ userId);
		Management management = new Management();
    	ManagementDAO managementDAO = new ManagementDAO();
    	management = managementDAO.getManagementByUserId(userId);
    	
    	System.out.println("resource Management " + management);
    	if (management != null) {
    		return management;
    	} else {
    		return null;
    	}
	 }
}

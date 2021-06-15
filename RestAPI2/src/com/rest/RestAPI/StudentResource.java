package com.rest.RestAPI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.dto.Student;
import com.ts.dao.StudentDAO;

@Path("StudentResource")
public class StudentResource {
	@Path("getStudentByUserId/{userId}")
    @GET    
    @Produces(MediaType.APPLICATION_JSON)
	 public Student getStudentByUserId(@PathParam("userId") String userId) {
		Student student = new Student();
    	StudentDAO studentDAO = new StudentDAO();
    	student = studentDAO.getStudByUserId(userId);
    	if (student != null) {
    		return student;
    	} else {
    		return null;
    	}
	 }

}

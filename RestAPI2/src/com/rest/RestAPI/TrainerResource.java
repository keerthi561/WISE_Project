package com.rest.RestAPI;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("TrainerResource")
public class TrainerResource { /*
	@Path("getTrainerByUserId/{userId}")
    @GET    
    @Produces(MediaType.APPLICATION_JSON)
	 public Trainer getTrainerByUserId(@PathParam("userId") String userId) {
			Trainer trainer = new Trainer("101","Pasha","pasha@talentsprint.com","12345");
			Trainer trainer1 = new Trainer("102","Venkatesh","venkatesh@talentsprint.com","12345");
			Trainer trainer2 = new Trainer("103","Indira","indira@talentsprint.com","12345");
			List<Trainer> tnrList = new ArrayList<Trainer>();
			tnrList.add(trainer);
			tnrList.add(trainer1);
			tnrList.add(trainer2);
			for(Trainer tnr: tnrList) {
				if(tnr.getTnrEmail()==userId) {
					return tnr;
				}
			}
	        return null;
	    }*/

}

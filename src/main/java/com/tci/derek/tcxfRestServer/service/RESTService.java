package com.tci.derek.tcxfRestServer.service;

import java.io.IOException;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.tci.derek.tcxfRestServer.serverEntity.UserDTO;
import com.tci.derek.tcxfRestServer.serverEntity.Users;

@Path(value = "RESTService")
public interface RESTService {
	@GET
	@Path("/doGet")
	public String doGet();
	
    @GET
    @Path("/bean/{id}")
    public UserDTO getBean(@PathParam("id") int id);

    @GET
    @Path("/list")
    public Users getList(); 
    
    @POST
    @Path("/postData")
    public UserDTO postData(UserDTO user) throws IOException;

    @PUT
    @Path("/putData/{id}")
    public UserDTO putData(@PathParam("id") int id, UserDTO user);

    @DELETE
    @Path("/removeData/{id}")
    public void deleteData(@PathParam("id") int id);    
    
}

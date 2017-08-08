package com.tci.derek.tcxfRestServer.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.tci.derek.tcxfRestServer.serverEntity.UserDTO;
import com.tci.derek.tcxfRestServer.serverEntity.Users;

@Path("/user")
public class UserRESTService extends BaseService{
	@GET
	@Path("/doGet")
	public Response doGet() {
		return Response.status(Response.Status.OK).entity("Derek REST Get service").build();
	}

	@GET
	@Path("/bean/{id}")
	public Response getBean(int id) {
        System.out.println("####getBean#####");
        System.out.println("id:" + id);
        System.out.println("Method:" + request.getMethod());
        System.out.println("uri:" + uriInfo.getPath());
        System.out.println(uriInfo.getPathParameters());
        UserDTO user = new UserDTO();
        user.setId(id);
        user.setName("Derek");
        return Response.status(Response.Status.OK).entity(user).build();
	}
	
	@GET
	@Path("/bean/aaa")
	public Response getBean() {
		System.out.println("####getBean#####");
		System.out.println("Method:" + request.getMethod());
		System.out.println("uri:" + uriInfo.getPath());
		System.out.println(uriInfo.getPathParameters());
		UserDTO user = new UserDTO();
		user.setName("DerekLAAA");
		return Response.status(Response.Status.OK).entity(user).build();
	}

    @GET
    @Path("/list")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getList() {
        System.out.println("####getList#####");
        System.out.println("Method:" + request.getMethod());
        System.out.println("uri:" + uriInfo.getPath());
        System.out.println(uriInfo.getPathParameters());
        List<UserDTO> list = new ArrayList<UserDTO>();
        UserDTO user = null;
        for (int i = 0; i < 4;i ++) {
            user = new UserDTO();
            user.setId(i);
            user.setName("Derek-" + i);
            list.add(user);
        }
        Users users = new Users();
        users.setUsers(list);
        return Response.status(Response.Status.OK).entity(users).build();
	}

	
    @POST
    @Path("/postData")	public UserDTO postData(UserDTO user) throws IOException {
        System.out.println(user);
        user.setName("jojo##12321321");
        return user;
	}

    @PUT
    @Path("/putData/{id}")    
	public UserDTO putData(int id, UserDTO user) {
        System.out.println("#####putData#####");
        System.out.println(user);
        user.setId(id);
        user.setAddress("hoojo#gz");
        user.setEmail("hoojo_@126.com");
        user.setName("hoojo");
        System.out.println(user);
        return user;
	}

    @DELETE
    @Path("/removeData/{id}")    
	public void deleteData(int id) {
        System.out.println("#######deleteData#######" + id);
	}
}

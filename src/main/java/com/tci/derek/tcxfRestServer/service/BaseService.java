package com.tci.derek.tcxfRestServer.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

public class BaseService {

	@Context
	HttpServletRequest request;

	@Context
	HttpServletResponse response;

	@Context
	UriInfo uriInfo;

}

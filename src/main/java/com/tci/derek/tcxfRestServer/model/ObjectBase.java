package com.tci.derek.tcxfRestServer.model;

import java.io.Serializable;

/**
 * Object Base Class
 */

public class ObjectBase implements Serializable{
	protected int id;

	protected String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

package com.tci.derek.tcxfRestServer.model;
/**
 * User Bean Class
 */

import java.io.Serializable;

public class User extends ObjectBase implements Serializable,Cloneable{
	private static final long serialVersionUID = 1L;
	
    private String email;

    private String address;
    
    @Override
    public String toString() {
        return this.id + "#" + this.name + "#" + this.email + "#" + this.address;
    }
    
    //Getters & Setters

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
}

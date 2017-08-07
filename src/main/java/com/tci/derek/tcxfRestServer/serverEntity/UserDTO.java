package com.tci.derek.tcxfRestServer.serverEntity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="User")
public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
    private int id;

    private String name;

    private String email;

    private String address;
    
    @Override
    public String toString() {
        return this.id + "#" + this.name + "#" + this.email + "#" + this.address;
    }
    
    //Getters & Setters
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

package com.tci.derek.tcxfRestServer.serverEntity;

import java.util.HashMap;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="UserInfos")
public class Users {
    private List<UserDTO> users;

    private UserDTO[] userArr;

    private HashMap<String, UserDTO> maps;

	public List<UserDTO> getUsers() {
		return users;
	}

	public void setUsers(List<UserDTO> users) {
		this.users = users;
	}

	public UserDTO[] getUserArr() {
		return userArr;
	}

	public void setUserArr(UserDTO[] userArr) {
		this.userArr = userArr;
	}

	public HashMap<String, UserDTO> getMaps() {
		return maps;
	}

	public void setMaps(HashMap<String, UserDTO> maps) {
		this.maps = maps;
	}
    
}

package com.tci.derek.tcxfRestServer.serverEntity;

import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MapBean {
    private Map<String, UserDTO> map;

    public Map<String, UserDTO> getMap() {

        return map;

    }

    public void setMap(Map<String, UserDTO> map) {
        this.map = map;
    }
}

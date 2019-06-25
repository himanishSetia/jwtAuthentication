package com.example.JWT.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class JwtResponse implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;

    
    public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	private String jwtToken;

    public JwtResponse(String jwtToken){
        this.setJwtToken(jwtToken);
    }
}

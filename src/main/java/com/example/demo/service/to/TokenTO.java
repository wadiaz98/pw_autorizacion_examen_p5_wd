package com.example.demo.service.to;

import java.io.Serializable;
public class TokenTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private String jwtSemilla ;


	private int jwtExpirationMs;

	//SET y GET
	public String getJwtSemilla() {
		return jwtSemilla;
	}


	public void setJwtSemilla(String jwtSemilla) {
		this.jwtSemilla = jwtSemilla;
	}


	public int getJwtExpirationMs() {
		return jwtExpirationMs;
	}


	public void setJwtExpirationMs(int jwtExpirationMs) {
		this.jwtExpirationMs = jwtExpirationMs;
	}

	
}


package com.webexcc.api.demo.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

 @JsonIgnoreProperties(ignoreUnknown = true)
public class LastQueue implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -7022405750461935920L;
	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}

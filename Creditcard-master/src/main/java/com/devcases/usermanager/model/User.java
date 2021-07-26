package com.devcases.usermanager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
public class User implements Serializable {

	private static final long serialVersionUID = 6541162783907686900L;

	@Id
	@GeneratedValue
	private int id;

	@Column
	private String pannumber;
	
	@Column
	private String creditscore;


	@Version
	private long version;

	public String getPannumber() {
		return pannumber;
	}

	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}

	public String getCreditscore() {
		return creditscore;
	}

	public void setCreditscore(String creditscore) {
		this.creditscore = creditscore;
	}

	public User() {
		super();
	}

	public User(String pannumber) {
		super();
		this.pannumber = pannumber;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

}

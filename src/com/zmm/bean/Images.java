package com.zmm.bean;

/**
 * Images entity. @author MyEclipse Persistence Tools
 */

public class Images implements java.io.Serializable {

	// Fields

	private Integer id;
	private String picurl;

	// Constructors

	/** default constructor */
	public Images() {
	}

	/** full constructor */
	public Images(Integer id, String picurl) {
		this.id = id;
		this.picurl = picurl;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPicurl() {
		return this.picurl;
	}

	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}

}
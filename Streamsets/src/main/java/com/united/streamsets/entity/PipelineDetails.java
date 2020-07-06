package com.united.streamsets.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class PipelineDetails {

	@Id
	private String pipelineid;
	private String title;
	private String status;
	private String user;
	private String description;
	private String valid;
	
	
	public PipelineDetails() {
		
	}


	public String getPipelineid() {
		return pipelineid;
	}


	public void setPipelineid(String pipelineid) {
		this.pipelineid = pipelineid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getValid() {
		return valid;
	}


	public void setValid(String valid) {
		this.valid = valid;
	}
	
}

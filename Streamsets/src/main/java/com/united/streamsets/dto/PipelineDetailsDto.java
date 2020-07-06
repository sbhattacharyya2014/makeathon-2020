package com.united.streamsets.dto;

import com.united.streamsets.entity.PipelineDetails;

public class PipelineDetailsDto {
	
	private String pipelineId;
	private String title;
	private String status;
	private String user;
	private String description;
	private String valid;
	
	public PipelineDetailsDto() {
	}

	public String getPipelineId() {
		return pipelineId;
	}

	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
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
	
	public PipelineDetails createEntity() {
		PipelineDetails entity = new PipelineDetails();
		entity.setPipelineid(this.pipelineId);
		entity.setTitle(this.title);
		entity.setStatus(this.status);
		entity.setUser(this.user);
		entity.setDescription(this.description);
		entity.setValid(this.valid);
		return entity;
	}

}

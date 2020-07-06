package com.united.streamsets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.united.streamsets.repository.PipelinesJpaRepository;

@Service
public class StreamsetService {
	@Value("${streamSets.URL}")
	String streamsetUrl;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	PipelinesJpaRepository pipelineRepository;
	
	public ResponseEntity<String> getPipeLineCount() {
		return restTemplate.getForEntity(streamsetUrl + "/pipelines/count", String.class);
	}
	
	public ResponseEntity<String>getAllPipeLine() {
		return restTemplate.getForEntity(streamsetUrl + "/pipelines", String.class);
	}

}

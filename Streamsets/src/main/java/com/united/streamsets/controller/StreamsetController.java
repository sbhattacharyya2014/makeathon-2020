package com.united.streamsets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.united.streamsets.service.StreamsetService;

@RestController
@RequestMapping("/")
public class StreamsetController {

	@Autowired
	private StreamsetService streamsetService;
	
	
	
	@GetMapping("pipelines_count")
	public ResponseEntity<String> getPipelineCount(){
		return streamsetService.getPipeLineCount();
	}
	@GetMapping("pipelines")
	public ResponseEntity<String>getAllPipeline(){
		return streamsetService.getAllPipeLine();
	}
	
}

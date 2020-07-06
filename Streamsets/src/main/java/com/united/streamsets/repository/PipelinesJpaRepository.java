package com.united.streamsets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.united.streamsets.entity.PipelineDetails;

public interface PipelinesJpaRepository extends JpaRepository<PipelineDetails, String> {

}

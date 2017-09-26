package com.logan.portfolio.dao;

import com.logan.portfolio.models.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectDao extends CrudRepository<Project, Long> {
}

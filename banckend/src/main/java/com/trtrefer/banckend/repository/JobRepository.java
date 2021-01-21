package com.trtrefer.banckend.repository;

import com.trtrefer.banckend.entity.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job,Long> {
}

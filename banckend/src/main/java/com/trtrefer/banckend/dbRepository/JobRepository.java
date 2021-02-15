package com.trtrefer.banckend.dbRepository;

import com.trtrefer.banckend.dbEntity.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job,Long> {
}

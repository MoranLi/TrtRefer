package com.trtrefer.banckend.repository;

import com.trtrefer.banckend.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}

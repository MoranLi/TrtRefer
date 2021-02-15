package com.trtrefer.banckend.dbRepository;

import com.trtrefer.banckend.dbEntity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}

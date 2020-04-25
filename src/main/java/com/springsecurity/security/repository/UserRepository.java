package com.springsecurity.security.repository;

import com.springsecurity.security.domain.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId> {
    @Query("{'name' : ?0}")
    Optional<User> findByUserName(String name);
}

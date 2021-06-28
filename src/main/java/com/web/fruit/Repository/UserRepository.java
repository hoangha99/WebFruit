package com.web.fruit.Repository;


import com.web.fruit.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    @Query("select us from User us where us.username = :name")
    User findByUsername(String name);

}
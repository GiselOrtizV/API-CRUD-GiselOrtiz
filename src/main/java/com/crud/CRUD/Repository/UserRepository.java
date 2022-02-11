package com.crud.CRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.CRUD.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

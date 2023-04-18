package com.forlearning.fullstackbackend.repository;

import com.forlearning.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

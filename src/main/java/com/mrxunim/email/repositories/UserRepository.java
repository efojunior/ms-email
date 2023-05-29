package com.mrxunim.email.repositories;

import com.mrxunim.email.models.ProductModel;
import com.mrxunim.email.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
}

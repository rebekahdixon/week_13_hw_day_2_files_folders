package com.codelan.filesfolders.homeworkFilesFolders.repository;

import com.codelan.filesfolders.homeworkFilesFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

package com.codelan.filesfolders.homeworkFilesFolders.repository;

import com.codelan.filesfolders.homeworkFilesFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}

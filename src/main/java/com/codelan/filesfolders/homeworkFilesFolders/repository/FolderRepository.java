package com.codelan.filesfolders.homeworkFilesFolders.repository;

import com.codelan.filesfolders.homeworkFilesFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}

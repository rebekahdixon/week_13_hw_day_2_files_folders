package com.codelan.filesfolders.homeworkFilesFolders.components;

import com.codelan.filesfolders.homeworkFilesFolders.models.ExtensionType;
import com.codelan.filesfolders.homeworkFilesFolders.models.File;
import com.codelan.filesfolders.homeworkFilesFolders.models.Folder;
import com.codelan.filesfolders.homeworkFilesFolders.models.User;
import com.codelan.filesfolders.homeworkFilesFolders.repository.FileRepository;
import com.codelan.filesfolders.homeworkFilesFolders.repository.FolderRepository;
import com.codelan.filesfolders.homeworkFilesFolders.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args){

        User bob = new User("Bob");
        User sam = new User("Sam");

        Folder folder1 = new Folder("Homework", bob);
        Folder folder2 = new Folder("Class Work", bob);


        File file1 = new File("day1", ExtensionType.TXT,30, folder1);

        userRepository.save(bob);
        userRepository.save(sam);
        folderRepository.save(folder1);
        folderRepository.save(folder2);
        fileRepository.save(file1);
    }
}

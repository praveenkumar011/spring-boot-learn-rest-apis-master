package com.codingshuttle.youtube.LearningRESTAPIs.controller;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController
public class GitController {

    @GetMapping("/getDeployedBranch")
    public String getDeployedBranch() {

        try {
            Repository repository =  new FileRepositoryBuilder()
                    .setGitDir(new File(".git"))
                    .build();
            Git     git = new Git(repository);
            String branch  = git.getRepository().getBranch();
            return branch;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
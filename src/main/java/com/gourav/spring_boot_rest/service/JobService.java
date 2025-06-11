package com.gourav.spring_boot_rest.service;

import com.gourav.spring_boot_rest.Repo.JobRepo;
import com.gourav.spring_boot_rest.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

;


@Service
public class JobService {

        @Autowired
        private JobRepo repo;
        public void addJobs(JobPost jobPost){
            repo.addJobs(jobPost);
        }
        public List<JobPost> getAllJobs(){
            return repo.getAllJobs();
        }

    public JobPost getJob(int i) {
        return repo.getJob(i);
    }

    public void upadtejob(JobPost jobPost) {
            repo.updateJob(jobPost);
    }

    public String deleteJob(int postId){
            return repo.deleteJob(postId);
    }
}

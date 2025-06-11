package com.gourav.spring_boot_rest;

import com.gourav.spring_boot_rest.model.JobPost;
import com.gourav.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin(origins = "http://localhost:3000")

public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("JobPosts")
    @ResponseBody
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("JobPost/{postId}")
    public JobPost getJob(@PathVariable ("postId")int postId){
        return service.getJob(postId);
    }

    @PostMapping("JobPost")
    public void addJob(@RequestBody JobPost jobPost){
        service.addJobs(jobPost);
    }

    @PutMapping("jobPost")
    public List<JobPost> updatejob(@RequestBody JobPost jobPost){
        service.upadtejob(jobPost);
        return service.getAllJobs();
    }

    @DeleteMapping("JobPost/{postId}")
    public String deleteJob(@PathVariable int postId){
        return service.deleteJob(postId);
    }
}

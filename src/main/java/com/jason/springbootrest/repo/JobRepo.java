package com.jason.springbootrest.repo;

import com.jason.springbootrest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Software Engineer", "Must have good system knowledge", 3, Arrays.asList("Java", "Spring")),
            new JobPost(2, "Data Scientist", "Must have strong analytical skills", 5, Arrays.asList("Python", "TensorFlow")),
            new JobPost(3, "Product Manager", "Must have excellent leadership skills", 4, Arrays.asList("Agile", "Scrum"))
    ));


    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println(jobs);
    }
}

package com.jason.springbootrest.repo;

import com.jason.springbootrest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class JobRepo {

    // HashMap to store JobPost objects with postId as key
    private Map<Integer, JobPost> jobs = new HashMap<>();

    // ****************************************************************************

    // constructor->injecting objects into HashMap defined above.
    public JobRepo() {

        // Java Developer Job Post
        jobs.put(1, new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));

        // Frontend Developer Job Post
        jobs.put(2, new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
                3, List.of("HTML", "CSS", "JavaScript", "React")));

        // Data Scientist Job Post
        jobs.put(3, new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                List.of("Python", "Machine Learning", "Data Analysis")));

        // Network Engineer Job Post
        jobs.put(4, new JobPost(4, "Network Engineer",
                "Design and implement computer networks for efficient data communication", 5,
                List.of("Networking", "Cisco", "Routing", "Switching")));

        // Mobile App Developer Job Post
        jobs.put(5, new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
                List.of("iOS Development", "Android Development", "Mobile App")));

    }

    // method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return new ArrayList<>(jobs.values());
    }

    // method to save a job post object into HashMap
    public void addJobPost(JobPost job) {
        jobs.put(job.getPostId(), job);
    }

    // method to get a job by postId - O(1) lookup!
    public JobPost getJob(int postId) {
        return jobs.get(postId);
    }

    // method to update a job post - O(1) update!
    public void updateJob(JobPost jobPost) {
        jobs.put(jobPost.getPostId(), jobPost);
    }

    // method to delete a job by postId - O(1) deletion!
    public void deleteJob(int postId) {
        jobs.remove(postId);
    }
}

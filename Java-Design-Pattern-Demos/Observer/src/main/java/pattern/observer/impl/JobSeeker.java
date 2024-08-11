package pattern.observer.impl;

import pattern.entity.JobPost;
import pattern.observer.Observer;

public class JobSeeker implements Observer {
    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }
    @Override
    public void onJobPosted(JobPost job) {
        // Do something with the job posting
        System.out.println("Hi " + name + "! New job posted: " + job.getTitle());
    }
}

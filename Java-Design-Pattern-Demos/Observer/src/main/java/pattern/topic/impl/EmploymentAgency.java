package pattern.topic.impl;

import pattern.entity.JobPost;
import pattern.observer.Observer;
import pattern.topic.Observable;

import java.util.ArrayList;
import java.util.List;

public class EmploymentAgency implements Observable {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(JobPost job) {
        for (Observer observer : observers) {
            observer.onJobPosted(job);
        }
    }

    public void addJob(JobPost jobPosting) {
        notifyObserver(jobPosting);
    }
}

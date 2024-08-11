import pattern.entity.JobPost;
import pattern.observer.impl.JobSeeker;
import pattern.topic.impl.EmploymentAgency;

public class Main {
    public static void main(String[] args) {
        JobSeeker johnDoe = new JobSeeker("John Doe");
        JobSeeker janeDoe = new JobSeeker("Jane Doe");

        EmploymentAgency agency = new EmploymentAgency();
        agency.attach(johnDoe);
        agency.attach(janeDoe);

        agency.addJob(new JobPost("Software Engineer"));
        agency.addJob(new JobPost("QA Engineer"));
    }
}

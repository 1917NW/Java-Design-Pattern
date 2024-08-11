package pattern.topic;

import pattern.entity.JobPost;
import pattern.observer.Observer;

/**
 * 主题接口
 */
public interface Observable {

    public void attach(Observer observer);

    public void detach(Observer observer);

    public void notifyObserver(JobPost job);
}

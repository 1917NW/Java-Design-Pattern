package pattern.observer;

import pattern.entity.JobPost;


/**
 * 观察者接口
 */
public interface Observer {

    // 更新方法
    void onJobPosted(JobPost job);
}

package cn.lidd.threadpool;

/**
 * Created by lidong on 2016/3/17.
 */
public class ThreadPoolManagerTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // 线程池为10个
        ThreadPoolManager tpm = new ThreadPoolManager(10);
        // 执行
        tpm.execute();
    }
}
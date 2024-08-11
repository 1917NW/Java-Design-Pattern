package singleton;

/**
 * 饿汉式单例
 */
public class HungrySingleton {
	// 类加载，初始化
	private static final HungrySingleton instance = new HungrySingleton();
	
	private HungrySingleton() {}
	
	public static HungrySingleton getInstance() {
		return instance;
	}
}
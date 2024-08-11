package singleton;

/**
 * 懒汉式单例
 */
public class LazySingleton {
	private static LazySingleton instance = null;
	
	private LazySingleton() {}
	
	public static LazySingleton getInstance() {
		// 如果实例没被创建，就创建
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
package org.maoge.pattern.p01;

/**
 * 仓库类--采用单例模式设计，保证只有一个实例
 */
public class Warehouse {
	private static Warehouse warehouse = new Warehouse();

	private Warehouse() {

	}

	public static Warehouse getInstance() {
		return warehouse;
	}

	public static void main(String[] args) {
		Warehouse w1 = Warehouse.getInstance();
		Warehouse w2 = Warehouse.getInstance();
		// 不论如何获取，只有一个实例
		System.out.println(w1 == w2);
	}
}

package org.maoge.pattern.p01;

/**
 * �ֿ���--���õ���ģʽ��ƣ���ֻ֤��һ��ʵ��
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
		// ������λ�ȡ��ֻ��һ��ʵ��
		System.out.println(w1 == w2);
	}
}

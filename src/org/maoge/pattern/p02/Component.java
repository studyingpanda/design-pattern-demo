package org.maoge.pattern.p02;

/**
 * Ԫ����--ԭ��ģʽ����֤����Ʒ��һģһ��
 */
public class Component implements Cloneable {
	/**
	 * ����
	 */
	private String name;
	/**
	 * ����
	 */
	private double length;
	/**
	 * ���
	 */
	private double width;

	/**
	 * չʾ
	 */
	public void display() {
		System.out.printf("��Ʒ����:%s,����:%s,���:%s;\n", name, length, width);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Component component1 = new Component();
		component1.setName("��׼��C01");
		component1.setLength(100);
		component1.setWidth(80);
		component1.display();
		Component component2 = (Component) component1.clone();
		component2.display();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}

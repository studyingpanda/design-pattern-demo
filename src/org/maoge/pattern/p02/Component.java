package org.maoge.pattern.p02;

/**
 * 元器件--原型模式，保证复制品都一模一样
 */
public class Component implements Cloneable {
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 长度
	 */
	private double length;
	/**
	 * 宽度
	 */
	private double width;

	/**
	 * 展示
	 */
	public void display() {
		System.out.printf("产品名称:%s,长度:%s,宽度:%s;\n", name, length, width);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Component component1 = new Component();
		component1.setName("标准件C01");
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

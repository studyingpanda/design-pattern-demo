package org.maoge.pattern.p05;

/**
 * 水表
 */
public class WaterMeter implements IMeter {
	private double num;

	@Override
	public void read() {
		System.out.println("水表读数为" + num);
	}
	
}

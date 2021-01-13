package org.maoge.pattern.p04;

/**
 * 水表
 */
public class WaterMeter implements IMeter {

	private String unit;
	private double num;

	public WaterMeter(String unit, double num) {
		this.unit = unit;
		this.num = num;
	}

	@Override
	public void read() {
		System.out.println("水表读数:" + num + unit);
	}

}

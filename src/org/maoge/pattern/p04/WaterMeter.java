package org.maoge.pattern.p04;

/**
 * ˮ��
 */
public class WaterMeter implements IMeter {
	private double num;

	@Override
	public void read() {
		System.out.println("ˮ�����Ϊ" + num);
	}
	
}

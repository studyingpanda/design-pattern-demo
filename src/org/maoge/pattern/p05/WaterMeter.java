package org.maoge.pattern.p05;

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

package org.maoge.pattern.p05;

/**
 * 燃气表
 */
public class GasMeter implements IMeter {
	private double num;

	@Override
	public void read() {
		System.out.println("燃气表读数为" + num);
	}
}

package org.maoge.pattern.p04;

/**
 * 燃气表
 */
public class GasMeter implements IMeter {
	private String unit;
	private double num;

	public GasMeter(String unit, double num) {
		this.unit = unit;
		this.num = num;
	}

	@Override
	public void read() {
		System.out.println("燃气表读数：" + num + unit);
	}
}

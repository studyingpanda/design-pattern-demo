package org.maoge.pattern.p04;

/**
 * ȼ����
 */
public class GasMeter implements IMeter {
	private double num;

	@Override
	public void read() {
		System.out.println("ȼ�������Ϊ" + num);
	}
}

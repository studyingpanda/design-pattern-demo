package org.maoge.pattern.p03;

/**
 * ����ӿ�--������ģʽ
 */
public interface IBuilder {
	public void buildBasic();

	public void buildBattery();

	public void buildConnection();

	public IotMeter buildMeter();
}

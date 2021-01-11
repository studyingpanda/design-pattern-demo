package org.maoge.pattern.p03;

/**
 * 建造接口--建造者模式
 */
public interface IBuilder {
	public void buildBasic();

	public void buildBattery();

	public void buildConnection();

	public IotMeter buildMeter();
}

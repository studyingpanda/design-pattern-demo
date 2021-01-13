package org.maoge.pattern.p03;

/**
 * 抽象制造接口
 */
public interface IBuilder {
	/**
	 * 装配基表
	 */
	public void buildBasic();

	/**
	 * 装配电池
	 */
	public void buildBattery();

	/**
	 * 装配网络模块
	 */
	public void buildConnection();

	/**
	 * 得到完整产品
	 */
	public IotMeter buildMeter();
}

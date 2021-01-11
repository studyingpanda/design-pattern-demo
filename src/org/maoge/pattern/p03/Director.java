package org.maoge.pattern.p03;

/**
 * 指挥者
 */
public class Director {
	public IotMeter makeIotMeter(IBuilder builder) {
		builder.buildBasic();
		builder.buildBattery();
		builder.buildConnection();
		return builder.buildMeter();
	}
}

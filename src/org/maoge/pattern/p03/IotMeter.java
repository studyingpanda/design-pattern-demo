package org.maoge.pattern.p03;

/**
 * 物联网仪表
 */
public class IotMeter {
	// 基表
	private String basic;
	// 电池
	private String battery;
	// 网络模块
	private String connection;

	// 省略 get set
	public String getBasic() {
		return basic;
	}

	public void setBasic(String basic) {
		this.basic = basic;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}
}

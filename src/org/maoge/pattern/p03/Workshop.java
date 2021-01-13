package org.maoge.pattern.p03;

/**
 * 车间
 */
public class Workshop {
	public static void main(String[] args) {
		// 将生产任务下达给指挥者即可
		Director director = new Director();
		// 指挥者指挥生产物联网表
		IotMeter meter=director.makeIotMeter(new IotMeterBuilder(new IotMeter()));
	}
}
package org.maoge.pattern.p03;

/**
 * 具体建造者
 */
public class IotMeterBuilder implements IBuilder {
	private IotMeter iotMeter;

	public IotMeterBuilder(IotMeter inputMeter) {
		this.iotMeter = inputMeter;
	}

	@Override
	public void buildBasic() {
		iotMeter.setBasic("装备基表");
		System.out.println("已装配基表");
	}

	@Override
	public void buildBattery() {
		iotMeter.setBattery("装配电池");
		System.out.println("已装配电池");
	}

	@Override
	public void buildConnection() {
		iotMeter.setConnection("装配网络模块");
		System.out.println("已装配网络");
	}

	@Override
	public IotMeter buildMeter() {
		return iotMeter;
	}
}

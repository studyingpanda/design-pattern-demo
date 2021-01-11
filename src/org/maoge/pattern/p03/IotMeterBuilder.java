package org.maoge.pattern.p03;

public class IotMeterBuilder implements IBuilder {
	private IotMeter iotMeter;

	public IotMeterBuilder(IotMeter inputMeter) {
		this.iotMeter = inputMeter;
	}

	@Override
	public void buildBasic() {
		iotMeter.setBasic("装配基表");
	}

	@Override
	public void buildBattery() {
		iotMeter.setBattery("装配电池");
	}

	@Override
	public void buildConnection() {
		iotMeter.setConnection("装配通讯模块");
	}

	@Override
	public IotMeter buildMeter() {
		return iotMeter;
	}
}

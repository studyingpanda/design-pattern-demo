package org.maoge.pattern.p03;

public class IotMeterBuilder implements IBuilder {
	private IotMeter iotMeter;

	public IotMeterBuilder(IotMeter inputMeter) {
		this.iotMeter = inputMeter;
	}

	@Override
	public void buildBasic() {
		iotMeter.setBasic("װ�����");
	}

	@Override
	public void buildBattery() {
		iotMeter.setBattery("װ����");
	}

	@Override
	public void buildConnection() {
		iotMeter.setConnection("װ��ͨѶģ��");
	}

	@Override
	public IotMeter buildMeter() {
		return iotMeter;
	}
}

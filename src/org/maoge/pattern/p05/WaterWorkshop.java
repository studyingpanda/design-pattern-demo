package org.maoge.pattern.p05;

/**
 * ˮ����������
 */
public class WaterWorkshop implements IWorkshop {

	@Override
	public IMeter produceMeter() {
		return new WaterMeter();
	}

}

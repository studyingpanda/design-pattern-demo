package org.maoge.pattern.p05;

/**
 * 水表生产车间
 */
public class WaterWorkshop implements IWorkshop {

	@Override
	public IMeter produceMeter() {
		return new WaterMeter();
	}

}

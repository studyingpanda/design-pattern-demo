package org.maoge.pattern.p06;

/**
 * 普通产品车间
 */
public class WorkshopCommon implements IWorkshop {

	@Override
	public IBasic produceBasic() {
		return new PlasticBasic();
	}

	@Override
	public IBattery produceBattery() {
		return new SmallBattery();
	}

}

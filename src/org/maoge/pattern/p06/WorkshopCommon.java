package org.maoge.pattern.p06;

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

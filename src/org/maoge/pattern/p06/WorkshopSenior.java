package org.maoge.pattern.p06;

public class WorkshopSenior implements IWorkshop {

	@Override
	public IBasic produceBasic() {
		return new MetalBasic();
	}

	@Override
	public IBattery produceBattery() {
		return new BigBattery();
	}

}

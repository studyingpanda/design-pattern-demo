package org.maoge.pattern.p06;

/**
 * 高端产品车间
 */
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

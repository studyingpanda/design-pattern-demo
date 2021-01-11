package org.maoge.pattern.p05;

/**
 * 燃气表生产车间
 */
public class GasWorkshop implements IWorkshop {

	@Override
	public IMeter produceMeter() {
		return new GasMeter();
	}

}

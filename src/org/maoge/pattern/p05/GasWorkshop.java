package org.maoge.pattern.p05;

/**
 * ȼ������������
 */
public class GasWorkshop implements IWorkshop {

	@Override
	public IMeter produceMeter() {
		return new GasMeter();
	}

}

package org.maoge.pattern.p04;

/**
 * ����
 */
public class Workshop {
	public static IMeter produceMeter(MeterTypeEnum meterTypeEnum) {
		switch (meterTypeEnum) {
		case WATER_METER:
			return new WaterMeter();
		case GAS_METER:
			return new GasMeter();
		}
		return null;
	}
}

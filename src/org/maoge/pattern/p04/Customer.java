package org.maoge.pattern.p04;

/**
 * 客户类
 */
public class Customer {
	public static void main(String[] args) {
		Workshop workshop = new Workshop();
		workshop.produceMeter(MeterTypeEnum.GAS_METER);
		
	}
}

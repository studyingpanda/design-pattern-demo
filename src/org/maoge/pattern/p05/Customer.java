package org.maoge.pattern.p05;

/**
 * 客户
 */
public class Customer {
	public static void main(String[] args) {
		IWorkshop workshop = new GasWorkshop();
		workshop.produceMeter();
	}
}

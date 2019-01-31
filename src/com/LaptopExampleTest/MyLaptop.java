package com.LaptopExampleTest;

import com.LaptopConsumer.LaptopConsumer;
import com.LaptopDependencyInjection.DellServiceInjector;
import com.LaptopDependencyInjection.HpServiceInjector;

public class MyLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LaptopConsumer laptopConsumer = null;
		
		DellServiceInjector dellServiceInjector = new DellServiceInjector();
		laptopConsumer= dellServiceInjector.getLaptop();
		laptopConsumer.getLaptop();
		
		
		HpServiceInjector hpServiceInjector = new HpServiceInjector();
		laptopConsumer = hpServiceInjector.getLaptop();
		laptopConsumer.getLaptop();
	}

}

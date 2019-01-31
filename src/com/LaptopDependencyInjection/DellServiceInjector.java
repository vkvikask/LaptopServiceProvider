package com.LaptopDependencyInjection;

import com.LaptopConsumer.LaptopConsumer;
import com.LaptopConsumer.MyLaptopConsumer;
import com.LaptopServicesProvider.DellLaptopImpl;

public class DellServiceInjector implements LaptopServiceInjector {

	
	MyLaptopConsumer myLaptopConsumer = new MyLaptopConsumer(new DellLaptopImpl());
	@Override
	public LaptopConsumer getLaptop() {
		// TODO Auto-generated method stub
		return null;
	}

}

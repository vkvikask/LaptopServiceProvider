package com.LaptopDependencyInjection;

import com.LaptopConsumer.LaptopConsumer;
import com.LaptopConsumer.MyLaptopConsumer;
import com.LaptopServicesProvider.HpLaptopImpl;

public class HpServiceInjector implements LaptopServiceInjector {
 
	MyLaptopConsumer mylaptopConsumer = new MyLaptopConsumer(new HpLaptopImpl());
	@Override
	public LaptopConsumer getLaptop() {
		// TODO Auto-generated method stub
		return null;
	}

}

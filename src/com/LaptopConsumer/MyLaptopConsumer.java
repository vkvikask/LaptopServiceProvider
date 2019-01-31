package com.LaptopConsumer;

import com.LaptopServicesProvider.LaptopService;

public class MyLaptopConsumer implements LaptopConsumer{

	LaptopService laptopService;
	
	
	public MyLaptopConsumer(LaptopService laptopService){
		this.laptopService = laptopService;
	}

	@Override
	public void getLaptop() {
		// TODO Auto-generated method stub
		
	}

}

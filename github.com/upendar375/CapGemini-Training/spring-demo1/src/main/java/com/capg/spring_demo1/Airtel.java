package com.capg.spring_demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("airtel")
public class Airtel implements Sim {
	@Value("${airtel.browsingspeed}")
	private float browsingspeed;
	@Value("${airtel.callingcharge}")
	private float callcharge;
	@Value("#{${airtel.supportednetworks}}")
	private List<String> supportednetworks;
	
public List<String> getSupportednetworks() {
		return supportednetworks;
	}

	public void setSupportednetworks(List<String> supportednetworks) {
		this.supportednetworks = supportednetworks;
	}

public Airtel() {
	
}

	public Airtel(float browsingspeed, float callcharge) {
		System.out.println("setting upproperties....");
	this.browsingspeed = browsingspeed;
	this.callcharge = callcharge;
}

	public float getBrowsingspeed() {
		return browsingspeed;
	}

	public void setBrowsingspeed(float browsingspeed) {
		System.out.println("setting up the browsingspeed");
		this.browsingspeed = browsingspeed;
	}

	public float getCallcharge() {
		return callcharge;
	}

	public void setCallcharge(float callcharge) {
		System.out.println("setting up the calling charges");
		this.callcharge = callcharge;
	}

	@Override
	public void call() {  
		// TODO Auto-generated method stub
		System.out.println("calling with airtel..... charges"    +callcharge   );
	}

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("browsing with airtel....speed"    +browsingspeed   );
	}
	public void showsupportednetworks() {
		System.out.println("supportednetworks aer...");
		supportednetworks.forEach(n->System.out.println(n));
	}

//	@Override
//	public void showsupportednetworks() {
//		// TODO Auto-generated method stub
//		
//	}
}

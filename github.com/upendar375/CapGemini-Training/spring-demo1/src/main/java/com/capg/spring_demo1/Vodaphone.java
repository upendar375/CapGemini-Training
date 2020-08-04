package com.capg.spring_demo1;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("vodaphone")
public class Vodaphone implements Sim {
    @Value("${vodaphone.browsingspeed}")
	private float browsingspeed;
    @Value("${vodaphone.callingcharge}")
	private float callcharge;
	@Value("#{${vodaphone.supportednetworks}}")
	private Map<String,Integer> supportednetworks;

	public Map<String, Integer> getSupportednetworks() {
		return supportednetworks;
	}


	public void setSupportednetworks(Map<String, Integer> supportednetworks) {
		this.supportednetworks = supportednetworks;
	}


	public Vodaphone() {
	}
	

	public Vodaphone(float browsingspeed, float callcharge) {
		System.out.println("setting up properties.......");
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
		System.out.println("setting up the calling charges....");
		this.callcharge = callcharge;
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("calling with vodaphone..... charges"   +callcharge    );
	}

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("browsing with vodaphone....speed"     +browsingspeed   );
	}
	public void showsupportednetworks() {
		System.out.println("supportednetworks are         -Years ");
		supportednetworks.forEach(
		(n,y)->System.out.printf("%-30s %-10d \n",n,y)
		);

	}
}
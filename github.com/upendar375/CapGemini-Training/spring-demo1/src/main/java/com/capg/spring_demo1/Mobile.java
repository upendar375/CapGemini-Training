package com.capg.spring_demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component("mobile")
public class Mobile {
@Autowired
@Qualifier("vodaphone")
private Sim sim;
	
//	
//	public Sim getSim() {
//		return sim;
//	}
//	public void setSim(Sim sim) {
//		this.sim = sim;
//	}
	void call() {
		if(sim==null) {
			System.out.println("Phone lo sim veyya raa first");
		}
		else  {
		sim.call();
	}
		}
	void browse() {
		if(sim==null) {
			System.out.println("Phone lo sim veyya raa first");
		}
		else {
		sim.browse();
}
	}
	
	public void showsupportednetworks() {
		if(sim==null) {
			System.out.println("Phone lo sim veyya raa first");
		}
		else {
		sim.showsupportednetworks();
	         }
	}
	
} 
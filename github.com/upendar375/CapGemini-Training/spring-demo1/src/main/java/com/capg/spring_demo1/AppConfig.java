package com.capg.spring_demo1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration 
@ComponentScan(basePackages = "com.capg.spring_demo1")
@PropertySource("App.properties")
public class AppConfig {
//	@Bean(name="airtel")
//	public Airtel GetAirtelBean() {
//		Airtel airtel =new Airtel();
//		List<String> netLists=Arrays.asList("EDGE" ,"GOPALA KRISHNA", "DUNNA", "DEVIL");
//		airtel.setSupportednetworks(netLists);
//		return airtel;
//	}
//@Bean(name="vodaphone")
//	public Vodaphone  GetVodaphoneBean() {
//Vodaphone vf=new Vodaphone();
//vf.setCallcharge(1.7f);
//vf.setBrowsingspeed(19.7f);
//Map <String, Integer> nets=new HashMap<>();
//nets.put("SINUPENDAR", 2003);
//nets.put("Airtel2", 2018);
//nets.put("Idea", 2003);
//nets.put("Airtel", 2003);
//vf.setSupportednetworks(nets);
//return vf;
	//}	

@Bean(name="mobile")
public Mobile GetMobileBean() {
	Mobile m=new Mobile();
	//m.setSim(GetVodaphoneBean());
	return m;
}
}

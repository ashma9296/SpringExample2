package com.abc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.sp.OfficePojo;

public class Mainmethod {
	
	public static void main(String[] args) {
		
 ApplicationContext  ctx = new ClassPathXmlApplicationContext("application2context.xml");
 
 OfficePojo  ofc1 = (OfficePojo) ctx.getBean("ofc");
 
 System.out.println(ofc1.getFloor());
 
}
}
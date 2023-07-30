package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    	ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("Config.xml");
    	//Object bean = context.getBean("goldcostumer");
    	
    	GoldCustomer bean = (GoldCustomer)context.getBean("goldcostumer");
    	
    	System.out.println(bean);
    	bean.save();
    	
    	GoldCustomer bean1 = (GoldCustomer)context.getBean("goldcostumer");
    	
    	System.out.println(bean1);
    	
    }
}

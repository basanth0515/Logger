package com.mylogger.loggerprint;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	private static Scanner sc;
	public static void getInterest() {
		LOGGER.debug("enter principal amount ");
		double pa=sc.nextDouble();
		LOGGER.debug("enter time period ");
		double ti= sc.nextDouble();
		LOGGER.debug("Enter rate of interest ");
		double rate=sc.nextDouble();
		Interest i=new Interest(pa,ti,rate);
		LOGGER.debug("\noption 1- calculate simple interest\nOption 2- Calculates the compound interest\nEnter option ");
		int  op=sc.nextInt();
		if(op==1) {
			LOGGER.debug("Simple Interest is "+i.getSimpleInterest());
		}
		else {
			LOGGER.debug("Compound Interest is "+i.getCompoundInterest());
		}
	}
	public static void getCostOfBuliding() {
		LOGGER.debug("• Option 1-standard materials\n• Option 2-use above standard materials\n• Option 3-high standard material\n• Option 4-high standard material and fully automated home\n Enter the type material requried for type of constuction of buliding ");
		int op2=sc.nextInt();
		LOGGER.debug("Enter the area of the land to estimate the cost of buliding ");
		double area=sc.nextDouble();
		Building b=new Building(area,op2);
		LOGGER.debug("Cost for construction of buliding is "+b.getCostOfBuilding());
	}
    public static void main( String[] args )
    {
    	sc =new Scanner(System.in);
        while(true) {
        	LOGGER.debug("\n1 opion one to claculate Interest\n2 option to calculate the cost for buliding a buliding\n3 option to exit\n");
        	LOGGER.debug("Enter option ");
        	int option = sc.nextInt();
        	switch(option) {
        	case 1:
        		getInterest();
        		break;
        	case 2:
        		getCostOfBuliding();
        		break;
        	case 3:
        		sc.close();
        		return;
        	default:
        		error();
        	}
        }
        
    }
	private static void error() {
		LOGGER.debug("Enter valid opion");
	}
}

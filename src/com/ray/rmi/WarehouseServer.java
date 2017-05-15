package com.ray.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * @author : ray
 * @date : 2017年5月15日
 */
public class WarehouseServer {

	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
		// TODO Auto-generated method stub
		
		Warehouse c = new WarehouseImple();
		LocateRegistry.createRegistry(8888);
		
		Naming.bind("rmi://localhost:8888/warehouse", c);
		
	}

}

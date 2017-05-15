package com.ray.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : ray
 * @date : 2017年5月15日
 */
public class WarehouseClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		// TODO Auto-generated method stub

		Warehouse s = (Warehouse) Naming.lookup("rmi://localhost:8888/warehouse");
		System.out.println(s.getPrice("2"));
		List<String> l = new ArrayList<>();
		l.add("1");
		l.add("1.2");
		Product p = s.getProduct(l);
		System.out.println(p.getDescription());
		System.out.println(p.getPrice());
		
//		String[] e = Naming.list("rmi://localhost:8888/");
//		if(e != null && e.length > 0)
//		{
//			for(int i = 0 ; i < e.length ; i++)
//				System.out.println(e[i]);
//		}
	}

}

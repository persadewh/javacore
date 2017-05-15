package com.ray.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : ray
 * @date : 2017年5月15日
 * UnicastRemoteObject
 * exportObject
 * UnicastRemoteObject.exportObject(this,0)
 * Multicast
 */
public class WarehouseImple extends UnicastRemoteObject implements Warehouse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6391083044884810773L;

	private Map<String,Double> prices;
	
	
	protected WarehouseImple() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
		prices = new HashMap<String, Double>();
		prices.put("1", 1.2d);
		prices.put("2", 2.1d);
	}
	
	@Override
	public Double getPrice(String description) throws RemoteException {
		// TODO Auto-generated method stub
		Double price = prices.get(description);
		return price == null ? 0 : price;
	}

	@Override
	public Product getProduct(List<String> keywords) throws RemoteException {
		// TODO Auto-generated method stub
		Product n = new Product(keywords.get(0), Double.valueOf(keywords.get(1)));
		
		return n;
	}

}

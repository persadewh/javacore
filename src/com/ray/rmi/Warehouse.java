package com.ray.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * @author : ray
 * @date : 2017年5月15日
 * a remote interface
 */
public interface Warehouse extends Remote {

	Double getPrice(String description) throws RemoteException;
	Product getProduct(List<String> keywords) throws RemoteException;
}

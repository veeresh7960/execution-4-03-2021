package com.xworkz.electricalshop.dao;

public interface ElectricalShopDAO {

	void save();

	boolean update(String ownerName);

	boolean delete(String ownerName);

}

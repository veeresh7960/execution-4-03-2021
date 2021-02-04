package com.xworkz.electricalshop.service;

public interface ServiceDAO {
	boolean save(String ownerName);
	boolean update(String ownerName );
	boolean delete(String ownerName);

}

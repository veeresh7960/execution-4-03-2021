package com.xworkz.electricalshop;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.electricalshop.dao.ElectricalShopDAOImpl;
import com.xworkz.electricalshop.dto.ElectricalShopDTO;

public class ElectricalShopApplication {

	public static void main(String[] args) {
		ElectricalShopDTO dto = new ElectricalShopDTO("DCR ElectricalShop", "koppal", "Doddabasappa", 9925445187l, 5);
		ElectricalShopDTO dto2 = new ElectricalShopDTO("Niranjan ElectricalShop", "koppal", "Niranjan", 821709690l, 10);
		ElectricalShopDTO dto3 = new ElectricalShopDTO("Siddu ElectricalShop", "koppal", "Siddu", 7760727960l, 10);

		

		Collection<ElectricalShopDTO> collection = new ArrayList<ElectricalShopDTO>();
		System.out.println("added dto to collection");
		collection.add(dto);
		collection.add(dto2);
		collection.add(dto3);
		ElectricalShopDAOImpl daoImpl = new ElectricalShopDAOImpl(dto2);
		
		System.out.println(dto.toString());
		System.out.println(dto2.toString());
		System.out.println(dto3.toString());
		daoImpl.save();
//		daoImpl.update("niranjan");
		System.out.println(collection.size());
		daoImpl.delete("niranjan");
		System.out.println(collection.size());
		
		
		
		

	}

}

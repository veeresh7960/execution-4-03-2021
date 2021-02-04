package com.xworkz.electricalshop.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.electricalshop.dto.ElectricalShopDTO;

public class ElectricalShopDAOImpl implements ElectricalShopDAO {
	Collection<ElectricalShopDTO> dtos = new ArrayList<ElectricalShopDTO>();
	private ElectricalShopDTO dto;

	public ElectricalShopDAOImpl(ElectricalShopDTO dto) {
		this.dto = dto;
	}

	@Override
	public void save() {
		System.out.println(" invoked save");
	}

	@Override
	public boolean update(String ownerName) {
		System.out.println(" invoked upadate");

		boolean equals = this.dtos.equals(ownerName);
		if (this.dtos.equals(equals)) {
			System.out.println(" name can be update");
		}
		return false;
	}

	@Override
	public boolean delete(String ownerName) {
		System.out.println(" invoked delete");
		Iterator<ElectricalShopDTO> iterator = this.dtos.iterator();
		while (iterator.hasNext()) {
			ElectricalShopDTO electricalShopDTO = (ElectricalShopDTO) iterator.next();
			if (electricalShopDTO.getOwnerName() != null) {
				System.out.println(electricalShopDTO);
			
			iterator.remove();
			}
		}
		return false;
	}

}

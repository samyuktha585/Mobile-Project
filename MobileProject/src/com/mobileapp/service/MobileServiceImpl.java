package com.mobileapp.service;
import com.mobileapp.exception.MobileNotFound;
import com.mobileapp.model.Mobile;


public  class MobileServiceImpl implements MobileService {

	@Override
	public Mobile getById(int id) throws MobileNotFound {
		Mobile[] mobiles = allMobiles();
		for (Mobile mobl : mobiles) {
			if (mobl.getMobileId() == id) {
				return mobl;
			}
		}
		throw new MobileNotFound("Mobile Not Found");
	}

	@Override
	public Mobile[] getAll() {
		return allMobiles();
	}

	@Override
	public Mobile[] getByBrand(String brand) throws MobileNotFound {
		Mobile[] mobiles = allMobiles();
		Mobile[] mobileByBrand = new Mobile[7];
		int index = 0, flag = 0;
		for (Mobile mobile : mobiles) {
			if (mobile.getBrand().equals(brand)) {
				mobileByBrand[index++] = mobile;
				flag = 1;
			}
		}
		if (flag == 0) {
			throw new MobileNotFound("Mobile Not Found");
		}
		return mobileByBrand;

	}

	private Mobile[] allMobiles() {
		Mobile[] mobiles = new Mobile[7];
		mobiles[0] = new Mobile(1, "Model-1", "Sony", 10000);
		mobiles[1] = new Mobile(2, "Model-2", "Samsung", 20000);
		mobiles[2] = new Mobile(3, "Model-3", "Redmi", 30000);
		mobiles[3] = new Mobile(4, "Model-4", "Vivo", 40000);
		mobiles[4] = new Mobile(5, "Model-5", "Oppo", 50000);
		mobiles[5] = new Mobile(6, "Model-6", "Apple", 60000);
		mobiles[6] = new Mobile(7, "Model-7", "Oneplus", 70000);
		return mobiles;


	}

}


package com.mobileapp.service;

import com.mobileapp.exception.*;
import com.mobileapp.model.Mobile;

public interface MobileService {
	
	Mobile getById(int id) throws MobileNotFound;

	Mobile[] getAll();

	Mobile[] getByBrand(String brand) throws MobileNotFound;

}

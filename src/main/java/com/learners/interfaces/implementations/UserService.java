package com.learners.interfaces.implementations;


import java.util.UUID;

import com.learners.java.entities.ExternalFacingUser;
import com.learners.service.interfaces.IUserService;

public class UserService implements IUserService {

	
	
	/**
	 * @see IUserService.create
	 */
	
	public ExternalFacingUser create(ExternalFacingUser externalFacingUser) throws Exception
	{
	
		return externalFacingUser;
	}
}

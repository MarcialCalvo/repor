/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;


/**
 * Provides a wrapper for {@link UserLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UserLocalService
 * @generated
 */
public class UserLocalServiceWrapperImpl extends UserLocalServiceWrapper {
	public UserLocalServiceWrapperImpl(UserLocalService userLocalService) {
		super(userLocalService);
	}

	/**
	* Adds the user to the database. Also notifies the appropriate model listeners.
	*
	* @param user the user
	* @return the user that was added
	* @throws SystemException if a system exception occurred
	*/
	public User addUser(User user)
		throws SystemException {
		System.out.println("HOhOOLA");
		return super.addUser(user);
	}
	
	public User createUser(long id){
		System.out.println("VA A CREAR EL ID DEL USUARIO");
		return super.createUser(id);
	}
	
	public User deleteUser(long userId) throws PortalException, SystemException {
		System.out.println("Borra usuario metodo A");
		return super.deleteUser(userId);
	}
	public User deleteUser(User user) throws PortalException, SystemException {
		System.out.println("Borra usuario metodo B");
		return super.deleteUser(user);
	}
	
	public User getUserById(long userId)
	        throws PortalException, SystemException {

//	        System.out.println(
//	            "## MyUserLocalServiceImpl.getUserById(" + userId + ")");

	        return super.getUserById(userId);
	    }

}
/**
 * 
 */
package com.learners.service.interfaces;

import com.learners.java.entities.ExternalFacingUser;

/**
 * @author amlesh
 *
 */
public interface IUserService {
	/**
	 * This method is used to create an external facing user.
	 * @param externalFacingUser The instance of the user to be created.
	 * @throws ValidationFailedException If the user name or password are empty
	 * @throws ConflictException This is thrown if the user already exists in the database
	 * for the given provider
	 * @return a user which has been created
	 */
	public ExternalFacingUser create(ExternalFacingUser externalFacingUser) throws Exception;
			


}

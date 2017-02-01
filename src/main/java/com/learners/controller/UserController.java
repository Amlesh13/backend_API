/**
 * 
 */
package com.learners.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.learners.java.entities.ExternalFacingUser;
import com.learners.service.interfaces.IUserService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

/**
 * @author amlesh
 *
 */
@Api(description="This api has controllers for User CRUD operations" ,value="User API's",basePath="/user")
@RestController
public class UserController {

	@Autowired
	IUserService userService;
	
	@ApiOperation(	value="Creates a new User entity in the system"
			,notes="The user is unique in the system, The creation date and updated "
					+ "date are automatically filled."
		 )
@ApiResponses(value={
					@ApiResponse(code=200, message="Ok")
				,	@ApiResponse(code=404, message="Not Found")
				,	@ApiResponse(code=400, message="Bad request, User name or password is empty")
				,	@ApiResponse(code=409, message="The user already exists in the system for the provider")	
				})

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public @ResponseBody ExternalFacingUser createUser(@RequestBody ExternalFacingUser externalFacingUser)
			throws Exception{
		//call the business layer

		ExternalFacingUser userReturned =  userService.create(externalFacingUser);
		return userReturned;
	}
}

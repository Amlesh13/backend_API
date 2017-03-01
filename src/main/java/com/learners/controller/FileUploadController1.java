/**
 * 
 */
package com.learners.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.learners.java.entities.ExternalFacingUser;
import com.learners.service.interfaces.IUserService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

/**
 * 
 * @author amlesh
 *
 */
@Api(description="This api has controllers for CSV File Upload operations" ,value="File Upload1",basePath="/upload1")
@RestController
public class FileUploadController1 {
	
	@Autowired
	IUserService userService;
	
	@ApiOperation(	value="upload the file in system"
			,notes="The file should be .csv format with Comma separated, The creation date and updated "
					+ "date are automatically filled."
		 )
@ApiResponses(value={
					@ApiResponse(code=200, message="Ok")
				,	@ApiResponse(code=404, message="Not Found")
				,	@ApiResponse(code=400, message="Bad request, file format is invalid")
				,	@ApiResponse(code=409, message="The file already exists in the system for the provider")	
				})
	
	@RequestMapping(value = "/upload1", method = RequestMethod.POST)
	public  ExternalFacingUser createUser(ExternalFacingUser externalFacingUser)
			throws Exception{
	
	//call the business layer
	
	ExternalFacingUser userReturned =  userService.create(externalFacingUser);
	return userReturned;
}


}

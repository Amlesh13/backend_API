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
 * @author amlesh
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
	//public @ResponseBody ExternalFacingUser createUser(@RequestBody ExternalFacingUser externalFacingUser)
		//	throws Exception{
		public  ExternalFacingUser createUser(ExternalFacingUser externalFacingUser)
				throws Exception{
		//call the business layer
		
		ExternalFacingUser userReturned =  userService.create(externalFacingUser);
		return userReturned;
	}
	
	/*@ApiOperation(value="This is Authenticates a user by passing user name, password for default provider"
					,notes="The user is unique in the system for a given provider.")
					+ "The user may passed as a user id or as DEFAULT:userId"
	manish.gupta@ilfstechnologies.com
	 @ApiResponses(value={
			@ApiResponse(code=200, message="Ok")
		,	@ApiResponse(code=404, message="Not Found")
		})
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public @ResponseBody Session authenticate(@RequestBody AuthenticationRequest 
			authenticationRequest) throws UnauthorizedException{
	
		//Call authentication service to check if user name and password are valid
		Session session = this.userService.authenticate(authenticationRequest);
		
		//now  sessionId in a cookie, header and also as response back
		super.addHeader(Constants.AuthTokenHeaderKey, session.getSessionId());
				
		super.addCookie(Constants.AuthTokenCookieKey, session.getSessionId()
				,sessionManager.getSessionTimeout());
		
		//add the user id for logging, we have to explictly do it here only in this case all other cases
		//are handeled by HttpRequestInterseptor
		super.addHeader(Constants.X_User_Id, session.getExternalFacingUser().getUserId());
		RequestThreadLocal.setRequest(
				RequestThreadLocal.getRequestId(),
				RequestThreadLocal.getHttpRequest(), 
				RequestThreadLocal.getHttpResponse(),
				session); 
		return session;
	}
*/		
	@ApiOperation( value="This is delete user method from system",notes="the user is unique in the system for user provider" )
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public  ExternalFacingUser deleteUser(ExternalFacingUser externalFacingUser)
			throws Exception{
	
		//call the business layer
	ExternalFacingUser userReturned =  userService.create(externalFacingUser);
	return userReturned;
	}
}
/**
 * 
 */
package com.learners.java.entities;

import java.io.Serializable;

import com.learners.java.entities.UpdateUserEntity;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * @author amlesh
 *
 */
@ApiModel(value="A User", description="This is a user", parent=UpdateUserEntity.class)
public class ExternalFacingUser  extends UpdateUserEntity implements Serializable {

	@ApiModelProperty(value="This is the id of the user."
			,required=true,notes="The id of the user is unique in the system, it is analogous to user name"
			)
	/**
	 * This is the user's Id, this is not the system generated Id, it is the id created
	 * by the user.
	 */
	private String userId;
	
}

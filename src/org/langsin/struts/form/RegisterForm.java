/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package org.langsin.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 04-19-2007
 * 
 * XDoclet definition:
 * @struts.form name="registerForm"
 */
public class RegisterForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** userName property */
	private String userName;

	/** userEmail property */
	private String userEmail;

	/** userPwd property */
	private String userPwd;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the userName.
	 * @return String
	 */
	public String getUserName() {
		return userName;
	}

	/** 
	 * Set the userName.
	 * @param userName The userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/** 
	 * Returns the userEmail.
	 * @return String
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/** 
	 * Set the userEmail.
	 * @param userEmail The userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/** 
	 * Returns the userPwd.
	 * @return String
	 */
	public String getUserPwd() {
		return userPwd;
	}

	/** 
	 * Set the userPwd.
	 * @param userPwd The userPwd to set
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
}
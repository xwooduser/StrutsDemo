/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package org.langsin.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.langsin.struts.form.RegisterForm;

/** 
 * MyEclipse Struts
 * Creation date: 04-19-2007
 * 
 * XDoclet definition:
 * @struts.action path="/register" name="registerForm" input="/register.jsp" parameter="method" scope="request" validate="true"
 */
public class RegisterAction extends DispatchAction {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */

	public ActionForward addUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		RegisterForm registerForm = (RegisterForm) form;// TODO Auto-generated method stub
		System.out.println("adduser");
		return null;
	}
	public ActionForward updateUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		RegisterForm registerForm = (RegisterForm) form;// TODO Auto-generated method stub
		System.out.println("updateuser");
		return null;
	}
}
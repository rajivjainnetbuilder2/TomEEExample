package com.jndi;

import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.Name;
import javax.naming.NamingException;
import javax.naming.RefAddr;
import javax.naming.Reference;
import javax.naming.spi.ObjectFactory;

public class GitObjectFactory implements ObjectFactory {

	public GitObjectFactory() {
		
	}
	
	/**
	 * This method is called by Tomcat.
	 * @param obj the Object
	 * @param name the name
	 * @param nameCtx the name context
	 * @param environment the environment
	 * @return the gitConnection.
	 */
	public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable environment) throws NamingException {
		GitConnection gitConnection = new GitConnection();
		// Customize the bean properties from our attributes
		Reference ref = (Reference) obj;
		RefAddr refAddr = ref.get("gitLocation");
		String value = (String) refAddr.getContent();
		gitConnection.setGitLocation(value);
		return gitConnection;
	}
}
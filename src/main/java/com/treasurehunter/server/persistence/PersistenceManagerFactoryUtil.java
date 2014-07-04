package com.treasurehunter.server.persistence;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

/**
 * @author Daniel Kocsis
 */
public class PersistenceManagerFactoryUtil {

	public static PersistenceManagerFactory getPersistenceManagerFactory() {
		return pmfInstance;
	}

	private static final PersistenceManagerFactory pmfInstance =
		JDOHelper.getPersistenceManagerFactory("transactions-optional");

	private PersistenceManagerFactoryUtil() {}

}

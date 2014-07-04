package com.treasurehunter.server.persistence.model;

import com.google.appengine.api.datastore.Key;
import com.treasurehunter.server.persistence.PersistenceManagerFactoryUtil;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 * @author Daniel Kocsis
 */
public class DataStoreModel {

	public Key getKey() {
		return key;
	}

	public static DataStoreModel getObjectByKey(Key key) {
		PersistenceManagerFactory pmf =
			PersistenceManagerFactoryUtil.getPersistenceManagerFactory();

		PersistenceManager persistenceManager = pmf.getPersistenceManager();

		return persistenceManager.getObjectById(DataStoreModel.class, key);
	}

	public void delete() {
		PersistenceManagerFactory pmf =
			PersistenceManagerFactoryUtil.getPersistenceManagerFactory();

		PersistenceManager persistenceManager = pmf.getPersistenceManager();

		try {
			persistenceManager.deletePersistent(this);
		}
		finally {
			persistenceManager.close();
		}
	}

	public DataStoreModel add() {
		PersistenceManagerFactory pmf =
			PersistenceManagerFactoryUtil.getPersistenceManagerFactory();

		PersistenceManager persistenceManager = pmf.getPersistenceManager();

		try {
			return persistenceManager.makePersistent(this);
		}
		finally {
			persistenceManager.close();
		}
	}

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

}

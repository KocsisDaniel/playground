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

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

}

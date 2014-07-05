package com.treasurehunter.server.persistence.dao;

import com.google.appengine.api.datastore.Key;
import com.treasurehunter.server.persistence.model.DataStoreModel;

import java.util.List;

/**
 * @author Daniel Kocsis
 */
public interface DAO<T extends DataStoreModel> {

	public T create(T model);

	public void delete(T model);

	public List<T> findAll();

	public T getModelByKey(Key key);

	public T update(T model);

}

package com.idega.location.data;


import javax.ejb.CreateException;
import javax.ejb.FinderException;
import com.idega.data.IDOFactory;

public class LocationHomeImpl extends IDOFactory implements LocationHome {

	public Class getEntityInterfaceClass() {
		return Location.class;
	}

	public Location create() throws CreateException {
		return (Location) super.createIDO();
	}

	public Location findByPrimaryKey(Object pk) throws FinderException {
		return (Location) super.findByPrimaryKeyIDO(pk);
	}
}
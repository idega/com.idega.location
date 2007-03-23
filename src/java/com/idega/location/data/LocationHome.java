package com.idega.location.data;


import javax.ejb.CreateException;
import com.idega.data.IDOHome;
import javax.ejb.FinderException;

public interface LocationHome extends IDOHome {

	public Location create() throws CreateException;

	public Location findByPrimaryKey(Object pk) throws FinderException;
}
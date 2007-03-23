package com.idega.location.data;


import com.idega.data.IDOEntity;

public interface Location extends IDOEntity {

	/**
	 * @see com.idega.location.data.LocationBMPBean#setUnit
	 */
	public void setUnit(String unit);

	/**
	 * @see com.idega.location.data.LocationBMPBean#getUnit
	 */
	public String getUnit();
}
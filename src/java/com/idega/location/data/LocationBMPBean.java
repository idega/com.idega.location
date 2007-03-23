/*
 * $Id: LocationBMPBean.java,v 1.1 2007/03/23 16:14:52 thomas Exp $
 * Created on Mar 14, 2007
 *
 * Copyright (C) 2007 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.idega.location.data;

import com.idega.data.GenericEntity;


/**
 * 
 *  Last modified: $Date: 2007/03/23 16:14:52 $ by $Author: thomas $
 * 
 * @author <a href="mailto:thomas@idega.com">thomas</a>
 * @version $Revision: 1.1 $
 */
public class LocationBMPBean extends GenericEntity implements Location {
	
	// long input fields
	private static final int LONG_INPUT_FIELD = 255;
	
	private static final String COLUMN_UNIT = "UNIT";

	/* (non-Javadoc)
	 * @see com.idega.data.GenericEntity#getEntityName()
	 */
	public String getEntityName() {
		return "loc_location";
	}

	/* (non-Javadoc)
	 * @see com.idega.data.GenericEntity#initializeAttributes()
	 */
	public void initializeAttributes() {
		addAttribute(getIDColumnName());
		addAttribute(COLUMN_UNIT, "accommodation unit", String.class, LONG_INPUT_FIELD);
	}
	
	public void setUnit(String unit) {
		setColumn(COLUMN_UNIT, unit);
	}
	
	public String getUnit() {
		return (String) getColumnValue(COLUMN_UNIT);
	}
	
}

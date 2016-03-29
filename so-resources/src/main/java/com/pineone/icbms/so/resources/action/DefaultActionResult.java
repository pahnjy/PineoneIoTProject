package com.pineone.icbms.so.resources.action;

import com.pineone.icbms.so.resources.result.AGenericResult;

/**
 * Action result class.<BR/>
 * Created by uni4love on 2015. 11. 01..
 */
public class DefaultActionResult extends AGenericResult
{
	/**
	 * status
	 */
	protected int status = SC_SUCCESS;

	/**
	 * counts
        */
	protected int counts = 0;

	/**
	* Test:
	*/ 

	@Override
	public Integer getStatus()
	{
		return status;
	}
}

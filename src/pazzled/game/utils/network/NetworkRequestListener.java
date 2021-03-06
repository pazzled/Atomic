/*******************************************************************************
 * Copyright (c) 2013 venkat@pazzled.com.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     venkat@pazzled.com - Venkat
 ******************************************************************************/
package pazzled.game.utils.network;

import org.apache.http.NameValuePair;

public interface NetworkRequestListener {

	public void onComplete(Long result, NameValuePair[] post_data);
	public NameValuePair[] getParams();
}

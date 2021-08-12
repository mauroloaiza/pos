/**
 * ************************************************************************
 * * The contents of this file are subject to the MRPL 1.2
 * * (the  "License"),  being   the  Mozilla   Public  License
 * * Version 1.1  with a permitted attribution clause; you may not  use this
 * * file except in compliance with the License. You  may  obtain  a copy of
 * * the License at http://www.floreantpos.org/license.html
 * * Software distributed under the License  is  distributed  on  an "AS IS"
 * * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * * License for the specific  language  governing  rights  and  limitations
 * * under the License.
 * * The Original Code is FLOREANT POS.
 * * The Initial Developer of the Original Code is OROCUBE LLC
 * * All portions are Copyright (C) 2015 OROCUBE LLC
 * * All Rights Reserved.
 * ************************************************************************
 */
package com.floreantpos.model;

import org.apache.commons.lang.StringUtils;

import com.floreantpos.model.base.BasePayOutTransaction;

public class PayOutTransaction extends BasePayOutTransaction {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public PayOutTransaction() {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public PayOutTransaction(java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public PayOutTransaction(java.lang.Integer id, java.lang.String transactionType, java.lang.String paymentType) {

		super(id, transactionType, paymentType);
	}

	/* [CONSTRUCTOR MARKER END] */

	@Override
	public String getTransactionType() {
		String type = super.getTransactionType();

		if (StringUtils.isEmpty(type)) {
			return TransactionType.DEBIT.name();
		}

		return type;
	}

}
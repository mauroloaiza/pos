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
package com.floreantpos.ui.views.payment;

import java.awt.Font;

import javax.swing.JLabel;

import com.floreantpos.Messages;
import com.floreantpos.ui.dialog.POSDialog;

public class PosPaymentWaitDialog extends POSDialog {

	private JLabel label;

	public PosPaymentWaitDialog() {
		setTitle(Messages.getString("PaymentProcessWaitDialog.0")); //$NON-NLS-1$

		label = new JLabel("Waiting for response from credit card Device.........."); //$NON-NLS-1$
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(label.getFont().deriveFont(Font.BOLD, 20));
		add(label);

		setSize(500, 400);
		setLocationRelativeTo(null);
	}

	public void setMessage(String msg) {
		label.setText(msg);
	}
}

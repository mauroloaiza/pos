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
/*
 * ExplorerButtonPanel.java
 *
 * Created on August 24, 2006, 7:35 PM
 */

package com.floreantpos.bo.ui.explorer;

import javax.swing.JButton;

import com.floreantpos.swing.TransparentPanel;

/**
 *
 * @author rajib
 */
public class ExplorerButtonPanel extends TransparentPanel {

	private JButton editButton, addButton, deleteButton;

	/** Creates new form ExplorerButtonPanel */
	public ExplorerButtonPanel() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc=" Generated Code ">
	private void initComponents() {

		// TransparentPanel panel = new TransparentPanel();
		editButton = new JButton();
		addButton = new JButton();
		deleteButton = new JButton();

		editButton.setText(com.floreantpos.POSConstants.EDIT);
		addButton.setText(com.floreantpos.POSConstants.ADD);
		deleteButton.setText(com.floreantpos.POSConstants.DELETE);

		add(addButton);
		add(editButton);
		add(deleteButton);
	}

	public JButton getAddButton() {
		return addButton;
	}

	public JButton getDeleteButton() {
		return deleteButton;
	}

	public JButton getEditButton() {
		return editButton;
	}

	// </editor-fold>

	// Variables declaration - do not modify
	// End of variables declaration

}

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
package com.floreantpos.config;

import java.awt.Font;

import javax.swing.UIManager;

import com.floreantpos.swing.PosUIManager;

public class UIConfig {
	public final static Font buttonFont = UIManager.getFont("Button.font").deriveFont(Font.BOLD, //$NON-NLS-1$
			PosUIManager.getDefaultFontSize());
	public final static Font largeFont = UIManager.getFont("Button.font").deriveFont(Font.BOLD, //$NON-NLS-1$
			PosUIManager.getLargeFontSize());

	public UIConfig() {
		super();
	}

	public static Font getButtonFont() {
		return buttonFont;
	}

}

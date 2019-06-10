package com.logigear.test.ta_dashboard.pom;

import com.logigear.testfw.common.BasePOM;
import com.logigear.testfw.element.Element;

public class PanelListPage extends BasePOM {

	// Element
	protected Element lnkAddNew;

	public PanelListPage(Class<?> derivedClass) {
		super(derivedClass);
	}

	@Override
	public void initPageElements() {
		this.lnkAddNew = new Element(getLocator("lnkAddNew").getBy());
	}

	/*
	 * Author: Tien Tran
	 * Method name: clickLinkAddNew()
	 * Purpose/Description: Click "Add New" on Panel List page.
	 * 
	 * */
	
	public void clickLinkAddNew() {
		lnkAddNew.waitForClickable(60).click();
	}
}

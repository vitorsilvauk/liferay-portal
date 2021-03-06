/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.portal.dbupgrade.viewsampledatalatest.tags.messageboards;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class SearchTagsTest extends BaseTestCase {
	public void testSearchTags() throws Exception {
		selenium.open("/web/tags-message-board-community/");
		loadRequiredJavaScriptModules();

		for (int second = 0;; second++) {
			if (second >= 90) {
				fail("timeout");
			}

			try {
				if (selenium.isVisible("link=Message Boards Page")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.clickAt("link=Message Boards Page",
			RuntimeVariables.replace("Message Boards Page"));
		selenium.waitForPageToLoad("30000");
		loadRequiredJavaScriptModules();
		selenium.type("//input[@id='_19_keywords1']",
			RuntimeVariables.replace("selenium1"));
		selenium.clickAt("//input[@value='Search']",
			RuntimeVariables.replace("Search"));
		selenium.waitForPageToLoad("30000");
		loadRequiredJavaScriptModules();
		assertTrue(selenium.isElementPresent("link=Message1 Tag1 Test1"));
		assertTrue(selenium.isElementNotPresent("link=Message2 Tag2 Test2"));
		assertTrue(selenium.isElementNotPresent("link=Message3 Tag3 Test3"));
		assertTrue(selenium.isElementNotPresent("link=MessageA TagA TestA"));
		assertTrue(selenium.isElementNotPresent("link=MessageB TagB TestB"));
		assertTrue(selenium.isElementNotPresent("link=MessageC TagC TestC"));

		for (int second = 0;; second++) {
			if (second >= 90) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent("link=Message Boards Page")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.clickAt("link=Message Boards Page",
			RuntimeVariables.replace("Message Boards Page"));
		selenium.waitForPageToLoad("30000");
		loadRequiredJavaScriptModules();
		selenium.type("//input[@id='_19_keywords1']",
			RuntimeVariables.replace("selenium2"));
		selenium.clickAt("//input[@value='Search']",
			RuntimeVariables.replace("Search"));
		selenium.waitForPageToLoad("30000");
		loadRequiredJavaScriptModules();
		assertTrue(selenium.isElementPresent("link=Message2 Tag2 Test2"));
		assertTrue(selenium.isElementNotPresent("link=Message1 Tag1 Test1"));
		assertTrue(selenium.isElementNotPresent("link=Message3 Tag3 Test3"));
		assertTrue(selenium.isElementNotPresent("link=MessageA TagA TestA"));
		assertTrue(selenium.isElementNotPresent("link=MessageB TagB TestB"));
		assertTrue(selenium.isElementNotPresent("link=MessageC TagC TestC"));

		for (int second = 0;; second++) {
			if (second >= 90) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent("link=Message Boards Page")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.clickAt("link=Message Boards Page",
			RuntimeVariables.replace("Message Boards Page"));
		selenium.waitForPageToLoad("30000");
		loadRequiredJavaScriptModules();
		selenium.type("//input[@id='_19_keywords1']",
			RuntimeVariables.replace("selenium3"));
		selenium.clickAt("//input[@value='Search']",
			RuntimeVariables.replace("Search"));
		selenium.waitForPageToLoad("30000");
		loadRequiredJavaScriptModules();
		assertTrue(selenium.isElementPresent("link=Message3 Tag3 Test3"));
		assertTrue(selenium.isElementNotPresent("link=Message1 Tag1 Test1"));
		assertTrue(selenium.isElementNotPresent("link=Message2 Tag2 Test2"));
		assertTrue(selenium.isElementNotPresent("link=MessageA TagA TestA"));
		assertTrue(selenium.isElementNotPresent("link=MessageB TagB TestB"));
		assertTrue(selenium.isElementNotPresent("link=MessageC TagC TestC"));

		for (int second = 0;; second++) {
			if (second >= 90) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent("link=Message Boards Page")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.clickAt("link=Message Boards Page",
			RuntimeVariables.replace("Message Boards Page"));
		selenium.waitForPageToLoad("30000");
		loadRequiredJavaScriptModules();
		selenium.type("//input[@id='_19_keywords1']",
			RuntimeVariables.replace("selenium"));
		selenium.clickAt("//input[@value='Search']",
			RuntimeVariables.replace("Search"));
		selenium.waitForPageToLoad("30000");
		loadRequiredJavaScriptModules();
		assertTrue(selenium.isElementPresent("link=MessageA TagA TestA"));
		assertTrue(selenium.isElementPresent("link=MessageB TagB TestB"));
		assertTrue(selenium.isElementPresent("link=MessageC TagC TestC"));
		assertTrue(selenium.isElementNotPresent("link=Message1 Tag1 Test1"));
		assertTrue(selenium.isElementNotPresent("link=Message2 Tag2 Test2"));
		assertTrue(selenium.isElementNotPresent("link=Message3 Tag3 Test3"));
	}
}
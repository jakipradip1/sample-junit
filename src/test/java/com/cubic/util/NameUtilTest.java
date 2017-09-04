package com.cubic.util;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.cubic.accounts.Account;
import com.cubic.accounts.Billing;

//@Ignore to ignore the whole class
public class NameUtilTest {
	private NameUtil nameUtil = new NameUtil();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Category(Account.class)
	@Test
	public void testGetFormattedName() {
		String formattedName = nameUtil.getFormattedName("Dipendra", "Chaudaury");
		assertTrue(formattedName.equals("Dipendra Chaudaury"));
		assertNotNull(formattedName);
		assertThat(formattedName, containsString("Dipendra"));
		assertThat(formattedName, allOf(containsString("Dipendra"), containsString("Chaudau")));
		assertThat(formattedName, anyOf(containsString("Dipendra"), containsString("false")));

		formattedName = nameUtil.getFormattedName("", "Chaudaury");
		assertTrue(formattedName.equals("Chaudaury"));

		formattedName = nameUtil.getFormattedName("Dipendra", "");
		assertTrue(formattedName.equals("Dipendra"));

		formattedName = nameUtil.getFormattedName("", "");
		assertTrue(formattedName.equals(""));
		// assertNull(formattedName);
	}

	@Category(Billing.class)
	@Test
	public void testGetFormattedNullFirstName() {
		String formattedName = nameUtil.getFormattedName(null, "Chaudaury");
		assertNotNull(formattedName);
		assertTrue(formattedName.equals("Chaudaury"));

	}

	@Test
	public void testGetFormattedNullLastName() {
		String formattedName = nameUtil.getFormattedName("Dipendra", null);
		assertNotNull(formattedName);
		assertTrue(formattedName.equals("Dipendra"));

	}

	// ignoring this test case
	@Ignore
	@Test
	public void testGetFormattedNullLastName2() {
		String formattedName = nameUtil.getFormattedName("Dipendra", null);
		assertNotNull(formattedName);
		assertTrue(formattedName.equals(""));

	}

}

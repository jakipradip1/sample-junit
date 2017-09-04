package com.cubic.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.cubic.accounts.Account;
import com.cubic.accounts.Billing;

public class MathUtilTest {
	private MathUtil mathUtil = new MathUtil();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("SetUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Category(Account.class)
	@Test
	public void testAdd() {
		System.out.println("testAdd");
		int result = mathUtil.add(2, 3);
		assertEquals(result, 5);
		result = mathUtil.add(-2, -5);
		assertEquals(result, -7);
		result = mathUtil.add(-2, 5);
		assertEquals(result, 3);
		result = mathUtil.add(2, -5);
		assertEquals(result, -3);
	}

	@Category(Billing.class)

	@Test
	public void testSub() {
		System.out.println("testAdd");
		int result = mathUtil.sub(3, 2);
		assertEquals(result, 1);
	}

	@Category({ Account.class, Billing.class })
	@Test
	public void testDiv() {
		System.out.println("testAdd");
		int result = mathUtil.div(4, 2);
		assertEquals(result, 2);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivByZero() {
		System.out.println("testDivByZero");
		mathUtil.div(4, 0);
	}

	@Test
	public void testMul() {
		System.out.println("testAdd");
		int result = mathUtil.mul(3, 2);
		assertEquals(result, 6);
	}

	@Test(timeout = 500)
	public void testTimeOut() {
		System.out.println("testTimeOut");
		try {
			Thread.sleep(400); // sucess
			// Thread.sleep(600); //fail

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}

}

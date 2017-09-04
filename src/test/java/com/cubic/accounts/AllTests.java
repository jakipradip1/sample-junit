package com.cubic.accounts;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.cubic.util.MathUtilTest;
import com.cubic.util.NameUtilTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ SuiteA.class, NameUtilTest.class })
public class AllTests {

}

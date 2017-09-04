package com.cubic.accounts;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@IncludeCategory(Account.class)
@Suite.SuiteClasses(AllTests.class)
public class AccountTest {

}

package io.github.brunobaiano;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

//only run tests with the UnitTest tag
@Suite
@SelectPackages("io.github.brunobaiano")
@IncludeTags("UnitTest")
public class UnitTestSuite {
}

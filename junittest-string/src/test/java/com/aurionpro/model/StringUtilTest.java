package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class StringUtilTest {

	StringUtil util = new StringUtil();

	@Test
	@DisplayName("Removing AA")
	void testTruncateAInFirst2Place_AA() {
		String Expected = "BC";
		String Actual = util.truncateAInFirst2Place("aaBC");
		assertEquals(Expected, Actual);
	}
	
	@Test
	@DisplayName("Removing A")
	void testTruncateAInFirst2Place_A() {
		String Expected = "BC";
		String Actual = util.truncateAInFirst2Place("aBC");
		assertEquals(Expected, Actual);
	}
	
	@Test
	@DisplayName("Removing A second index")
	void testTruncateAInFirst2Place_BA() {
		String Expected = "BBC";
		String Actual = util.truncateAInFirst2Place("BaBC");
		assertEquals(Expected, Actual);
	}
	
	@Test
	@DisplayName("Check First and last Two char equal")
	void testfirstAndLastTWoCharEqual() {
		boolean Expected = true;
		boolean Actual = util.firstAndLastTWoCharEqual("ABCDab");
		assertEquals(Expected, Actual);
	}
	
	
	

}
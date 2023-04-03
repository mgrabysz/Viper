package org.example.token;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TokenTypeTest {

	@Test
	void tokenKeywordTest() {
		Assertions.assertEquals("klasa", TokenType.CLASS.getKeyword());
		Assertions.assertEquals("jeżeli", TokenType.IF.getKeyword());
		Assertions.assertNull(TokenType.END_OF_FILE.getKeyword());
	}
}
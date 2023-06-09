package org.example.commons;

import lombok.experimental.UtilityClass;
import org.example.programstructure.expression.enums.AdditiveType;
import org.example.programstructure.expression.enums.MultiplicativeType;
import org.example.programstructure.expression.enums.RelationalType;
import org.example.token.TokenType;

import java.util.*;
import java.util.stream.Stream;

import static org.example.token.TokenType.*;

@UtilityClass
public class TokenGroups {

    /*
    * Map of keywords mapping keywords to token types
    * e.g. "klasa": CLASS (polish config)
    *      "zwróć": RETURN
    */
    public static final Map<String, TokenType> KEYWORDS = new HashMap<>();
    static {
        Stream.of(RETURN, FOR, IN, IF, ELSE, CLASS, THIS, AND, OR, NOT)
				.forEach(tokenType -> KEYWORDS.put(tokenType.getKeyword(), tokenType));
    }

    public static final Map<String, TokenType> BOOL_LITERALS = new HashMap<>();
	static {
		Stream.of(TRUE, FALSE)
				.forEach(tokenType -> BOOL_LITERALS.put(tokenType.getKeyword(), tokenType));
	}

    public static final Map<String, TokenType> SYMBOLS = new HashMap<>();
    static {
        Stream.of(
				COMMENT, SEMICOLON, COMA, DOT,										// general symbols
				OPEN_BRACKET, CLOSE_BRACKET, OPEN_PARENTHESIS, CLOSE_PARENTHESIS, 	// parenthesis
				ASSIGN, ADD_AND_ASSIGN, SUBTRACT_AND_ASSIGN,						// assignment
				EQUAL, NOT_EQUAL, GREATER, LESS, GREATER_OR_EQUAL, LESS_OR_EQUAL,	// relation
				ADD, SUBTRACT, MULTIPLY, DIVIDE)									// math
				.forEach(tokenType -> SYMBOLS.put(tokenType.getKeyword(), tokenType));
    }

	public static final Map<TokenType, RelationalType> RELATIONAL_OPERATORS = Map.of(
			EQUAL, RelationalType.EQUAL,
			NOT_EQUAL, RelationalType.NOT_EQUAL,
			GREATER, RelationalType.GREATER,
			LESS, RelationalType.LESS,
			GREATER_OR_EQUAL, RelationalType.GREATER_OR_EQUAL,
			LESS_OR_EQUAL, RelationalType.LESS_OR_EQUAL
	);

	public static final Map<TokenType, AdditiveType> ADDITIVE_OPERATORS = Map.of(
			ADD, AdditiveType.ADD,
			SUBTRACT, AdditiveType.SUBTRACT
	);

	public static final Map<TokenType, MultiplicativeType> MULTIPLICATIVE_OPERATORS = Map.of(
			MULTIPLY, MultiplicativeType.MULTIPLY,
			DIVIDE, MultiplicativeType.DIVIDE
	);

}

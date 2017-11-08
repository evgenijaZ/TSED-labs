package com.lab111.labwork8_1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Parses the string with tokens
 */
class TokenReader {
    /**
     * recursively passes through all tokens
     *
     * @param tokenString string to parsing
     * @return result expression
     */
    Expression readToken(String tokenString) {
        String[] tokenList = tokenString.split(" ");
        ArrayList <String> arrayList = new ArrayList <String>(Arrays.asList(tokenList));
        return readNextToken(arrayList);
    }

    /**
     * reads the next token
     *
     * @param tokenList list of tokens
     * @return next expression
     */
    private Expression readNextToken(ArrayList <String> tokenList) {
        if (tokenList == null) return null;
        else {
            String token = tokenList.get(0);
            if (tryParseInt(token)) {
                tokenList.remove(0);
                return new ConstantExpression(Integer.parseInt(token));
            } else {
                if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
                    tokenList.remove(0);
                    return new VariableExpression(token);
                }
            }
            return readNonTerminal(tokenList);
        }
    }

    /**
     * read non terminal token
     *
     * @param tokenList list of tokens
     * @return non terminal expression
     */
    private Expression readNonTerminal(ArrayList <String> tokenList) {
        if (tokenList == null) return null;

        String token = tokenList.get(0);
        tokenList.remove(0);
        Expression left = readNextToken(tokenList);
        Expression right = readNextToken(tokenList);

        switch (token) {
            case "+":
                return new PlusExpression(left, right);
            case "-":
                return new MinusExpression(left, right);
            case "*":
                return new MultiplyExpression(left, right);
            case "/":
                return new DivideExpression(left, right);
            default: {
                System.out.println("Invalid token:" + token);
                return null;
            }
        }

    }


    private boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

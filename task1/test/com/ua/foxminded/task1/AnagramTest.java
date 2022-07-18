package com.ua.foxminded.task1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    Anagram anagram = new Anagram();
    @Test
    void splitStringByWords_shouldReturnNullPointerException_whenInputIsNull() {

        String expected = "Null is forbidden";

        Exception actual = assertThrows(
              NullPointerException.class,
                () -> { throw new NullPointerException("Null is forbidden"); }
        );
        assertEquals(expected, actual.getMessage());
    }

    @Test
    void splitStringByWords_shouldReturnEmptyString_whenInputIsEmptyString() {

        String expected = "";
        String actual = anagram.splitStringByWords("");

        assertEquals(expected, actual);
    }

    @Test
    void splitStringByWords_shouldReturnSingleSpace_whenInputIsSingleSpace() {

        String expected = " ";
        String actual = anagram.splitStringByWords(" ");

        assertEquals(expected, actual);
    }

    @Test
    void splitStringByWords_shouldReturnSeveralSpaces_whenInputIsSeveralSpaces() {

        String expected = "   ";
        String actual = anagram.splitStringByWords("   ");

        assertEquals(expected, actual);
    }

    @Test
    void splitStringByWords_shouldReturnOneLetter_whenInputIsOneLetter() {

        String expected = "x";
        String actual = anagram.splitStringByWords("x");

        assertEquals(expected, actual);
    }

    @Test
    void splitStringByWords_shouldReturnSameLetters_whenInputIsIdenticalLetters() {

        String expected = "aaa";
        String actual = anagram.splitStringByWords("aaa");

        assertEquals(expected, actual);
    }

    @Test
    void splitStringByWords_shouldReturnReverseString_whenInputIsUpperAndLowerCaseLetters() {

        String expected = "aAaAaA";
        String actual = anagram.splitStringByWords("AaAaAa");

        assertEquals(expected, actual);
    }

    @Test
    void splitStringByWords_shouldReturnReverseWord_whenInputIsAWord() {

        String expected = "drowtseT";
        String actual = anagram.splitStringByWords("Testword");

        assertEquals(expected, actual);
    }

    @Test
    void splitStringByWords_shouldReturnNotReversedString_whenInputOnlySymbols() {

        String expected = "\"&?*+-\\";
        String actual = anagram.splitStringByWords("\"&?*+-\\");

        assertEquals(expected, actual);
    }

    @Test
    void splitStringByWords_shouldReturnReversedEachWord_whenInputNumberOfWords() {

        String expected = "tsrif tset drow dnoces tset drow";
        String actual = anagram.splitStringByWords("first test word second test word");

        assertEquals(expected, actual);
    }

    @Test
    void splitStringByWords_shouldReturnReversedWordSymbolOnSamePlace_whenInputWordAndSymbol() {

        String expected = "tseT!";
        String actual = anagram.splitStringByWords("Test!");

        assertEquals(expected, actual);
    }

    @Test
    void splitStringByWords_shouldReturnReversedWordsSymbolsOnSamePlace_whenInputMultiplyWordsAndSymbols() {

        String expected = "tsrif? tset! drow&";
        String actual = anagram.splitStringByWords("first? test! word&");

        assertEquals(expected, actual);
    }

    @Test
    void splitStringByWords_shouldReturnNumber_whenInputIsOneNumber() {

        String expected = "1";
        String actual = anagram.splitStringByWords("1");

        assertEquals(expected, actual);
    }

    @Test
    void splitStringByWords_shouldReturnNumbersOnTheSamePlace_whenInputMultiplyNumbers() {

        String expected = "123";
        String actual = anagram.splitStringByWords("123");

        assertEquals(expected, actual);
    }

    @Test
    void splitStringByWords_shouldReturnReversLettersNumberOnTheSamePlace_whenInputIsLettersAndNumbers() {

        String expected = "tset123";
        String actual = anagram.splitStringByWords("test123");

        assertEquals(expected, actual);
    }

}

package com.ua.foxminded.task1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void splitStringByWords_shouldReturnNullPointerException_whenInputIsNull() {

        Anagram anagram = new Anagram();
        assertThrows(NullPointerException.class, () -> {

        anagram.splitStringByWords(null);
        });

    }

    @Test
    void splitStringByWords_shouldReturnEmptyString_whenInputIsEmptyString() {

        Anagram anagram = new Anagram();
        assertEquals("", anagram.splitStringByWords(""));
    }

    @Test
    void splitStringByWords_shouldReturnSingleSpace_whenInputIsSingleSpace() {

        Anagram anagram = new Anagram();
        assertEquals(" ", anagram.splitStringByWords(" "));
    }

    @Test
    void splitStringByWords_shouldReturnSeveralSpaces_whenInputIsSeveralSpaces() {

        Anagram anagram = new Anagram();
        assertEquals("  ", anagram.splitStringByWords("  "));
    }

    @Test
    void splitStringByWords_shouldReturnOneLetter_whenInputIsOneLetter() {

        Anagram anagram = new Anagram();
        assertEquals("x", anagram.splitStringByWords("x"));
    }

    @Test
    void splitStringByWords_shouldReturnSameLetters_whenInputIsIdenticalLetters() {

        Anagram anagram = new Anagram();
        assertEquals("aaa", anagram.splitStringByWords("aaa"));
    }

    @Test
    void splitStringByWords_shouldReturnReverseString_whenInputIsUpperAndLowerCaseLetters() {

        Anagram anagram = new Anagram();
        assertEquals("aAaAaA", anagram.splitStringByWords("AaAaAa"));
    }

    @Test
    void splitStringByWords_shouldReturnReverseWord_whenInputIsAWord() {

        Anagram anagram = new Anagram();
        assertEquals("Testword", anagram.splitStringByWords("drowtseT"));
    }

    @Test
    void splitStringByWords_shouldReturnNotReversedString_whenInputOnlySymbols() {

        Anagram anagram = new Anagram();
        assertEquals("\"&?*+-\\", anagram.splitStringByWords("\"&?*+-\\"));
    }

    @Test
    void splitStringByWords_shouldReturnReversedEachWord_whenInputNumberOfWords() {

        Anagram anagram = new Anagram();
        assertEquals("first test word second test word", anagram.splitStringByWords("tsrif tset drow dnoces tset drow"));
    }

    @Test
    void splitStringByWords_shouldReturnReversedWordSymbolOnSamePlace_whenInputWordAndSymbol() {

        Anagram anagram = new Anagram();
        assertEquals("Test!", anagram.splitStringByWords("tseT!"));
    }

    @Test
    void splitStringByWords_shouldReturnReversedWordsSymbolsOnSamePlace_whenInputMultiplyWordsAndSymbols() {

        Anagram anagram = new Anagram();
        assertEquals("first? test! word&", anagram.splitStringByWords("tsrif? tset! drow&"));
    }

    @Test
    void splitStringByWords_shouldReturnNumber_whenInputIsOneNumber() {

        Anagram anagram = new Anagram();
        assertEquals("1", anagram.splitStringByWords("1"));
    }

    @Test
    void splitStringByWords_shouldReturnNumbersOnTheSamePlace_whenInputMultiplyNumbers() {

        Anagram anagram = new Anagram();
        assertEquals("123", anagram.splitStringByWords("123"));
    }

    @Test
    void splitStringByWords_shouldReturnReversLettersNumberOnTheSamePlace_whenInputIsLettersAndNumbers() {

        Anagram anagram = new Anagram();
        assertEquals("test123", anagram.splitStringByWords("tset123"));
    }

}

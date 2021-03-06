package com.trickyrat.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class UniqueMorseRepresentationsTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("getData")
    public void test(String[] words, int expect) {
        int actual = solution.uniqueMorseRepresentations(words);
        Assertions.assertEquals(expect, actual);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.arguments(new String[]{"gin", "zen", "gig", "msg"}, 2),
                Arguments.arguments(new String[]{"a"}, 1));
    }
}

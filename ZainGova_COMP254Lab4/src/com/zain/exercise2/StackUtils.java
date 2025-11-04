package com.zain.exercise2;

public class StackUtils {
    private StackUtils() {}

    public static <E> void transfer(Stack <E> S, Stack<E> T) {
        while (!S.isEmpty()) {
            T.push(S.pop());
        }
    }
}

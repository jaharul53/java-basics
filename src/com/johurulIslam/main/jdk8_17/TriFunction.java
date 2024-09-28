package com.johurulIslam.main.jdk8_17;

@FunctionalInterface
public interface TriFunction<A, B, C, D> {
    D apply(A a, B b, C c);
}

package dev.sirdir;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public class WithBeforeEachTest {

    @Container
    public GenericContainer alpine = new GenericContainer("alpine:latest");

    @BeforeEach
    void setupPerTest() {
        System.out.println(this.getClass().getSimpleName() + " BeforeEach " + alpine.isRunning());
    }

    @Test
    void test3() {
        System.out.println(this.getClass().getSimpleName() + " test3 " + alpine.isRunning());
    }

    @Test
    void test4() {
        System.out.println(this.getClass().getSimpleName() + " test4 " + alpine.isRunning());
    }
}

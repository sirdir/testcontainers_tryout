package dev.sirdir;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Testcontainers
public class PerClass {

    @Container
    public GenericContainer<?> alpine = new GenericContainer("alpine:latest").withCommand("sleep 10");

    @Test
    void test1() {
        System.out.println(alpine.isRunning());
    }

    @Test
    void test2() {
        System.out.println(alpine.isRunning());
    }
}

package dev.sirdir;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@Testcontainers
public class PerMethod {

    @Container
    public GenericContainer<?> nginx = new GenericContainer("nginx:latest");

    @Test
    void test1() {
        System.out.println(nginx.isRunning());
    }

    @Test
    void test2() {
        System.out.println(nginx.isRunning());
    }
}

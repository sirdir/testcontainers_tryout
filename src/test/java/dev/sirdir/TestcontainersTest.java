package dev.sirdir;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public class TestcontainersTest {

    @Container
    public GenericContainer alpine = new GenericContainer("alpine:latest");

    @Test
    void test1() {
        System.out.println(this.getClass().getSimpleName() + " test1 " + alpine.isRunning());
    }

    @Test
    void test2() {
        System.out.println(this.getClass().getSimpleName() + " test2 " + alpine.isRunning());
    }

}

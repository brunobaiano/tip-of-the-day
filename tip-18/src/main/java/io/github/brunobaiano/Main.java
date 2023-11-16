package io.github.brunobaiano;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import java.util.HashMap;

@QuarkusMain
public class Main {
    public static void main(String... args)  {
        System.out.println("Running main method");
        Quarkus.run(args);
    }
}
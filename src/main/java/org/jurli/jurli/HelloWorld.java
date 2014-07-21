package org.jurli.jurli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nonnull;

public final class HelloWorld {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(final String[] args) {
        LOGGER.info("Printing message");

        System.out.println(
                getMessage()
        );
    }

    @Nonnull
    private static String getMessage() {
        return "Hello world!";
    }

}

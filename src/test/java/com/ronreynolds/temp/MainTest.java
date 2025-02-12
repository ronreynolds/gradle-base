package com.ronreynolds.temp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class MainTest {

    @Test
    void getMessage() {
        assertThat(assertDoesNotThrow(Main::getMessage)).isEqualTo("hello!");
    }
}
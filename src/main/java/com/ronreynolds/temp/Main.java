package com.ronreynolds.temp;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("message:{}", getMessage());
    }

    public static String getMessage() {
        return "hello!";
    }
}

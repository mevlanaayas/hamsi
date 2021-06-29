package com.trendyol.javasonartest;

import org.springframework.stereotype.Service;

@Service
public class ServiceToBeUnusedAfterRefactoring {

    public void get() {
        System.out.println("xd");
    }
}

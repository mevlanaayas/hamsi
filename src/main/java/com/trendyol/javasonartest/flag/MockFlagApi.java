package com.trendyol.javasonartest.flag;

import org.springframework.stereotype.Service;

@Service
public class MockFlagApi implements FlagApi {

    public boolean flagEnabled(Toggle toggle) {
        return true;
    }
}

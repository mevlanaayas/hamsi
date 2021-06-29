package com.trendyol.javasonartest;

import com.trendyol.javasonartest.flag.FlagApi;
import com.trendyol.javasonartest.flag.Toggle;
import org.springframework.stereotype.Service;

@Service
public class ServiceToBeRefactored {

    private final FlagApi flagApi;
    private final MixedService mixedService;
    private final ServiceToBeUsedAfterRefactoring serviceToBeUsedAfterRefactoring;
    private final ServiceToBeUnusedAfterRefactoring serviceToBeUnusedAfterRefactoring;

    public ServiceToBeRefactored(FlagApi flagApi,
                                 MixedService mixedService,
                                 ServiceToBeUsedAfterRefactoring serviceToBeUsedAfterRefactoring,
                                 ServiceToBeUnusedAfterRefactoring serviceToBeUnusedAfterRefactoring) {
        this.flagApi = flagApi;
        this.mixedService = mixedService;
        this.serviceToBeUsedAfterRefactoring = serviceToBeUsedAfterRefactoring;
        this.serviceToBeUnusedAfterRefactoring = serviceToBeUnusedAfterRefactoring;
    }

    public void zoo() {
        if (flagApi.flagEnabled(Toggle.ENABLE_X)) {
            System.out.println("Hello world");
            serviceToBeUsedAfterRefactoring.get();
            mixedService.getUsed();
        } else {
            serviceToBeUnusedAfterRefactoring.get();
            mixedService.getUnused();
            System.out.println("Hi World");
        }
    }
}

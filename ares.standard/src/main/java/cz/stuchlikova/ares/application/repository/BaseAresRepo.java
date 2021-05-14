package cz.stuchlikova.ares.application.repository;

import cz.stuchlikova.ares.application.exceptions.ApiRateExceededException;
import cz.stuchlikova.ares.application.service.AresService;

public abstract class BaseAresRepo {




    synchronized void checkRateLimit(AresService.CallCounter callCounter) {
        if (callCounter.isNotFromInterval()) {
            callCounter.init();
        }
        long count = callCounter.incrementAndGet();
        if (count > callCounter.getLimit()) {
            throw new ApiRateExceededException("Too many API requests");
        }
    }
}

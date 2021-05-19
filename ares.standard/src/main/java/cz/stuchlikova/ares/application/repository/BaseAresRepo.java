package cz.stuchlikova.ares.application.repository;

import cz.stuchlikova.ares.application.exceptions.ApiRateExceededException;
import cz.stuchlikova.ares.application.service.AresService;

public abstract class BaseAresRepo {



    synchronized void checkRateLimit(AresService.CallCounter callCounter) {
        callCounter.checkOrThrow();//(() -> new ApiRateExceededException("Too many API requests"));
    }
}

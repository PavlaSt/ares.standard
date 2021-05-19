package cz.stuchlikova.ares.application.repository;

import cz.stuchlikova.ares.application.service.CallCounter;

public abstract class BaseAresRepo {



    synchronized void checkRateLimit(CallCounter callCounter) {
        callCounter.checkOrThrow();
    }
}

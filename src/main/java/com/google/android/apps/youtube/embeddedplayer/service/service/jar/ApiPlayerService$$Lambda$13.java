package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.ConditionVariable;
import java.util.concurrent.atomic.AtomicBoolean;

final /* synthetic */ class ApiPlayerService$$Lambda$13 implements Runnable {
    private final ApiPlayerService a;
    private final AtomicBoolean b;
    private final ConditionVariable c;

    ApiPlayerService$$Lambda$13(ApiPlayerService apiPlayerService, AtomicBoolean atomicBoolean, ConditionVariable conditionVariable) {
        this.a = apiPlayerService;
        this.b = atomicBoolean;
        this.c = conditionVariable;
    }

    public final void run() {
        ApiPlayerService apiPlayerService = this.a;
        AtomicBoolean atomicBoolean = this.b;
        ConditionVariable conditionVariable = this.c;
        atomicBoolean.set(apiPlayerService.a.k());
        conditionVariable.open();
    }
}

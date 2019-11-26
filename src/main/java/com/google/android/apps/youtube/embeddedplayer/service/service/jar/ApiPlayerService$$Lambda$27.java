package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.ConditionVariable;
import java.util.concurrent.atomic.AtomicReference;

final /* synthetic */ class ApiPlayerService$$Lambda$27 implements Runnable {
    private final ApiPlayerService a;
    private final AtomicReference b;
    private final ConditionVariable c;

    ApiPlayerService$$Lambda$27(ApiPlayerService apiPlayerService, AtomicReference atomicReference, ConditionVariable conditionVariable) {
        this.a = apiPlayerService;
        this.b = atomicReference;
        this.c = conditionVariable;
    }

    public final void run() {
        ApiPlayerService apiPlayerService = this.a;
        AtomicReference atomicReference = this.b;
        ConditionVariable conditionVariable = this.c;
        atomicReference.set(apiPlayerService.a.o());
        conditionVariable.open();
    }
}

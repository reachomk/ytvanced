package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.ConditionVariable;

final /* synthetic */ class ApiPlayerService$$Lambda$12 implements Runnable {
    private final ApiPlayerService a;
    private final ConditionVariable b;

    ApiPlayerService$$Lambda$12(ApiPlayerService apiPlayerService, ConditionVariable conditionVariable) {
        this.a = apiPlayerService;
        this.b = conditionVariable;
    }

    public final void run() {
        ApiPlayerService apiPlayerService = this.a;
        ConditionVariable conditionVariable = this.b;
        apiPlayerService.a.j();
        conditionVariable.open();
    }
}

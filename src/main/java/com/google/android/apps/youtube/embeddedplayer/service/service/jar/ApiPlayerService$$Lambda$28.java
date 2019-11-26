package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.ConditionVariable;
import defpackage.ajcp;

final /* synthetic */ class ApiPlayerService$$Lambda$28 implements Runnable {
    private final ApiPlayerService a;
    private final ajcp b;
    private final ConditionVariable c;

    ApiPlayerService$$Lambda$28(ApiPlayerService apiPlayerService, ajcp ajcp, ConditionVariable conditionVariable) {
        this.a = apiPlayerService;
        this.b = ajcp;
        this.c = conditionVariable;
    }

    public final void run() {
        ApiPlayerService apiPlayerService = this.a;
        ajcp ajcp = this.b;
        ConditionVariable conditionVariable = this.c;
        apiPlayerService.a.a(ajcp);
        conditionVariable.open();
    }
}

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.view.KeyEvent;

final /* synthetic */ class ApiPlayerService$$Lambda$25 implements Runnable {
    private final ApiPlayerService a;
    private final int b;
    private final KeyEvent c;

    ApiPlayerService$$Lambda$25(ApiPlayerService apiPlayerService, int i, KeyEvent keyEvent) {
        this.a = apiPlayerService;
        this.b = i;
        this.c = keyEvent;
    }

    public final void run() {
        ApiPlayerService apiPlayerService = this.a;
        apiPlayerService.a.a(this.b, this.c);
    }
}

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

final /* synthetic */ class ApiPlayerService$$Lambda$14 implements Runnable {
    private final ApiPlayerService a;
    private final boolean b;

    ApiPlayerService$$Lambda$14(ApiPlayerService apiPlayerService, boolean z) {
        this.a = apiPlayerService;
        this.b = z;
    }

    public final void run() {
        this.a.a(this.b);
    }
}

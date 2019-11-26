package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

final /* synthetic */ class ApiPlayerService$$Lambda$17 implements Runnable {
    private final ApiPlayerService a;
    private final int b;

    ApiPlayerService$$Lambda$17(ApiPlayerService apiPlayerService, int i) {
        this.a = apiPlayerService;
        this.b = i;
    }

    public final void run() {
        ApiPlayerService apiPlayerService = this.a;
        apiPlayerService.a.a(this.b);
    }
}

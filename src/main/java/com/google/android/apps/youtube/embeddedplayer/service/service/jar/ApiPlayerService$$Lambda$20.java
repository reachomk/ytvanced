package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

final /* synthetic */ class ApiPlayerService$$Lambda$20 implements Runnable {
    private final ApiPlayerService a;
    private final boolean b;

    ApiPlayerService$$Lambda$20(ApiPlayerService apiPlayerService, boolean z) {
        this.a = apiPlayerService;
        this.b = z;
    }

    public final void run() {
        ApiPlayerService apiPlayerService = this.a;
        apiPlayerService.a.a(this.b);
    }
}

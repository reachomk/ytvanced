package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

final /* synthetic */ class ApiPlayerService$$Lambda$0 implements Runnable {
    private final ApiPlayerService a;
    private final String b;
    private final int c;
    private final int d;

    ApiPlayerService$$Lambda$0(ApiPlayerService apiPlayerService, String str, int i, int i2) {
        this.a = apiPlayerService;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public final void run() {
        ApiPlayerService apiPlayerService = this.a;
        apiPlayerService.a.a(this.b, this.c, this.d);
    }
}

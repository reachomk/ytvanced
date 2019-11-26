package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

final /* synthetic */ class ApiPlayerService$$Lambda$4 implements Runnable {
    private final ApiPlayerService a;
    private final String b;
    private final int c;
    private final int d;
    private final int e;

    ApiPlayerService$$Lambda$4(ApiPlayerService apiPlayerService, String str, int i, int i2, int i3) {
        this.a = apiPlayerService;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final void run() {
        ApiPlayerService apiPlayerService = this.a;
        apiPlayerService.a.a(this.b, this.c, this.d, this.e);
    }
}

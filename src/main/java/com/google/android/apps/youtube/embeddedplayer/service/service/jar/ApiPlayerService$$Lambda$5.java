package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

final /* synthetic */ class ApiPlayerService$$Lambda$5 implements Runnable {
    private final ApiPlayerService a;
    private final String b;
    private final int c;
    private final int d;
    private final boolean e;
    private final int f;

    ApiPlayerService$$Lambda$5(ApiPlayerService apiPlayerService, String str, int i, int i2, boolean z, int i3) {
        this.a = apiPlayerService;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = i3;
    }

    public final void run() {
        ApiPlayerService apiPlayerService = this.a;
        apiPlayerService.a.a(this.b, this.c, this.d, this.e, this.f);
    }
}

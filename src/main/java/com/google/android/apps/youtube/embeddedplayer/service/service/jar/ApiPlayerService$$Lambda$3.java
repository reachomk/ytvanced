package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

final /* synthetic */ class ApiPlayerService$$Lambda$3 implements Runnable {
    private final ApiPlayerService a;
    private final String b;
    private final boolean c;
    private final int d;
    private final boolean e;
    private final int f;

    ApiPlayerService$$Lambda$3(ApiPlayerService apiPlayerService, String str, boolean z, int i, boolean z2, int i2) {
        this.a = apiPlayerService;
        this.b = str;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = i2;
    }

    public final void run() {
        ApiPlayerService apiPlayerService = this.a;
        apiPlayerService.a.a(this.b, this.c, this.d, this.e, this.f);
    }
}

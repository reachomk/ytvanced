package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import defpackage.mmj;

final /* synthetic */ class ApiPlayerService$$Lambda$1 implements Runnable {
    private final ApiPlayerService a;
    private final String b;

    ApiPlayerService$$Lambda$1(ApiPlayerService apiPlayerService, String str) {
        this.a = apiPlayerService;
        this.b = str;
    }

    public final void run() {
        ApiPlayerService apiPlayerService = this.a;
        apiPlayerService.a.a.a(this.b, new mmj());
    }
}

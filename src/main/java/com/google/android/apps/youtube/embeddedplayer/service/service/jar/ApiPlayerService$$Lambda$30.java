package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.ConditionVariable;
import defpackage.aiqq;
import defpackage.ajcp;
import defpackage.mmk;
import defpackage.ngx;

final /* synthetic */ class ApiPlayerService$$Lambda$30 implements Runnable {
    private final ApiPlayerService a;
    private final ngx b;
    private final ConditionVariable c;

    ApiPlayerService$$Lambda$30(ApiPlayerService apiPlayerService, ngx ngx, ConditionVariable conditionVariable) {
        this.a = apiPlayerService;
        this.b = ngx;
        this.c = conditionVariable;
    }

    public final void run() {
        ApiPlayerService apiPlayerService = this.a;
        ngx ngx = this.b;
        ConditionVariable conditionVariable = this.c;
        mmk mmk = apiPlayerService.a;
        if (ngx != null) {
            ApiPlayerStateCache apiPlayerStateCache = mmk.f;
            int i = ngx.b;
            ajcp ajcp = apiPlayerStateCache.a;
            ajcp ajcp2 = null;
            if (ajcp != null && i == ajcp.hashCode()) {
                ajcp2 = apiPlayerStateCache.a;
            }
            if (ajcp2 != null) {
                mmk.a(ajcp2);
            } else {
                aiqq aiqq = ngx.c;
                if (aiqq != null) {
                    mmk.a(aiqq, ngx.a, mmk.e);
                }
            }
        }
        conditionVariable.open();
    }
}

package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.ConditionVariable;
import defpackage.aiqq;
import defpackage.ajcp;
import defpackage.ajmq;
import defpackage.mmk;
import defpackage.ngx;
import defpackage.nip;
import java.util.concurrent.atomic.AtomicReference;

final /* synthetic */ class ApiPlayerService$$Lambda$29 implements Runnable {
    private final ApiPlayerService a;
    private final AtomicReference b;
    private final ConditionVariable c;

    ApiPlayerService$$Lambda$29(ApiPlayerService apiPlayerService, AtomicReference atomicReference, ConditionVariable conditionVariable) {
        this.a = apiPlayerService;
        this.b = atomicReference;
        this.c = conditionVariable;
    }

    public final void run() {
        ApiPlayerService apiPlayerService = this.a;
        AtomicReference atomicReference = this.b;
        ConditionVariable conditionVariable = this.c;
        mmk mmk = apiPlayerService.a;
        ajcp o = mmk.o();
        int hashCode = o != null ? o.hashCode() : 0;
        mmk.f.a = o;
        aiqq aiqq = mmk.d;
        if (aiqq != null) {
            aiqq = aiqq.s().b();
            ajmq q = mmk.g.q();
            if (q != null) {
                aiqq.a(q.d());
            }
        } else {
            aiqq = null;
        }
        nip nip = mmk.b;
        boolean z = true;
        if (nip.a == null && !nip.b) {
            z = false;
        }
        atomicReference.set(new ngx(hashCode, aiqq, z));
        conditionVariable.open();
    }
}

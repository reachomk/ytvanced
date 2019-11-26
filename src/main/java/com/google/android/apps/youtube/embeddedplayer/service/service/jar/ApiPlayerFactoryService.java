package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService.Stub;
import defpackage.amkt;
import defpackage.amqw;
import defpackage.mlp;
import defpackage.myy;
import defpackage.mzd;
import defpackage.mze;
import defpackage.mzj;
import defpackage.mzk;
import defpackage.mzq;
import defpackage.mzv;
import defpackage.mzw;
import defpackage.nab;
import defpackage.nac;
import defpackage.nah;
import defpackage.nai;
import defpackage.nan;
import defpackage.nao;
import defpackage.nat;
import java.util.concurrent.atomic.AtomicReference;

public final class ApiPlayerFactoryService extends Stub {
    public final Context a;
    public final Handler b;
    public final amkt c;
    public final mlp d;

    public ApiPlayerFactoryService(Context context, Handler handler, amkt amkt, mlp mlp) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (Handler) amqw.a((Object) handler);
        this.c = (amkt) amqw.a((Object) amkt);
        this.d = (mlp) amqw.a((Object) mlp);
    }

    public final IApiPlayerService a(mze mze, nab nab, nah nah, nai nai, mzd mzd, myy myy, nan nan, mzj mzj, nat nat, mzv mzv, nac nac, nao nao, mzw mzw, mzk mzk, mzq mzq, boolean z) {
        amqw.a((Object) mze);
        amqw.a((Object) nab);
        if (z) {
            amqw.a((Object) nai);
        } else {
            amqw.a((Object) nah);
        }
        amqw.a((Object) mzd);
        amqw.a((Object) myy);
        amqw.a((Object) nan);
        amqw.a((Object) mzj);
        amqw.a((Object) mzv);
        amqw.a((Object) nac);
        amqw.a((Object) nao);
        amqw.a((Object) mzw);
        final ConditionVariable conditionVariable = r20;
        ConditionVariable conditionVariable2 = new ConditionVariable();
        final AtomicReference atomicReference = r21;
        AtomicReference atomicReference2 = new AtomicReference();
        final mze mze2 = mze;
        final nab nab2 = nab;
        final nah nah2 = nah;
        final nai nai2 = nai;
        final mzd mzd2 = mzd;
        final myy myy2 = myy;
        final nan nan2 = nan;
        final mzj mzj2 = mzj;
        final nat nat2 = nat;
        final mzv mzv2 = mzv;
        final nac nac2 = nac;
        AnonymousClass1 anonymousClass1 = r0;
        final nao nao2 = nao;
        Handler handler = this.b;
        final mzw mzw2 = mzw;
        final mzk mzk2 = mzk;
        final mzq mzq2 = mzq;
        final boolean z2 = z;
        AnonymousClass1 anonymousClass12 = new Runnable(this) {
            private final /* synthetic */ ApiPlayerFactoryService s;

            public final void run() {
                ApiPlayerFactoryService apiPlayerFactoryService = this.s;
                ApiPlayerService apiPlayerService = r1;
                ApiPlayerService apiPlayerService2 = new ApiPlayerService(apiPlayerFactoryService.a, apiPlayerFactoryService.b, apiPlayerFactoryService.c, apiPlayerFactoryService.d, mze2, nab2, nah2, nai2, mzd2, myy2, nan2, mzj2, nat2, mzv2, nac2, nao2, mzw2, mzk2, mzq2, z2);
                atomicReference.set(apiPlayerService);
                conditionVariable.open();
            }
        };
        handler.post(anonymousClass1);
        conditionVariable2.block();
        return (IApiPlayerService) atomicReference2.get();
    }
}

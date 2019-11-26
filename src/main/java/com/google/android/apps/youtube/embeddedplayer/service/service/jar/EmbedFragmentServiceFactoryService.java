package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.ConditionVariable;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService.Stub;
import defpackage.amkt;
import defpackage.amqw;
import defpackage.mlp;
import defpackage.mzp;
import defpackage.xak;
import java.util.concurrent.atomic.AtomicReference;

public final class EmbedFragmentServiceFactoryService extends Stub {
    public final Handler a;
    public final amkt b;
    public final mlp c;

    public EmbedFragmentServiceFactoryService(Handler handler, amkt amkt, mlp mlp) {
        this.a = (Handler) amqw.a((Object) handler);
        this.b = (amkt) amqw.a((Object) amkt);
        this.c = (mlp) amqw.a((Object) mlp);
    }

    public final IEmbedFragmentService a(mzp mzp, int i) {
        amqw.a((Object) mzp);
        xak.b();
        ConditionVariable conditionVariable = new ConditionVariable();
        AtomicReference atomicReference = new AtomicReference();
        final mzp mzp2 = mzp;
        final int i2 = i;
        final AtomicReference atomicReference2 = atomicReference;
        final ConditionVariable conditionVariable2 = conditionVariable;
        this.a.post(new Runnable() {
            public final void run() {
                EmbedFragmentServiceFactoryService embedFragmentServiceFactoryService = EmbedFragmentServiceFactoryService.this;
                atomicReference2.set(new EmbedFragmentService(embedFragmentServiceFactoryService.a, mzp2, embedFragmentServiceFactoryService.c, embedFragmentServiceFactoryService.b, i2));
                conditionVariable2.open();
            }
        });
        conditionVariable.block();
        return (IEmbedFragmentService) atomicReference.get();
    }
}

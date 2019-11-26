package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ajdp */
public final class ajdp {
    public final xsc a;
    public final Executor b;
    public final afia c;
    public final ajdf d;
    public final ahhq e;
    public final zzl f;
    public final ScheduledExecutorService g;
    public final awtm h;

    public ajdp(xsc xsc, Executor executor, afia afia, ajdf ajdf, ahhq ahhq, zzl zzl, ScheduledExecutorService scheduledExecutorService) {
        this.a = (xsc) amqw.a((Object) xsc);
        this.b = (Executor) amqw.a((Object) executor);
        this.c = (afia) amqw.a((Object) afia);
        this.d = (ajdf) amqw.a((Object) ajdf);
        this.e = (ahhq) amqw.a((Object) ahhq);
        this.f = zzl;
        this.g = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        awtp awtp = (awtp) awtm.x.createBuilder();
        awtp.copyOnWrite();
        awtm awtm = (awtm) awtp.instance;
        awtm.a |= 134217728;
        awtp.copyOnWrite();
        awtm = (awtm) awtp.instance;
        awtm.a |= 8192;
        awtm.j = false;
        awtp.copyOnWrite();
        awtm = (awtm) awtp.instance;
        awtm.a |= 16384;
        awtm.k = 2000;
        awtp.copyOnWrite();
        awtm = (awtm) awtp.instance;
        awtm.a |= 32768;
        awtm.l = 0;
        awtp.copyOnWrite();
        awtm = (awtm) awtp.instance;
        awtm.a |= 65536;
        awtm.m = true;
        awtp.copyOnWrite();
        awtm = (awtm) awtp.instance;
        awtm.a |= 524288;
        awtm.n = false;
        awtp.copyOnWrite();
        awtm = (awtm) awtp.instance;
        awtm.a |= 8388608;
        awtm.r = 100;
        awtp.copyOnWrite();
        awtm = (awtm) awtp.instance;
        awtm.a |= 33554432;
        awtm.t = 1800;
        awtp.copyOnWrite();
        awtm = (awtm) awtp.instance;
        awtm.a |= 16777216;
        awtm.s = 0.9f;
        awtp.copyOnWrite();
        awtm = (awtm) awtp.instance;
        awtm.a |= 2097152;
        awtm.p = 15;
        awtp.copyOnWrite();
        awtm = (awtm) awtp.instance;
        awtm.a |= 4194304;
        awtm.q = 0.01f;
        awtp.copyOnWrite();
        awtm = (awtm) awtp.instance;
        awtm.a |= 1048576;
        awtm.o = false;
        this.h = (awtm) ((anxl) awtp.build());
    }
}

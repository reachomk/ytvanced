package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* renamed from: bayj */
public final class bayj {
    public static final Logger a = Logger.getLogger(bayj.class.getName());
    public static final double b = ((double) TimeUnit.MILLISECONDS.toNanos(1));
    public final bbjx c;
    public final bbji d;
    public final amro e;
    public final baur f;
    public final boolean g = true;
    public final boolean h;
    public final boolean i;
    private final boolean j;

    bayj(amro amro, boolean z, boolean z2) {
        Object a = bbka.a.a();
        Object a2 = bbka.a.b().a();
        Object a3 = bbjg.a.a();
        this.c = (bbjx) amqw.a(a, (Object) "tagger");
        this.d = (bbji) amqw.a(a3, (Object) "statsRecorder");
        amqw.a(a2, (Object) "tagCtxSerializer");
        this.e = (amro) amqw.a((Object) amro, (Object) "stopwatchSupplier");
        this.h = z;
        this.i = z2;
        this.j = false;
        this.f = baur.a("grpc-tags-bin", new baym(a2, a));
    }

    public final void a(bbju bbju, double d) {
    }
}

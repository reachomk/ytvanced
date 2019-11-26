package defpackage;

import java.util.concurrent.Executor;

/* renamed from: afmf */
public class afmf {
    public final Executor a;
    public final xsc b;
    public final String c;
    public final afnz d;
    public final xwk e;
    private final xgq f;

    public afmf(Executor executor, xgq xgq, xwk xwk, String str, xsc xsc) {
        this.a = (Executor) amqw.a((Object) executor, (Object) "executor can't be null");
        this.f = (xgq) amqw.a((Object) xgq, (Object) "httpClient can't be null");
        this.e = (xwk) amqw.a((Object) xwk, (Object) "xmlParser can't be null");
        this.c = (String) amqw.a((Object) str, (Object) "cachePath can't be null");
        this.b = (xsc) amqw.a((Object) xsc, (Object) "clock can't be null");
        this.d = new afnz("GET");
    }

    public afmf(Executor executor, xgq xgq, String str, xsc xsc) {
        this.a = (Executor) amqw.a((Object) executor, (Object) "executor can't be null");
        this.f = (xgq) amqw.a((Object) xgq, (Object) "httpClient can't be null");
        this.b = (xsc) amqw.a((Object) xsc, (Object) "clock can't be null");
        this.c = str;
        this.d = new afnz("GET");
        this.e = null;
    }

    /* Access modifiers changed, original: protected|final */
    public final afse a(afnx afnx, afnp afnp) {
        return new afse(this.f, afnx, afnp);
    }

    /* Access modifiers changed, original: protected|final */
    public final afrk a(afsk afsk) {
        return afrk.a(this.a, afsk);
    }

    /* Access modifiers changed, original: protected|final */
    public final afsq a(wyi wyi, afsk afsk, long j) {
        amqw.a(this.b, (Object) "this instance does not contain a clock");
        return afsq.a(wyi, afsk, this.b, j);
    }
}

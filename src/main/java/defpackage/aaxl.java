package defpackage;

import java.util.Map;

/* renamed from: aaxl */
final class aaxl implements afsw {
    private final Map a;
    private final /* synthetic */ aaxi b;

    public aaxl(aaxi aaxi, Map map) {
        this.b = aaxi;
        this.a = map;
    }

    public final void a(bqn bqn) {
        xtl.a("Error flagging", (Throwable) bqn);
        this.b.a.c(bqn);
    }
}

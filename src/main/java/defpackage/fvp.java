package defpackage;

import java.util.Map;

/* renamed from: fvp */
final class fvp implements afsw {
    private final apxu a;
    private final Map b;
    private final /* synthetic */ fvn c;

    fvp(fvn fvn, apxu apxu, Map map) {
        this.c = fvn;
        this.a = apxu;
        this.b = map;
    }

    public final void a(bqn bqn) {
        xtl.a("Error rating", (Throwable) bqn);
        this.c.b.c(bqn);
    }
}

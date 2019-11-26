package defpackage;

import java.util.Map;

/* renamed from: yai */
final class yai implements afsw {
    private final /* synthetic */ Map a;
    private final /* synthetic */ anjg b;
    private final /* synthetic */ yaf c;

    yai(yaf yaf, Map map, anjg anjg) {
        this.c = yaf;
        this.a = map;
        this.b = anjg;
    }

    public final void a(bqn bqn) {
        this.c.b.c(bqn);
        anjg anjg = this.b;
        if (anjg != null) {
            anjg.a((Throwable) bqn);
        }
    }
}

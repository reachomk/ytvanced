package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aedu */
public final class aedu implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;
    private final bcaa i;
    private final bcaa j;
    private final bcaa k;
    private final bcaa l;

    private aedu(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
        this.g = bcaa7;
        this.h = bcaa8;
        this.i = bcaa9;
        this.j = bcaa10;
        this.k = bcaa11;
        this.l = bcaa12;
    }

    public static aedu a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12) {
        return new aedu(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7, bcaa8, bcaa9, bcaa10, bcaa11, bcaa12);
    }

    public static aell a(Executor executor, ScheduledExecutorService scheduledExecutorService, xsc xsc, xhv xhv, String str, Object obj, aajk aajk, aeqo aeqo, avtc avtc, bcaa bcaa) {
        avtc avtc2 = avtc;
        aedf aedf = (aedf) obj;
        if (avtc2 == null || !avtc2.e) {
            return null;
        }
        int i = avtc2.m;
        return aell.a(new aedq(str, aedf, executor, aeqo, avtc, i > 0 ? i : 0, avtc2.g * 1000), avtc2.f, avtc2.h * 1000, xsc, scheduledExecutorService, avtc, aajk, xhv, (aelx) bcaa.get());
    }

    public final /* synthetic */ Object get() {
        Executor executor = (Executor) this.a.get();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.get();
        xsc xsc = (xsc) this.c.get();
        xhv xhv = (xhv) this.d.get();
        String str = (String) this.e.get();
        Object obj = this.f.get();
        this.g.get();
        aajk aajk = (aajk) this.h.get();
        aeqo aeqo = (aeqo) this.i.get();
        avtc avtc = (avtc) this.j.get();
        this.k.get();
        return aedu.a(executor, scheduledExecutorService, xsc, xhv, str, obj, aajk, aeqo, avtc, this.l);
    }
}

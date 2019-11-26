package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bdcn */
final class bdcn implements bcun {
    private final bdap a;
    private final Object b;

    bdcn(bdap bdap, Object obj) {
        this.a = bdap;
        this.b = obj;
    }

    public final /* synthetic */ void a(Object obj) {
        bcum bcum = (bcum) obj;
        bdap bdap = this.a;
        bcum.a(((bdat) bdap.b.get()).a().b(new bdcp(bcum, this.b), -1, TimeUnit.NANOSECONDS));
    }
}

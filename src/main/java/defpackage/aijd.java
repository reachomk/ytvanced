package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aijd */
public class aijd implements aalb {
    public final xci a;
    private final bcaa b;
    private final bcaa c;
    private final Executor d;
    private final bcaa e;
    private final bcaa f;
    private final aijq g;
    private final amqp h;

    public aijd(xci xci, Executor executor, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, aijq aijq, amqp amqp) {
        this.a = (xci) amqw.a((Object) xci);
        this.d = (Executor) amqw.a((Object) executor);
        this.e = (bcaa) amqw.a((Object) bcaa);
        this.b = (bcaa) amqw.a((Object) bcaa2);
        this.c = bcaa3;
        this.f = (bcaa) amqw.a((Object) bcaa4);
        this.g = (aijq) amqw.a((Object) aijq);
        this.h = amqp;
    }

    /* Access modifiers changed, original: protected */
    public amuv a(apxu apxu, awbv awbv) {
        amuv i = amuw.i();
        if (awbv.c != 0) {
            aiix aiix = new aiix(this.a, (aizy) this.b.get(), (ajam) this.c.get(), apxu);
            aiix.f.a(aiix.a(aiix.e));
            if (aiix.d.t() && aiix.d.q() != null) {
                aiix.a(aiix.d.q());
            }
            i.c(aiix);
        }
        if (aijn.a(awbv)) {
            aiiq aiiq = new aiiq(this.a, apxu, this.g, (ajam) this.c.get());
            aiiq.e.a(aiiq.a(aiiq.d));
            i.c(aiiq);
        }
        return i;
    }
}

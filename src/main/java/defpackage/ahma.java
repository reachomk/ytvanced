package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ahma */
public final class ahma extends aijd {
    private final ahlq b;

    public ahma(xci xci, Executor executor, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, aijq aijq, ahlq ahlq, zyw zyw, amqp amqp) {
        super(xci, executor, bcaa, bcaa2, bcaa3, bcaa4, aijq, amqp);
        this.b = (ahlq) amqw.a((Object) ahlq);
    }

    /* Access modifiers changed, original: protected|final */
    public final amuv a(apxu apxu, awbv awbv) {
        awbu awbu = (awbu) ((anxo) awbv.toBuilder());
        Object obj = null;
        if (awbu.a() != 0) {
            if (this.b.b()) {
                int a = awbu.a();
                awbu.copyOnWrite();
                awbv awbv2 = (awbv) awbu.instance;
                awbv2.a |= 4;
                awbv2.c = a;
                apxu = aijn.a(apxu, awbu);
            } else {
                obj = new ahmb(this.a, awbu.a());
            }
        }
        amuv a2 = super.a(apxu, (awbv) ((anxl) awbu.build()));
        if (obj != null) {
            obj.d.a(obj);
            a2.c(obj);
        }
        return a2;
    }
}

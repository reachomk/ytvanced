package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: abqp */
public final class abqp implements aaap {
    public final aboq a;
    private final abbj b;
    private final xoi c;
    private final Executor d;

    public abqp(abbj abbj, aboq aboq, xoi xoi, Executor executor) {
        this.b = (abbj) amqw.a((Object) abbj);
        this.a = (aboq) amqw.a((Object) aboq);
        this.c = (xoi) amqw.a((Object) xoi);
        this.d = executor;
    }

    public final void a(apxu apxu, Map map) {
        abbj abbj = this.b;
        anjv a = abbj.i.a(abbj.c(apxu), aniv.a);
        Executor executor = this.d;
        xoi xoi = this.c;
        xoi.getClass();
        xan.a(a, executor, new abqo(xoi), new abqr(this, map));
    }
}

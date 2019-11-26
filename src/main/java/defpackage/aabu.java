package defpackage;

import java.util.concurrent.Callable;

/* renamed from: aabu */
final /* synthetic */ class aabu implements Callable {
    private final aabs a;
    private final bbmi b;
    private final String c;

    aabu(aabs aabs, bbmi bbmi, String str) {
        this.a = aabs;
        this.b = bbmi;
        this.c = str;
    }

    public final Object call() {
        return this.b.d(amqp.c(this.a.b(this.c)));
    }
}

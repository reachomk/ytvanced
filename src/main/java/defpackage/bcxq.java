package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bcxq */
public final class bcxq implements bcub {
    public final long a = 500;
    public final TimeUnit b;
    private final bcuf c;

    public bcxq(TimeUnit timeUnit, bcuf bcuf) {
        this.b = timeUnit;
        this.c = bcuf;
    }

    public final /* synthetic */ Object a(Object obj) {
        bcup bcup = (bcup) obj;
        bcuo a = this.c.a();
        bded bded = new bded(bcup);
        bcuo bdfw = new bdfw();
        bded.a(a);
        bded.a(bdfw);
        return new bcxt(this, bcup, bdfw, a, bded);
    }
}

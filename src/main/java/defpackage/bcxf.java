package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bcxf */
public final class bcxf implements bcty {
    private final long a;
    private final TimeUnit b;
    private final bcuf c;

    public bcxf(long j, TimeUnit timeUnit, bcuf bcuf) {
        this.a = j;
        this.b = timeUnit;
        this.c = bcuf;
    }

    public final /* synthetic */ void a(Object obj) {
        bcup bcup = (bcup) obj;
        bcuo a = this.c.a();
        bcup.a(a);
        a.a(new bcxe(bcup), this.a, this.b);
    }
}

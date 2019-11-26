package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aipw */
public final class aipw {
    public final aiqa a;
    public final String b;
    public final aahr[] c;
    public final long d;
    public final long e;
    public final aipy f;
    public aivp g;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final Runnable i = new aipz(this);

    public final void a() {
        this.h.set(true);
        synchronized (this) {
            aivp aivp = this.g;
            if (aivp != null) {
                aivp.a(false);
            }
        }
    }

    /* synthetic */ aipw(aiqa aiqa, String str, aahr[] aahrArr, long j, long j2, aipy aipy) {
        this.a = aiqa;
        this.b = str;
        this.c = aahrArr;
        this.d = j;
        this.e = j2;
        this.f = aipy;
    }
}

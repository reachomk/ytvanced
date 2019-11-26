package defpackage;

import java.io.IOException;

/* renamed from: rcd */
public final class rcd extends rhf {
    public rcd(qui qui, String str, String str2, qpa qpa, int i) {
        super(qui, str, str2, qpa, i, 24);
    }

    public final Void b() {
        qui qui = this.a;
        if (qui.o) {
            return super.call();
        }
        if (qui.m) {
            c();
        }
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        if (this.a.m) {
            c();
            return;
        }
        synchronized (this.b) {
            this.b.Q = (String) this.c.invoke(null, new Object[]{this.a.a});
        }
    }

    private final void c() {
        pcv a = this.a.a();
        if (a != null) {
            try {
                pcy a2 = a.a();
                String a3 = qyb.a(a2.a);
                if (a3 != null) {
                    synchronized (this.b) {
                        qpa qpa = this.b;
                        qpa.Q = a3;
                        qpa.S = Boolean.valueOf(a2.b);
                        this.b.R = Integer.valueOf(5);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public final /* synthetic */ Object call() {
        return call();
    }
}

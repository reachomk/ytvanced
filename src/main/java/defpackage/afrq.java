package defpackage;

import java.util.concurrent.Executor;

/* renamed from: afrq */
public class afrq implements afsk {
    public final afnw a;
    public final Executor b;
    private final afsk c;
    private final afnx d;

    public afrq(afsk afsk, afnw afnw, Executor executor) {
        this.c = (afsk) amqw.a((Object) afsk);
        this.d = null;
        this.a = afnw;
        this.b = executor;
    }

    protected afrq(afnx afnx, afnw afnw) {
        this.c = null;
        this.d = afnx;
        this.a = afnw;
        this.b = null;
    }

    public final void a(Object obj, wxg wxg) {
        try {
            afnx afnx = this.d;
            Object b = afnx != null ? afnx.b(obj) : obj;
            b(b, new afrt(this, obj, b, wxg));
        } catch (xwd e) {
            a(obj, null, wxg, e);
        }
    }

    /* Access modifiers changed, original: protected */
    public void b(Object obj, wxg wxg) {
        amqw.a(this.c);
        this.c.a(obj, wxg);
    }

    /* Access modifiers changed, original: protected */
    public void a(Object obj, Object obj2, wxg wxg, Exception exception) {
        wxg.a(obj, exception);
    }
}

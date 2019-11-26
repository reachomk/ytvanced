package defpackage;

/* renamed from: afsq */
public abstract class afsq implements afsk {
    public final wyi a;
    public final xsc b;
    private final afsk c;
    private final long d;

    public static afsq a(wyi wyi, afsk afsk, xsc xsc, long j) {
        amqw.a((Object) wyi);
        amqw.a((Object) afsk);
        amqw.a((Object) xsc);
        amqw.a(true, (Object) "time to live must be >=0 and <= 2592000000");
        return new afss(wyi, afsk, xsc, j);
    }

    public abstract Object a(Object obj);

    /* Access modifiers changed, original: protected */
    public void a(wyi wyi) {
    }

    protected afsq(wyi wyi, afsk afsk, xsc xsc, long j) {
        this.a = wyi;
        this.c = afsk;
        this.b = xsc;
        this.d = j;
    }

    public final void a(Object obj, wxg wxg) {
        if (this.d > 0) {
            afmc afmc = (afmc) this.a.a(a(obj));
            long a = this.b.a();
            if (afmc != null) {
                long j = afmc.b;
                if (a >= j && j + this.d >= a) {
                    wxg.a(obj, afmc.a);
                    a(this.a);
                    return;
                }
            }
        }
        afsk afsk = this.c;
        if (afsk != null) {
            afsk.a(obj, new afst(this, wxg));
        } else {
            wxg.a(obj, new afmd());
        }
    }
}

package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: lgi */
public final class lgi extends ekk implements ele, xcp {
    public final aaas a;
    public final lgg b;
    public final ekz c;
    private final boolean d;
    private final boolean e;
    private final zyw f;
    private final aife g;
    private final ajkv h;
    private final xci i;
    private final ajam j;
    private bcuo k;
    private WeakReference l;

    public lgi(elm elm, aaas aaas, lgg lgg, aife aife, ekz ekz, zyw zyw, ajkv ajkv, xci xci, ajam ajam) {
        super(elm);
        this.d = foh.f(zyw);
        this.a = aaas;
        this.b = lgg;
        this.g = aife;
        this.c = ekz;
        this.h = ajkv;
        this.i = xci;
        this.j = ajam;
        this.e = foh.x(zyw);
        this.f = zyw;
    }

    public final void a(boolean z, boolean z2) {
        c();
    }

    public final void a(ahkf ahkf) {
        if (!this.d && airg.a(ahkf.e, 5)) {
            aafv aafv = ahkf.c;
            WeakReference weakReference = null;
            if (aafv != null) {
                aafl aafl = aafv.i;
                if (aafl != null) {
                    weakReference = new WeakReference(aafl);
                }
            }
            this.l = weakReference;
            c();
        }
    }

    private final void c() {
        aafc aafc;
        ajkz ajkz;
        WeakReference weakReference = this.l;
        ajlc ajlc = null;
        if (weakReference == null || weakReference.get() == null) {
            aafc = null;
        } else {
            aafl aafl = (aafl) this.l.get();
            ekz ekz = this.c;
            aafc = aafl.a(ekz.a, ekz.b, false);
        }
        if (aafc == null) {
            ajkz = null;
        } else {
            aozk aozk = aafc.a.h;
            if (aozk == null) {
                aozk = aozk.c;
            }
            ajlc = a(aozk);
            aozk aozk2 = aafc.a.f;
            if (aozk2 == null) {
                aozk2 = aozk.c;
            }
            ajkz = a(aozk2);
        }
        this.g.a(ajlc);
        this.g.a(ajkz);
        this.h.a(ajlc);
        this.h.a(ajkz);
    }

    private final lgn a(aozk aozk) {
        return aozk.a == 114177671 ? new lgn(this, (aozq) aozk.b) : null;
    }

    public final void A_() {
        if (this.e) {
            this.k = this.j.t().f().a(emg.a(this.f, 562949953421312L, 1)).a(new lgl(this), lgk.a);
        } else {
            this.i.a((Object) this);
        }
    }

    public final void ar_() {
        if (this.e) {
            this.k.b();
            this.k = null;
        } else {
            this.i.b(this);
        }
        this.g.a(null);
        this.g.a(null);
        this.h.a(null);
        this.h.a(null);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkf.class};
        } else if (i == 0) {
            a((ahkf) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}

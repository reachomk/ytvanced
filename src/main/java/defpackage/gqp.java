package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: gqp */
public final class gqp implements aizm, gqi {
    private final Set a = new HashSet();
    private ajzq b;
    private final gqf c;

    public gqp(gqf gqf) {
        this.c = gqf;
        gqf.a(this);
    }

    public final void a(aafv aafv) {
    }

    public final void a(aizl aizl, aiqq aiqq) {
    }

    public final void a(apxu apxu, ajzq ajzq, int i) {
    }

    public final void a(boolean z) {
    }

    public final void b(apxu apxu) {
    }

    public final boolean b(aiqq aiqq) {
        return true;
    }

    public final void c(String str) {
    }

    public final void bE_() {
        this.c.b(this);
    }

    public final aizl a(aiqq aiqq) {
        return new aizl(aizn.JUMP, aiqq);
    }

    public final aiqq a(aizl aizl) {
        int ordinal = aizl.e.ordinal();
        boolean z = true;
        aiqq aiqq = null;
        ajzq ajzq;
        aiqs a;
        String valueOf;
        StringBuilder stringBuilder;
        if (ordinal == 0) {
            if (aizl.e != aizn.AUTOPLAY) {
                z = false;
            }
            ajzq = this.b;
            if (!(ajzq == null || ajzq.c == null)) {
                if (z) {
                    byte[] b = ggf.b(ajzq);
                    if (b != null) {
                        ajzq ajzq2 = this.b;
                        apxx apxx = (apxx) ((anxo) ajzq2.c.toBuilder());
                        apxx.a(anvu.a(b));
                        ajzq2.c = (apxu) ((anxl) apxx.build());
                    } else {
                        ajzq = this.b;
                        apxx apxx2 = (apxx) ((anxo) ajzq.c.toBuilder());
                        apxx2.a();
                        ajzq.c = (apxu) ((anxl) apxx2.build());
                    }
                }
                a = aiqq.a();
                a.a = this.b.c;
                a.e = z;
                a.d = z;
                aiqq = a.b();
            }
            return aiqq;
        } else if (ordinal == 1) {
            ajzq = this.b;
            if (ajzq == null || ajzq.d == null) {
                return null;
            }
            a = aiqq.a();
            a.a = this.b.d;
            return a.b();
        } else if (ordinal == 2) {
            valueOf = String.valueOf(aizl.e);
            stringBuilder = new StringBuilder(valueOf.length() + 38);
            stringBuilder.append("Unsupported Autoplay navigation type: ");
            stringBuilder.append(valueOf);
            throw new UnsupportedOperationException(stringBuilder.toString());
        } else if (ordinal == 4) {
            return aizl.f;
        } else {
            valueOf = String.valueOf(aizl.e);
            stringBuilder = new StringBuilder(valueOf.length() + 29);
            stringBuilder.append("Unsupported navigation type: ");
            stringBuilder.append(valueOf);
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    public final aiqw bD_() {
        return aiqw.a;
    }

    public final void a(aizp aizp) {
        this.a.add(aizp);
    }

    public final void b(aizp aizp) {
        this.a.remove(aizp);
    }

    private final synchronized void d() {
        for (aizp a : this.a) {
            a.a();
        }
    }

    public final aizu c() {
        return new gqr(this.b);
    }

    public final void a(ajzq ajzq, String str, boolean z) {
        this.b = ajzq;
        d();
    }

    public final int b(aizl aizl) {
        int ordinal = aizl.e.ordinal();
        boolean z = false;
        ajzq ajzq;
        if (ordinal == 0) {
            ajzq = this.b;
            if (!(ajzq == null || ajzq.c == null)) {
                z = true;
            }
            return aizl.a(z);
        } else if (ordinal != 1) {
            return ordinal != 4 ? 1 : 2;
        } else {
            ajzq = this.b;
            if (!(ajzq == null || ajzq.d == null)) {
                z = true;
            }
            return aizl.a(z);
        }
    }
}

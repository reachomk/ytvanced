package defpackage;

/* renamed from: ehs */
public final class ehs implements ajan, xcp {
    public final zyw a;
    public String b;
    public String c;

    public ehs(zyw zyw) {
        this.a = zyw;
    }

    public final long e() {
        return 1;
    }

    public final void a(ahkn ahkn) {
        if (ahkn != null) {
            synchronized (this) {
                this.b = ahkn.e;
                aakj aakj = ahkn.b;
                this.c = aakj != null ? aakj.b() : null;
            }
        }
    }

    public final void a(ahjc ahjc) {
        if (ahjc != null && ahjc.e != null) {
            synchronized (this) {
                this.b = ahjc.b;
                this.c = ahjc.e;
            }
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.f().a(emg.a(this.a, 1024)).a(new ehr(this), ehu.a), ajam.Q().c.f().a(emg.a(this.a, 1024)).a(new eht(this), ehw.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjc.class, ahkn.class};
        } else if (i == 0) {
            a((ahjc) obj);
            return null;
        } else if (i == 1) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}

package defpackage;

/* renamed from: aimh */
public class aimh implements ajan, xcp {
    private static final aimp f = new aimq();
    private final aimp a;
    private final akpk b = new akpk();
    private aimp c = f;
    private airc d;
    private airi e;

    public aimh(aimp aimp) {
        this.a = (aimp) amqw.a((Object) aimp);
    }

    public final long e() {
        return 134217728;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        a(null);
    }

    private final void a(awfu awfu) {
        byte[] bArr;
        this.b.clear();
        aimp aimp = this.c;
        if (aimp != this.a) {
            aimp.c(0);
            this.c = this.a;
            this.c.a(this.b);
        }
        if (awfu != null) {
            for (awfw awfw : awfu.b) {
                int i = awfw.a;
                akpk akpk;
                Object obj;
                if ((i & 2) != 0) {
                    akpk = this.b;
                    obj = awfw.c;
                    if (obj == null) {
                        obj = areh.j;
                    }
                    akpk.add(obj);
                } else if ((i & 1) != 0) {
                    akpk = this.b;
                    obj = awfw.b;
                    if (obj == null) {
                        obj = arej.m;
                    }
                    akpk.add(obj);
                }
            }
        }
        this.c.k();
        aimp = this.c;
        if (awfu == null) {
            bArr = null;
        } else {
            bArr = awfu.d.d();
        }
        aimp.a(bArr);
    }

    /* Access modifiers changed, original: protected */
    public boolean a() {
        return !this.b.isEmpty() && this.d == airc.FULLSCREEN;
    }

    /* Access modifiers changed, original: protected */
    public int a(airi airi) {
        if (airi != airi.VIDEO_PLAYING) {
            return airi != airi.ENDED ? 0 : 2;
        } else {
            return 1;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        this.c.c(a() ? a(this.e) : 0);
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 134217728)).a(ajcg.a(ajam.O(), 134217728, 1)).a(new aimk(this), aimj.a), ajam.t().a(ajcg.b(ajam.O(), 134217728)).a(ajcg.a(ajam.O(), 134217728, 1)).a(new aimm(this), aiml.a), ajam.P().b.a(ajcg.b(ajam.O(), 134217728)).a(ajcg.a(ajam.O(), 134217728, 0)).a(new aimo(this), aimn.a)};
    }

    public final void a(ahkf ahkf) {
        aafv aafv = ahkf.c;
        if (aafv != null) {
            ajxr ajxr = aafv.a.e;
            ajxs ajxs = ajxr != null ? ajxr.b : null;
            if (ajxs != null) {
                awfi awfi = ajxs.b;
                if (awfi == null || (awfi.a & 1) == 0) {
                    b();
                } else {
                    awfu awfu = awfi.b;
                    if (awfu == null) {
                        awfu = awfu.e;
                    }
                    a(awfu);
                }
            }
        }
        c();
    }

    public final void a(ahkn ahkn) {
        this.e = ahkn.a;
        this.c.a(this.e == airi.ENDED);
        c();
    }

    public final void a(ahjn ahjn) {
        airc airc = this.d;
        airc airc2 = ahjn.a;
        if (airc != airc2) {
            this.d = airc2;
            c();
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjn.class, ahkf.class, ahkn.class};
        } else if (i == 0) {
            a((ahjn) obj);
            return null;
        } else if (i == 1) {
            a((ahkf) obj);
            return null;
        } else if (i == 2) {
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

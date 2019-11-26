package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ahlq */
public final class ahlq implements ahkx, ajan, xcp {
    public final ajam a;
    public final xci b;
    public final zyw c;
    public boolean d = false;
    private final bcaa e;
    private final ahlm f;
    private final xpt g;
    private final xhv h;
    private airc i;
    private int j;
    private int k;
    private boolean l;

    public ahlq(xci xci, bcaa bcaa, ajam ajam, ahlm ahlm, xpt xpt, xhv xhv, zyw zyw) {
        this.b = (xci) amqw.a((Object) xci);
        this.e = (bcaa) amqw.a((Object) bcaa);
        this.f = (ahlm) amqw.a((Object) ahlm);
        this.g = (xpt) amqw.a((Object) xpt);
        this.h = (xhv) amqw.a((Object) xhv);
        this.a = ajam;
        this.c = zyw;
    }

    public final void b(boolean z) {
    }

    public final long e() {
        return 4;
    }

    public final void as_() {
        this.l = true;
    }

    public final boolean b() {
        if (this.d && this.i == airc.BACKGROUND && ((aizy) this.e.get()).a(aizl.d) && this.f.a() && !this.l) {
            int i;
            if (this.h.g()) {
                i = this.k;
            } else {
                i = this.j;
            }
            if (i == 0 || i == -1 || this.g.b() < TimeUnit.MINUTES.toMillis((long) i)) {
                return true;
            }
        }
        return false;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 4)).a(ajcg.a(ajam.O(), 4, 1)).a(new ahlt(this), ahls.a), ajam.P().b.a(ajcg.b(ajam.O(), 4)).a(ajcg.a(ajam.O(), 4, 0)).a(new ahlv(this), ahlu.a), ajam.t().a(ajcg.b(ajam.O(), 4)).a(ajcg.a(ajam.O(), 4)).a(new ahlx(this), ahlw.a)};
    }

    public final void a(ahkn ahkn) {
        int ordinal = ahkn.a.ordinal();
        if (ordinal == 0) {
            this.l = false;
        } else if (ordinal == 9 && b()) {
            ((aizy) this.e.get()).b(aizl.d);
        }
    }

    public final void a(ahjn ahjn) {
        this.i = ahjn.a;
    }

    public final void a(ahkf ahkf) {
        aafv aafv = ahkf.c;
        if (aafv != null) {
            ajxr ajxr = aafv.a.e;
            awfc awfc = null;
            ajxs ajxs = ajxr != null ? ajxr.b : null;
            if (ajxs != null) {
                awfg awfg = ajxs.c;
                if (awfg != null && (awfg.a & 1) != 0) {
                    awfe awfe = awfg.b;
                    if (awfe == null) {
                        awfe = awfe.p;
                    }
                    if ((awfe.a & 64) != 0) {
                        awfa awfa = awfe.h;
                        if (awfa == null) {
                            awfa = awfa.c;
                        }
                        awfc = awfa.b;
                        if (awfc == null) {
                            awfc = awfc.f;
                        }
                    }
                    int i = -1;
                    this.j = awfc != null ? awfc.c : -1;
                    if (awfc != null) {
                        i = awfc.d;
                    }
                    this.k = i;
                }
            }
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

package defpackage;

import android.text.TextUtils;

/* renamed from: htw */
public final class htw implements ajan, eib, exv, hvc, xcp {
    private final elv a;
    private final bcaa b;
    private final elh c;
    private final xci d;
    private final eif e;
    private final eic f;
    private final ajam g;
    private final bdfu h = new bdfu();
    private final zyw i;
    private boolean j;
    private boolean k;
    private airi l;

    public htw(elv elv, elh elh, bcaa bcaa, xci xci, eif eif, eic eic, ajam ajam, zyw zyw) {
        this.a = elv;
        this.c = elh;
        this.b = bcaa;
        this.d = xci;
        this.e = eif;
        this.f = eic;
        this.g = ajam;
        this.i = zyw;
    }

    public final long e() {
        return 1;
    }

    public final void c() {
        eja c = this.f.c();
        if (!(this.j || !this.e.c().m() || c == null || TextUtils.isEmpty(c.b()) || this.l == null)) {
            String b = c.b();
            ely a = this.a.a(b);
            long j = 0;
            if (this.l == airi.INTERSTITIAL_PLAYING) {
                elv elv = this.a;
                if (a != null) {
                    j = a.a;
                }
                ((elf) this.c.get()).j();
                elv.a(b, j);
            } else if (this.l.a(airi.VIDEO_PLAYING)) {
                if (a != null) {
                    j = a.a;
                }
                long n = ((aizy) this.b.get()).n();
                long o = ((aizy) this.b.get()).o();
                if (Math.abs(j - n) >= 500) {
                    if (!this.k && n >= o) {
                        elv elv2 = this.a;
                        elv2.b.remove(b);
                        elv2.c.remove(b);
                        elv2.a.c(new elx(b));
                        return;
                    }
                    elv elv3 = this.a;
                    ((elf) this.c.get()).j();
                    elv3.a(b, n);
                }
            }
        }
    }

    public final void a() {
        if (foh.x(this.i)) {
            this.h.a(a(this.g));
        } else {
            this.d.a((Object) this);
        }
    }

    public final void b() {
        if (foh.x(this.i)) {
            this.h.a();
        } else {
            this.d.b(this);
        }
        c();
    }

    public final void a(eja eja) {
        if (eja == null) {
            this.k = false;
            this.l = null;
        }
    }

    public final void a(ahkn ahkn) {
        this.l = ahkn.a;
        aakj aakj = ahkn.b;
        boolean z = false;
        if (aakj != null && aakj.j()) {
            z = true;
        }
        this.k = z;
    }

    public final void a(ahkr ahkr) {
        if (ahkr.b()) {
            c();
        }
    }

    public final void a(ahjn ahjn) {
        this.j = ahjn.a == airc.REMOTE;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.f().a(emg.a(this.i, 134217728, 1)).a(new htv(this), hty.a), ajam.Q().d.f().a(emg.a(this.i, 134217728, 1)).a(new htx(this), hua.a), ajam.P().b.f().a(emg.a(this.i, 134217728, 0)).a(new htz(this), huc.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjn.class, ahkn.class, ahkr.class};
        } else if (i == 0) {
            a((ahjn) obj);
            return null;
        } else if (i == 1) {
            a((ahkn) obj);
            return null;
        } else if (i == 2) {
            a((ahkr) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}

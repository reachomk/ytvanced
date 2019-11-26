package defpackage;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: aink */
public final class aink implements ajan, xcp {
    public final zyw a;
    public final bdfu b = new bdfu();
    public final xci c;
    public final ajam d;
    public final aizy e;
    public final xpt f;
    public final ainw g;
    public final Handler h;
    public Runnable i;
    private final acum j;
    private final acvx k;
    private azko l;
    private boolean m;
    private boolean n;

    public aink(Handler handler, zyw zyw, xci xci, ajam ajam, aizy aizy, xpt xpt, acum acum, acvx acvx, ainw ainw) {
        this.a = zyw;
        this.c = xci;
        this.h = handler;
        this.d = ajam;
        this.e = aizy;
        this.f = xpt;
        this.j = acum;
        this.k = acvx;
        this.g = ainw;
    }

    public final long e() {
        return 536870912;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 536870912)).a(ajcg.a(ajam.O(), 536870912, 1)).a(new ainn(this), ainm.a), ajam.Q().b.a(ajcg.b(ajam.O(), 536870912)).a(ajcg.a(ajam.O(), 536870912, 1)).a(new ainp(this), aino.a), ajam.P().b.a(ajcg.b(ajam.O(), 536870912)).a(ajcg.a(ajam.O(), 536870912, 0)).a(new ainr(this), ainq.a)};
    }

    public final void a(ahkn ahkn) {
        airi airi = ahkn.a;
        if (airi.a(airi.PLAYBACK_LOADED)) {
            this.l = null;
            for (atef atef : ahkn.b.v()) {
                if (!(atef == null || (atef.a & 2) == 0)) {
                    azko azko = atef.c;
                    if (azko == null) {
                        azko = azko.c;
                    }
                    this.l = azko;
                }
            }
        } else {
            if (airi.a(airi.NEW, airi.ENDED)) {
                a();
            }
        }
        this.n = airi.a(airi.VIDEO_PLAYING);
    }

    public final void a(ahkm ahkm) {
        if (this.n) {
            azko azko = this.l;
            if (azko != null) {
                azkq azkq = azko.b;
                if (azkq == null) {
                    azkq = azkq.c;
                }
                if (azkq.a == 126827209 && !this.m) {
                    azkm azkm;
                    azkq = this.l.b;
                    if (azkq == null) {
                        azkq = azkq.c;
                    }
                    if (azkq.a == 126827209) {
                        azkm = (azkm) azkq.b;
                    } else {
                        azkm = azkm.j;
                    }
                    if (ahkm.a > TimeUnit.SECONDS.toMillis((long) azkm.c)) {
                        if (this.f.b() > azkm.b) {
                            this.g.b(azkm, new ainv(this, azkm));
                        } else {
                            a(2, azkm);
                        }
                        this.l = null;
                    }
                }
            }
        }
    }

    public final void a(ahjn ahjn) {
        this.m = ahjn.a == airc.REMOTE;
    }

    public static boolean a(zyw zyw) {
        if (!(zyw == null || zyw.a() == null)) {
            awde awde = zyw.a().s;
            if (awde == null) {
                awde = awde.s;
            }
            if (awde.b) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        Runnable runnable = this.i;
        if (runnable != null) {
            this.h.removeCallbacks(runnable);
            this.i = null;
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjn.class, ahkn.class, ahkm.class};
        } else if (i == 0) {
            a((ahjn) obj);
            return null;
        } else if (i == 1) {
            a((ahkn) obj);
            return null;
        } else if (i == 2) {
            a((ahkm) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final void a(int i, azkm azkm) {
        azkk azkk = (azkk) azkh.g.createBuilder();
        azkk.copyOnWrite();
        azkh azkh = (azkh) azkk.instance;
        azkh.a |= 1;
        azkh.b = i - 1;
        i = azkm.c;
        azkk.copyOnWrite();
        azkh = (azkh) azkk.instance;
        azkh.a |= 16;
        azkh.f = i;
        long j = azkm.b;
        azkk.copyOnWrite();
        azkh = (azkh) azkk.instance;
        azkh.a |= 2;
        azkh.c = j;
        j = this.f.b();
        azkk.copyOnWrite();
        azkh = (azkh) azkk.instance;
        azkh.a |= 4;
        azkh.d = j;
        String d = this.k.d();
        azkk.copyOnWrite();
        azkh azkh2 = (azkh) azkk.instance;
        if (d != null) {
            azkh2.a |= 8;
            azkh2.e = d;
            azkh azkh3 = (azkh) ((anxl) azkk.build());
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.copyOnWrite();
            asmw asmw = (asmw) asmz.instance;
            if (azkh3 != null) {
                asmw.c = azkh3;
                asmw.b = 21;
                this.j.a((asmw) ((anxl) asmz.build()));
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}

package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: lum */
public final class lum implements ajan, eic, eli, ell, xcp {
    public final lrd a;
    public final zyw b;
    public final Set c;
    public final ffs d;
    private final xci e;
    private final ajam f;
    private final bdfu g = new bdfu();
    private final bcaa h;
    private final Set i;
    private luu j;
    private eja k;
    private aygk l;

    public lum(xci xci, ajam ajam, bcaa bcaa, zyw zyw, lrd lrd) {
        this.e = xci;
        this.f = ajam;
        this.a = lrd;
        this.b = zyw;
        this.h = bcaa;
        this.i = new CopyOnWriteArraySet();
        this.c = new CopyOnWriteArraySet();
        this.d = new ffs("PBMO");
    }

    public final long e() {
        return 1;
    }

    public final void a(luu luu) {
        this.j = luu;
        a((eib) luu);
    }

    public final lqt f() {
        return this.j.b();
    }

    public final synchronized eja c() {
        return this.k;
    }

    public final void a(eib eib) {
        this.i.add(eib);
    }

    public final void b(eib eib) {
        this.i.remove(eib);
    }

    public final void A_() {
        if (foh.x(this.b)) {
            this.g.a(a(this.f));
        } else {
            this.e.a((Object) this);
        }
        if (!elq.a((aizy) this.h.get())) {
            h();
        }
    }

    public final void ar_() {
        if (foh.x(this.b)) {
            this.g.a();
        } else {
            this.e.b(this);
        }
    }

    public final synchronized void a(apxu apxu, aygk aygk) {
        b(apxu, aygk);
    }

    public final void d() {
        h();
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkf ahkf) {
        if (airg.a(ahkf.e, 2)) {
            apxu apxu = ahkf.d;
            if (apxu == null) {
                aizy aizy = (aizy) this.h.get();
                apxu = airn.a(aizy.k(), aizy.m(), aizy.l(), 0.0f);
            }
            aakj aakj = ahkf.b;
            aygk d = (aakj == null || aakj.g() == null) ? null : aakj.g().d();
            b(apxu, d);
            if (aakj != null) {
                this.j.a(aakj.c(), aakj.f());
            }
            int i = ahkf.e;
            if (i == 5) {
                this.j.a(ahkf.c);
            } else if (i != 3) {
                this.j.a(null);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void g() {
        this.j.a(null);
    }

    /* Access modifiers changed, original: final */
    public final void a(ahjc ahjc) {
        this.j.a(ahjc);
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.t().f().a(emg.a(this.b, 274877906944L, 1)).a(new lul(this), luo.a), ajam.o().f().a(emg.a(this.b, 274877906944L, 0)).a(new lun(this), luq.a), ajam.Q().c.f().a(emg.a(this.b, 274877906944L, 1)).a(new lup(this), lus.a)};
    }

    private final synchronized void h() {
        if (this.k != null) {
            a(null, null);
        }
    }

    private final void b(apxu apxu, aygk aygk) {
        eja eja = this.k;
        if (eja == null || !eja.b(apxu)) {
            eja = new eja(apxu);
        } else {
            eja.a(apxu);
        }
        a(eja, aygk);
    }

    private final void a(eja eja, aygk aygk) {
        Object aygk2;
        eja eja2 = this.k;
        if (eja2 == null || eja == null || !eja2.b(eja.a())) {
            this.k = eja;
        } else {
            this.k.a(eja.a());
        }
        if (eja2 != this.k) {
            i();
        }
        aygk aygk3 = this.l;
        if (aygk2 == null) {
            aygk2 = this.j.a();
        }
        if (eja2 != this.k || !amqq.a(aygk3, aygk2)) {
            this.l = aygk2;
            j();
            this.j.a(this.l);
        }
    }

    private final synchronized void i() {
        for (eib a : this.i) {
            a.a(this.k);
        }
    }

    private final synchronized void j() {
        for (eie a : this.c) {
            a.a(this.k, this.l);
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjc.class, ahkb.class, ahkf.class};
        } else if (i == 0) {
            a((ahjc) obj);
            return null;
        } else if (i == 1) {
            g();
            return null;
        } else if (i == 2) {
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

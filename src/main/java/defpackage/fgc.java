package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: fgc */
public final class fgc implements t {
    public final Handler a;
    public final zyw b;
    public final fhb c;
    public fgu d;
    public bbnc e;
    private final Set f = Collections.newSetFromMap(new WeakHashMap());
    private final List g = new ArrayList();
    private int h = 0;

    public fgc(Handler handler, fhb fhb, zyw zyw) {
        this.a = handler;
        this.b = zyw;
        this.c = fhb;
    }

    public final void B_() {
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void C_() {
        bbnc bbnc = this.e;
        if (bbnc != null && !bbnc.c()) {
            this.e.bK_();
        }
    }

    public final void a(fob fob, fgz fgz, int i) {
        if (foh.H(this.b)) {
            bbnc bbnc = this.e;
            if (!(bbnc == null || bbnc.c())) {
                this.e.bK_();
            }
            this.e = this.c.a(fob, fgz, i).a(fgf.a, fge.a);
            return;
        }
        xak.a();
        amqw.a((Object) fob);
        String.valueOf(fob).length();
        if (!b(fob) && !c(fob)) {
            fgu fgu = new fgu(fob, fgz, i);
            fgu fgu2 = this.d;
            if (fgu2 == null) {
                this.d = fgu;
                c(1, fgu);
            } else if (fgu2.e != 0) {
                a(fgu, 0);
            } else {
                StringBuilder stringBuilder = new StringBuilder(61);
                stringBuilder.append("Requested Playback when currentRequest has status ");
                stringBuilder.append(0);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    public final void f() {
        if (foh.H(this.b)) {
            bbnc bbnc = this.e;
            if (!(bbnc == null || bbnc.c())) {
                this.e.bK_();
            }
            this.e = this.c.a().a(fgl.a, fgk.a);
            return;
        }
        xak.a();
        if (this.d != null) {
            a(null, 0);
        }
    }

    public final void g() {
        if (foh.H(this.b)) {
            bblt a;
            bbnc bbnc = this.e;
            if (!(bbnc == null || bbnc.c())) {
                this.e.bK_();
            }
            fhb fhb = this.c;
            xak.a();
            fhh fhh = fhb.d;
            if (fhh == null || fhh.g == 3) {
                a = bblt.a();
            } else {
                a = fhh.e;
                fhb.a(null, 0);
            }
            this.e = a.a(fgn.a, fgm.a);
            return;
        }
        xak.a();
        fgu fgu = this.d;
        if (!(fgu == null || fgu.e == 3)) {
            a(null, 0);
        }
    }

    public final void a(fgu fgu, int i) {
        fgu fgu2 = this.d;
        int i2 = fgu2.e;
        Object obj = 1;
        if (!(i2 == 3 || i2 == 2)) {
            obj = null;
        }
        if (obj == null) {
            fgu2.e = 3;
        }
        fgu fgu3 = fgu2.f;
        if (fgu3 != null) {
            fgu3.e = 3;
        }
        fgu2.f = fgu;
        if (obj == null) {
            if (fgu2.d == 3) {
                c(i, fgu2);
            } else {
                fgu2.e = 2;
                if (fgu2.a()) {
                    for (fgs a : this.g) {
                        a.a(fgu2.a.b);
                    }
                    fgu2.c.clear();
                }
                fgu2.e = 3;
                this.a.post(new fgj(this, i, fgu2));
            }
        }
    }

    public final int a(fob fob) {
        int i = 0;
        if (foh.H(this.b)) {
            fhh fhh = this.c.d;
            if (fhh != null) {
                if (fhh.a.b == fob) {
                    i = fhh.b;
                } else {
                    fhh = fhh.h;
                    if (fhh != null && fhh.a.b == fob) {
                        return fhh.b;
                    }
                }
            }
            return i;
        }
        fgu fgu = this.d;
        if (fgu != null) {
            if (fgu.a.b == fob) {
                return fgu.b;
            }
            fgu = fgu.f;
            if (fgu != null && fgu.a.b == fob) {
                return fgu.b;
            }
        }
        return 0;
    }

    public final void a(fgt fgt) {
        if (foh.H(this.b)) {
            fhi fhi = this.c.b;
            amqw.a((Object) fgt);
            fhi.a.add(fgt);
            return;
        }
        amqw.a((Object) fgt);
        this.f.add(fgt);
    }

    public final void b(fgt fgt) {
        if (foh.H(this.b)) {
            fhi fhi = this.c.b;
            amqw.a((Object) fgt);
            fhi.a.remove(fgt);
            return;
        }
        this.f.remove(fgt);
    }

    public final void a(fgs fgs) {
        if (foh.H(this.b)) {
            fhb fhb = this.c;
            amqw.a((Object) fgs);
            fhb.c.add(fgs);
            return;
        }
        amqw.a((Object) fgs);
        this.g.add(fgs);
    }

    private final void c(int i, fgu fgu) {
        int i2 = fgu.e;
        if (i2 == 0) {
            fgu.e = 1;
        } else if (!(i2 != 3 || i == 0 || i == 4)) {
            StringBuilder stringBuilder = new StringBuilder(54);
            stringBuilder.append("Can't transition aborted requests to state ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        amqw.b(fgu.a() ^ 1, "Can't transition, request is already blocked %s", fgu.c);
        for (fgs fgs : this.g) {
            fgu.c.add(fgs);
            if (fgs.a(fgu.a.b, i, new fgh(this, fgu, i, fgs))) {
                fgu.a(fgs);
            } else {
                String.valueOf(fgs).length();
            }
        }
        if (!fgu.a()) {
            this.a.post(new fgg(this, i, fgu));
        }
    }

    public final void a(int i, fgu fgu) {
        this.d = (fgu) amqw.a((Object) fgu);
        if (fgc.b(i, this.d)) {
            int i2 = this.h;
            this.h = i;
            this.d.d = i;
            for (fgt a : this.f) {
                a.a(this.d.a, i2, this.h);
            }
        }
        i = this.h;
        if (i == 3 && this.d.e != 3) {
            return;
        }
        if (i == 0 || i == 4) {
            this.d = this.d.f;
            fgu fgu2 = this.d;
            if (fgu2 != null) {
                c(1, fgu2);
            }
            return;
        }
        fgu fgu3 = this.d;
        c(fgu3.e != 3 ? i + 1 : 0, fgu3);
    }

    public static boolean b(int i, fgu fgu) {
        int i2 = fgu.e;
        return !(i2 == 3 || i2 == 2) || i == 0 || i == 4;
    }

    public final boolean b(fob fob) {
        fgu fgu = this.d;
        return fgu != null && fgu.a.b.a(fob);
    }

    public final boolean c(fob fob) {
        fgu fgu = this.d;
        if (fgu != null) {
            fgu = fgu.f;
            if (fgu != null && fgu.a.b.a(fob)) {
                return true;
            }
        }
        return false;
    }
}

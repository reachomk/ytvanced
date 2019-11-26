package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fhb */
public final class fhb {
    public final Handler a;
    public final fhi b = new fhi();
    public final List c = new ArrayList();
    public fhh d;
    private int e = 0;

    public fhb(Handler handler) {
        this.a = handler;
    }

    public final bblt a(fob fob, fgz fgz, int i) {
        xak.a();
        amqw.a((Object) fob);
        String.valueOf(fob).length();
        if (b(fob)) {
            return this.d.d;
        }
        if (c(fob)) {
            return this.d.h.d;
        }
        fhh fhh = new fhh(fob, fgz, i);
        fhh fhh2 = this.d;
        if (fhh2 == null) {
            this.d = fhh;
            c(1, fhh);
        } else if (fhh2.g == 0) {
            StringBuilder stringBuilder = new StringBuilder(61);
            stringBuilder.append("Requested Playback when currentRequest has status ");
            stringBuilder.append(0);
            return bblt.a(new IllegalStateException(stringBuilder.toString()));
        } else {
            a(fhh, 0);
        }
        return fhh.d;
    }

    public final bblt a() {
        xak.a();
        fhh fhh = this.d;
        if (fhh == null) {
            return bblt.a();
        }
        bbzr bbzr = fhh.e;
        a(null, 0);
        return bbzr;
    }

    public final bblt a(fob fob) {
        xak.a();
        String.valueOf(fob).length();
        if (this.d == null) {
            return bblt.a();
        }
        if (!b(fob) && !c(fob)) {
            return bblt.a();
        }
        bbzr bbzr = this.d.e;
        a(null, 0);
        return bbzr;
    }

    public final void a(fhh fhh, int i) {
        fhh fhh2 = this.d;
        int i2 = fhh2.g;
        Object obj = 1;
        if (!(i2 == 3 || i2 == 2)) {
            obj = null;
        }
        if (obj == null) {
            fhh2.g = 3;
        }
        fhh fhh3 = fhh2.h;
        if (fhh3 != null) {
            fhh3.g = 3;
        }
        fhh2.h = fhh;
        if (obj == null) {
            if (fhh2.f == 3) {
                c(i, fhh2);
            } else {
                fhh2.g = 2;
                if (fhh2.a()) {
                    for (fgs a : this.c) {
                        a.a(fhh2.a.b);
                    }
                    fhh2.c.clear();
                }
                fhh2.g = 3;
                this.a.post(new fhg(this, i, fhh2));
            }
        }
    }

    private final void c(int i, fhh fhh) {
        int i2 = fhh.g;
        if (i2 == 0) {
            fhh.g = 1;
        } else if (!(i2 != 3 || i == 0 || i == 4)) {
            StringBuilder stringBuilder = new StringBuilder(54);
            stringBuilder.append("Can't transition aborted requests to state ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        amqw.b(fhh.a() ^ 1, "Can't transition, request is already blocked %s", fhh.c);
        for (fgs fgs : this.c) {
            fhh.c.add(fgs);
            if (fgs.a(fhh.a.b, i, new fhe(this, fhh, i, fgs))) {
                fhh.a(fgs);
            } else {
                String.valueOf(fgs).length();
            }
        }
        if (!fhh.a()) {
            this.a.post(new fhd(this, i, fhh));
        }
    }

    public final void a(int i, fhh fhh) {
        String.valueOf(fhh).length();
        this.d = (fhh) amqw.a((Object) fhh);
        if (fhb.b(i, this.d)) {
            int i2 = this.e;
            this.e = i;
            fhh fhh2 = this.d;
            fhh2.f = i;
            fhi fhi = this.b;
            int i3 = this.e;
            for (fgt a : fhi.a) {
                a.a(fhh2.a, i2, i3);
            }
            if (i3 == 0 || i3 == 4) {
                fhh2.e.bL_();
            } else if (i3 == 3) {
                fhh2.d.bL_();
            }
        }
        i = this.e;
        if (i == 3 && this.d.g != 3) {
            return;
        }
        if (i == 0 || i == 4) {
            this.d = this.d.h;
            fhh fhh3 = this.d;
            if (fhh3 != null) {
                c(1, fhh3);
            }
            return;
        }
        fhh fhh4 = this.d;
        c(fhh4.g != 3 ? i + 1 : 0, fhh4);
    }

    public static boolean b(int i, fhh fhh) {
        int i2 = fhh.g;
        return !(i2 == 3 || i2 == 2) || i == 0 || i == 4;
    }

    public final boolean b(fob fob) {
        fhh fhh = this.d;
        return fhh != null && fhh.a.b.a(fob);
    }

    public final boolean c(fob fob) {
        fhh fhh = this.d;
        if (fhh != null) {
            fhh = fhh.h;
            if (fhh != null && fhh.a.b.a(fob)) {
                return true;
            }
        }
        return false;
    }
}

package defpackage;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

/* renamed from: dbj */
final class dbj extends apa {
    public final /* synthetic */ dad c;

    dbj(dad dad) {
        this.c = dad;
        a(dad.l);
    }

    public final aqj a(ViewGroup viewGroup, int i) {
        dad dad = this.c;
        dcc dcc = dad.C;
        if (i == dcc.b) {
            czt czt = dad.h;
            return new dbg(new cpq(dad.g), true);
        }
        dat dat = dad.d;
        if (dat != null) {
            return dat.a(viewGroup, i);
        }
        cye cye = (cye) dcc.a.get(i);
        Context context = this.c.g.b;
        return new dbg(cye.a(viewGroup), false);
    }

    public final void a(aqj aqj, int i) {
        cyl cyl = (cyl) this.c.b.get(this.c.f(i));
        dbz e = cyl.e();
        if (e.c()) {
            cpq cpq = (cpq) aqj.a;
            cpq.a(this.c.m);
            i = this.c.b(cyl);
            int c = this.c.c(cyl);
            if (!cyl.a(i, c)) {
                cyl.a(this.c.g, i, c, new crd());
            }
            int a = this.c.e.a();
            int i2 = -1;
            int size = MeasureSpec.getMode(i) == 1073741824 ? MeasureSpec.getSize(i) : a == 1 ? -1 : -2;
            if (MeasureSpec.getMode(c) == 1073741824) {
                i2 = MeasureSpec.getSize(c);
            } else if (a == 1) {
                i2 = -2;
            }
            e.b();
            cpq.setLayoutParams(new dbn(size, i2, i, c));
            cpq.a(cyl.g());
            cpq.getClass();
            cpq.post(new dbm(cpq));
            if (cyl.e().e() != null && cyl.i() == 0) {
                cpq.A = new dbl(this, cpq);
            }
        } else {
            dat dat = this.c.d;
            if (dat != null) {
                dat.a(aqj, i);
            } else {
                dbg dbg = (dbg) aqj;
                cyb g = e.g();
                dbg.q = g;
                g.a(dbg.a);
            }
        }
        cuj.a();
    }

    public final int a(int i) {
        dad dad = this.c;
        dbz e = ((cyl) dad.b.get(dad.f(i))).e();
        if (e.c()) {
            return this.c.C.b;
        }
        dat dat = this.c.d;
        if (dat != null) {
            return dat.a(i);
        }
        return e.j();
    }

    public final int a() {
        int size = this.c.b.size();
        return (!this.c.p || size <= 0) ? size : Integer.MAX_VALUE;
    }

    public final void a(aqj aqj) {
        if (aqj instanceof dbg) {
            dbg dbg = (dbg) aqj;
            if (dbg.p) {
                cpq cpq = (cpq) aqj.a;
                cpq.o();
                cpq.a(null);
                cpq.a(null);
                return;
            }
            cyb cyb = dbg.q;
            if (cyb != null) {
                cyb.b(aqj.a);
                dbg.q = null;
            }
            return;
        }
        this.c.d.a(aqj);
    }

    public final long b(int i) {
        return (long) ((cyl) this.c.b.get(i)).g;
    }
}

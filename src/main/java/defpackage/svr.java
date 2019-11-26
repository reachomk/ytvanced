package defpackage;

import android.content.Context;
import android.widget.ImageView;

/* renamed from: svr */
public final class svr extends cma {
    @cue(a = 13)
    public Boolean a;
    @cue(a = 13)
    public bapb b;
    @cue(a = 13)
    public bapb c;
    @cue(a = 13)
    public bapb d;
    @cue(a = 13)
    public sxh e;
    @cue(a = 3)
    public int f;
    @cue(a = 13)
    public sxd g;
    private brj u;
    private crd v;

    public svr() {
        super("GlideImageFlat");
    }

    public final int A() {
        return 3;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean n() {
        return true;
    }

    public final boolean t() {
        return true;
    }

    public final boolean u() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean v() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final int w() {
        return 30;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean x() {
        return false;
    }

    public final boolean a(cma cma) {
        if (this == cma) {
            return true;
        }
        if (cma == null || getClass() != cma.getClass()) {
            return false;
        }
        svr svr = (svr) cma;
        if (this.j == svr.j) {
            return true;
        }
        Boolean bool = this.a;
        if (!bool == null ? bool.equals(svr.a) : svr.a == null) {
            return false;
        }
        bapb bapb = this.b;
        if (!bapb == null ? bapb.equals(svr.b) : svr.b == null) {
            return false;
        }
        bapb = this.c;
        if (!bapb == null ? bapb.equals(svr.c) : svr.c == null) {
            return false;
        }
        bapb = this.d;
        if (!bapb == null ? bapb.equals(svr.d) : svr.d == null) {
            return false;
        }
        sxh sxh = this.e;
        if (!sxh == null ? sxh.equals(svr.e) : svr.e == null) {
            return false;
        }
        if (this.f != svr.f) {
            return false;
        }
        sxd sxd = this.g;
        sxd sxd2 = svr.g;
        return sxd == null ? sxd2 == null : sxd.equals(sxd2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(cma cma) {
        svr svr = (svr) cma;
        this.u = svr.u;
        this.v = svr.v;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cmn cmn, int i, int i2, crd crd) {
        float c;
        bapb bapb = this.d;
        if (bapb.a() != 0) {
            bape g = bapb.g(0);
            c = ((float) g.c()) / ((float) g.d());
        } else {
            c = 1.0f;
        }
        cya.a(i, i2, c, crd);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object b(Context context) {
        return svv.a(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cmn cmn) {
        cqp cqp = new cqp();
        cqp cqp2 = new cqp();
        svv.a(cmg, cmn, this.d, this.f, this.b, this.c, cqp, cqp2);
        this.u = (brj) cqp.a;
        this.v = (crd) cqp2.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(cmg cmg, Object obj) {
        svv.a((ImageView) obj, this.d, this.b, this.c, this.e, this.a, this.u, this.v, this.g);
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(cmg cmg, Object obj) {
        svv.a(cmg, (ImageView) obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(cma cma, cma cma2) {
        svr svr = (svr) cma;
        svr svr2 = (svr) cma2;
        Object obj = null;
        Object obj2 = svr != null ? svr.d : null;
        if (svr2 != null) {
            obj = svr2.d;
        }
        return svv.a(new coa(obj2, obj));
    }

    public final /* bridge */ /* synthetic */ cma g() {
        svr svr = (svr) super.g();
        svr.u = null;
        svr.v = null;
        return svr;
    }
}

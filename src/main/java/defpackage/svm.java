package defpackage;

import android.content.Context;
import android.widget.ImageView;

/* renamed from: svm */
public final class svm extends cma {
    @cue(a = 13)
    public Boolean a;
    @cue(a = 13)
    public bdhi b;
    @cue(a = 13)
    public bdhi c;
    @cue(a = 13)
    public bdhi d;
    @cue(a = 13)
    public sxh e;
    @cue(a = 3)
    public int f;
    @cue(a = 13)
    public sxd g;
    private brj u;
    private crd v;

    public svm() {
        super("GlideImage");
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
        svm svm = (svm) cma;
        if (this.j == svm.j) {
            return true;
        }
        Boolean bool = this.a;
        if (!bool == null ? bool.equals(svm.a) : svm.a == null) {
            return false;
        }
        bdhi bdhi = this.b;
        if (!bdhi == null ? bdhi.equals(svm.b) : svm.b == null) {
            return false;
        }
        bdhi = this.c;
        if (!bdhi == null ? bdhi.equals(svm.c) : svm.c == null) {
            return false;
        }
        bdhi = this.d;
        if (!bdhi == null ? bdhi.equals(svm.d) : svm.d == null) {
            return false;
        }
        sxh sxh = this.e;
        if (!sxh == null ? sxh.equals(svm.e) : svm.e == null) {
            return false;
        }
        if (this.f != svm.f) {
            return false;
        }
        sxd sxd = this.g;
        sxd sxd2 = svm.g;
        return sxd == null ? sxd2 == null : sxd.equals(sxd2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(cma cma) {
        svm svm = (svm) cma;
        this.u = svm.u;
        this.v = svm.v;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cmn cmn, int i, int i2, crd crd) {
        swa.a(i, i2, crd, this.d);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object b(Context context) {
        return swa.a(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cmn cmn) {
        cqp cqp = new cqp();
        cqp cqp2 = new cqp();
        swa.a(cmg, cmn, this.d, this.f, this.b, this.c, cqp, cqp2);
        this.u = (brj) cqp.a;
        this.v = (crd) cqp2.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(cmg cmg, Object obj) {
        swa.a((ImageView) obj, this.d, this.b, this.c, this.e, this.a, this.u, this.v, this.g);
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(cmg cmg, Object obj) {
        swa.a(cmg, (ImageView) obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(cma cma, cma cma2) {
        svm svm = (svm) cma;
        svm svm2 = (svm) cma2;
        Object obj = null;
        Object obj2 = svm != null ? svm.d : null;
        if (svm2 != null) {
            obj = svm2.d;
        }
        return swa.a(new coa(obj2, obj));
    }

    public final /* bridge */ /* synthetic */ cma g() {
        svm svm = (svm) super.g();
        svm.u = null;
        svm.v = null;
        return svm;
    }
}

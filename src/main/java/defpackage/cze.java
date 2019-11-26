package defpackage;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.view.View.OnScrollChangeListener;
import com.facebook.litho.ComponentTree;
import com.facebook.yoga.YogaDirection;

/* renamed from: cze */
public final class cze extends cma {
    @cue(a = 10)
    public cma a;
    @cue(a = 3)
    public boolean b;
    @cue(a = 13)
    public Integer c;
    @cue(a = 13)
    public OnScrollChangeListener d;
    @cue(a = 3)
    public boolean e = true;
    @cue(a = 14)
    private czg f = new czg();
    private Integer g;
    private Integer u;
    private YogaDirection v;
    private Integer w;
    private Integer x;

    private cze() {
        super("HorizontalScroll");
    }

    public final int A() {
        return 3;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean n() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean v() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final int w() {
        return 3;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean x() {
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean y() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final crh d() {
        return this.f;
    }

    public final boolean a(cma cma) {
        if (this == cma) {
            return true;
        }
        if (cma == null || getClass() != cma.getClass()) {
            return false;
        }
        cze cze = (cze) cma;
        if (this.j == cze.j) {
            return true;
        }
        cma cma2 = this.a;
        if (!cma2 == null ? cma2.a(cze.a) : cze.a == null) {
            return false;
        }
        if (this.b == cze.b) {
            Integer num = this.c;
            if (!num == null ? num.equals(cze.c) : cze.c == null) {
                return false;
            }
            OnScrollChangeListener onScrollChangeListener = this.d;
            if (!onScrollChangeListener == null ? onScrollChangeListener.equals(cze.d) : cze.d == null) {
                return false;
            }
            if (this.e == cze.e) {
                ComponentTree componentTree = this.f.a;
                if (!componentTree == null ? componentTree.equals(cze.f.a) : cze.f.a == null) {
                    return false;
                }
                czj czj = this.f.b;
                czj czj2 = cze.f.b;
                return czj == null ? czj2 == null : czj.equals(czj2);
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(cma cma) {
        cze cze = (cze) cma;
        this.g = cze.g;
        this.u = cze.u;
        this.v = cze.v;
        this.w = cze.w;
        this.x = cze.x;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cmn cmn, int i, int i2, crd crd) {
        cqp cqp = new cqp();
        cqp cqp2 = new cqp();
        cma cma = this.a;
        ComponentTree componentTree = this.f.a;
        crd a = czf.a();
        componentTree.a(cma, MeasureSpec.makeMeasureSpec(0, 0), i2, a);
        i2 = a.a;
        int i3 = a.b;
        czf.a(a);
        cqp.a = Integer.valueOf(i2);
        cqp2.a = Integer.valueOf(i3);
        if (MeasureSpec.getMode(i) != 0) {
            i2 = MeasureSpec.getSize(i);
        }
        crd.a = i2;
        crd.b = i3;
        this.x = (Integer) cqp.a;
        this.w = (Integer) cqp2.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cmn cmn) {
        cqp cqp = new cqp();
        cqp cqp2 = new cqp();
        cqp cqp3 = new cqp();
        czf.a(cmn, this.a, this.b, this.f.a, this.x, this.w, cqp, cqp2, cqp3);
        this.u = (Integer) cqp.a;
        this.g = (Integer) cqp2.a;
        this.v = (YogaDirection) cqp3.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object b(Context context) {
        return czf.a(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(cmg cmg, Object obj) {
        czk czk = (czk) obj;
        boolean z = this.e;
        OnScrollChangeListener onScrollChangeListener = this.d;
        czg czg = this.f;
        czf.a(czk, z, onScrollChangeListener, czg.b, czg.a, this.u.intValue(), this.g.intValue(), this.v);
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(cmg cmg, Object obj) {
        czf.a((czk) obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final void f(cmg cmg) {
        cri cri = new cri();
        cri cri2 = new cri();
        czf.a(cmg, cri, cri2, this.a, this.c);
        czg czg = this.f;
        czg.b = (czj) cri.a;
        czg.a = (ComponentTree) cri2.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(crh crh, crh crh2) {
        czg czg = (czg) crh;
        czg czg2 = (czg) crh2;
        czg2.a = czg.a;
        czg2.b = czg.b;
    }

    public static czd a(cmg cmg) {
        czd czd = new czd();
        czd.a(czd, cmg, new cze());
        return czd;
    }

    public final /* synthetic */ cma g() {
        cze cze = (cze) super.g();
        cma cma = cze.a;
        cze.a = cma != null ? cma.g() : null;
        cze.g = null;
        cze.u = null;
        cze.v = null;
        cze.w = null;
        cze.x = null;
        cze.f = new czg();
        return cze;
    }
}

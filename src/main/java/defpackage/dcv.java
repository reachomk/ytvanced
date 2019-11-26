package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View.MeasureSpec;
import com.facebook.litho.ComponentTree;

/* renamed from: dcv */
public final class dcv extends cma {
    @cue(a = 10)
    public cma a;
    @cue(a = 3)
    public boolean b;
    @cue(a = 3)
    public boolean c;
    @cue(a = 3)
    public boolean d;
    @cue(a = 13)
    public Integer e;
    @cue(a = 3)
    public boolean f;
    @cue(a = 13)
    public adh g;
    @cue(a = 3)
    public boolean u = true;
    @cue(a = 14)
    private dcx v = new dcx();
    @cue(a = 3)
    private final boolean w = true;
    private Integer x;
    private Integer y;

    private dcv() {
        super("VerticalScroll");
    }

    public final int A() {
        return 3;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean n() {
        return true;
    }

    public final boolean o() {
        return true;
    }

    public final boolean t() {
        return true;
    }

    public final boolean u() {
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
        return this.v;
    }

    public final boolean a(cma cma) {
        if (this == cma) {
            return true;
        }
        if (cma == null || getClass() != cma.getClass()) {
            return false;
        }
        dcv dcv = (dcv) cma;
        if (this.j == dcv.j) {
            return true;
        }
        cma cma2 = this.a;
        if (!cma2 == null ? cma2.a(dcv.a) : dcv.a == null) {
            return false;
        }
        if (this.b == dcv.b && this.c == dcv.c && this.d == dcv.d) {
            Integer num = this.e;
            if (!num == null ? num.equals(dcv.e) : dcv.e == null) {
                return false;
            }
            if (this.f == dcv.f) {
                adh adh = this.g;
                if (!adh == null ? adh.equals(dcv.g) : dcv.g == null) {
                    return false;
                }
                if (this.u == dcv.u && this.w == dcv.w) {
                    ComponentTree componentTree = this.v.a;
                    if (!componentTree == null ? componentTree.equals(dcv.v.a) : dcv.v.a == null) {
                        return false;
                    }
                    ddb ddb = this.v.b;
                    ddb ddb2 = dcv.v.b;
                    return ddb == null ? ddb2 == null : ddb.equals(ddb2);
                }
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(cma cma) {
        dcv dcv = (dcv) cma;
        this.x = dcv.x;
        this.y = dcv.y;
    }

    /* Access modifiers changed, original: protected|final */
    public final void f(cmg cmg) {
        cri cri = new cri();
        cri cri2 = new cri();
        Integer num = this.e;
        boolean z = this.d;
        cma cma = this.a;
        ddb ddb = new ddb();
        ddb.a = num != null ? num.intValue() : 0;
        cri.a = ddb;
        cmy a = ComponentTree.a(new cmg(cmg.b, cmg.c, cmg.d, cmg.e(), (byte) 0), cma);
        a.c = z;
        cri2.a = a.a();
        dcx dcx = this.v;
        dcx.b = (ddb) cri.a;
        dcx.a = (ComponentTree) cri2.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cmn cmn, int i, int i2, crd crd) {
        cqp cqp = new cqp();
        cqp cqp2 = new cqp();
        cma cma = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        dda.a(cmg, i, i2, crd, this.v.a, cma, z, z2);
        cqp.a = Integer.valueOf(crd.a);
        cqp2.a = Integer.valueOf(crd.b);
        this.y = (Integer) cqp.a;
        this.x = (Integer) cqp2.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cmn cmn) {
        cma cma = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        ComponentTree componentTree = this.v.a;
        Integer num = this.y;
        Integer num2 = this.x;
        int a = (cmn.a() - cmn.f()) - cmn.d();
        int b = (cmn.b() - cmn.c()) - cmn.e();
        if (num == null || num.intValue() != a || (z && (num2 == null || num2.intValue() != b))) {
            a = MeasureSpec.makeMeasureSpec(cmn.a(), 1073741824);
            dda.a(cmg, a, MeasureSpec.makeMeasureSpec(cmn.b(), 1073741824), new crd(), componentTree, cma, z, z2);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object b(Context context) {
        return new dcz(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(cmg cmg, Object obj) {
        dcz dcz = (dcz) obj;
        boolean z = this.u;
        boolean z2 = this.w;
        boolean z3 = this.f;
        boolean z4 = this.d;
        adh adh = this.g;
        dcx dcx = this.v;
        ComponentTree componentTree = dcx.a;
        ddb ddb = dcx.b;
        dcz.b.a(componentTree);
        dcz.e = z4;
        dcz.c = ddb;
        ddc ddc = new ddc(dcz, ddb);
        dcz.getViewTreeObserver().addOnPreDrawListener(ddc);
        dcz.d = ddc;
        dcz.setScrollbarFadingEnabled(z2);
        dcz.setNestedScrollingEnabled(z3);
        dcz.setVerticalFadingEdgeEnabled(false);
        dcz.setFadingEdgeLength(0);
        if (VERSION.SDK_INT < 21) {
            dcz.setVerticalScrollBarEnabled(false);
        } else {
            dcz.setVerticalScrollBarEnabled(z);
        }
        dcz.a = adh;
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(cmg cmg, Object obj) {
        dcz dcz = (dcz) obj;
        dcz.a = null;
        dcz.b.a(null);
        dcz.c = null;
        dcz.getViewTreeObserver().removeOnPreDrawListener(dcz.d);
        dcz.d = null;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(cma cma, cma cma2) {
        dcv dcv = (dcv) cma;
        dcv dcv2 = (dcv) cma2;
        Object obj = null;
        coa coa = new coa(dcv != null ? dcv.a : null, dcv2 != null ? dcv2.a : null);
        coa coa2 = new coa(dcv != null ? Boolean.valueOf(dcv.u) : null, dcv2 != null ? Boolean.valueOf(dcv2.u) : null);
        coa coa3 = new coa(dcv != null ? Boolean.valueOf(dcv.w) : null, dcv2 != null ? Boolean.valueOf(dcv2.w) : null);
        coa coa4 = new coa(dcv != null ? Boolean.valueOf(dcv.c) : null, dcv2 != null ? Boolean.valueOf(dcv2.c) : null);
        coa coa5 = new coa(dcv != null ? Boolean.valueOf(dcv.f) : null, dcv2 != null ? Boolean.valueOf(dcv2.f) : null);
        Object valueOf = dcv != null ? Boolean.valueOf(dcv.d) : null;
        if (dcv2 != null) {
            obj = Boolean.valueOf(dcv2.d);
        }
        coa coa6 = new coa(valueOf, obj);
        if (((cma) coa.a).a((cma) coa.b) && ((Boolean) coa2.a).equals(coa2.b) && ((Boolean) coa3.a).equals(coa3.b) && ((Boolean) coa4.a).equals(coa4.b) && ((Boolean) coa5.a).equals(coa5.b) && ((Boolean) coa6.a).equals(coa6.b)) {
            return false;
        }
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(crh crh, crh crh2) {
        dcx dcx = (dcx) crh;
        dcx dcx2 = (dcx) crh2;
        dcx2.a = dcx.a;
        dcx2.b = dcx.b;
    }

    public static dcy a(cmg cmg) {
        dcy dcy = new dcy();
        dcy.a(dcy, cmg, new dcv());
        return dcy;
    }

    public final /* synthetic */ cma g() {
        dcv dcv = (dcv) super.g();
        cma cma = dcv.a;
        dcv.a = cma != null ? cma.g() : null;
        dcv.x = null;
        dcv.y = null;
        dcv.v = new dcx();
        return dcv;
    }
}

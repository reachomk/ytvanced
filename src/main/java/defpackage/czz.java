package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: czz */
public final class czz extends cma {
    public static final aaa a = new aaa(2);
    @cue(a = 3)
    public int A = 0;
    @cue(a = 3)
    public boolean B = true;
    @cue(a = 13)
    public dbp C;
    @cue(a = 3)
    public int D = -1;
    @cue(a = 11)
    public coj E;
    @cue(a = 13)
    public Integer F;
    @cue(a = 3)
    public int G = -16777216;
    @cue(a = 3)
    public int H = 0;
    @cue(a = 3)
    public int I = 0;
    @cue(a = 13)
    public arm J;
    @cue(a = 3)
    public int K = 0;
    @cue(a = 13)
    public czu L;
    @cue(a = 3)
    public boolean M;
    @cue(a = 14)
    private dae N = new dae();
    @cue(a = 3)
    private final boolean O = true;
    private aph P;
    private bfd Q;
    @cue(a = 13)
    public cyf b;
    @cue(a = 3)
    public int c = 0;
    @cue(a = 3)
    public boolean d = true;
    @cue(a = 3)
    public boolean e = true;
    @cue(a = 13)
    public CharSequence f;
    @cue(a = 3)
    public int g;
    @cue(a = 3)
    public boolean u;
    @cue(a = 13)
    public aph v = dby.a;
    @cue(a = 13)
    public apk w;
    @cue(a = 3)
    public int x = 0;
    @cue(a = 3)
    public boolean y = true;
    @cue(a = 5)
    public List z;

    private czz() {
        super("Recycler");
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
        return this.N;
    }

    public final boolean a(cma cma) {
        if (this == cma) {
            return true;
        }
        if (cma == null || getClass() != cma.getClass()) {
            return false;
        }
        czz czz = (czz) cma;
        if (this.j == czz.j) {
            return true;
        }
        cyf cyf = this.b;
        if (!cyf == null ? cyf.equals(czz.b) : czz.b == null) {
            return false;
        }
        if (this.c == czz.c && this.d == czz.d && this.e == czz.e) {
            CharSequence charSequence = this.f;
            if (!charSequence == null ? charSequence.equals(czz.f) : czz.f == null) {
                return false;
            }
            if (this.g == czz.g && this.O == czz.O) {
                aph aph = this.v;
                if (!aph == null ? aph.equals(czz.v) : czz.v == null) {
                    return false;
                }
                if (this.x == czz.x && this.y == czz.y) {
                    List list = this.z;
                    if (!list == null ? list.equals(czz.z) : czz.z == null) {
                        return false;
                    }
                    if (this.B == czz.B) {
                        dbp dbp = this.C;
                        if (!dbp == null ? dbp.equals(czz.C) : czz.C == null) {
                            return false;
                        }
                        if (this.D == czz.D) {
                            coj coj = this.E;
                            if (!coj == null ? coj.a(czz.E) : czz.E == null) {
                                return false;
                            }
                            if (this.G == czz.G && this.H == czz.H) {
                                arm arm = this.J;
                                if (arm == null ? czz.J == null : arm.equals(czz.J)) {
                                    return this.K == czz.K && this.N.a == czz.N.a;
                                } else {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(cma cma) {
        czz czz = (czz) cma;
        this.P = czz.P;
        this.Q = czz.Q;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cmn cmn, int i, int i2, crd crd) {
        dby.a(cmg, i, i2, crd, this.b);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cmn cmn) {
        dby.a(cmn, this.b);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object b(Context context) {
        return dby.a(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void e(cmg cmg) {
        cqp cqp = new cqp();
        dby.a(this.E, cqp);
        this.Q = (bfd) cqp.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(cmg cmg, Object obj) {
        dby.a((dcb) obj, this.b, this.O, this.e, this.x, this.H, this.K, this.c, null, this.G, this.d, this.y, 0, null, false, false, this.g, this.D, 0, this.f);
    }

    /* Access modifiers changed, original: protected|final */
    public final void e(cmg cmg, Object obj) {
        cqp cqp = new cqp();
        dby.a((dcb) obj, this.b, this.v, this.C, this.z, this.J, this.B, null, this.Q, cqp);
        this.P = (aph) cqp.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(Object obj) {
        dby.a((dcb) obj, this.b, this.C, this.z, this.P);
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(cmg cmg, Object obj) {
        dby.a((dcb) obj, this.b, null, null, this.J);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(cma cma, cma cma2) {
        boolean z;
        coa coa;
        Object valueOf;
        coa coa2;
        Object obj;
        coa coa3;
        czz czz = (czz) cma;
        czz czz2 = (czz) cma2;
        Object obj2 = null;
        coa coa4 = new coa(czz != null ? czz.b : null, czz2 != null ? czz2.b : null);
        coa coa5 = new coa(czz != null ? Boolean.valueOf(czz.O) : null, czz2 != null ? Boolean.valueOf(czz2.O) : null);
        coa coa6 = new coa(czz != null ? Boolean.valueOf(czz.e) : null, czz2 != null ? Boolean.valueOf(czz2.e) : null);
        coa coa7 = new coa(czz != null ? Integer.valueOf(czz.x) : null, czz2 != null ? Integer.valueOf(czz2.x) : null);
        coa coa8 = new coa(czz != null ? Integer.valueOf(czz.H) : null, czz2 != null ? Integer.valueOf(czz2.H) : null);
        coa coa9 = new coa(czz != null ? Integer.valueOf(czz.K) : null, czz2 != null ? Integer.valueOf(czz2.K) : null);
        coa coa10 = new coa(czz != null ? Integer.valueOf(czz.c) : null, czz2 != null ? Integer.valueOf(czz2.c) : null);
        coa coa11 = new coa(null, null);
        coa coa12 = new coa(czz != null ? Integer.valueOf(czz.G) : null, czz2 != null ? Integer.valueOf(czz2.G) : null);
        coa coa13 = new coa(czz != null ? Boolean.valueOf(czz.d) : null, czz2 != null ? Boolean.valueOf(czz2.d) : null);
        coa coa14 = new coa(czz != null ? Integer.valueOf(0) : null, czz2 != null ? Integer.valueOf(0) : null);
        coa coa15 = new coa(null, null);
        if (czz != null) {
            z = false;
            obj2 = Boolean.valueOf(false);
        } else {
            z = false;
        }
        if (czz2 != null) {
            coa = coa15;
            valueOf = Boolean.valueOf(z);
        } else {
            coa = coa15;
            valueOf = null;
        }
        coa coa16 = new coa(obj2, valueOf);
        obj2 = czz != null ? Boolean.valueOf(z) : null;
        if (czz2 != null) {
            Boolean valueOf2 = Boolean.valueOf(z);
            coa2 = coa16;
            obj = valueOf2;
        } else {
            coa2 = coa16;
            obj = null;
        }
        coa15 = new coa(obj2, obj);
        obj2 = czz != null ? Integer.valueOf(czz.g) : null;
        if (czz2 != null) {
            coa3 = coa15;
            valueOf = Integer.valueOf(czz2.g);
        } else {
            coa3 = coa15;
            valueOf = null;
        }
        return dby.a(coa4, coa5, coa6, coa7, coa8, coa9, coa10, coa11, coa12, coa13, coa14, coa, coa2, coa3, new coa(obj2, valueOf), new coa(czz != null ? Integer.valueOf(czz.N.a) : null, czz2 != null ? Integer.valueOf(czz2.N.a) : null));
    }

    /* Access modifiers changed, original: protected|final */
    public final void f(cmg cmg) {
        cri cri = new cri();
        dby.a(cri);
        this.N.a = ((Integer) cri.a).intValue();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean z() {
        return dby.a(this.b);
    }

    public static coj a(cmg cmg) {
        return cmm.a(cmg, 946341036, new Object[]{cmg});
    }

    public final Object a(coj coj, Object obj) {
        int i = coj.b;
        if (i == -1048037474) {
            cmm.a((cmg) coj.c[0], (coi) obj);
            return null;
        } else if (i != 946341036) {
            return null;
        } else {
            dby.a((cmg) coj.c[0], ((czz) coj.a).N.a);
            return null;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(crh crh, crh crh2) {
        ((dae) crh2).a = ((dae) crh).a;
    }

    protected static void a(cmg cmg, int i) {
        if (cmg.h != null) {
            cmg.b(new dab(i), "Recycler.onUpdateMeasure");
        }
    }

    public static dac g(cmg cmg) {
        dac dac = new dac();
        dac.a(dac, cmg, new czz());
        return dac;
    }

    public final /* synthetic */ cma g() {
        czz czz = (czz) super.g();
        czz.P = null;
        czz.Q = null;
        czz.N = new dae();
        return czz;
    }
}

package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextUtils.TruncateAt;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.View;

/* renamed from: dco */
public final class dco extends cma {
    private static final aaa x = new aaa(2);
    @cue(a = 3)
    private final int A = -1;
    @cue(a = 0)
    private final float B = Float.MAX_VALUE;
    @cue(a = 3)
    private final int C = -1;
    @cue(a = 3)
    private final int D = Integer.MAX_VALUE;
    @cue(a = 3)
    private final int E = -1;
    @cue(a = 3)
    private final int F = aocf.UNSET_ENUM_VALUE;
    @cue(a = 3)
    private final int G = -7829368;
    @cue(a = 0)
    private final float H = 1.0f;
    @cue(a = 13)
    private final ColorStateList I = dcu.a;
    @cue(a = 3)
    private final int J = 13;
    @cue(a = 3)
    private final int K = dcu.b;
    @cue(a = 13)
    private final Typeface L = dcu.c;
    private ClickableSpan[] M;
    private ImageSpan[] N;
    private Layout O;
    private Integer P;
    private Integer Q;
    private CharSequence R;
    private Layout S;
    private Float T;
    @cue(a = 13)
    private final int U = dcu.d;
    @cue(a = 3)
    public boolean a;
    @cue(a = 3)
    public int b = 0;
    @cue(a = 13)
    public CharSequence c;
    @cue(a = 13)
    public TruncateAt d;
    @cue(a = 0)
    public float e;
    @cue(a = 3)
    public int f = 0;
    @cue(a = 3)
    public int g = Integer.MAX_VALUE;
    @cue(a = 3)
    public boolean u = true;
    @cue(a = 13)
    public CharSequence v;
    @cue(a = 13)
    public int w = dcu.e;
    @cue(a = 3)
    private final boolean y = true;
    @cue(a = 3)
    private final int z = -1;

    private dco() {
        super("Text");
    }

    public final int A() {
        return 2;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean n() {
        return true;
    }

    public final boolean r() {
        return true;
    }

    public final boolean s() {
        return true;
    }

    public final boolean t() {
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
        dco dco = (dco) cma;
        if (this.j == dco.j) {
            return true;
        }
        if (this.a == dco.a && this.b == dco.b && Float.compare(0.0f, 0.0f) == 0 && this.y == dco.y) {
            CharSequence charSequence = this.c;
            if (!charSequence == null ? charSequence.equals(dco.c) : dco.c == null) {
                return false;
            }
            TruncateAt truncateAt = this.d;
            if (!truncateAt == null ? truncateAt.equals(dco.d) : dco.d == null) {
                return false;
            }
            if (Float.compare(this.e, dco.e) == 0 && this.z == dco.z && this.A == dco.A && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.B, dco.B) == 0 && this.f == dco.f && this.C == dco.C && this.g == dco.g && this.D == dco.D && this.E == dco.E && this.F == dco.F && this.G == dco.G && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && this.u == dco.u && Float.compare(this.H, dco.H) == 0) {
                CharSequence charSequence2 = this.v;
                if (!charSequence2 == null ? charSequence2.equals(dco.v) : dco.v == null) {
                    return false;
                }
                int i = this.w;
                if (i == 0 ? dco.w != 0 : i != dco.w) {
                    ColorStateList colorStateList = this.I;
                    if (!colorStateList == null ? colorStateList.equals(dco.I) : dco.I == null) {
                        return false;
                    }
                    if (this.J == dco.J && this.K == dco.K) {
                        Typeface typeface = this.L;
                        if (!typeface == null ? typeface.equals(dco.L) : dco.L == null) {
                            return false;
                        }
                        i = this.U;
                        int i2 = dco.U;
                        return i == 0 ? i2 == 0 : i == i2;
                    }
                }
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(cma cma) {
        dco dco = (dco) cma;
        this.M = dco.M;
        this.N = dco.N;
        this.O = dco.O;
        this.P = dco.P;
        this.Q = dco.Q;
        this.R = dco.R;
        this.S = dco.S;
        this.T = dco.T;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cmn cmn, int i, int i2, crd crd) {
        cmg cmg2 = cmg;
        cmn cmn2 = cmn;
        int i3 = i;
        int i4 = i2;
        crd crd2 = crd;
        cqp cqp = r15;
        cqp cqp2 = new cqp();
        cqp cqp3 = r14;
        cqp cqp4 = new cqp();
        cqp cqp5 = r13;
        cqp cqp6 = new cqp();
        cqp cqp7 = cqp6;
        cqp cqp8 = cqp7;
        cqp7 = cqp4;
        cqp cqp9 = cqp7;
        cqp7 = cqp2;
        cqp cqp10 = cqp7;
        cmg = cmg2;
        dcu.a(cmg, cmn2, i3, i4, crd2, this.v, this.d, this.u, this.F, this.g, this.E, this.C, this.D, this.G, this.I, this.f, this.J, this.e, this.H, this.K, this.L, this.w, this.b, this.B, cqp, cqp3, cqp5);
        this.O = (Layout) cqp10.a;
        this.Q = (Integer) cqp9.a;
        this.P = (Integer) cqp8.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cmn cmn) {
        cmg cmg2 = cmg;
        cmn cmn2 = cmn;
        cqp cqp = r15;
        cqp cqp2 = new cqp();
        cqp cqp3 = r14;
        cqp cqp4 = new cqp();
        cqp cqp5 = r13;
        cqp cqp6 = new cqp();
        cqp cqp7 = r12;
        cqp cqp8 = new cqp();
        cqp cqp9 = r11;
        cqp cqp10 = new cqp();
        cqp cqp11 = cqp10;
        cqp cqp12 = cqp11;
        cqp11 = cqp8;
        cqp cqp13 = cqp11;
        cqp11 = cqp6;
        cqp cqp14 = cqp11;
        cqp11 = cqp4;
        cqp cqp15 = cqp11;
        cqp11 = cqp2;
        cqp cqp16 = cqp11;
        cmg = cmg2;
        dcu.a(cmg, cmn2, this.v, this.d, this.u, this.g, this.E, this.C, this.D, this.G, this.I, this.f, this.J, this.e, this.H, this.U, this.K, this.L, this.w, this.b, this.c, this.B, this.O, this.Q, this.P, cqp, cqp3, cqp5, cqp7, cqp9);
        this.R = (CharSequence) cqp16.a;
        this.S = (Layout) cqp15.a;
        this.T = (Float) cqp14.a;
        this.M = (ClickableSpan[]) cqp13.a;
        this.N = (ImageSpan[]) cqp12.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object b(Context context) {
        return dcu.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(cmg cmg, Object obj) {
        dcu.a((dcp) obj, this.I, this.A, this.z, this.y, this.R, this.S, this.T, this.M, this.N);
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(cmg cmg, Object obj) {
        dcu.a((dcp) obj, this.v);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view, aca aca) {
        dcu.a(view, aca, this.v);
    }

    /* Access modifiers changed, original: protected|final */
    public final int q() {
        return dcu.a(this.a, this.M);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aca aca, int i, int i2, int i3) {
        dcu.a(aca, i, i2, i3, this.v, this.S, this.M);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(int i, int i2) {
        return dcu.a(i, i2, this.v, this.S, this.M);
    }

    public static dcn a(cmg cmg) {
        dcn dcn = new dcn();
        dcn.a(dcn, cmg, new dco());
        return dcn;
    }

    public final /* bridge */ /* synthetic */ cma g() {
        dco dco = (dco) super.g();
        dco.M = null;
        dco.N = null;
        dco.O = null;
        dco.P = null;
        dco.Q = null;
        dco.R = null;
        dco.S = null;
        dco.T = null;
        return dco;
    }
}

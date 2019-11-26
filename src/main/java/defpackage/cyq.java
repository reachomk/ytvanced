package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Layout.Alignment;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cyq */
public final class cyq extends cma {
    public static final aaa a = new aaa(2);
    public static final aaa b = new aaa(2);
    public static final aaa c = new aaa(2);
    @cue(a = 3)
    private final int A = 131073;
    @cue(a = 3)
    private final int B = Integer.MAX_VALUE;
    @cue(a = 3)
    private final int C = Integer.MAX_VALUE;
    @cue(a = 3)
    private final int D = aocf.UNSET_ENUM_VALUE;
    @cue(a = 3)
    private final int E = -1;
    @cue(a = 3)
    private final int F = -7829368;
    @cue(a = 0)
    private final float G = 1.0f;
    @cue(a = 13)
    private final Alignment H = cyt.e;
    @cue(a = 13)
    private final ColorStateList I = cyt.a;
    @cue(a = 3)
    private final int J = cyt.c;
    @cue(a = 13)
    private final Typeface K = cyt.d;
    @cue(a = 13)
    private final int L = cyt.f;
    @cue(a = 13)
    public CharSequence d;
    @cue(a = 3)
    public boolean e = false;
    @cue(a = 13)
    public CharSequence f;
    @cue(a = 3)
    public int g = 13;
    public coj u;
    @cue(a = 14)
    private cyr v = new cyr();
    @cue(a = 3)
    private final int w = -1;
    @cue(a = 3)
    private final boolean x = true;
    @cue(a = 3)
    private final int y = 8388627;
    @cue(a = 13)
    private final ColorStateList z = cyt.b;

    private cyq() {
        super("EditText");
    }

    public final int A() {
        return 3;
    }

    public final void k() {
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean n() {
        return true;
    }

    public final boolean t() {
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

    /* JADX WARNING: Missing block: B:55:0x00a1, code skipped:
            if (r6.L == 0) goto L_0x00aa;
     */
    /* JADX WARNING: Missing block: B:58:0x00a8, code skipped:
            if (r2 == r3) goto L_0x00aa;
     */
    public final boolean a(defpackage.cma r6) {
        /*
        r5 = this;
        r0 = 1;
        if (r5 == r6) goto L_0x0149;
    L_0x0003:
        r1 = 0;
        if (r6 == 0) goto L_0x0148;
    L_0x0006:
        r2 = r5.getClass();
        r3 = r6.getClass();
        if (r2 != r3) goto L_0x0148;
    L_0x0010:
        r6 = (defpackage.cyq) r6;
        r2 = r5.j;
        r3 = r6.j;
        if (r2 == r3) goto L_0x0147;
    L_0x0018:
        r2 = r5.w;
        r3 = r6.w;
        if (r2 != r3) goto L_0x0146;
    L_0x001e:
        r2 = r5.x;
        r3 = r6.x;
        if (r2 != r3) goto L_0x0146;
    L_0x0024:
        r2 = 0;
        r3 = java.lang.Float.compare(r2, r2);
        if (r3 != 0) goto L_0x0146;
    L_0x002b:
        r3 = r5.y;
        r4 = r6.y;
        if (r3 != r4) goto L_0x0146;
    L_0x0031:
        r3 = r5.d;
        if (r3 == 0) goto L_0x003e;
    L_0x0035:
        r4 = r6.d;
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0042;
    L_0x003d:
        goto L_0x0043;
    L_0x003e:
        r3 = r6.d;
        if (r3 == 0) goto L_0x0043;
    L_0x0042:
        return r1;
    L_0x0043:
        r3 = r5.z;
        if (r3 == 0) goto L_0x0050;
    L_0x0047:
        r4 = r6.z;
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0054;
    L_0x004f:
        goto L_0x0055;
    L_0x0050:
        r3 = r6.z;
        if (r3 == 0) goto L_0x0055;
    L_0x0054:
        return r1;
    L_0x0055:
        r3 = r5.A;
        r4 = r6.A;
        if (r3 != r4) goto L_0x0146;
    L_0x005b:
        r3 = r5.B;
        r4 = r6.B;
        if (r3 != r4) goto L_0x0146;
    L_0x0061:
        r3 = r5.C;
        r4 = r6.C;
        if (r3 != r4) goto L_0x0146;
    L_0x0067:
        r3 = r5.D;
        r4 = r6.D;
        if (r3 != r4) goto L_0x0146;
    L_0x006d:
        r3 = r5.e;
        r4 = r6.e;
        if (r3 != r4) goto L_0x0146;
    L_0x0073:
        r3 = r5.E;
        r4 = r6.E;
        if (r3 != r4) goto L_0x0146;
    L_0x0079:
        r3 = r5.F;
        r4 = r6.F;
        if (r3 != r4) goto L_0x0146;
    L_0x007f:
        r3 = java.lang.Float.compare(r2, r2);
        if (r3 != 0) goto L_0x0146;
    L_0x0085:
        r3 = java.lang.Float.compare(r2, r2);
        if (r3 != 0) goto L_0x0146;
    L_0x008b:
        r2 = java.lang.Float.compare(r2, r2);
        if (r2 != 0) goto L_0x0146;
    L_0x0091:
        r2 = r5.G;
        r3 = r6.G;
        r2 = java.lang.Float.compare(r2, r3);
        if (r2 != 0) goto L_0x0146;
    L_0x009b:
        r2 = r5.L;
        if (r2 != 0) goto L_0x00a4;
    L_0x009f:
        r2 = r6.L;
        if (r2 != 0) goto L_0x0143;
    L_0x00a3:
        goto L_0x00aa;
    L_0x00a4:
        r3 = r6.L;
        if (r2 == 0) goto L_0x0144;
    L_0x00a8:
        if (r2 != r3) goto L_0x0143;
    L_0x00aa:
        r2 = r5.f;
        if (r2 == 0) goto L_0x00b7;
    L_0x00ae:
        r3 = r6.f;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x00bb;
    L_0x00b6:
        goto L_0x00bc;
    L_0x00b7:
        r2 = r6.f;
        if (r2 == 0) goto L_0x00bc;
    L_0x00bb:
        return r1;
    L_0x00bc:
        r2 = r5.H;
        if (r2 == 0) goto L_0x00c9;
    L_0x00c0:
        r3 = r6.H;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x00cd;
    L_0x00c8:
        goto L_0x00ce;
    L_0x00c9:
        r2 = r6.H;
        if (r2 == 0) goto L_0x00ce;
    L_0x00cd:
        return r1;
    L_0x00ce:
        r2 = r5.I;
        if (r2 == 0) goto L_0x00db;
    L_0x00d2:
        r3 = r6.I;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x00df;
    L_0x00da:
        goto L_0x00e0;
    L_0x00db:
        r2 = r6.I;
        if (r2 == 0) goto L_0x00e0;
    L_0x00df:
        return r1;
    L_0x00e0:
        r2 = r5.g;
        r3 = r6.g;
        if (r2 != r3) goto L_0x0143;
    L_0x00e6:
        r2 = r5.J;
        r3 = r6.J;
        if (r2 != r3) goto L_0x0143;
    L_0x00ec:
        r2 = r5.K;
        if (r2 == 0) goto L_0x00f9;
    L_0x00f0:
        r3 = r6.K;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x00fd;
    L_0x00f8:
        goto L_0x00fe;
    L_0x00f9:
        r2 = r6.K;
        if (r2 == 0) goto L_0x00fe;
    L_0x00fd:
        return r1;
    L_0x00fe:
        r2 = r5.v;
        r2 = r2.a;
        if (r2 == 0) goto L_0x010f;
    L_0x0104:
        r3 = r6.v;
        r3 = r3.a;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0115;
    L_0x010e:
        goto L_0x0116;
    L_0x010f:
        r2 = r6.v;
        r2 = r2.a;
        if (r2 == 0) goto L_0x0116;
    L_0x0115:
        return r1;
    L_0x0116:
        r2 = r5.v;
        r2 = r2.b;
        if (r2 == 0) goto L_0x0127;
    L_0x011c:
        r3 = r6.v;
        r3 = r3.b;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x012d;
    L_0x0126:
        goto L_0x012e;
    L_0x0127:
        r2 = r6.v;
        r2 = r2.b;
        if (r2 == 0) goto L_0x012e;
    L_0x012d:
        return r1;
    L_0x012e:
        r2 = r5.v;
        r2 = r2.c;
        r6 = r6.v;
        r6 = r6.c;
        if (r2 == 0) goto L_0x013f;
    L_0x0138:
        r6 = r2.equals(r6);
        if (r6 != 0) goto L_0x0142;
    L_0x013e:
        goto L_0x0141;
    L_0x013f:
        if (r6 == 0) goto L_0x0142;
    L_0x0141:
        return r1;
    L_0x0142:
        return r0;
    L_0x0143:
        return r1;
    L_0x0144:
        r6 = 0;
        throw r6;
    L_0x0146:
        return r1;
    L_0x0147:
        return r0;
    L_0x0148:
        return r1;
    L_0x0149:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyq.a(cma):boolean");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cmn cmn, int i, int i2, crd crd) {
        cmg cmg2 = cmg;
        cyt.a(cmg, cmn, i, i2, crd, this.f, this.d, this.D, this.C, this.B, this.F, this.I, this.z, this.g, this.G, this.J, this.K, this.H, this.y, this.x, this.E, this.A, this.e, this.w, this.v.b);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object b(Context context) {
        return cyt.a(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(cmg cmg, Object obj) {
        cyy cyy = (cyy) obj;
        CharSequence charSequence = this.f;
        CharSequence charSequence2 = this.d;
        int i = this.D;
        int i2 = this.C;
        int i3 = this.B;
        int i4 = this.F;
        ColorStateList colorStateList = this.I;
        ColorStateList colorStateList2 = this.z;
        int i5 = this.g;
        float f = this.G;
        int i6 = this.J;
        Typeface typeface = this.K;
        Alignment alignment = this.H;
        int i7 = this.y;
        cyy cyy2 = cyy;
        boolean z = this.x;
        int i8 = this.E;
        int i9 = this.A;
        boolean z2 = this.e;
        int i10 = this.w;
        cyr cyr = this.v;
        cyt.a(cyy2, charSequence, charSequence2, i, i2, i3, i4, colorStateList, colorStateList2, i5, f, i6, typeface, alignment, i7, z, i8, i9, z2, i10, cyr.c, cyr.a, cyr.b);
    }

    /* Access modifiers changed, original: protected|final */
    public final void e(cmg cmg, Object obj) {
        cyt.a(cmg, (cyy) obj, this.L);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(Object obj) {
        cyt.a((cyy) obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(cmg cmg, Object obj) {
        cyt.a(this.v.c);
    }

    /* Access modifiers changed, original: protected|final */
    public final void f(cmg cmg) {
        cri cri = new cri();
        cri cri2 = new cri();
        cyt.a(cri, cri2);
        cyr cyr = this.v;
        cyr.c = (AtomicReference) cri.a;
        cyr.a = (AtomicBoolean) cri2.a;
    }

    public static coj a(cmg cmg) {
        cma cma = cmg.h;
        return cma != null ? ((cyq) cma).u : null;
    }

    public static coj g(cmg cmg) {
        cma cma = cmg.h;
        return null;
    }

    public static coj h(cmg cmg) {
        cma cma = cmg.h;
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(crh crh, crh crh2) {
        cyr cyr = (cyr) crh;
        cyr cyr2 = (cyr) crh2;
        cyr2.a = cyr.a;
        cyr2.b = cyr.b;
        cyr2.c = cyr.c;
    }

    protected static void a(cmg cmg, CharSequence charSequence) {
        if (cmg.h != null) {
            cmg.a(new cyu(charSequence), "EditText.updateInput");
        }
    }

    protected static void b(cmg cmg, CharSequence charSequence) {
        if (cmg.h != null) {
            cmg.a(new cyp(charSequence));
        }
    }

    public static cys i(cmg cmg) {
        cys cys = new cys();
        cys.a(cys, cmg, new cyq());
        return cys;
    }

    public final /* synthetic */ cma g() {
        cyq cyq = (cyq) super.g();
        cyq.v = new cyr();
        return cyq;
    }

    static {
        aaa aaa = new aaa(2);
    }
}

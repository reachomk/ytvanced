package defpackage;

import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View.MeasureSpec;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.YogaWrap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: coz */
public class coz implements cmn {
    public coj A;
    public String B;
    public cog C;
    public float D;
    public float E;
    public float F;
    public float G;
    public cnz H;
    public ArrayList I;
    public ArrayList J;
    public boolean K;
    public csq L;
    public Set M;
    public int N;
    private coz O;
    private cog P;
    private cog Q;
    private boolean[] R;
    private float S;
    private float T;
    private float U;
    private float V;
    private int W;
    private int X;
    public final YogaNode a;
    public final cmg b;
    public final List c;
    public int d;
    public boolean e;
    public boolean f;
    public coz g;
    public long h;
    public cvu i;
    public cvl j;
    public final int[] k;
    public final float[] l;
    public PathEffect m;
    public StateListAnimator n;
    public int o;
    public cqi p;
    public boolean q;
    public String r;
    public float s;
    public float t;
    public coj u;
    public coj v;
    public coj w;
    public coj x;
    public coj y;
    public coj z;

    static coz a(cmg cmg) {
        return new coz(cmg);
    }

    protected coz() {
        this.c = new ArrayList(1);
        this.d = 0;
        this.k = new int[4];
        this.l = new float[4];
        this.D = Float.NaN;
        this.E = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = -1;
        this.X = -1;
        this.F = -1.0f;
        this.G = -1.0f;
        this.M = null;
        this.a = null;
        this.b = null;
    }

    private coz(cmg cmg) {
        this(cmg, new YogaNode(cqh.a));
    }

    protected coz(byte b) {
        this(null, null);
    }

    private coz(cmg cmg, YogaNode yogaNode) {
        this.c = new ArrayList(1);
        this.d = 0;
        this.k = new int[4];
        this.l = new float[4];
        this.D = Float.NaN;
        this.E = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = -1;
        this.X = -1;
        this.F = -1.0f;
        this.G = -1.0f;
        this.M = null;
        this.M = new HashSet();
        if (yogaNode != null) {
            yogaNode.e = this;
        }
        this.a = yogaNode;
        this.b = cmg;
        cmg = this.b;
        if (cmg != null && cmg.h() > 0) {
            this.b.h();
        }
    }

    public int i() {
        if (ddl.a(this.S)) {
            this.S = this.a.mLeft;
        }
        return (int) this.S;
    }

    public int j() {
        if (ddl.a(this.T)) {
            this.T = this.a.mTop;
        }
        return (int) this.T;
    }

    public int a() {
        if (ddl.a(this.U)) {
            this.U = this.a.mWidth;
        }
        return (int) this.U;
    }

    public int b() {
        if (ddl.a(this.V)) {
            this.V = this.a.mHeight;
        }
        return (int) this.V;
    }

    public int f() {
        return con.a(this.a.a(YogaEdge.LEFT));
    }

    public int c() {
        return con.a(this.a.a(YogaEdge.TOP));
    }

    public int d() {
        return con.a(this.a.a(YogaEdge.RIGHT));
    }

    public int e() {
        return con.a(this.a.a(YogaEdge.BOTTOM));
    }

    public final cvu g() {
        return this.i;
    }

    public void k() {
        this.K = true;
    }

    public int l() {
        return this.W;
    }

    public void a(int i) {
        this.W = i;
    }

    public int m() {
        return this.X;
    }

    public void b(int i) {
        this.X = i;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(float f) {
        this.F = f;
    }

    /* Access modifiers changed, original: 0000 */
    public void b(float f) {
        this.G = f;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(cnz cnz) {
        this.H = cnz;
    }

    public YogaDirection h() {
        return this.a.b();
    }

    /* Access modifiers changed, original: 0000 */
    public coz a(YogaDirection yogaDirection) {
        this.h |= 1;
        YogaNode.jni_YGNodeStyleSetDirection(this.a.d, yogaDirection.d);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz a(YogaFlexDirection yogaFlexDirection) {
        YogaNode.jni_YGNodeStyleSetFlexDirection(this.a.d, yogaFlexDirection.e);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz a(YogaWrap yogaWrap) {
        YogaNode.jni_YGNodeStyleSetFlexWrap(this.a.d, yogaWrap.d);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz a(YogaJustify yogaJustify) {
        YogaNode.jni_YGNodeStyleSetJustifyContent(this.a.d, yogaJustify.f);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz a(YogaAlign yogaAlign) {
        YogaNode.jni_YGNodeStyleSetAlignItems(this.a.d, yogaAlign.f);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz b(YogaAlign yogaAlign) {
        YogaNode.jni_YGNodeStyleSetAlignContent(this.a.d, yogaAlign.f);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz c(YogaAlign yogaAlign) {
        this.h |= 2;
        YogaNode.jni_YGNodeStyleSetAlignSelf(this.a.d, yogaAlign.f);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz a(YogaPositionType yogaPositionType) {
        this.h |= 4;
        YogaNode.jni_YGNodeStyleSetPositionType(this.a.d, yogaPositionType.c);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz c(float f) {
        this.h |= 8;
        YogaNode.jni_YGNodeStyleSetFlex(this.a.d, 0.0f);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz d(float f) {
        this.h |= 16;
        YogaNode.jni_YGNodeStyleSetFlexGrow(this.a.d, f);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz e(float f) {
        this.h |= 32;
        YogaNode.jni_YGNodeStyleSetFlexShrink(this.a.d, f);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz c(int i) {
        this.h |= 64;
        YogaNode.jni_YGNodeStyleSetFlexBasis(this.a.d, (float) i);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz f(float f) {
        this.h |= 64;
        YogaNode.jni_YGNodeStyleSetFlexBasisPercent(this.a.d, f);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz d(int i) {
        this.h |= 128;
        this.d = i;
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz a(boolean z) {
        this.h |= 256;
        this.e = false;
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz a(YogaEdge yogaEdge, int i) {
        this.h |= 512;
        YogaNode yogaNode = this.a;
        yogaNode.mEdgeSetFlag |= 1;
        YogaNode.jni_YGNodeStyleSetMargin(yogaNode.d, yogaEdge.j, (float) i);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz a(YogaEdge yogaEdge, float f) {
        this.h |= 512;
        YogaNode yogaNode = this.a;
        yogaNode.mEdgeSetFlag |= 1;
        YogaNode.jni_YGNodeStyleSetMarginPercent(yogaNode.d, yogaEdge.j, f);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz a(YogaEdge yogaEdge) {
        this.h |= 512;
        YogaNode yogaNode = this.a;
        yogaNode.mEdgeSetFlag |= 1;
        YogaNode.jni_YGNodeStyleSetMarginAuto(yogaNode.d, yogaEdge.j);
        return this;
    }

    private final cog E() {
        if (this.P == null) {
            this.P = new cog();
        }
        return this.P;
    }

    /* Access modifiers changed, original: 0000 */
    public coz b(YogaEdge yogaEdge, int i) {
        this.h |= 1024;
        if (this.f) {
            E().a(yogaEdge, (float) i);
            a(yogaEdge, false);
        } else {
            this.a.a(yogaEdge, (float) i);
        }
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz b(YogaEdge yogaEdge, float f) {
        this.h |= 1024;
        if (this.f) {
            E().a(yogaEdge, f);
            a(yogaEdge, true);
        } else {
            this.a.b(yogaEdge, f);
        }
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz a(clo clo) {
        this.h |= 268435456;
        int length = clo.b.length;
        int i = 0;
        while (i < length) {
            if (i < 4) {
                YogaEdge yogaEdge;
                if (i == 0) {
                    yogaEdge = YogaEdge.LEFT;
                } else if (i == 1) {
                    yogaEdge = YogaEdge.TOP;
                } else if (i != 2) {
                    yogaEdge = YogaEdge.BOTTOM;
                } else {
                    yogaEdge = YogaEdge.RIGHT;
                }
                c(yogaEdge, clo.b[i]);
                i++;
            } else {
                throw new IllegalArgumentException("Given index out of range of acceptable edges: 4");
            }
        }
        int[] iArr = clo.c;
        int[] iArr2 = this.k;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        float[] fArr = clo.a;
        float[] fArr2 = this.l;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        this.m = null;
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public void c(YogaEdge yogaEdge, int i) {
        if (this.f) {
            if (this.Q == null) {
                this.Q = new cog();
            }
            this.Q.a(yogaEdge, (float) i);
            return;
        }
        this.a.c(yogaEdge, (float) i);
    }

    /* Access modifiers changed, original: 0000 */
    public int b(YogaEdge yogaEdge) {
        return con.a(this.a.b(yogaEdge));
    }

    /* Access modifiers changed, original: 0000 */
    public coz d(YogaEdge yogaEdge, int i) {
        this.h |= 2048;
        YogaNode.jni_YGNodeStyleSetPosition(this.a.d, yogaEdge.j, (float) i);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz c(YogaEdge yogaEdge, float f) {
        this.h |= 2048;
        YogaNode.jni_YGNodeStyleSetPositionPercent(this.a.d, yogaEdge.j, f);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz e(int i) {
        this.h |= 4096;
        this.a.a((float) i);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz g(float f) {
        this.h |= 4096;
        YogaNode.jni_YGNodeStyleSetWidthPercent(this.a.d, f);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz f(int i) {
        this.h |= 8192;
        YogaNode.jni_YGNodeStyleSetMinWidth(this.a.d, (float) i);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz h(float f) {
        this.h |= 8192;
        YogaNode.jni_YGNodeStyleSetMinWidthPercent(this.a.d, f);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz g(int i) {
        this.h |= 16384;
        this.a.c((float) i);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz i(float f) {
        this.h |= 16384;
        YogaNode.jni_YGNodeStyleSetMaxWidthPercent(this.a.d, f);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz h(int i) {
        this.h |= 32768;
        this.a.b((float) i);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz j(float f) {
        this.h |= 32768;
        YogaNode.jni_YGNodeStyleSetHeightPercent(this.a.d, f);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz i(int i) {
        this.h |= 65536;
        YogaNode.jni_YGNodeStyleSetMinHeight(this.a.d, (float) i);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz k(float f) {
        this.h |= 65536;
        YogaNode.jni_YGNodeStyleSetMinHeightPercent(this.a.d, f);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz j(int i) {
        this.h |= 131072;
        this.a.d((float) i);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz l(float f) {
        this.h |= 131072;
        YogaNode.jni_YGNodeStyleSetMaxHeightPercent(this.a.d, f);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz m(float f) {
        this.h |= 67108864;
        YogaNode.jni_YGNodeStyleSetAspectRatio(this.a.d, f);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz n() {
        YogaNode.jni_YGNodeSetIsReferenceBaseline(this.a.d, false);
        return this;
    }

    public final boolean o() {
        if (this.C != null) {
            cqi cqi = this.p;
            if (cqi != null && cqi.b()) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public coz a(cma cma) {
        return cma != null ? a(this.b.a(cma)) : this;
    }

    /* Access modifiers changed, original: final */
    public final coz a(coz coz) {
        if (!(coz == null || coz == cmg.a)) {
            a(coz, this.a.a());
        }
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    @Deprecated
    public coz a(cvu cvu) {
        this.h |= 262144;
        this.i = cvu;
        if (cvu != null) {
            Context context = this.b.b;
            Drawable drawable = (Drawable) cvu.a(cvu);
            if (drawable != null) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                if (!(rect.bottom == 0 && rect.top == 0 && rect.left == 0 && rect.right == 0)) {
                    b(YogaEdge.LEFT, rect.left);
                    b(YogaEdge.TOP, rect.top);
                    b(YogaEdge.RIGHT, rect.right);
                    b(YogaEdge.BOTTOM, rect.bottom);
                }
                Context context2 = this.b.b;
            }
        }
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz a(cvl cvl) {
        this.h |= 524288;
        this.j = null;
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz p() {
        this.q = true;
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz a(coj coj) {
        D().a(coj);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz b(coj coj) {
        D().c(coj);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz c(coj coj) {
        D().d(coj);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final coz b(boolean z) {
        cqi D = D();
        if (z) {
            D.A = 1;
        } else {
            D.A = 2;
        }
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz d(coj coj) {
        this.h |= 1048576;
        this.u = coz.a(this.u, coj);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz q() {
        this.h |= 2097152;
        this.w = coz.a(this.w, null);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz r() {
        this.h |= 16777216;
        this.x = coz.a(this.x, null);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz s() {
        this.h |= 4194304;
        this.y = coz.a(this.y, null);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz e(coj coj) {
        this.h |= 8388608;
        this.z = coz.a(this.z, coj);
        return this;
    }

    public static coj a(coj coj, coj coj2) {
        if (coj != null) {
            return coj2 != null ? new cnx(coj, coj2) : coj;
        } else {
            return coj2;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public coz a(CharSequence charSequence) {
        D().a(charSequence);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz a(Object obj) {
        D().a(obj);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz a(SparseArray sparseArray) {
        cqi D = D();
        D.C |= 4;
        D.c = sparseArray;
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public coz a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.h |= 134217728;
            this.r = str;
        }
        return this;
    }

    /* Access modifiers changed, original: final */
    public final boolean t() {
        return TextUtils.isEmpty(this.r) ^ 1;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(YogaMeasureFunction yogaMeasureFunction) {
        YogaNode yogaNode = this.a;
        yogaNode.c = yogaMeasureFunction;
        YogaNode.jni_YGNodeSetHasMeasureFunc(yogaNode.d, yogaMeasureFunction != null);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean u() {
        return this.a.mHasNewLayout;
    }

    /* Access modifiers changed, original: 0000 */
    public void v() {
        this.a.mHasNewLayout = false;
    }

    /* Access modifiers changed, original: 0000 */
    public float w() {
        return ((YogaValue) YogaNode.jni_YGNodeStyleGetWidth(this.a.d)).a;
    }

    /* Access modifiers changed, original: 0000 */
    public float x() {
        return ((YogaValue) YogaNode.jni_YGNodeStyleGetHeight(this.a.d)).a;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(float f, float f2) {
        YogaNode.jni_YGNodeCalculateLayout(this.a.d, f, f2);
    }

    public int y() {
        return this.a.a();
    }

    /* Access modifiers changed, original: 0000 */
    public YogaDirection z() {
        return YogaDirection.a(YogaNode.jni_YGNodeStyleGetDirection(this.a.d));
    }

    public coz k(int i) {
        return this.a.a(i) != null ? (coz) this.a.a(i).e : null;
    }

    /* Access modifiers changed, original: 0000 */
    public coz A() {
        YogaNode yogaNode = this.a;
        if (yogaNode != null) {
            yogaNode = yogaNode.a;
            if (yogaNode != null) {
                return (coz) yogaNode.e;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(coz coz, int i) {
        YogaNode yogaNode = this.a;
        YogaNode yogaNode2 = coz.a;
        if (yogaNode2.a == null) {
            if (yogaNode.b == null) {
                yogaNode.b = new ArrayList(4);
            }
            yogaNode.b.add(i, yogaNode2);
            yogaNode2.a = yogaNode;
            YogaNode.jni_YGNodeInsertChild(yogaNode.d, yogaNode2.d, i);
            return;
        }
        throw new IllegalStateException("Child already has a parent, it must be removed first.");
    }

    public final float a(cog cog, YogaEdge yogaEdge) {
        YogaEdge yogaEdge2;
        YogaDirection b = this.a.b();
        YogaDirection yogaDirection = YogaDirection.RTL;
        int ordinal = yogaEdge.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                String valueOf = String.valueOf(yogaEdge);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 32);
                stringBuilder.append("Not an horizontal padding edge: ");
                stringBuilder.append(valueOf);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (b != yogaDirection) {
                yogaEdge2 = YogaEdge.END;
            } else {
                yogaEdge2 = YogaEdge.START;
            }
        } else if (b != yogaDirection) {
            yogaEdge2 = YogaEdge.START;
        } else {
            yogaEdge2 = YogaEdge.END;
        }
        float b2 = cog.b(yogaEdge2);
        return ddl.a(b2) ? cog.a(yogaEdge) : b2;
    }

    /* Access modifiers changed, original: final */
    public final cma B() {
        return this.c.size() != 0 ? (cma) this.c.get(0) : null;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:15:0x0042, code skipped:
            r4 = false;
     */
    public boolean C() {
        /*
        r6 = this;
        r0 = r6.k;
        r1 = r0.length;
        r2 = 0;
        r3 = 0;
    L_0x0005:
        r4 = 1;
        if (r3 >= r1) goto L_0x0042;
    L_0x0008:
        r5 = r0[r3];
        if (r5 == 0) goto L_0x003f;
    L_0x000c:
        r0 = r6.a;
        r1 = com.facebook.yoga.YogaEdge.LEFT;
        r0 = r0.b(r1);
        r1 = 0;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 != 0) goto L_0x0043;
    L_0x0019:
        r0 = r6.a;
        r3 = com.facebook.yoga.YogaEdge.TOP;
        r0 = r0.b(r3);
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 != 0) goto L_0x0043;
    L_0x0025:
        r0 = r6.a;
        r3 = com.facebook.yoga.YogaEdge.RIGHT;
        r0 = r0.b(r3);
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 != 0) goto L_0x0043;
    L_0x0031:
        r0 = r6.a;
        r3 = com.facebook.yoga.YogaEdge.BOTTOM;
        r0 = r0.b(r3);
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 != 0) goto L_0x003e;
    L_0x003d:
        goto L_0x0042;
    L_0x003e:
        return r4;
    L_0x003f:
        r3 = r3 + 1;
        goto L_0x0005;
    L_0x0042:
        r4 = 0;
    L_0x0043:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coz.C():boolean");
    }

    /* Access modifiers changed, original: 0000 */
    public void b(cma cma) {
        this.c.add(cma);
    }

    /* Access modifiers changed, original: 0000 */
    public void b(coz coz) {
        coz.O = this;
        this.g = coz;
    }

    /* Access modifiers changed, original: 0000 */
    public void c(coz coz) {
        cqi cqi = this.p;
        if (cqi != null) {
            cqi cqi2 = coz.p;
            if (cqi2 == null) {
                coz.p = cqi;
            } else {
                int i = cqi.C;
                if ((i & 8) != 0) {
                    cqi2.k = cqi.k;
                }
                if ((i & 16) != 0) {
                    cqi2.m = cqi.m;
                }
                if ((131072 & i) != 0) {
                    cqi2.l = cqi.l;
                }
                if ((i & 32) != 0) {
                    cqi2.n = cqi.n;
                }
                if ((262144 & i) != 0) {
                    cqi2.o = cqi.o;
                }
                if ((4194304 & i) != 0) {
                    cqi2.p = cqi.p;
                }
                if ((16777216 & i) != 0) {
                    cqi2.q = cqi.q;
                }
                if ((i & 64) != 0) {
                    cqi2.r = cqi.r;
                }
                if ((i & 128) != 0) {
                    cqi2.s = cqi.s;
                }
                if ((i & 256) != 0) {
                    cqi2.u = cqi.u;
                }
                if ((i & 512) != 0) {
                    cqi2.t = cqi.t;
                }
                if ((i & 1024) != 0) {
                    cqi2.v = cqi.v;
                }
                if ((i & 2048) != 0) {
                    cqi2.w = cqi.w;
                }
                if ((i & 4096) != 0) {
                    cqi2.x = cqi.x;
                }
                if ((i & 8192) != 0) {
                    cqi2.y = cqi.y;
                }
                if ((i & 1) != 0) {
                    cqi2.a = cqi.a;
                }
                if ((i & 16384) != 0) {
                    cqi2.d = cqi.d;
                }
                if ((32768 & i) != 0) {
                    cqi2.e = cqi.e;
                }
                if ((i & 65536) != 0) {
                    cqi2.f = cqi.f;
                }
                if (cqi.a()) {
                    cqi2.a(cqi.g);
                }
                Object obj = cqi.b;
                if (obj != null) {
                    cqi2.b = obj;
                }
                SparseArray sparseArray = cqi.c;
                if (sparseArray != null) {
                    cqi2.c = sparseArray;
                }
                i = cqi.z;
                if (i != 0) {
                    cqi2.z = i;
                }
                i = cqi.A;
                if (i != 0) {
                    cqi2.A = i;
                }
                i = cqi.B;
                if (i != 0) {
                    cqi2.B = i;
                }
                i = cqi.C;
                if ((524288 & i) != 0) {
                    cqi2.h = cqi.h;
                }
                if ((1048576 & i) != 0) {
                    cqi2.i = cqi.i;
                }
                if ((i & 2097152) != 0) {
                    cqi2.j = cqi.j;
                }
            }
        }
        if ((coz.h & 1) == 0 || coz.h() == YogaDirection.INHERIT) {
            coz.a(h());
        }
        long j = coz.h;
        if ((128 & j) == 0 || coz.d == 0) {
            coz.d = this.d;
        }
        long j2 = this.h;
        if ((256 & j2) != 0) {
            coz.e = this.e;
        }
        if ((262144 & j2) != 0) {
            coz.i = this.i;
        }
        if ((524288 & j2) != 0) {
            coz.j = this.j;
        }
        if (this.q) {
            coz.q = true;
        }
        if ((1048576 & j2) != 0) {
            coz.u = this.u;
        }
        if ((Long.MIN_VALUE & j2) != 0) {
            coz.v = this.v;
        }
        if ((2097152 & j2) != 0) {
            coz.w = this.w;
        }
        if ((4194304 & j2) != 0) {
            coz.y = this.y;
        }
        if ((8388608 & j2) != 0) {
            coz.z = this.z;
        }
        if ((16777216 & j2) != 0) {
            coz.x = this.x;
        }
        if ((2147483648L & j2) != 0) {
            coz.A = this.A;
        }
        String str = this.B;
        if (str != null) {
            coz.B = str;
        }
        if ((j2 & 1024) != 0) {
            if (this.P != null) {
                YogaNode yogaNode = coz.a;
                coz.h = j | 1024;
                if (c(YogaEdge.LEFT)) {
                    yogaNode.b(YogaEdge.LEFT, this.P.b(YogaEdge.LEFT));
                } else {
                    yogaNode.a(YogaEdge.LEFT, this.P.b(YogaEdge.LEFT));
                }
                if (c(YogaEdge.TOP)) {
                    yogaNode.b(YogaEdge.TOP, this.P.b(YogaEdge.TOP));
                } else {
                    yogaNode.a(YogaEdge.TOP, this.P.b(YogaEdge.TOP));
                }
                if (c(YogaEdge.RIGHT)) {
                    yogaNode.b(YogaEdge.RIGHT, this.P.b(YogaEdge.RIGHT));
                } else {
                    yogaNode.a(YogaEdge.RIGHT, this.P.b(YogaEdge.RIGHT));
                }
                if (c(YogaEdge.BOTTOM)) {
                    yogaNode.b(YogaEdge.BOTTOM, this.P.b(YogaEdge.BOTTOM));
                } else {
                    yogaNode.a(YogaEdge.BOTTOM, this.P.b(YogaEdge.BOTTOM));
                }
                if (c(YogaEdge.VERTICAL)) {
                    yogaNode.b(YogaEdge.VERTICAL, this.P.b(YogaEdge.VERTICAL));
                } else {
                    yogaNode.a(YogaEdge.VERTICAL, this.P.b(YogaEdge.VERTICAL));
                }
                if (c(YogaEdge.HORIZONTAL)) {
                    yogaNode.b(YogaEdge.HORIZONTAL, this.P.b(YogaEdge.HORIZONTAL));
                } else {
                    yogaNode.a(YogaEdge.HORIZONTAL, this.P.b(YogaEdge.HORIZONTAL));
                }
                if (c(YogaEdge.START)) {
                    yogaNode.b(YogaEdge.START, this.P.b(YogaEdge.START));
                } else {
                    yogaNode.a(YogaEdge.START, this.P.b(YogaEdge.START));
                }
                if (c(YogaEdge.END)) {
                    yogaNode.b(YogaEdge.END, this.P.b(YogaEdge.END));
                } else {
                    yogaNode.a(YogaEdge.END, this.P.b(YogaEdge.END));
                }
                if (c(YogaEdge.ALL)) {
                    yogaNode.b(YogaEdge.ALL, this.P.b(YogaEdge.ALL));
                } else {
                    yogaNode.a(YogaEdge.ALL, this.P.b(YogaEdge.ALL));
                }
            } else {
                throw new IllegalStateException("copyInto() must be used when resolving a nestedTree. If padding was set on the holder node, we must have a mNestedTreePadding instance");
            }
        }
        if ((this.h & 268435456) != 0) {
            if (this.Q != null) {
                YogaNode yogaNode2 = coz.a;
                coz.h = 268435456 | coz.h;
                yogaNode2.c(YogaEdge.LEFT, this.Q.b(YogaEdge.LEFT));
                yogaNode2.c(YogaEdge.TOP, this.Q.b(YogaEdge.TOP));
                yogaNode2.c(YogaEdge.RIGHT, this.Q.b(YogaEdge.RIGHT));
                yogaNode2.c(YogaEdge.BOTTOM, this.Q.b(YogaEdge.BOTTOM));
                yogaNode2.c(YogaEdge.VERTICAL, this.Q.b(YogaEdge.VERTICAL));
                yogaNode2.c(YogaEdge.HORIZONTAL, this.Q.b(YogaEdge.HORIZONTAL));
                yogaNode2.c(YogaEdge.START, this.Q.b(YogaEdge.START));
                yogaNode2.c(YogaEdge.END, this.Q.b(YogaEdge.END));
                yogaNode2.c(YogaEdge.ALL, this.Q.b(YogaEdge.ALL));
                int[] iArr = this.k;
                System.arraycopy(iArr, 0, coz.k, 0, iArr.length);
                float[] fArr = this.l;
                System.arraycopy(fArr, 0, coz.l, 0, fArr.length);
            } else {
                throw new IllegalStateException("copyInto() must be used when resolving a nestedTree. If border width was set on the holder node, we must have a mNestedTreeBorderWidth instance");
            }
        }
        j = this.h;
        if ((134217728 & j) != 0) {
            coz.r = this.r;
        }
        if ((4294967296L & j) != 0) {
            coz.N = this.N;
        }
        float f = this.s;
        if (f != 0.0f) {
            coz.s = f;
        }
        f = this.t;
        if (f != 0.0f) {
            coz.t = f;
        }
        if ((536870912 & j) != 0) {
            coz.n = this.n;
        }
        if ((j & 1073741824) != 0) {
            coz.o = this.o;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void l(int i) {
        int mode = MeasureSpec.getMode(i);
        if (mode != aocf.UNSET_ENUM_VALUE) {
            if (mode == 0) {
                this.a.a(Float.NaN);
            } else if (mode == 1073741824) {
                this.a.a((float) MeasureSpec.getSize(i));
                return;
            }
            return;
        }
        this.a.c((float) MeasureSpec.getSize(i));
    }

    /* Access modifiers changed, original: 0000 */
    public void m(int i) {
        int mode = MeasureSpec.getMode(i);
        if (mode != aocf.UNSET_ENUM_VALUE) {
            if (mode == 0) {
                this.a.b(Float.NaN);
            } else if (mode == 1073741824) {
                this.a.b((float) MeasureSpec.getSize(i));
                return;
            }
            return;
        }
        this.a.d((float) MeasureSpec.getSize(i));
    }

    public final cqi D() {
        if (this.p == null) {
            this.p = new cqi();
        }
        return this.p;
    }

    public static List a(List list, Object obj) {
        if (list == null) {
            list = new LinkedList();
        }
        list.add(obj);
        return list;
    }

    private final void a(YogaEdge yogaEdge, boolean z) {
        if (this.R == null && z) {
            this.R = new boolean[(YogaEdge.ALL.j + 1)];
        }
        boolean[] zArr = this.R;
        if (zArr != null) {
            zArr[yogaEdge.j] = z;
        }
    }

    private final boolean c(YogaEdge yogaEdge) {
        boolean[] zArr = this.R;
        return zArr != null && zArr[yogaEdge.j];
    }
}

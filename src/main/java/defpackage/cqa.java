package defpackage;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import com.facebook.yoga.YogaDirection;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: cqa */
public final class cqa implements csh {
    private static final Rect C = new Rect();
    public static final BitSet a = new BitSet(0);
    public static final Rect j = new Rect();
    public final Set A = new HashSet();
    private final zr B = new zr();
    private final cmg D;
    public final zr b = new zr();
    public final zr c = new zr();
    public final Map d;
    public long[] e;
    public BitSet f;
    public boolean g;
    public boolean h;
    public final zr i = new zr();
    public final cpq k;
    public final Rect l = new Rect();
    public final cqc m = new cqc();
    public final cqd n = new cqd();
    public int o;
    public int p;
    public int q = -1;
    public cpg r;
    public boolean s = false;
    public final cqb t;
    public csf u;
    public final HashSet v = new HashSet();
    public int[] w;
    public final Map x = new LinkedHashMap();
    public crr y;
    public boolean z = false;

    public cqa(cpq cpq) {
        this.D = cpq.v;
        this.k = cpq;
        this.g = true;
        this.d = cuj.d ? new HashMap() : null;
        ComponentHost componentHost = this.k;
        css css = new css();
        css.e = YogaDirection.INHERIT;
        this.t = new cqb(cot.B(), componentHost, componentHost, null, css, 0, 0, componentHost.getContext().getResources().getConfiguration().orientation, null);
    }

    private static boolean a(float f, int i, int i2) {
        return ((float) i2) >= f * ((float) i);
    }

    public final void a(csd csd) {
        csf csf = this.u;
        if (csf != null && csd != null) {
            csf.a(csd, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0245 A:{SYNTHETIC} */
    public final void a(defpackage.cpg r22, android.graphics.Rect r23, defpackage.cqq r24) {
        /*
        r21 = this;
        r0 = r21;
        r1 = r22;
        r2 = r23;
        if (r2 == 0) goto L_0x025a;
    L_0x0008:
        if (r24 != 0) goto L_0x000b;
    L_0x000a:
        goto L_0x000e;
    L_0x000b:
        r24.f();
    L_0x000e:
        r3 = defpackage.cno.d();
        r4 = r22.d();
        r6 = 0;
    L_0x0017:
        if (r6 >= r4) goto L_0x024e;
    L_0x0019:
        r7 = r1.c(r6);
        if (r3 != 0) goto L_0x0020;
    L_0x001f:
        goto L_0x0043;
    L_0x0020:
        r8 = r7.b;
        if (r8 == 0) goto L_0x0029;
    L_0x0024:
        r8 = r8.b();
        goto L_0x002b;
    L_0x0029:
        r8 = "Unknown";
    L_0x002b:
        r8 = java.lang.String.valueOf(r8);
        r9 = "visibilityHandlers:";
        r10 = r8.length();
        if (r10 != 0) goto L_0x003d;
    L_0x0037:
        r8 = new java.lang.String;
        r8.<init>(r9);
        goto L_0x0040;
    L_0x003d:
        r9.concat(r8);
    L_0x0040:
        defpackage.cno.a();
    L_0x0043:
        r8 = r7.f;
        r9 = r7.h;
        r10 = r7.i;
        r11 = r7.j;
        r12 = r7.k;
        r13 = r7.l;
        r14 = r7.a;
        r5 = r7.c;
        r16 = r4;
        r4 = j;
        r4 = r4.setIntersect(r5, r2);
        r17 = r6;
        if (r4 == 0) goto L_0x0091;
    L_0x005f:
        r4 = j;
        r6 = r7.d;
        r19 = r3;
        r3 = r7.e;
        r18 = 0;
        r20 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1));
        if (r20 != 0) goto L_0x0074;
    L_0x006d:
        r20 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1));
        if (r20 == 0) goto L_0x0072;
    L_0x0071:
        goto L_0x0074;
    L_0x0072:
        r1 = 1;
        goto L_0x0094;
    L_0x0074:
        r1 = r5.height();
        r2 = r4.height();
        r1 = defpackage.cqa.a(r6, r1, r2);
        if (r1 == 0) goto L_0x0093;
    L_0x0082:
        r1 = r5.width();
        r2 = r4.width();
        r1 = defpackage.cqa.a(r3, r1, r2);
        if (r1 != 0) goto L_0x0072;
    L_0x0090:
        goto L_0x0093;
    L_0x0091:
        r19 = r3;
    L_0x0093:
        r1 = 0;
    L_0x0094:
        r2 = r0.B;
        r2 = r2.a(r14);
        r2 = (defpackage.csu) r2;
        r3 = 0;
        if (r2 == 0) goto L_0x00ed;
    L_0x009f:
        r4 = r2.a;
        r6 = r7.b;
        if (r6 == 0) goto L_0x00a8;
    L_0x00a5:
        r6 = r6.l;
        goto L_0x00a9;
    L_0x00a8:
        r6 = r3;
    L_0x00a9:
        if (r4 == 0) goto L_0x00b4;
    L_0x00ab:
        r4 = r4.equals(r6);
        if (r4 == 0) goto L_0x00b2;
    L_0x00b1:
        goto L_0x00b4;
    L_0x00b2:
        r4 = 1;
        goto L_0x00b5;
    L_0x00b4:
        r4 = 0;
    L_0x00b5:
        if (r4 != 0) goto L_0x00bb;
    L_0x00b7:
        r2.d = r10;
        r2.c = r12;
    L_0x00bb:
        if (r1 != 0) goto L_0x00be;
    L_0x00bd:
        goto L_0x00c5;
    L_0x00be:
        if (r4 != 0) goto L_0x00c5;
    L_0x00c0:
        r4 = r0.g;
        r2.f = r4;
        goto L_0x00ed;
    L_0x00c5:
        r4 = r2.c;
        if (r4 == 0) goto L_0x00ce;
    L_0x00c9:
        r6 = r0.k;
        defpackage.cok.a(r4, r6);
    L_0x00ce:
        if (r13 == 0) goto L_0x00d6;
    L_0x00d0:
        r4 = 0;
        r6 = 0;
        defpackage.cok.a(r13, r6, r6, r4, r4);
        goto L_0x00d7;
    L_0x00d6:
        r6 = 0;
    L_0x00d7:
        r4 = r2.a();
        if (r4 == 0) goto L_0x00e7;
    L_0x00dd:
        r2.a(r6);
        r2 = r2.d;
        if (r2 == 0) goto L_0x00e7;
    L_0x00e4:
        defpackage.cok.a(r2);
    L_0x00e7:
        r2 = r0.B;
        r2.b(r14);
        r2 = r3;
    L_0x00ed:
        if (r1 == 0) goto L_0x023a;
    L_0x00ef:
        if (r2 == 0) goto L_0x00f3;
    L_0x00f1:
        goto L_0x0162;
    L_0x00f3:
        r1 = r7.b;
        if (r1 != 0) goto L_0x00f9;
    L_0x00f7:
        r1 = r3;
        goto L_0x00fb;
    L_0x00f9:
        r1 = r1.l;
    L_0x00fb:
        r2 = new csu;
        r2.<init>(r1, r12, r10, r13);
        r1 = r0.g;
        r2.f = r1;
        r1 = r0.B;
        r1.b(r14, r2);
        if (r8 == 0) goto L_0x0162;
    L_0x010b:
        r1 = r0.k;
        r4 = r7.b;
        r6 = defpackage.cma.e(r4);
        if (r6 == 0) goto L_0x011a;
    L_0x0115:
        r4 = defpackage.cqa.a(r4, r1);
        goto L_0x0134;
    L_0x011a:
        r4 = r4.q;
        if (r4 == 0) goto L_0x0133;
    L_0x011e:
        r6 = r4.i;
        if (r6 != 0) goto L_0x0123;
    L_0x0122:
        goto L_0x0133;
    L_0x0123:
        r4 = r4.b;
        if (r4 == 0) goto L_0x012a;
    L_0x0127:
        r4 = r4.b;
        goto L_0x012b;
    L_0x012a:
        r4 = r3;
    L_0x012b:
        if (r4 != 0) goto L_0x012e;
    L_0x012d:
        goto L_0x0133;
    L_0x012e:
        r4 = defpackage.cxz.a(r1, r4);
        goto L_0x0134;
    L_0x0133:
        r4 = r3;
    L_0x0134:
        r6 = defpackage.cno.d();
        if (r6 == 0) goto L_0x013d;
    L_0x013a:
        defpackage.cno.a();
    L_0x013d:
        r7 = defpackage.cok.f;
        if (r7 != 0) goto L_0x0148;
    L_0x0141:
        r7 = new csw;
        r7.<init>();
        defpackage.cok.f = r7;
    L_0x0148:
        r7 = defpackage.cok.f;
        r7.a = r1;
        r1 = defpackage.cok.f;
        r1.b = r4;
        r1 = defpackage.cok.f;
        r8.a(r1);
        r1 = defpackage.cok.f;
        r1.a = r3;
        r1 = defpackage.cok.f;
        r1.b = r3;
        if (r6 == 0) goto L_0x0162;
    L_0x015f:
        defpackage.cno.c();
    L_0x0162:
        if (r9 != 0) goto L_0x0169;
    L_0x0164:
        if (r10 == 0) goto L_0x0167;
    L_0x0166:
        goto L_0x0169;
    L_0x0167:
        r1 = 0;
        goto L_0x01c0;
    L_0x0169:
        r1 = j;
        r3 = r0.k;
        r3 = r3.getParent();
        r3 = (android.view.View) r3;
        if (r3 == 0) goto L_0x01b1;
    L_0x0175:
        r4 = r3.getWidth();
        r3 = r3.getHeight();
        r4 = r4 * r3;
        r4 = r4 / 2;
        r3 = defpackage.cqa.a(r5);
        r6 = defpackage.cqa.a(r1);
        if (r3 >= r4) goto L_0x0192;
    L_0x018b:
        r1 = r5.equals(r1);
        if (r1 != 0) goto L_0x0194;
    L_0x0191:
        goto L_0x01b1;
    L_0x0192:
        if (r6 < r4) goto L_0x01b1;
    L_0x0194:
        r1 = r2.a();
        if (r1 != 0) goto L_0x0167;
    L_0x019a:
        r1 = 1;
        r2.a(r1);
        if (r9 == 0) goto L_0x0167;
    L_0x01a0:
        r1 = defpackage.cok.h;
        if (r1 != 0) goto L_0x01ab;
    L_0x01a4:
        r1 = new cop;
        r1.<init>();
        defpackage.cok.h = r1;
    L_0x01ab:
        r1 = defpackage.cok.h;
        r9.a(r1);
        goto L_0x0167;
    L_0x01b1:
        r1 = r2.a();
        if (r1 == 0) goto L_0x0167;
    L_0x01b7:
        r1 = 0;
        r2.a(r1);
        if (r10 == 0) goto L_0x01c0;
    L_0x01bd:
        defpackage.cok.a(r10);
    L_0x01c0:
        if (r11 == 0) goto L_0x0211;
    L_0x01c2:
        r3 = r2.b();
        if (r3 != 0) goto L_0x0211;
    L_0x01c8:
        r3 = j;
        r4 = r5.top;
        r6 = r3.top;
        if (r4 != r6) goto L_0x01d6;
    L_0x01d0:
        r4 = r2.b;
        r4 = r4 | 4;
        r2.b = r4;
    L_0x01d6:
        r4 = r5.bottom;
        r6 = r3.bottom;
        if (r4 != r6) goto L_0x01e2;
    L_0x01dc:
        r4 = r2.b;
        r4 = r4 | 16;
        r2.b = r4;
    L_0x01e2:
        r4 = r5.left;
        r6 = r3.left;
        if (r4 != r6) goto L_0x01ee;
    L_0x01e8:
        r4 = r2.b;
        r4 = r4 | 2;
        r2.b = r4;
    L_0x01ee:
        r4 = r5.right;
        r3 = r3.right;
        if (r4 != r3) goto L_0x01fa;
    L_0x01f4:
        r3 = r2.b;
        r3 = r3 | 8;
        r2.b = r3;
    L_0x01fa:
        r2 = r2.b();
        if (r2 != 0) goto L_0x0201;
    L_0x0200:
        goto L_0x0211;
    L_0x0201:
        r2 = defpackage.cok.i;
        if (r2 != 0) goto L_0x020c;
    L_0x0205:
        r2 = new cos;
        r2.<init>();
        defpackage.cok.i = r2;
    L_0x020c:
        r2 = defpackage.cok.i;
        r11.a(r2);
    L_0x0211:
        if (r13 == 0) goto L_0x0235;
    L_0x0213:
        r2 = r23;
        r3 = r2.right;
        r4 = r2.left;
        r3 = r3 - r4;
        r4 = r2.bottom;
        r5 = r2.top;
        r4 = r4 - r5;
        r5 = (float) r3;
        r6 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r5 = r5 * r6;
        r7 = r22;
        r8 = r7.j;
        r8 = (float) r8;
        r5 = r5 / r8;
        r8 = (float) r4;
        r8 = r8 * r6;
        r6 = r7.k;
        r6 = (float) r6;
        r8 = r8 / r6;
        defpackage.cok.a(r13, r3, r4, r5, r8);
        goto L_0x023f;
    L_0x0235:
        r7 = r22;
        r2 = r23;
        goto L_0x023f;
    L_0x023a:
        r7 = r22;
        r2 = r23;
        r1 = 0;
    L_0x023f:
        if (r19 != 0) goto L_0x0242;
    L_0x0241:
        goto L_0x0245;
    L_0x0242:
        defpackage.cno.c();
    L_0x0245:
        r6 = r17 + 1;
        r1 = r7;
        r4 = r16;
        r3 = r19;
        goto L_0x0017;
    L_0x024e:
        r1 = r0.g;
        if (r1 == 0) goto L_0x0255;
    L_0x0252:
        r21.c();
    L_0x0255:
        if (r24 == 0) goto L_0x025a;
    L_0x0257:
        r24.f();
    L_0x025a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqa.a(cpg, android.graphics.Rect, cqq):void");
    }

    private final void c() {
        boolean d = cno.d();
        if (d) {
            cno.a();
        }
        int b = this.B.b();
        while (true) {
            b--;
            if (b < 0) {
                break;
            }
            csu csu = (csu) this.B.c(b);
            if (csu.f) {
                csu.f = false;
            } else {
                coj coj = csu.c;
                coj coj2 = csu.d;
                coj coj3 = csu.e;
                if (coj != null) {
                    cok.a(coj, this.k);
                }
                if (csu.a()) {
                    csu.a(false);
                    if (coj2 != null) {
                        cok.a(coj2);
                    }
                }
                if (coj3 != null) {
                    cok.a(coj3, 0, 0, 0.0f, 0.0f);
                }
                this.B.a(b);
            }
        }
        if (d) {
            cno.c();
        }
    }

    public final void a(long j, ComponentHost componentHost) {
        componentHost.a(true);
        this.i.b(j, componentHost);
    }

    private static int a(Rect rect) {
        return !rect.isEmpty() ? rect.width() * rect.height() : 0;
    }

    public final void a(boolean z) {
        int b = this.i.b();
        while (true) {
            b--;
            if (b >= 0) {
                ((ComponentHost) this.i.c(b)).a(z);
            } else {
                return;
            }
        }
    }

    public static int a(Object obj) {
        if (obj instanceof Drawable) {
            return ((Drawable) obj).getBounds().height();
        }
        return ((View) obj).getHeight();
    }

    public final List a(cpg cpg) {
        if (this.e == null) {
            return Collections.emptyList();
        }
        List list = null;
        int i = 0;
        while (i < this.e.length) {
            if (b(cpg) && a() && this.u != null) {
                cpg cpg2 = this.r;
                if (cpg2 != null) {
                    csd csd = cpg2.b(i).n;
                    if (csd != null) {
                        csi csi = (csi) this.u.b.a(csd);
                        if (csi != null && csi.c == 2) {
                            int a = cqa.a(this.r, i);
                            cpd b = this.r.b(i);
                            if (this.f.get(i)) {
                                long j = b.c;
                                for (int i2 = i + 1; i2 <= a; i2++) {
                                    if (this.r.b(i2).i == j) {
                                        a(i2, this.i);
                                    }
                                }
                                this.f.clear(i);
                            }
                            for (int i3 = i; i3 <= a; i3++) {
                                if (a(i3) == null) {
                                    a(i3, this.r.b(i3), this.r);
                                }
                            }
                            cqb a2 = a(i);
                            ComponentHost componentHost = (ComponentHost) this.i.a(0);
                            cqb a3 = a(i);
                            ComponentHost componentHost2 = a3.e;
                            if (componentHost2 != componentHost) {
                                int width;
                                int height;
                                Object obj = a3.d;
                                int i4 = 0;
                                int i5 = 0;
                                while (componentHost2 != componentHost) {
                                    i4 += componentHost2.getLeft();
                                    i5 += componentHost2.getTop();
                                    componentHost2 = (ComponentHost) componentHost2.getParent();
                                }
                                if (obj instanceof View) {
                                    View view = (View) obj;
                                    i4 += view.getLeft();
                                    i5 += view.getTop();
                                    width = view.getWidth() + i4;
                                    height = view.getHeight();
                                } else {
                                    Rect bounds = ((Drawable) obj).getBounds();
                                    i4 += bounds.left;
                                    width = bounds.width() + i4;
                                    i5 += bounds.top;
                                    height = bounds.height();
                                }
                                int i6 = height + i5;
                                a3.e.a(i, a3);
                                cqa.a(obj, i4, i5, width, i6, false);
                                componentHost.a(i, a3, j);
                                a3.e = componentHost;
                            }
                            for (int i7 = i; i7 <= a; i7++) {
                                a3 = a(i7);
                                this.b.b(this.e[i7]);
                                cma cma = a3.c;
                                if (cma != null && cma.o()) {
                                    this.c.b(this.e[i7]);
                                }
                                if (cma.c(a3.c)) {
                                    zr zrVar = this.i;
                                    zrVar.a(zrVar.a((ComponentHost) a3.d));
                                }
                            }
                            csd csd2 = a2.h;
                            cqo cqo = (cqo) this.x.get(csd2);
                            if (cqo == null) {
                                cqo = new cqo();
                                this.x.put(csd2, cqo);
                            }
                            cqo.a(cph.c(this.e[i]), a2);
                            componentHost = a2.e;
                            Object obj2 = a2.d;
                            if (obj2 instanceof Drawable) {
                                componentHost.c();
                                cmi.b(i, componentHost.e, componentHost.f);
                            } else if (obj2 instanceof View) {
                                componentHost.b();
                                cmi.b(i, componentHost.c, componentHost.d);
                                componentHost.l = true;
                                componentHost.c(i, a2);
                            }
                            componentHost.a();
                            cmi.b(i, componentHost.a, componentHost.b);
                            componentHost.k();
                            componentHost.d();
                            componentHost.g.add(a2);
                            if (list == null) {
                                list = new ArrayList(2);
                            }
                            list.add(Integer.valueOf(i));
                            list.add(Integer.valueOf(a));
                            i = a + 1;
                        }
                    }
                }
            }
            i++;
        }
        return list == null ? Collections.emptyList() : list;
    }

    public final void a(int i, cpd cpd, cpg cpg) {
        if (!this.f.get(i)) {
            System.nanoTime();
            long a = cqa.a(cpd, cpg, this.f);
            ComponentHost componentHost = (ComponentHost) this.i.a(a);
            if (componentHost == null) {
                int a2 = cpg.a(a);
                a(a2, cpg.b(a2), cpg);
                componentHost = (ComponentHost) this.i.a(a);
            }
            cma cma = cpd.d;
            if (cma != null) {
                Object a3;
                Context context = this.D.b;
                cpy a4 = cnk.a(context, cma);
                if (a4 == null) {
                    a3 = cma.a(context);
                } else {
                    a3 = a4.a(context, cma);
                }
                cmg a5 = a(cma);
                cma.a(a5, a3);
                if (cma.c(cma)) {
                    a(cpd.c, (ComponentHost) a3);
                }
                cqb cqb = new cqb(cma, componentHost, a3, cpd);
                this.b.b(this.e[i], cqb);
                if (cma.o()) {
                    this.c.b(this.e[i], cqb);
                }
                cpd.a(j);
                componentHost.a(i, cqb, j);
                cqa.a(cqb);
                cma.b(a5, a3);
                cqb.f = true;
                boolean z = this.k.t.c;
                this.D.b.getApplicationContext();
                if (VERSION.SDK_INT >= 21 && !z && !(a3 instanceof RippleDrawable) && (a3 instanceof cpw)) {
                    ((cpw) a3).getCurrent();
                }
                cqa.a(cpd, cpg, this.f, j);
                cqa.a(cqb.d, j.left, j.top, j.right, j.bottom, true);
                return;
            }
            throw new RuntimeException("Trying to mount a LayoutOutput with a null Component.");
        }
    }

    public static void a(Object obj, int i, int i2, int i3, int i4, boolean z) {
        if (obj instanceof View) {
            clq.a((View) obj, i, i2, i3, i4, z);
        } else if (obj instanceof Drawable) {
            ((Drawable) obj).setBounds(i, i2, i3, i4);
        } else {
            String valueOf = String.valueOf(obj);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 28);
            stringBuilder.append("Unsupported mounted content ");
            stringBuilder.append(valueOf);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public static long a(cpd cpd, cpg cpg, BitSet bitSet) {
        if (!bitSet.get(cpd.j)) {
            while (true) {
                long j = cpd.i;
                cpd = cpg.b(j);
                if (cpd == null) {
                    break;
                } else if (!bitSet.get(cpd.j)) {
                    return j;
                }
            }
        }
        return -1;
    }

    public static void a(cpd cpd, cpg cpg, BitSet bitSet, Rect rect) {
        long a = cqa.a(cpd, cpg, bitSet);
        cpd.a(rect);
        long j = cpd.i;
        while (j != a) {
            cpd = cpg.b(j);
            cpd.a(C);
            rect.offset(C.left, C.top);
            j = cpd.i;
        }
    }

    public static void a(cqb cqb) {
        cma cma = cqb.c;
        if (cma.e(cma)) {
            int size;
            View view = (View) cqb.d;
            cqi cqi = cqb.a;
            int i = 2;
            if (cqi != null) {
                ComponentHost componentHost;
                coj coj = cqi.k;
                if (coj != null) {
                    cmd a = cqa.a(view);
                    if (a == null) {
                        a = new cmd();
                        if (view instanceof ComponentHost) {
                            componentHost = (ComponentHost) view;
                            componentHost.m = a;
                            componentHost.setOnClickListener(a);
                        } else {
                            view.setOnClickListener(a);
                            view.setTag(R.id.component_click_listener, a);
                        }
                    }
                    a.a = coj;
                    view.setClickable(true);
                }
                coj = cqi.m;
                if (coj != null) {
                    cmv b = cqa.b(view);
                    if (b == null) {
                        b = new cmv();
                        if (view instanceof ComponentHost) {
                            componentHost = (ComponentHost) view;
                            componentHost.n = b;
                            componentHost.setOnLongClickListener(b);
                        } else {
                            view.setOnLongClickListener(b);
                            view.setTag(R.id.component_long_click_listener, b);
                        }
                    }
                    b.a = coj;
                    view.setLongClickable(true);
                }
                coj = cqi.l;
                if (coj != null) {
                    cmf c = cqa.c(view);
                    if (c == null) {
                        c = new cmf();
                        if (view instanceof ComponentHost) {
                            componentHost = (ComponentHost) view;
                            componentHost.o = c;
                            componentHost.setOnFocusChangeListener(c);
                        } else {
                            view.setOnFocusChangeListener(c);
                            view.setTag(R.id.component_focus_change_listener, c);
                        }
                    }
                    c.a = coj;
                }
                coj = cqi.n;
                if (coj != null) {
                    cmu d = cqa.d(view);
                    if (d == null) {
                        d = new cmu();
                        if (view instanceof ComponentHost) {
                            componentHost = (ComponentHost) view;
                            componentHost.p = d;
                            componentHost.setOnTouchListener(d);
                        } else {
                            view.setOnTouchListener(d);
                            view.setTag(R.id.component_touch_listener, d);
                        }
                    }
                    d.a = coj;
                }
                coj = cqi.o;
                if (coj != null && (view instanceof ComponentHost)) {
                    ((ComponentHost) view).q = coj;
                }
                boolean z = view instanceof ComponentHost;
                if (z || cqi.c()) {
                    view.setTag(R.id.component_node_info, cqi);
                }
                Object obj = cqi.b;
                if (z) {
                    ((ComponentHost) view).h = obj;
                } else {
                    view.setTag(obj);
                }
                SparseArray sparseArray = cqi.c;
                if (sparseArray != null) {
                    if (z) {
                        ((ComponentHost) view).i = sparseArray;
                    } else {
                        size = sparseArray.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            view.setTag(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
                        }
                    }
                }
                float f = cqi.d;
                if (f != 0.0f) {
                    abe.d(view, f);
                }
                ViewOutlineProvider viewOutlineProvider = cqi.e;
                if (viewOutlineProvider != null && VERSION.SDK_INT >= 21) {
                    view.setOutlineProvider(viewOutlineProvider);
                }
                if (cqi.f && VERSION.SDK_INT >= 21) {
                    view.setClipToOutline(true);
                }
                if (cqi.a() && (view instanceof ViewGroup)) {
                    ((ViewGroup) view).setClipChildren(cqi.g);
                }
                CharSequence charSequence = cqi.a;
                if (!TextUtils.isEmpty(charSequence)) {
                    view.setContentDescription(charSequence);
                }
                size = cqi.z;
                if (size == 1) {
                    view.setFocusable(true);
                } else if (size == 2) {
                    view.setFocusable(false);
                }
                size = cqi.A;
                if (size == 1) {
                    view.setEnabled(true);
                } else if (size == 2) {
                    view.setEnabled(false);
                }
                size = cqi.B;
                if (size == 1) {
                    view.setSelected(true);
                } else if (size == 2) {
                    view.setSelected(false);
                }
                if (cqi.d()) {
                    f = cqi.h;
                    view.setScaleX(f);
                    view.setScaleY(f);
                }
                if (cqi.e()) {
                    view.setAlpha(cqi.i);
                }
                if (cqi.f()) {
                    view.setRotation(cqi.j);
                }
            }
            int i3 = cqb.g;
            if (i3 != 0) {
                abe.b(view, i3);
            }
            css css = cqb.b;
            if (css != null) {
                StateListAnimator stateListAnimator = css.f;
                size = css.g;
                if (!(stateListAnimator == null && size == 0)) {
                    if (VERSION.SDK_INT >= 21) {
                        if (stateListAnimator == null) {
                            stateListAnimator = AnimatorInflater.loadStateListAnimator(view.getContext(), size);
                        }
                        view.setStateListAnimator(stateListAnimator);
                    } else {
                        throw new IllegalStateException("MountState has a ViewNodeInfo with stateListAnimator, however the current Android version doesn't support stateListAnimator on Views");
                    }
                }
                if (!cma.c(cma)) {
                    cvu cvu = css.a;
                    if (cvu != null) {
                        view.getContext();
                        cqa.a(view, (Drawable) cvu.a(cvu));
                    }
                    if (css.a()) {
                        Rect rect = css.c;
                        int i4 = rect != null ? rect.left : 0;
                        Rect rect2 = css.c;
                        i3 = rect2 != null ? rect2.top : 0;
                        Rect rect3 = css.c;
                        int i5 = rect3 != null ? rect3.right : 0;
                        Rect rect4 = css.c;
                        view.setPadding(i4, i3, i5, rect4 != null ? rect4.bottom : 0);
                    }
                    cvl cvl = css.b;
                    if (cvl != null) {
                        if (VERSION.SDK_INT >= 23) {
                            view.setForeground(cvl);
                        } else {
                            throw new IllegalStateException("MountState has a ViewNodeInfo with foreground however the current Android version doesn't support foreground on Views");
                        }
                    }
                    if (VERSION.SDK_INT >= 17) {
                        int ordinal = css.e.ordinal();
                        if (ordinal == 1) {
                            i = 0;
                        } else if (ordinal == 2) {
                            i = 1;
                        }
                        view.setLayoutDirection(i);
                    }
                }
            }
        }
    }

    public static void b(cqb cqb) {
        cma cma = cqb.c;
        if (cma.e(cma)) {
            cqa.b(cqb, cma.c(cma));
        }
    }

    private static void b(cqb cqb, boolean z) {
        View view = (View) cqb.d;
        cqi cqi = cqb.a;
        boolean z2 = true;
        if (cqi != null) {
            if (cqi.k != null) {
                cmd a = cqa.a(view);
                if (a != null) {
                    a.a = null;
                }
            }
            if (cqi.m != null) {
                cmv b = cqa.b(view);
                if (b != null) {
                    b.a = null;
                }
            }
            if (cqi.l != null) {
                cmf c = cqa.c(view);
                if (c != null) {
                    c.a = null;
                }
            }
            if (cqi.n != null) {
                cmu d = cqa.d(view);
                if (d != null) {
                    d.a = null;
                }
            }
            if (cqi.o != null && (view instanceof ComponentHost)) {
                ((ComponentHost) view).q = null;
            }
            boolean z3 = view instanceof ComponentHost;
            if (z3) {
                ((ComponentHost) view).h = null;
            } else {
                view.setTag(null);
            }
            SparseArray sparseArray = cqi.c;
            if (z3) {
                ((ComponentHost) view).i = null;
            } else if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    view.setTag(sparseArray.keyAt(i), null);
                }
            }
            if (cqi.d != 0.0f) {
                abe.d(view, 0.0f);
            }
            if (cqi.e != null && VERSION.SDK_INT >= 21) {
                view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            }
            if (cqi.f && VERSION.SDK_INT >= 21) {
                view.setClipToOutline(false);
            }
            if (!cqi.g && (view instanceof ViewGroup)) {
                ((ViewGroup) view).setClipChildren(true);
            }
            if (!TextUtils.isEmpty(cqi.a)) {
                view.setContentDescription(null);
            }
            if (VERSION.SDK_INT >= 11 && cqi.d()) {
                if (view.getScaleX() != 1.0f) {
                    view.setScaleX(1.0f);
                }
                if (view.getScaleY() != 1.0f) {
                    view.setScaleY(1.0f);
                }
            }
            if (VERSION.SDK_INT >= 11 && cqi.e() && view.getAlpha() != 1.0f) {
                view.setAlpha(1.0f);
            }
            if (VERSION.SDK_INT >= 11 && cqi.f() && view.getRotation() != 0.0f) {
                view.setRotation(0.0f);
            }
        }
        view.setClickable((cqb.k & 1) != 0);
        view.setLongClickable((cqb.k & 2) == 2);
        view.setFocusable((cqb.k & 4) == 4);
        view.setEnabled((cqb.k & 8) == 8);
        if ((cqb.k & 16) != 16) {
            z2 = false;
        }
        view.setSelected(z2);
        if (cqb.g != 0) {
            abe.b(view, 0);
        }
        boolean z4 = view instanceof ComponentHost;
        if (z4 || view.getTag(R.id.component_node_info) != null) {
            view.setTag(R.id.component_node_info, null);
            if (!z4) {
                abe.a(view, null);
            }
        }
        css css = cqb.b;
        if (css != null) {
            if (!(css.f == null && css.g == 0)) {
                if (VERSION.SDK_INT >= 21) {
                    view.setStateListAnimator(null);
                } else {
                    throw new IllegalStateException("MountState has a ViewNodeInfo with stateListAnimator, however the current Android version doesn't support stateListAnimator on Views");
                }
            }
            if (!z) {
                if (css.a()) {
                    view.setPadding(0, 0, 0, 0);
                }
                cvu cvu = css.a;
                view.getBackground();
                if (cvu != null) {
                    cqa.a(view, null);
                    view.getContext();
                }
                if (css.b != null) {
                    if (VERSION.SDK_INT >= 23) {
                        view.setForeground(null);
                    } else {
                        throw new IllegalStateException("MountState has a ViewNodeInfo with foreground however the current Android version doesn't support foreground on Views");
                    }
                }
                if (VERSION.SDK_INT >= 17) {
                    view.setLayoutDirection(2);
                }
            }
        }
    }

    private static cmd a(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).m;
        }
        return (cmd) view.getTag(R.id.component_click_listener);
    }

    private static cmv b(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).n;
        }
        return (cmv) view.getTag(R.id.component_long_click_listener);
    }

    private static cmf c(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).o;
        }
        return (cmf) view.getTag(R.id.component_focus_change_listener);
    }

    private static cmu d(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).p;
        }
        return (cmu) view.getTag(R.id.component_touch_listener);
    }

    private static void a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 21 && (drawable instanceof cvn)) {
            Drawable drawable2 = ((cvn) drawable).a;
            if (drawable2 instanceof RippleDrawable) {
                view.setBackground(drawable2);
                return;
            }
        }
        view.setBackground(drawable);
    }

    public static void a(cqb cqb, boolean z) {
        if (cma.e(cqb.c)) {
            cqa.a((View) cqb.d, z);
        }
    }

    public static void a(View view, boolean z) {
        int i = 0;
        if (view instanceof cpq) {
            cpq cpq = (cpq) view;
            if (cpq.n()) {
                if (z) {
                    cpq.m();
                    return;
                }
                cpq.a(new Rect(0, 0, view.getWidth(), view.getHeight()), false);
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            while (i < viewGroup.getChildCount()) {
                cqa.a(viewGroup.getChildAt(i), z);
                i++;
            }
        }
    }

    private final void a(cmg cmg, cqb cqb) {
        ComponentHost componentHost;
        a(cqb.h);
        Object obj = cqb.d;
        int i = -1;
        if (obj instanceof ComponentHost) {
            componentHost = (ComponentHost) obj;
            for (int f = componentHost.f() - 1; f >= 0; f--) {
                a(cmg, componentHost.a(f));
            }
            if (componentHost.f() > 0) {
                throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
            }
        }
        componentHost = cqb.e;
        componentHost.a();
        aaf aaf = componentHost.a;
        int i2 = 0;
        if (aaf.a) {
            aaf.b();
        }
        while (i2 < aaf.c) {
            if (aaf.b[i2] == cqb) {
                i = i2;
                break;
            }
            i2++;
        }
        componentHost.a(aaf.d(i), cqb);
        cqa.b(cqb);
        c(cqb);
        if (cqb.c.o()) {
            int a = this.c.a((Object) cqb);
            if (a > 0) {
                this.c.a(a);
            }
        }
        cqb.a(cmg.b);
    }

    public final void a(int i, zr zrVar) {
        cqb a = a(i);
        System.nanoTime();
        if (a != null) {
            if (this.e[i] != 0) {
                int f;
                Object obj = a.d;
                if ((obj instanceof ComponentHost) && !(obj instanceof cpq)) {
                    ComponentHost componentHost = (ComponentHost) obj;
                    f = componentHost.f();
                    while (true) {
                        f--;
                        if (f < 0) {
                            break;
                        }
                        Object a2 = componentHost.a(f);
                        zr zrVar2 = this.b;
                        long b = zrVar2.b(zrVar2.a(a2));
                        int length = this.e.length;
                        while (true) {
                            length--;
                            if (length >= 0) {
                                if (this.e[length] == b) {
                                    a(length, zrVar);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (componentHost.f() > 0) {
                        throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                    }
                }
                if (obj instanceof cou) {
                    ArrayList arrayList = new ArrayList();
                    ((cou) obj).a(arrayList);
                    f = arrayList.size();
                    while (true) {
                        f--;
                        if (f < 0) {
                            break;
                        }
                        ((cpq) arrayList.get(f)).o();
                    }
                }
                a.e.a(i, a);
                cqa.b(a);
                cma cma = a.c;
                if (cma.c(cma)) {
                    ComponentHost componentHost2 = (ComponentHost) obj;
                    zrVar.a(zrVar.a((Object) componentHost2));
                    a(componentHost2);
                }
                c(a);
                long j = this.e[i];
                this.b.b(j);
                if (a.a()) {
                    int c = cph.c(j);
                    csd csd = a.h;
                    csf csf = this.u;
                    if (!(csf == null || csd == null)) {
                        csi csi = (csi) csf.b.a(csd);
                        if (csi != null) {
                            cqo cqo = csi.b;
                            if (!(cqo == null || cqo.a(c) == null)) {
                                cqo cqo2;
                                if (cqo.b > (short) 1) {
                                    cqo2 = new cqo(cqo);
                                    cqo2.b(c, null);
                                } else {
                                    cqo2 = null;
                                }
                                csf.a(csi, cqo2);
                            }
                        }
                    }
                }
                if (cma.o()) {
                    this.c.b(this.e[i]);
                }
                a.a(this.D.b);
                return;
            }
            cqa.b(a, true);
        }
    }

    private final void c(cqb cqb) {
        cma cma = cqb.c;
        Object obj = cqb.d;
        cmg a = a(cma);
        if (cqb.f) {
            cma.b(obj);
            cqb.f = false;
        }
        cma.d(a, obj);
    }

    public final void a(cqo cqo) {
        a(((cqb) cqo.a()).h);
        short s = cqo.b;
        short s2 = (short) 0;
        while (s2 < s) {
            ComponentHost componentHost;
            Object obj = (cqb) cqo.c(s2);
            if (cqo.b(s2) == 3) {
                componentHost = (ComponentHost) obj.d;
                int f = componentHost.f();
                while (true) {
                    f--;
                    if (f < 0) {
                        break;
                    }
                    a(this.D, componentHost.a(f));
                }
                if (componentHost.f() > 0) {
                    throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                }
            }
            componentHost = obj.e;
            componentHost.d();
            if (componentHost.g.remove(obj)) {
                Object obj2 = obj.d;
                if (obj2 instanceof Drawable) {
                    componentHost.a((cqb) obj);
                } else if (obj2 instanceof View) {
                    componentHost.a((View) obj2);
                }
                cmi.a((cqb) obj);
                cqa.b((cqb) obj);
                c((cqb) obj);
                if (obj.c.o()) {
                    int a = this.c.a(obj);
                    if (a > 0) {
                        this.c.a(a);
                    }
                }
                obj.a(this.D.b);
                s2++;
            } else {
                String valueOf = String.valueOf(obj.h);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 62);
                stringBuilder.append("Tried to remove non-existent disappearing item, transitionId: ");
                stringBuilder.append(valueOf);
                throw new RuntimeException(stringBuilder.toString());
            }
        }
    }

    public final cqb a(int i) {
        return (cqb) this.b.a(this.e[i]);
    }

    public final void a(cpg cpg, crr crr) {
        if (this.u == null) {
            this.u = new csf(this);
        }
        csf csf = this.u;
        cpg cpg2 = this.r;
        boolean d = cno.d();
        if (d) {
            cno.a();
        }
        for (csi csi : csf.b.d.values()) {
            csi.f = false;
        }
        Map map = cpg.p;
        if (cpg2 != null) {
            Map map2 = cpg2.p;
            HashSet hashSet = new HashSet();
            for (csd csd : map.keySet()) {
                int i = csd.a;
                cqo cqo = (cqo) map.get(csd);
                cqo cqo2 = (cqo) map2.get(csd);
                if (cqo2 != null) {
                    hashSet.add(csd);
                } else if (i == 3) {
                }
                csf.a(csd, cqo2, cqo);
            }
            for (csd csd2 : map2.keySet()) {
                if (!hashSet.contains(csd2)) {
                    csf.a(csd2, (cqo) map2.get(csd2), null);
                }
            }
        } else {
            for (csd csd3 : map.keySet()) {
                csf.a(csd3, null, (cqo) map.get(csd3));
            }
        }
        csf.i = csf.a(crr);
        HashSet<csd> hashSet2 = new HashSet();
        for (csd csd4 : csf.b.a()) {
            csi csi2 = (csi) csf.b.a(csd4);
            if (csi2.a.isEmpty()) {
                csf.a(csi2, null);
                csf.a(csi2);
                hashSet2.add(csd4);
            }
        }
        for (csd b : hashSet2) {
            csf.b.b(b);
        }
        if (d) {
            cno.c();
        }
        for (csd csd5 : cpg.p.keySet()) {
            if (this.u.b.d.containsKey(csd5)) {
                this.v.add(csd5);
            }
        }
    }

    private static int a(cpg cpg, int i) {
        long j = cpg.b(i).c;
        int c = cpg.c();
        for (i++; i < c; i++) {
            long j2 = cpg.b(i).i;
            while (j2 != j) {
                if (j2 == 0) {
                    return i - 1;
                }
                j2 = cpg.b(cpg.a(j2)).i;
            }
        }
        return cpg.c() - 1;
    }

    public final void a(cpg cpg, int i, boolean z) {
        int a = cqa.a(cpg, i);
        int i2 = i;
        while (true) {
            String str = "Decremented animation lock count below 0!";
            if (i2 > a) {
                long j = cpg.b(i).i;
                while (j != 0) {
                    i = cpg.a(j);
                    int[] iArr;
                    if (z) {
                        iArr = this.w;
                        iArr[i] = iArr[i] + 1;
                    } else {
                        iArr = this.w;
                        i2 = iArr[i] - 1;
                        iArr[i] = i2;
                        if (i2 < 0) {
                            throw new RuntimeException(str);
                        }
                    }
                    j = cpg.b(i).i;
                }
                return;
            }
            if (z) {
                int[] iArr2 = this.w;
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                int[] iArr3 = this.w;
                int i3 = iArr3[i2] - 1;
                iArr3[i2] = i3;
                if (i3 < 0) {
                    throw new RuntimeException(str);
                }
            }
            i2++;
        }
    }

    public final boolean b(cpg cpg) {
        boolean z = false;
        if (this.g) {
            if (this.q == cpg.l) {
                z = true;
            } else if (this.s) {
                return true;
            } else {
                return z;
            }
        }
        return z;
    }

    public final boolean a() {
        return this.y != null;
    }

    public final void b(csd csd) {
        cqo cqo = (cqo) this.x.remove(csd);
        if (cqo != null) {
            a(cqo);
            return;
        }
        this.v.remove(csd);
        cqo cqo2 = (cqo) this.r.p.get(csd);
        if (cqo2 != null) {
            short s = cqo2.b;
            for (short s2 = (short) 0; s2 < s; s2++) {
                a(this.r, ((cpd) cqo2.c(s2)).j, false);
            }
        }
    }

    public final void b() {
        if (this.e != null) {
            boolean d = cno.d();
            if (d) {
                cno.a();
            }
            int length = this.e.length;
            for (int i = 0; i < length; i++) {
                cqb a = a(i);
                if (a != null && a.f) {
                    cma cma = a.c;
                    a(cma);
                    cma.b(a.d);
                    a.f = false;
                }
            }
            c();
            if (d) {
                cno.c();
            }
        }
    }

    public final boolean b(int i) {
        int[] iArr = this.w;
        if (iArr == null || iArr[i] <= 0) {
            return false;
        }
        return true;
    }

    public final void a(ComponentHost componentHost) {
        if (componentHost.e()) {
            List arrayList;
            if (componentHost.e()) {
                arrayList = new ArrayList();
                int size = componentHost.g.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(((cqb) componentHost.g.get(i)).h);
                }
            } else {
                arrayList = null;
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.u.a((csd) arrayList.get(i2), null);
            }
        }
    }

    public final void a(cpg cpg, ComponentTree componentTree) {
        if (!this.z) {
            List arrayList = new ArrayList();
            List list = cpg.q;
            if (list != null) {
                arrayList.addAll(list);
            }
            list = cpg.o;
            list = cpg.o;
            componentTree.a(arrayList, cpg.i);
            cry cry = new cry();
            cry cry2 = new cry();
            csd csd = cpg.h;
            if (csd != null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    crr crr = (crr) arrayList.get(i);
                    if (crr != null) {
                        csn.a(csd, crr, cte.c, cry);
                        csn.a(csd, crr, cte.d, cry2);
                        i++;
                    } else {
                        String str = cpg.i;
                        String valueOf = String.valueOf(csd);
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 77) + valueOf.length());
                        stringBuilder.append("NULL_TRANSITION when collecting root bounds anim. Root: ");
                        stringBuilder.append(str);
                        stringBuilder.append(", root TransitionId: ");
                        stringBuilder.append(valueOf);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
            }
            crr crr2 = null;
            if (!cry.a) {
                cry = null;
            }
            if (!cry2.a) {
                cry2 = null;
            }
            componentTree.t = cry;
            componentTree.u = cry2;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    crr2 = (crr) arrayList.get(0);
                } else {
                    crr2 = new cqr(arrayList);
                }
            }
            this.y = crr2;
            this.z = true;
        }
    }

    public final cmg a(cma cma) {
        cmg cmg = cma.p;
        return cmg == null ? this.D : cmg;
    }

    private static View a(cma cma, ComponentHost componentHost) {
        int f = componentHost.f();
        for (int i = 0; i < f; i++) {
            cqb a = componentHost.a(i);
            cma cma2 = a.c;
            if (cma == cma2) {
                return (View) a.d;
            }
            if (cma.c(cma2)) {
                View a2 = cqa.a(cma, (ComponentHost) a.d);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }
}

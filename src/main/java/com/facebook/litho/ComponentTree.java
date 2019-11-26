package com.facebook.litho;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import defpackage.abe;
import defpackage.cma;
import defpackage.cmg;
import defpackage.cmq;
import defpackage.cmw;
import defpackage.cmx;
import defpackage.cmy;
import defpackage.cmz;
import defpackage.cna;
import defpackage.cnb;
import defpackage.cnc;
import defpackage.cnd;
import defpackage.cnf;
import defpackage.cng;
import defpackage.com;
import defpackage.coo;
import defpackage.cow;
import defpackage.cox;
import defpackage.coy;
import defpackage.cpb;
import defpackage.cpe;
import defpackage.cpg;
import defpackage.cpq;
import defpackage.cqu;
import defpackage.crd;
import defpackage.crg;
import defpackage.crm;
import defpackage.crr;
import defpackage.cry;
import defpackage.csb;
import defpackage.csq;
import defpackage.csx;
import defpackage.csy;
import defpackage.csz;
import defpackage.cto;
import defpackage.cuj;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ComponentTree {
    private static final AtomicInteger G = new AtomicInteger(0);
    private static final Handler H = new cna();
    private static volatile Looper I;
    private static volatile Looper J;
    public static final String a = ComponentTree.class.getSimpleName();
    public static final ThreadLocal d = new ThreadLocal();
    public final int A;
    public final com B = new com();
    public final int C;
    private boolean D;
    private String E;
    private cnd F;
    private final cow K;
    private final Runnable L = new cmw(this);
    private cpe M;
    private final boolean N;
    private final boolean O;
    private final Object P = new Object();
    private final List Q = new ArrayList();
    private csq R;
    private int S = -1;
    private int T = -1;
    private int U = -1;
    private int V = -1;
    private boolean W;
    private int X;
    private final coo Y = new coo();
    private final csz Z = new csz();
    private final boolean aa;
    public final String b;
    public final boolean c;
    public final boolean e;
    public final Object f = new Object();
    public cnf g;
    public final cmg h;
    public final boolean i;
    public boolean j;
    public final boolean k;
    public boolean l;
    public final boolean m;
    public cpq n;
    public cpe o;
    public volatile cng p;
    public final Object q = new Object();
    public cmx r;
    public volatile boolean s;
    public cry t;
    public cry u;
    public cma v;
    public cpg w;
    public cpg x;
    public crg y;
    public cqu z;

    public static cmy a(cmg cmg, cma cma) {
        if (cma != null) {
            return new cmy(cmg, cma);
        }
        throw new NullPointerException("Creating a ComponentTree with a null root is not allowed!");
    }

    public ComponentTree(cmy cmy) {
        cmg cmg = new cmg(cmy.a, new crg(), null, null);
        cmg.m = this;
        this.h = cmg;
        this.v = cmy.b;
        this.k = cmy.c;
        this.N = cmy.d;
        this.o = cmy.e;
        this.e = cmy.l;
        this.M = cmy.f;
        this.m = cmy.h;
        this.s = cmy.j;
        this.F = cmy.k;
        this.b = cmy.n;
        this.i = cmy.o;
        this.O = cmy.p;
        this.c = cmy.q;
        this.aa = cmy.r;
        this.C = cmy.s;
        a();
        if (this.M == null && cmy.m) {
            this.M = new cnc(t());
        }
        crg crg = cmy.g;
        if (crg == null) {
            crg = crg.a(null);
        }
        this.y = crg;
        int i = cmy.i;
        if (i == -1) {
            this.A = G.getAndIncrement();
        } else {
            this.A = i;
        }
        this.K = new cow(this);
    }

    public final void a() {
        if (this.o == null) {
            cpe cmz;
            if (cuj.h == null) {
                cmz = new cmz(s());
            } else {
                cmz = new crm(cuj.h);
            }
            this.o = cmz;
        }
    }

    private final cpg m() {
        cpg cpg;
        if (n()) {
            cpg = this.x;
            this.x = null;
            return cpg;
        }
        cpq cpq = this.n;
        if (cpq != null) {
            cpq.p();
        }
        cpg = this.w;
        this.w = this.x;
        this.x = null;
        return cpg;
    }

    private final boolean n() {
        if (a(this.w)) {
            return true;
        }
        if (a(this.x, this.S, this.T) || !a(this.w, this.S, this.T)) {
            return false;
        }
        return true;
    }

    private final void o() {
        cng cng = this.p;
        if (cng != null) {
            cng.a();
        }
    }

    /* JADX WARNING: Missing block: B:12:0x001b, code skipped:
            if (r1 == r0) goto L_0x0045;
     */
    /* JADX WARNING: Missing block: B:13:0x001d, code skipped:
            o();
            r0 = r4.n.getMeasuredWidth();
            r1 = r4.n.getMeasuredHeight();
     */
    /* JADX WARNING: Missing block: B:14:0x002c, code skipped:
            if (r0 == 0) goto L_0x002f;
     */
    /* JADX WARNING: Missing block: B:15:0x002f, code skipped:
            if (r1 != 0) goto L_0x0032;
     */
    /* JADX WARNING: Missing block: B:16:0x0031, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:18:0x003a, code skipped:
            if ((a(r4.w, r2, r0, r1) ^ 1) == 0) goto L_0x0042;
     */
    /* JADX WARNING: Missing block: B:19:0x003c, code skipped:
            r4.n.requestLayout();
     */
    /* JADX WARNING: Missing block: B:20:0x0041, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:21:0x0042, code skipped:
            d();
     */
    /* JADX WARNING: Missing block: B:22:0x0045, code skipped:
            return;
     */
    public final void b() {
        /*
        r4 = this;
        r0 = r4.l;
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r4.o();
        return;
    L_0x0008:
        monitor-enter(r4);
        r0 = r4.v;	 Catch:{ all -> 0x0046 }
        if (r0 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r4);	 Catch:{ all -> 0x0046 }
        return;
    L_0x000f:
        r0 = r4.w;	 Catch:{ all -> 0x0046 }
        r4.m();	 Catch:{ all -> 0x0046 }
        r1 = r4.w;	 Catch:{ all -> 0x0046 }
        r2 = r4.v;	 Catch:{ all -> 0x0046 }
        r2 = r2.j;	 Catch:{ all -> 0x0046 }
        monitor-exit(r4);	 Catch:{ all -> 0x0046 }
        if (r1 == r0) goto L_0x0045;
    L_0x001d:
        r4.o();
        r0 = r4.n;
        r0 = r0.getMeasuredWidth();
        r1 = r4.n;
        r1 = r1.getMeasuredHeight();
        if (r0 == 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0032;
    L_0x002f:
        if (r1 != 0) goto L_0x0032;
    L_0x0031:
        return;
    L_0x0032:
        r3 = r4.w;
        r0 = a(r3, r2, r0, r1);
        r0 = r0 ^ 1;
        if (r0 == 0) goto L_0x0042;
    L_0x003c:
        r0 = r4.n;
        r0.requestLayout();
        return;
    L_0x0042:
        r4.d();
    L_0x0045:
        return;
    L_0x0046:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0046 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.b():void");
    }

    public final void c() {
        cpq cpq = this.n;
        if (cpq != null) {
            int i;
            cow cow = this.K;
            if (cow != null) {
                cow.a(cpq);
            }
            synchronized (this) {
                this.l = true;
                m();
                cma cma = this.v;
                if (cma != null) {
                    i = cma.j;
                } else {
                    boolean z = this.D;
                    String str = this.E;
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 99);
                    stringBuilder.append("Trying to attach a ComponentTree with a null root. Is released: ");
                    stringBuilder.append(z);
                    stringBuilder.append(", Released Component name is: ");
                    stringBuilder.append(str);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            int measuredWidth = this.n.getMeasuredWidth();
            int measuredHeight = this.n.getMeasuredHeight();
            if (measuredWidth != 0 || measuredHeight != 0) {
                if ((1 ^ a(this.w, i, measuredWidth, measuredHeight)) != 0 || this.n.q()) {
                    this.n.requestLayout();
                    return;
                } else {
                    this.n.l();
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("Trying to attach a ComponentTree without a set View");
    }

    public final boolean d() {
        if (!this.n.q() && !this.n.r()) {
            return false;
        }
        if (this.k) {
            e();
        } else {
            a(null, true);
        }
        return true;
    }

    public final void e() {
        if (!this.k) {
            throw new IllegalStateException("Calling incrementalMountComponent() but incremental mount is not enabled");
        } else if (this.n != null) {
            Rect rect = new Rect();
            if (!this.n.getLocalVisibleRect(rect)) {
                if (!this.s) {
                    if ((this.u == null || rect.height() != 0) && (this.t == null || rect.width() != 0)) {
                        return;
                    }
                }
                return;
            }
            a(rect, true);
        }
    }

    public final int a(int i, boolean z, cry cry, cto cto) {
        if (cry != null) {
            if (!this.s) {
                csb csb = cry.b;
                if (csb != null) {
                    return (int) crr.a(csb, this.w, cto);
                }
            }
            if (!this.s || z) {
                return -1;
            }
            return i;
        }
        return -1;
    }

    public final synchronized boolean a(int i, int i2) {
        boolean z;
        z = a(this.w, i, i2) || a(this.x, i, i2);
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a4 A:{Catch:{ all -> 0x0a96 }} */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a3 A:{Catch:{ all -> 0x0a96 }} */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ce A:{Catch:{ all -> 0x0a96 }} */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01e8 A:{Catch:{ all -> 0x0a96 }} */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e7 A:{Catch:{ all -> 0x0a96 }} */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x076e  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x074f  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x077e  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x079a  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x078e  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x07d2  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0818  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0826  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x074f  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x076e  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x077e  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x078e  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x079a  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x07d2  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0818  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0826  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x076e  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x074f  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x077e  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x079a  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x078e  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x07d2  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0818  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0826  */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0869  */
    /* JADX WARNING: Removed duplicated region for block: B:574:0x086c A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x055c  */
    /* JADX WARNING: Removed duplicated region for block: B:574:0x086c A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0869  */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x09e5  */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x09fd  */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x0a0c  */
    /* JADX WARNING: Removed duplicated region for block: B:517:0x0a7b  */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x0a82  */
    /* JADX WARNING: Removed duplicated region for block: B:522:0x0a89  */
    /* JADX WARNING: Removed duplicated region for block: B:522:0x0a89  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:529:0x0a9e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Missing block: B:242:0x0511, code skipped:
            if (((com.facebook.litho.ComponentHost) r15).f() > 0) goto L_0x04ff;
     */
    /* JADX WARNING: Missing block: B:288:0x05c6, code skipped:
            if (r13 == 2) goto L_0x05e8;
     */
    /* JADX WARNING: Missing block: B:326:0x0647, code skipped:
            if (defpackage.clx.a(r6.f, r5.f) != false) goto L_0x0649;
     */
    public final void a(android.graphics.Rect r33, boolean r34) {
        /*
        r32 = this;
        r1 = r32;
        r0 = r1.w;
        if (r0 != 0) goto L_0x000e;
    L_0x0006:
        r0 = a;
        r2 = "Main Thread Layout state is not found";
        android.util.Log.w(r0, r2);
        return;
    L_0x000e:
        r0 = r1.n;
        r0 = r0.q();
        if (r0 != 0) goto L_0x0018;
    L_0x0016:
        r2 = r1.s;
    L_0x0018:
        r2 = 1;
        r1.j = r2;
        r3 = r1.s;
        if (r3 != 0) goto L_0x0027;
    L_0x001f:
        r3 = r1.n;
        r3 = r3.u;
        r3.s = r2;
        r1.s = r2;
    L_0x0027:
        r3 = r1.n;
        r4 = r1.w;
        r5 = r3.C;
        r6 = 0;
        r7 = 0;
        if (r5 > 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0054;
    L_0x0032:
        r5 = r3.t;
        if (r5 != 0) goto L_0x0037;
    L_0x0036:
        goto L_0x0054;
    L_0x0037:
        r5 = r5.k;
        if (r5 == 0) goto L_0x0054;
    L_0x003b:
        r5 = r3.u;
        r5 = r5.g;
        if (r5 == 0) goto L_0x0050;
    L_0x0041:
        r5 = new android.graphics.Rect;
        r8 = r3.getWidth();
        r9 = r3.getHeight();
        r5.<init>(r7, r7, r8, r9);
        r8 = 0;
        goto L_0x0058;
    L_0x0050:
        r19 = r0;
        goto L_0x0a85;
    L_0x0054:
        r5 = r33;
        r8 = r34;
    L_0x0058:
        if (r5 != 0) goto L_0x0060;
    L_0x005a:
        r9 = r3.w;
        r9.setEmpty();
        goto L_0x0065;
    L_0x0060:
        r9 = r3.w;
        r9.set(r5);
    L_0x0065:
        r3 = r3.u;
        if (r4 == 0) goto L_0x0a9e;
    L_0x0069:
        r9 = r3.k;
        r9 = r9.t;
        if (r5 != 0) goto L_0x0071;
    L_0x006f:
        r10 = 0;
        goto L_0x0072;
    L_0x0071:
        r10 = 1;
    L_0x0072:
        r11 = defpackage.cno.d();
        if (r11 == 0) goto L_0x00a9;
    L_0x0078:
        r12 = new java.lang.StringBuilder;
        if (r5 != 0) goto L_0x007f;
    L_0x007c:
        r13 = "mount";
        goto L_0x0081;
    L_0x007f:
        r13 = "incrementalMount";
    L_0x0081:
        r12.<init>(r13);
        r13 = "_";
        r12.append(r13);
        r14 = r9.j();
        r12.append(r14);
        r14 = r9.h;
        r14 = r14.c;
        if (r14 != 0) goto L_0x0097;
    L_0x0096:
        goto L_0x009d;
    L_0x0097:
        r12.append(r13);
        r12.append(r14);
    L_0x009d:
        r12.toString();
        r12 = defpackage.cno.b();
        r13 = r4.l;
        r12.b();
    L_0x00a9:
        r12 = r9.h;
        r13 = r12.d;
        r14 = r4.l;
        r15 = r3.q;
        if (r14 == r15) goto L_0x00b5;
    L_0x00b3:
        r3.r = r6;
    L_0x00b5:
        if (r13 != 0) goto L_0x00b9;
    L_0x00b7:
        r12 = r6;
        goto L_0x00c1;
    L_0x00b9:
        r15 = r13.d();
        r12 = defpackage.cpt.a(r12, r13, r15);
    L_0x00c1:
        r15 = r3.g;
        r33 = r8;
        if (r15 != 0) goto L_0x00cd;
    L_0x00c7:
        r19 = r0;
        r20 = r14;
        goto L_0x0347;
    L_0x00cd:
        r8 = defpackage.cno.d();
        if (r8 != 0) goto L_0x00d4;
    L_0x00d3:
        goto L_0x00f2;
    L_0x00d4:
        r15 = r9.h;
        r15 = r15.c;
        if (r15 != 0) goto L_0x00de;
    L_0x00da:
        defpackage.cno.a();
        goto L_0x00f2;
    L_0x00de:
        r2 = "MountState.updateTransitions:";
        r18 = r15.length();
        if (r18 != 0) goto L_0x00ec;
    L_0x00e6:
        r15 = new java.lang.String;
        r15.<init>(r2);
        goto L_0x00ef;
    L_0x00ec:
        r2.concat(r15);
    L_0x00ef:
        defpackage.cno.a();
    L_0x00f2:
        r2 = r4.l;	 Catch:{ all -> 0x0a96 }
        r15 = r3.q;	 Catch:{ all -> 0x0a96 }
        if (r15 != r2) goto L_0x00fa;
    L_0x00f8:
        goto L_0x019b;
    L_0x00fa:
        r2 = r3.u;	 Catch:{ all -> 0x0a96 }
        if (r2 == 0) goto L_0x018f;
    L_0x00fe:
        r2 = r3.x;	 Catch:{ all -> 0x0a96 }
        r2 = r2.values();	 Catch:{ all -> 0x0a96 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0a96 }
    L_0x0108:
        r15 = r2.hasNext();	 Catch:{ all -> 0x0a96 }
        if (r15 == 0) goto L_0x0118;
    L_0x010e:
        r15 = r2.next();	 Catch:{ all -> 0x0a96 }
        r15 = (defpackage.cqo) r15;	 Catch:{ all -> 0x0a96 }
        r3.a(r15);	 Catch:{ all -> 0x0a96 }
        goto L_0x0108;
    L_0x0118:
        r2 = r3.x;	 Catch:{ all -> 0x0a96 }
        r2.clear();	 Catch:{ all -> 0x0a96 }
        r2 = r3.v;	 Catch:{ all -> 0x0a96 }
        r2.clear();	 Catch:{ all -> 0x0a96 }
        r2 = r3.u;	 Catch:{ all -> 0x0a96 }
        r15 = r2.b;	 Catch:{ all -> 0x0a96 }
        r15 = r15.a();	 Catch:{ all -> 0x0a96 }
        r15 = r15.iterator();	 Catch:{ all -> 0x0a96 }
    L_0x012e:
        r18 = r15.hasNext();	 Catch:{ all -> 0x0a96 }
        if (r18 == 0) goto L_0x014d;
    L_0x0134:
        r18 = r15.next();	 Catch:{ all -> 0x0a96 }
        r7 = r18;
        r7 = (defpackage.csd) r7;	 Catch:{ all -> 0x0a96 }
        r6 = r2.b;	 Catch:{ all -> 0x0a96 }
        r6 = r6.a(r7);	 Catch:{ all -> 0x0a96 }
        r6 = (defpackage.csi) r6;	 Catch:{ all -> 0x0a96 }
        r7 = 0;
        r2.a(r6, r7);	 Catch:{ all -> 0x0a96 }
        defpackage.csf.a(r6);	 Catch:{ all -> 0x0a96 }
        r6 = 0;
        goto L_0x012e;
    L_0x014d:
        r6 = r2.b;	 Catch:{ all -> 0x0a96 }
        r7 = r6.a;	 Catch:{ all -> 0x0a96 }
        r7.clear();	 Catch:{ all -> 0x0a96 }
        r7 = r6.b;	 Catch:{ all -> 0x0a96 }
        r7.clear();	 Catch:{ all -> 0x0a96 }
        r7 = r6.c;	 Catch:{ all -> 0x0a96 }
        r7.clear();	 Catch:{ all -> 0x0a96 }
        r6 = r6.d;	 Catch:{ all -> 0x0a96 }
        r6.clear();	 Catch:{ all -> 0x0a96 }
        r6 = r2.c;	 Catch:{ all -> 0x0a96 }
        r6.d();	 Catch:{ all -> 0x0a96 }
        r6 = r2.a;	 Catch:{ all -> 0x0a96 }
        r6.clear();	 Catch:{ all -> 0x0a96 }
        r6 = r2.e;	 Catch:{ all -> 0x0a96 }
        r6 = r6.size();	 Catch:{ all -> 0x0a96 }
        r7 = -1;
        r6 = r6 + r7;
    L_0x0175:
        if (r6 < 0) goto L_0x0185;
    L_0x0177:
        r7 = r2.e;	 Catch:{ all -> 0x0a96 }
        r7 = r7.get(r6);	 Catch:{ all -> 0x0a96 }
        r7 = (defpackage.ctq) r7;	 Catch:{ all -> 0x0a96 }
        r7.a();	 Catch:{ all -> 0x0a96 }
        r6 = r6 + -1;
        goto L_0x0175;
    L_0x0185:
        r6 = r2.e;	 Catch:{ all -> 0x0a96 }
        r6.clear();	 Catch:{ all -> 0x0a96 }
        r6 = 0;
        r2.i = r6;	 Catch:{ all -> 0x0a96 }
        r3.w = r6;	 Catch:{ all -> 0x0a96 }
    L_0x018f:
        r2 = r3.s;	 Catch:{ all -> 0x0a96 }
        if (r2 != 0) goto L_0x019b;
    L_0x0193:
        if (r8 == 0) goto L_0x0198;
    L_0x0195:
        defpackage.cno.c();
    L_0x0198:
        r2 = 1;
        goto L_0x024a;
    L_0x019b:
        r2 = r3.x;	 Catch:{ all -> 0x0a96 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x0a96 }
        if (r2 == 0) goto L_0x01a4;
    L_0x01a3:
        goto L_0x01c8;
    L_0x01a4:
        r2 = r4.p;	 Catch:{ all -> 0x0a96 }
        r2 = r2.keySet();	 Catch:{ all -> 0x0a96 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0a96 }
    L_0x01ae:
        r6 = r2.hasNext();	 Catch:{ all -> 0x0a96 }
        if (r6 == 0) goto L_0x01c8;
    L_0x01b4:
        r6 = r2.next();	 Catch:{ all -> 0x0a96 }
        r6 = (defpackage.csd) r6;	 Catch:{ all -> 0x0a96 }
        r7 = r3.x;	 Catch:{ all -> 0x0a96 }
        r6 = r7.remove(r6);	 Catch:{ all -> 0x0a96 }
        r6 = (defpackage.cqo) r6;	 Catch:{ all -> 0x0a96 }
        if (r6 == 0) goto L_0x01ae;
    L_0x01c4:
        r3.a(r6);	 Catch:{ all -> 0x0a96 }
        goto L_0x01ae;
    L_0x01c8:
        r2 = r3.b(r4);	 Catch:{ all -> 0x0a96 }
        if (r2 == 0) goto L_0x01dc;
    L_0x01ce:
        r3.a(r4, r9);	 Catch:{ all -> 0x0a96 }
        r2 = r3.a();	 Catch:{ all -> 0x0a96 }
        if (r2 == 0) goto L_0x01dc;
    L_0x01d7:
        r2 = r3.y;	 Catch:{ all -> 0x0a96 }
        r3.a(r4, r2);	 Catch:{ all -> 0x0a96 }
    L_0x01dc:
        r2 = 0;
        r3.w = r2;	 Catch:{ all -> 0x0a96 }
        r2 = r3.v;	 Catch:{ all -> 0x0a96 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x0a96 }
        if (r2 == 0) goto L_0x01e8;
    L_0x01e7:
        goto L_0x0243;
    L_0x01e8:
        r2 = r4.p;	 Catch:{ all -> 0x0a96 }
        if (r2 == 0) goto L_0x0240;
    L_0x01ec:
        r6 = r2.keySet();	 Catch:{ all -> 0x0a96 }
        r6 = r6.iterator();	 Catch:{ all -> 0x0a96 }
    L_0x01f4:
        r7 = r6.hasNext();	 Catch:{ all -> 0x0a96 }
        if (r7 == 0) goto L_0x0243;
    L_0x01fa:
        r7 = r6.next();	 Catch:{ all -> 0x0a96 }
        r7 = (defpackage.csd) r7;	 Catch:{ all -> 0x0a96 }
        r9 = r3.v;	 Catch:{ all -> 0x0a96 }
        r9 = r9.contains(r7);	 Catch:{ all -> 0x0a96 }
        if (r9 == 0) goto L_0x01f4;
    L_0x0208:
        r9 = r3.w;	 Catch:{ all -> 0x0a96 }
        if (r9 != 0) goto L_0x0214;
    L_0x020c:
        r9 = r4.c();	 Catch:{ all -> 0x0a96 }
        r9 = new int[r9];	 Catch:{ all -> 0x0a96 }
        r3.w = r9;	 Catch:{ all -> 0x0a96 }
    L_0x0214:
        r7 = r2.get(r7);	 Catch:{ all -> 0x0a96 }
        r7 = (defpackage.cqo) r7;	 Catch:{ all -> 0x0a96 }
        r9 = r7.b;	 Catch:{ all -> 0x0a96 }
        r15 = 0;
    L_0x021d:
        if (r15 >= r9) goto L_0x01f4;
    L_0x021f:
        r19 = r7.c(r15);	 Catch:{ all -> 0x0a96 }
        r20 = r2;
        r2 = r19;
        r2 = (defpackage.cpd) r2;	 Catch:{ all -> 0x0a96 }
        r19 = r6;
        r21 = r7;
        r6 = r2.c;	 Catch:{ all -> 0x0a96 }
        r2 = r4.a(r6);	 Catch:{ all -> 0x0a96 }
        r6 = 1;
        r3.a(r4, r2, r6);	 Catch:{ all -> 0x0a96 }
        r15 = r15 + 1;
        r6 = r19;
        r2 = r20;
        r7 = r21;
        goto L_0x021d;
    L_0x0240:
        r2 = 0;
        r3.w = r2;	 Catch:{ all -> 0x0a96 }
    L_0x0243:
        if (r8 == 0) goto L_0x0198;
    L_0x0245:
        defpackage.cno.c();
        goto L_0x0198;
    L_0x024a:
        r3.a(r2);
        if (r12 == 0) goto L_0x0252;
    L_0x024f:
        r12.f();
    L_0x0252:
        r2 = r3.a(r4);
        r6 = defpackage.cqa.a;
        r7 = r3.m;
        r7.a();
        r7 = r3.e;
        if (r7 == 0) goto L_0x02fb;
    L_0x0261:
        r7 = 0;
        r8 = 0;
    L_0x0263:
        r9 = r3.e;
        r15 = r9.length;
        if (r7 >= r15) goto L_0x02fb;
    L_0x0268:
        r15 = r0;
        r0 = r9[r7];
        r0 = r4.b(r0);
        if (r0 == 0) goto L_0x027c;
    L_0x0271:
        r1 = r0.j;
        r1 = r6.get(r1);
        if (r1 != 0) goto L_0x027c;
    L_0x0279:
        r1 = r0.j;
        goto L_0x027d;
    L_0x027c:
        r1 = -1;
    L_0x027d:
        r9 = r3.a(r7);
        r19 = r15;
        r15 = r2.size();
        if (r15 <= r8) goto L_0x02a8;
    L_0x0289:
        r15 = r2.get(r8);
        r15 = (java.lang.Integer) r15;
        r15 = r15.intValue();
        if (r15 != r7) goto L_0x02a8;
    L_0x0295:
        r0 = r8 + 1;
        r0 = r2.get(r0);
        r0 = (java.lang.Integer) r0;
        r7 = r0.intValue();
        r8 = r8 + 2;
    L_0x02a3:
        r21 = r2;
        r20 = r14;
        goto L_0x02ef;
    L_0x02a8:
        r15 = -1;
        if (r1 != r15) goto L_0x02b6;
    L_0x02ab:
        r0 = r3.i;
        r3.a(r7, r0);
        r0 = r3.m;
        r0.a = r0.a + 1;
        goto L_0x02a3;
    L_0x02b6:
        r20 = r14;
        r14 = defpackage.cqa.a(r0, r4, r6);
        if (r9 != 0) goto L_0x02c6;
    L_0x02be:
        r0 = r3.m;
        r0.a = r0.a + 1;
        r21 = r2;
        goto L_0x02ef;
    L_0x02c6:
        r0 = r9.e;
        r21 = r2;
        r2 = r3.i;
        r2 = r2.a(r14);
        if (r0 == r2) goto L_0x02dd;
    L_0x02d2:
        r0 = r3.i;
        r3.a(r7, r0);
        r0 = r3.m;
        r0.a = r0.a + 1;
        goto L_0x02ef;
    L_0x02dd:
        if (r1 != r7) goto L_0x02e5;
    L_0x02df:
        r0 = r3.m;
        r0.c = r0.c + 1;
        goto L_0x02ef;
    L_0x02e5:
        r0 = r9.e;
        r0.a(r9, r7, r1);
        r0 = r3.m;
        r0.b = r0.b + 1;
    L_0x02ef:
        r0 = 1;
        r7 = r7 + r0;
        r1 = r32;
        r0 = r19;
        r14 = r20;
        r2 = r21;
        goto L_0x0263;
    L_0x02fb:
        r19 = r0;
        r20 = r14;
        if (r12 != 0) goto L_0x0302;
    L_0x0301:
        goto L_0x030b;
    L_0x0302:
        r12.b();
        r12.b();
        r12.b();
    L_0x030b:
        r0 = r3.i;
        r1 = 0;
        r0 = r0.a(r1);
        if (r0 != 0) goto L_0x0321;
    L_0x0315:
        r0 = r3.k;
        r3.a(r1, r0);
        r0 = r3.b;
        r7 = r3.t;
        r0.b(r1, r7);
    L_0x0321:
        r0 = r4.c();
        r1 = r3.e;
        if (r1 == 0) goto L_0x032c;
    L_0x0329:
        r1 = r1.length;
        if (r0 == r1) goto L_0x0330;
    L_0x032c:
        r1 = new long[r0];
        r3.e = r1;
    L_0x0330:
        r1 = 0;
    L_0x0331:
        if (r1 >= r0) goto L_0x0340;
    L_0x0333:
        r2 = r3.e;
        r7 = r4.b(r1);
        r7 = r7.c;
        r2[r1] = r7;
        r1 = r1 + 1;
        goto L_0x0331;
    L_0x0340:
        r3.f = r6;
        if (r12 == 0) goto L_0x0347;
    L_0x0344:
        r12.f();
    L_0x0347:
        r0 = r3.n;
        r0.a();
        if (r12 == 0) goto L_0x0351;
    L_0x034e:
        r13.g();
    L_0x0351:
        if (r5 != 0) goto L_0x0357;
    L_0x0353:
        r6 = r33;
        goto L_0x04d3;
    L_0x0357:
        r0 = r3.l;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0353;
    L_0x035f:
        r0 = r5.left;
        r1 = r3.l;
        r1 = r1.left;
        if (r0 != r1) goto L_0x0353;
    L_0x0367:
        r0 = r5.right;
        r1 = r3.l;
        r1 = r1.right;
        if (r0 != r1) goto L_0x0353;
    L_0x036f:
        r0 = r4.e;
        r1 = r4.f;
        r2 = r4.c();
        r6 = r5.top;
        if (r6 <= 0) goto L_0x037c;
    L_0x037b:
        goto L_0x0382;
    L_0x037c:
        r6 = r3.l;
        r6 = r6.top;
        if (r6 <= 0) goto L_0x03f9;
    L_0x0382:
        r6 = r3.p;
        if (r6 < r2) goto L_0x0387;
    L_0x0386:
        goto L_0x03b7;
    L_0x0387:
        r6 = r5.top;
        r7 = r3.p;
        r7 = r1.get(r7);
        r7 = (defpackage.cpd) r7;
        r7 = r7.e;
        r7 = r7.bottom;
        if (r6 < r7) goto L_0x03b7;
    L_0x0397:
        r6 = r3.p;
        r6 = r1.get(r6);
        r6 = (defpackage.cpd) r6;
        r6 = r6.c;
        r6 = r4.a(r6);
        r7 = r3.b(r6);
        if (r7 != 0) goto L_0x03b0;
    L_0x03ab:
        r7 = r3.i;
        r3.a(r6, r7);
    L_0x03b0:
        r6 = r3.p;
        r7 = 1;
        r6 = r6 + r7;
        r3.p = r6;
        goto L_0x0382;
    L_0x03b7:
        r6 = r3.p;
        if (r6 <= 0) goto L_0x03f9;
    L_0x03bb:
        r6 = r5.top;
        r7 = r3.p;
        r8 = -1;
        r7 = r7 + r8;
        r7 = r1.get(r7);
        r7 = (defpackage.cpd) r7;
        r7 = r7.e;
        r7 = r7.bottom;
        if (r6 >= r7) goto L_0x03f9;
    L_0x03cd:
        r6 = r3.p;
        r6 = r6 + r8;
        r3.p = r6;
        r6 = r1.get(r6);
        r6 = (defpackage.cpd) r6;
        r7 = r6.c;
        r7 = r4.a(r7);
        r7 = r3.a(r7);
        if (r7 != 0) goto L_0x03b7;
    L_0x03e4:
        r7 = r6.c;
        r7 = r4.a(r7);
        r3.a(r7, r6, r4);
        r7 = r3.A;
        r8 = r6.c;
        r6 = java.lang.Long.valueOf(r8);
        r7.add(r6);
        goto L_0x03b7;
    L_0x03f9:
        r1 = r3.k;
        r1 = r1.getHeight();
        r6 = r5.bottom;
        if (r6 >= r1) goto L_0x0404;
    L_0x0403:
        goto L_0x040a;
    L_0x0404:
        r6 = r3.l;
        r6 = r6.bottom;
        if (r6 >= r1) goto L_0x0482;
    L_0x040a:
        r1 = r3.o;
        if (r1 < r2) goto L_0x040f;
    L_0x040e:
        goto L_0x044f;
    L_0x040f:
        r1 = r5.bottom;
        r6 = r3.o;
        r6 = r0.get(r6);
        r6 = (defpackage.cpd) r6;
        r6 = r6.e;
        r6 = r6.top;
        if (r1 <= r6) goto L_0x044f;
    L_0x041f:
        r1 = r3.o;
        r1 = r0.get(r1);
        r1 = (defpackage.cpd) r1;
        r6 = r1.c;
        r6 = r4.a(r6);
        r6 = r3.a(r6);
        if (r6 == 0) goto L_0x0434;
    L_0x0433:
        goto L_0x0448;
    L_0x0434:
        r6 = r1.c;
        r6 = r4.a(r6);
        r3.a(r6, r1, r4);
        r6 = r3.A;
        r7 = r1.c;
        r1 = java.lang.Long.valueOf(r7);
        r6.add(r1);
    L_0x0448:
        r1 = r3.o;
        r6 = 1;
        r1 = r1 + r6;
        r3.o = r1;
        goto L_0x040a;
    L_0x044f:
        r1 = r3.o;
        if (r1 <= 0) goto L_0x0482;
    L_0x0453:
        r1 = r5.bottom;
        r2 = r3.o;
        r6 = -1;
        r2 = r2 + r6;
        r2 = r0.get(r2);
        r2 = (defpackage.cpd) r2;
        r2 = r2.e;
        r2 = r2.top;
        if (r1 > r2) goto L_0x0482;
    L_0x0465:
        r1 = r3.o;
        r1 = r1 + r6;
        r3.o = r1;
        r1 = r0.get(r1);
        r1 = (defpackage.cpd) r1;
        r1 = r1.c;
        r1 = r4.a(r1);
        r2 = r3.b(r1);
        if (r2 != 0) goto L_0x044f;
    L_0x047c:
        r2 = r3.i;
        r3.a(r1, r2);
        goto L_0x044f;
    L_0x0482:
        r0 = r3.c;
        r0 = r0.b();
        r1 = 0;
    L_0x0489:
        if (r1 >= r0) goto L_0x04c0;
    L_0x048b:
        r2 = r3.c;
        r2 = r2.c(r1);
        r2 = (defpackage.cqb) r2;
        r6 = r3.c;
        r6 = r6.b(r1);
        r8 = r3.A;
        r9 = java.lang.Long.valueOf(r6);
        r8 = r8.contains(r9);
        if (r8 == 0) goto L_0x04a9;
    L_0x04a5:
        r6 = r33;
        r7 = -1;
        goto L_0x04bb;
    L_0x04a9:
        r6 = r4.a(r6);
        r7 = -1;
        if (r6 == r7) goto L_0x04b9;
    L_0x04b0:
        r4.b(r6);
        r6 = r33;
        defpackage.cqa.a(r2, r6);
        goto L_0x04bb;
    L_0x04b9:
        r6 = r33;
    L_0x04bb:
        r1 = r1 + 1;
        r33 = r6;
        goto L_0x0489;
    L_0x04c0:
        r6 = r33;
        r0 = r3.A;
        r0.clear();
        r7 = r6;
        r24 = r11;
        r22 = r12;
        r21 = r13;
        r11 = r20;
        r6 = r5;
        goto L_0x08d9;
    L_0x04d3:
        r0 = r3.b;
        r1 = 0;
        r0 = r0.a(r1);
        r0 = (defpackage.cqb) r0;
        r1 = r4.c();
        r2 = 0;
    L_0x04e2:
        if (r2 >= r1) goto L_0x087f;
    L_0x04e4:
        r7 = r4.b(r2);
        r8 = r7.d;
        if (r11 == 0) goto L_0x04f2;
    L_0x04ec:
        r8.b();
        defpackage.cno.a();
    L_0x04f2:
        r9 = r3.a(r2);
        if (r9 != 0) goto L_0x04fa;
    L_0x04f8:
        r14 = 0;
        goto L_0x04fb;
    L_0x04fa:
        r14 = 1;
    L_0x04fb:
        if (r5 != 0) goto L_0x0501;
    L_0x04fd:
        r33 = r1;
    L_0x04ff:
        r1 = 1;
        goto L_0x052a;
    L_0x0501:
        if (r9 == 0) goto L_0x0514;
    L_0x0503:
        r15 = r9.d;
        r33 = r1;
        r1 = r15 instanceof com.facebook.litho.ComponentHost;
        if (r1 == 0) goto L_0x0516;
    L_0x050b:
        r15 = (com.facebook.litho.ComponentHost) r15;
        r1 = r15.f();
        if (r1 <= 0) goto L_0x0516;
    L_0x0513:
        goto L_0x04ff;
    L_0x0514:
        r33 = r1;
    L_0x0516:
        r1 = r7.e;
        r1 = android.graphics.Rect.intersects(r5, r1);
        if (r1 != 0) goto L_0x04ff;
    L_0x051e:
        r1 = r3.b(r2);
        if (r1 != 0) goto L_0x04ff;
    L_0x0524:
        if (r9 == 0) goto L_0x0529;
    L_0x0526:
        if (r9 != r0) goto L_0x0529;
    L_0x0528:
        goto L_0x04ff;
    L_0x0529:
        r1 = 0;
    L_0x052a:
        if (r1 == 0) goto L_0x054f;
    L_0x052c:
        if (r9 != 0) goto L_0x054f;
    L_0x052e:
        r3.a(r2, r7, r4);
        r1 = r3.b(r2);
        if (r1 == 0) goto L_0x0856;
    L_0x0537:
        if (r10 != 0) goto L_0x053b;
    L_0x0539:
        goto L_0x0856;
    L_0x053b:
        r1 = r8.o();
        if (r1 == 0) goto L_0x0856;
    L_0x0541:
        r1 = r3.a(r2);
        r1 = r1.d;
        r1 = (android.view.View) r1;
        r7 = 0;
        defpackage.cqa.a(r1, r7);
        goto L_0x0856;
    L_0x054f:
        if (r1 != 0) goto L_0x055a;
    L_0x0551:
        if (r14 == 0) goto L_0x055a;
    L_0x0553:
        r1 = r3.i;
        r3.a(r2, r1);
        goto L_0x0856;
    L_0x055a:
        if (r14 == 0) goto L_0x0856;
    L_0x055c:
        r1 = r3.g;
        if (r1 == 0) goto L_0x0834;
    L_0x0560:
        r1 = r3.r;
        if (r1 != 0) goto L_0x0566;
    L_0x0564:
        r1 = 0;
        goto L_0x056e;
    L_0x0566:
        r1 = r1.m;
        r14 = r4.n;
        if (r1 == r14) goto L_0x056d;
    L_0x056c:
        goto L_0x0564;
    L_0x056d:
        r1 = 1;
    L_0x056e:
        java.lang.System.nanoTime();
        r14 = r9.h;
        r15 = r7.d;
        r34 = r0;
        r0 = r9.c;
        if (r15 == 0) goto L_0x082c;
    L_0x057b:
        r21 = r13;
        r13 = r7.k;
        r22 = r12;
        r12 = r7.m;
        r23 = r5;
        r5 = r9.i;
        if (r12 != r5) goto L_0x05e4;
    L_0x0589:
        r5 = r7.e;
        r12 = r9.d;
        r24 = r11;
        r11 = r5.width();
        r25 = r6;
        r6 = r12 instanceof android.graphics.drawable.Drawable;
        if (r6 == 0) goto L_0x05a5;
    L_0x0599:
        r6 = r12;
        r6 = (android.graphics.drawable.Drawable) r6;
        r6 = r6.getBounds();
        r6 = r6.width();
        goto L_0x05ac;
    L_0x05a5:
        r6 = r12;
        r6 = (android.view.View) r6;
        r6 = r6.getWidth();
    L_0x05ac:
        if (r11 != r6) goto L_0x05b8;
    L_0x05ae:
        r5 = r5.height();
        r6 = defpackage.cqa.a(r12);
        if (r5 == r6) goto L_0x05bf;
    L_0x05b8:
        r5 = r15.v();
        if (r5 == 0) goto L_0x05bf;
    L_0x05be:
        goto L_0x05e8;
    L_0x05bf:
        if (r1 != 0) goto L_0x05c2;
    L_0x05c1:
        goto L_0x05c9;
    L_0x05c2:
        r1 = 1;
        if (r13 == r1) goto L_0x05d4;
    L_0x05c5:
        r1 = 2;
        if (r13 != r1) goto L_0x05c9;
    L_0x05c8:
        goto L_0x05be;
    L_0x05c9:
        r1 = r0.u();
        if (r1 == 0) goto L_0x05e8;
    L_0x05cf:
        r1 = r0.a(r0, r15);
        goto L_0x05e9;
    L_0x05d4:
        r1 = r0 instanceof defpackage.coe;
        if (r1 == 0) goto L_0x05e2;
    L_0x05d8:
        r1 = r15 instanceof defpackage.coe;
        if (r1 == 0) goto L_0x05e2;
    L_0x05dc:
        r1 = r0.a(r0, r15);
        if (r1 != 0) goto L_0x05e8;
    L_0x05e2:
        r1 = 0;
        goto L_0x05e9;
    L_0x05e4:
        r25 = r6;
        r24 = r11;
    L_0x05e8:
        r1 = 1;
    L_0x05e9:
        if (r1 == 0) goto L_0x05ee;
    L_0x05eb:
        r5 = 1;
        goto L_0x074d;
    L_0x05ee:
        r5 = r7.b;
        r6 = r9.b;
        if (r6 != 0) goto L_0x05f7;
    L_0x05f4:
        if (r5 == 0) goto L_0x05f7;
    L_0x05f6:
        goto L_0x05eb;
    L_0x05f7:
        if (r6 == 0) goto L_0x0649;
    L_0x05f9:
        if (r6 == r5) goto L_0x0649;
    L_0x05fb:
        if (r5 != 0) goto L_0x05fe;
    L_0x05fd:
        goto L_0x05eb;
    L_0x05fe:
        r11 = r6.a;
        r12 = r5.a;
        r11 = defpackage.cvu.a(r11, r12);
        if (r11 != 0) goto L_0x05eb;
    L_0x0608:
        r11 = r6.b;
        r12 = r5.b;
        if (r11 == 0) goto L_0x0618;
    L_0x060e:
        if (r12 != 0) goto L_0x0611;
    L_0x0610:
        goto L_0x061b;
    L_0x0611:
        r11 = r11.a(r12);
        if (r11 != 0) goto L_0x061b;
    L_0x0617:
        goto L_0x05eb;
    L_0x0618:
        if (r12 == 0) goto L_0x061b;
    L_0x061a:
        goto L_0x05eb;
    L_0x061b:
        r11 = r6.c;
        r12 = r5.c;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x0625:
        r11 = r6.d;
        r12 = r5.d;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x062f:
        r11 = r6.e;
        r12 = r5.e;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x0639:
        r11 = r6.g;
        r12 = r5.g;
        if (r11 != r12) goto L_0x05eb;
    L_0x063f:
        r6 = r6.f;
        r5 = r5.f;
        r5 = defpackage.clx.a(r6, r5);
        if (r5 == 0) goto L_0x05eb;
    L_0x0649:
        r5 = r7.a;
        r6 = r9.a;
        if (r6 != 0) goto L_0x0651;
    L_0x064f:
        if (r5 != 0) goto L_0x05eb;
    L_0x0651:
        if (r6 == 0) goto L_0x074c;
    L_0x0653:
        if (r6 == r5) goto L_0x074c;
    L_0x0655:
        if (r5 != 0) goto L_0x0658;
    L_0x0657:
        goto L_0x05eb;
    L_0x0658:
        r11 = r6.p;
        r12 = r5.p;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x0662:
        r11 = r6.i;
        r12 = r5.i;
        r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1));
        if (r11 != 0) goto L_0x05eb;
    L_0x066a:
        r11 = r6.k;
        r12 = r5.k;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x0674:
        r11 = r6.f;
        r12 = r5.f;
        if (r11 != r12) goto L_0x05eb;
    L_0x067a:
        r11 = r6.g;
        r12 = r5.g;
        if (r11 != r12) goto L_0x05eb;
    L_0x0680:
        r11 = r6.a;
        r12 = r5.a;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x068a:
        r11 = r6.r;
        r12 = r5.r;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x0694:
        r11 = r6.A;
        r12 = r5.A;
        if (r11 != r12) goto L_0x05eb;
    L_0x069a:
        r11 = r6.l;
        r12 = r5.l;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x06a4:
        r11 = r6.z;
        r12 = r5.z;
        if (r11 != r12) goto L_0x05eb;
    L_0x06aa:
        r11 = r6.o;
        r12 = r5.o;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x06b4:
        r11 = r6.m;
        r12 = r5.m;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x06be:
        r11 = r6.s;
        r12 = r5.s;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x06c8:
        r11 = r6.u;
        r12 = r5.u;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x06d2:
        r11 = r6.t;
        r12 = r5.t;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x06dc:
        r11 = r6.v;
        r12 = r5.v;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x06e6:
        r11 = r6.e;
        r12 = r5.e;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x06f0:
        r11 = r6.w;
        r12 = r5.w;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x06fa:
        r11 = r6.j;
        r12 = r5.j;
        r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1));
        if (r11 != 0) goto L_0x05eb;
    L_0x0702:
        r11 = r6.h;
        r12 = r5.h;
        r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1));
        if (r11 != 0) goto L_0x05eb;
    L_0x070a:
        r11 = r6.B;
        r12 = r5.B;
        if (r11 != r12) goto L_0x05eb;
    L_0x0710:
        r11 = r6.x;
        r12 = r5.x;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x071a:
        r11 = r6.y;
        r12 = r5.y;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x0724:
        r11 = r6.d;
        r12 = r5.d;
        r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1));
        if (r11 != 0) goto L_0x05eb;
    L_0x072c:
        r11 = r6.n;
        r12 = r5.n;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x0736:
        r11 = r6.b;
        r12 = r5.b;
        r11 = defpackage.clx.a(r11, r12);
        if (r11 == 0) goto L_0x05eb;
    L_0x0740:
        r6 = r6.c;
        r5 = r5.c;
        r5 = defpackage.clx.a(r6, r5);
        if (r5 != 0) goto L_0x074c;
    L_0x074a:
        goto L_0x05eb;
    L_0x074c:
        r5 = 0;
    L_0x074d:
        if (r1 == 0) goto L_0x076e;
    L_0x074f:
        r6 = r3.q;
        r11 = r20;
        if (r6 != r11) goto L_0x0756;
    L_0x0755:
        goto L_0x0765;
    L_0x0756:
        r6 = r9.c;
        r6 = defpackage.cma.c(r6);
        if (r6 == 0) goto L_0x0765;
    L_0x075e:
        r6 = r9.d;
        r6 = (com.facebook.litho.ComponentHost) r6;
        r3.a(r6);
    L_0x0765:
        defpackage.cqa.b(r9);
        r6 = r9.e;
        r6.c(r2, r9);
        goto L_0x077a;
    L_0x076e:
        r11 = r20;
        if (r5 == 0) goto L_0x077a;
    L_0x0772:
        defpackage.cqa.b(r9);
        r6 = r9.e;
        r6.c(r2, r9);
    L_0x077a:
        r6 = r9.f;
        if (r6 == 0) goto L_0x0789;
    L_0x077e:
        r3.a(r0);
        r6 = r9.d;
        r0.b(r6);
        r6 = 0;
        r9.f = r6;
    L_0x0789:
        r9.a(r7);
        if (r1 != 0) goto L_0x079a;
    L_0x078e:
        if (r5 != 0) goto L_0x0791;
    L_0x0790:
        goto L_0x07bb;
    L_0x0791:
        r0 = r9.e;
        r0.b(r2, r9);
        defpackage.cqa.a(r9);
        goto L_0x07bb;
    L_0x079a:
        r5 = r9.e;
        r5.b(r2, r9);
        r5 = r7.d;
        r6 = defpackage.cma.c(r5);
        if (r6 == 0) goto L_0x07a8;
    L_0x07a7:
        goto L_0x07b8;
    L_0x07a8:
        r6 = r9.d;
        r12 = r3.a(r0);
        r0.d(r12, r6);
        r0 = r3.a(r5);
        r5.a(r0, r6);
    L_0x07b8:
        defpackage.cqa.a(r9);
    L_0x07bb:
        r0 = r9.d;
        r5 = r3.a(r15);
        r15.b(r5, r0);
        r6 = 1;
        r9.f = r6;
        r0 = r3.f;
        r12 = r7.c;
        r16 = 0;
        r5 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1));
        if (r5 != 0) goto L_0x07d2;
    L_0x07d1:
        goto L_0x080e;
    L_0x07d2:
        r5 = defpackage.cqa.j;
        defpackage.cqa.a(r7, r4, r0, r5);
        r0 = r7.d;
        r0 = defpackage.cma.e(r0);
        if (r0 != 0) goto L_0x07e2;
    L_0x07df:
        r31 = 0;
        goto L_0x07ef;
    L_0x07e2:
        r0 = r9.d;
        r0 = (android.view.View) r0;
        r0 = r0.isLayoutRequested();
        if (r0 != 0) goto L_0x07ed;
    L_0x07ec:
        goto L_0x07df;
    L_0x07ed:
        r31 = 1;
    L_0x07ef:
        r0 = r9.d;
        r5 = defpackage.cqa.j;
        r5 = r5.left;
        r7 = defpackage.cqa.j;
        r7 = r7.top;
        r12 = defpackage.cqa.j;
        r12 = r12.right;
        r13 = defpackage.cqa.j;
        r13 = r13.bottom;
        r26 = r0;
        r27 = r5;
        r28 = r7;
        r29 = r12;
        r30 = r13;
        defpackage.cqa.a(r26, r27, r28, r29, r30, r31);
    L_0x080e:
        defpackage.cmi.a(r9);
        r0 = r9.d;
        r5 = r0 instanceof android.graphics.drawable.Drawable;
        if (r5 != 0) goto L_0x0818;
    L_0x0817:
        goto L_0x0823;
    L_0x0818:
        r5 = r9.e;
        r0 = (android.graphics.drawable.Drawable) r0;
        r7 = r9.j;
        r12 = r9.a;
        defpackage.cmi.a(r5, r0, r7, r12);
    L_0x0823:
        if (r1 != 0) goto L_0x0826;
    L_0x0825:
        goto L_0x0829;
    L_0x0826:
        r3.a(r14);
    L_0x0829:
        r0 = r3.n;
        goto L_0x0845;
    L_0x082c:
        r0 = new java.lang.RuntimeException;
        r1 = "Trying to update a MountItem with a null Component.";
        r0.<init>(r1);
        throw r0;
    L_0x0834:
        r34 = r0;
        r23 = r5;
        r25 = r6;
        r24 = r11;
        r22 = r12;
        r21 = r13;
        r11 = r20;
        r6 = 1;
        r16 = 0;
    L_0x0845:
        if (r10 == 0) goto L_0x0853;
    L_0x0847:
        r0 = r8.o();
        if (r0 == 0) goto L_0x0853;
    L_0x084d:
        r7 = r25;
        defpackage.cqa.a(r9, r7);
        goto L_0x0866;
    L_0x0853:
        r7 = r25;
        goto L_0x0866;
    L_0x0856:
        r34 = r0;
        r23 = r5;
        r7 = r6;
        r24 = r11;
        r22 = r12;
        r21 = r13;
        r11 = r20;
        r6 = 1;
        r16 = 0;
    L_0x0866:
        if (r24 != 0) goto L_0x0869;
    L_0x0868:
        goto L_0x086c;
    L_0x0869:
        defpackage.cno.c();
    L_0x086c:
        r2 = r2 + 1;
        r1 = r33;
        r0 = r34;
        r6 = r7;
        r20 = r11;
        r13 = r21;
        r12 = r22;
        r5 = r23;
        r11 = r24;
        goto L_0x04e2;
    L_0x087f:
        r23 = r5;
        r7 = r6;
        r24 = r11;
        r22 = r12;
        r21 = r13;
        r11 = r20;
        if (r10 != 0) goto L_0x088f;
    L_0x088c:
        r6 = r23;
        goto L_0x08d9;
    L_0x088f:
        r0 = r23.isEmpty();
        if (r0 != 0) goto L_0x088c;
    L_0x0895:
        r0 = r4.e;
        r1 = r4.f;
        r2 = r4.c();
        r5 = r4.c();
        r3.o = r5;
        r5 = 0;
    L_0x08a4:
        r6 = r23;
        if (r5 >= r2) goto L_0x08bd;
    L_0x08a8:
        r8 = r6.bottom;
        r9 = r0.get(r5);
        r9 = (defpackage.cpd) r9;
        r9 = r9.e;
        r9 = r9.top;
        if (r8 <= r9) goto L_0x08bb;
    L_0x08b6:
        r5 = r5 + 1;
        r23 = r6;
        goto L_0x08a4;
    L_0x08bb:
        r3.o = r5;
    L_0x08bd:
        r0 = r4.c();
        r3.p = r0;
        r0 = 0;
    L_0x08c4:
        if (r0 >= r2) goto L_0x08d9;
    L_0x08c6:
        r5 = r6.top;
        r8 = r1.get(r0);
        r8 = (defpackage.cpd) r8;
        r8 = r8.e;
        r8 = r8.bottom;
        if (r5 < r8) goto L_0x08d7;
    L_0x08d4:
        r0 = r0 + 1;
        goto L_0x08c4;
    L_0x08d7:
        r3.p = r0;
    L_0x08d9:
        r0 = r3.u;
        if (r0 == 0) goto L_0x0985;
    L_0x08dd:
        r0 = new java.util.LinkedHashMap;
        r1 = r3.v;
        r1 = r1.size();
        r0.<init>(r1);
        r1 = r3.b;
        r1 = r1.b();
        r2 = 0;
    L_0x08ef:
        if (r2 >= r1) goto L_0x0925;
    L_0x08f1:
        r5 = r3.b;
        r5 = r5.c(r2);
        r5 = (defpackage.cqb) r5;
        r8 = r5.a();
        if (r8 == 0) goto L_0x0922;
    L_0x08ff:
        r8 = r3.b;
        r8 = r8.b(r2);
        r8 = defpackage.cph.c(r8);
        r9 = r5.h;
        r9 = r0.get(r9);
        r9 = (defpackage.cqo) r9;
        if (r9 != 0) goto L_0x091d;
    L_0x0913:
        r9 = new cqo;
        r9.<init>();
        r10 = r5.h;
        r0.put(r10, r9);
    L_0x091d:
        r5 = r5.d;
        r9.b(r8, r5);
    L_0x0922:
        r2 = r2 + 1;
        goto L_0x08ef;
    L_0x0925:
        r1 = r0.keySet();
        r1 = r1.iterator();
    L_0x092d:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0945;
    L_0x0933:
        r2 = r1.next();
        r2 = (defpackage.csd) r2;
        r5 = r3.u;
        r8 = r0.get(r2);
        r8 = (defpackage.cqo) r8;
        r5.a(r2, r8);
        goto L_0x092d;
    L_0x0945:
        r0 = r3.x;
        r0 = r0.keySet();
        r0 = r0.iterator();
    L_0x094f:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0985;
    L_0x0955:
        r1 = r0.next();
        r1 = (defpackage.csd) r1;
        r2 = r3.x;
        r2 = r2.get(r1);
        r2 = (defpackage.cqo) r2;
        r5 = new cqo;
        r5.<init>();
        r8 = r2.b;
        r9 = 0;
    L_0x096b:
        if (r9 >= r8) goto L_0x097f;
    L_0x096d:
        r10 = r2.b(r9);
        r12 = r2.c(r9);
        r12 = (defpackage.cqb) r12;
        r12 = r12.d;
        r5.a(r10, r12);
        r9 = r9 + 1;
        goto L_0x096b;
    L_0x097f:
        r2 = r3.u;
        r2.a(r1, r5);
        goto L_0x094f;
    L_0x0985:
        r0 = r3.b(r4);
        if (r0 == 0) goto L_0x09e2;
    L_0x098b:
        r0 = r3.a();
        if (r0 == 0) goto L_0x09e2;
    L_0x0991:
        r0 = r3.u;
        r1 = r0.d;
        r1 = r1.keySet();
        r1 = r1.iterator();
    L_0x099d:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x09c9;
    L_0x09a3:
        r2 = r1.next();
        r2 = (defpackage.ctv) r2;
        r5 = r0.d;
        r5 = r5.get(r2);
        r5 = (java.lang.Float) r5;
        r5 = r5.floatValue();
        r8 = r2.a;
        r9 = r0.b;
        r8 = r9.a(r8);
        r8 = (defpackage.csi) r8;
        r8 = r8.b;
        if (r8 == 0) goto L_0x099d;
    L_0x09c3:
        r2 = r2.b;
        defpackage.csf.a(r2, r5, r8);
        goto L_0x099d;
    L_0x09c9:
        r1 = r0.d;
        r1.clear();
        r1 = r0.i;
        if (r1 == 0) goto L_0x09e2;
    L_0x09d2:
        r2 = r0.f;
        r1.a(r2);
        r1 = r0.i;
        r2 = r0.g;
        r1.a(r2);
        r1 = 0;
        r0.i = r1;
        goto L_0x09e3;
    L_0x09e2:
        r1 = 0;
    L_0x09e3:
        if (r7 == 0) goto L_0x09f0;
    L_0x09e5:
        defpackage.cno.a();
        r12 = r22;
        r3.a(r4, r6, r12);
        defpackage.cno.c();
    L_0x09f0:
        r3.y = r1;
        r0 = 0;
        r3.z = r0;
        r3.g = r0;
        r3.h = r0;
        r3.s = r0;
        if (r6 == 0) goto L_0x0a02;
    L_0x09fd:
        r0 = r3.l;
        r0.set(r6);
    L_0x0a02:
        r3.r = r1;
        r3.q = r11;
        r3.r = r4;
        r0 = r3.d;
        if (r0 == 0) goto L_0x0a75;
    L_0x0a0c:
        r0.clear();
        r0 = r4.e();
        r1 = 0;
    L_0x0a14:
        if (r1 >= r0) goto L_0x0a75;
    L_0x0a16:
        r2 = r4.d(r1);
        r5 = r2.b;
        r7 = r2.c;
        r9 = -1;
        r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r11 == 0) goto L_0x0a2d;
    L_0x0a24:
        r11 = r3.b;
        r7 = r11.a(r7);
        r7 = (defpackage.cqb) r7;
        goto L_0x0a2e;
    L_0x0a2d:
        r7 = 0;
    L_0x0a2e:
        r8 = new com.facebook.litho.TestItem;
        r8.<init>();
        r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r11 == 0) goto L_0x0a41;
    L_0x0a37:
        r9 = r3.i;
        r5 = r9.a(r5);
        r6 = r5;
        r6 = (com.facebook.litho.ComponentHost) r6;
        goto L_0x0a42;
    L_0x0a41:
        r6 = 0;
    L_0x0a42:
        r8.c = r6;
        r5 = r2.d;
        r6 = r8.b;
        r6.set(r5);
        r5 = r2.a;
        r8.a = r5;
        if (r7 == 0) goto L_0x0a54;
    L_0x0a51:
        r6 = r7.d;
        goto L_0x0a55;
    L_0x0a54:
        r6 = 0;
    L_0x0a55:
        r8.d = r6;
        r5 = r3.d;
        r6 = r2.a;
        r5 = r5.get(r6);
        r5 = (java.util.Deque) r5;
        if (r5 != 0) goto L_0x0a68;
    L_0x0a63:
        r5 = new java.util.LinkedList;
        r5.<init>();
    L_0x0a68:
        r5.add(r8);
        r6 = r3.d;
        r2 = r2.a;
        r6.put(r2, r5);
        r1 = r1 + 1;
        goto L_0x0a14;
    L_0x0a75:
        r0 = 0;
        r3.a(r0);
        if (r21 == 0) goto L_0x0a80;
    L_0x0a7b:
        r0 = r3.n;
        r21.f();
    L_0x0a80:
        if (r24 == 0) goto L_0x0a85;
    L_0x0a82:
        defpackage.cno.c();
    L_0x0a85:
        r1 = r32;
        if (r19 == 0) goto L_0x0a8d;
    L_0x0a89:
        r0 = r1.w;
        r0 = r0.o;
    L_0x0a8d:
        r0 = 0;
        r1.j = r0;
        r0 = 0;
        r1.u = r0;
        r1.t = r0;
        return;
    L_0x0a96:
        r0 = move-exception;
        if (r8 != 0) goto L_0x0a9a;
    L_0x0a99:
        goto L_0x0a9d;
    L_0x0a9a:
        defpackage.cno.c();
    L_0x0a9d:
        throw r0;
    L_0x0a9e:
        r0 = new java.lang.IllegalStateException;
        r2 = "Trying to mount a null layoutState";
        r0.<init>(r2);
        goto L_0x0aa7;
    L_0x0aa6:
        throw r0;
    L_0x0aa7:
        goto L_0x0aa6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.a(android.graphics.Rect, boolean):void");
    }

    public final void f() {
        cow cow = this.K;
        if (cow != null) {
            int size = cow.a.size();
            for (int i = 0; i < size; i++) {
                coy coy = (coy) cow.a.get(i);
                View view = (ViewPager) coy.a.get();
                if (view != null) {
                    abe.a(view, new cox(coy, view));
                }
            }
            cow.a.clear();
        }
        synchronized (this) {
            this.l = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005a  */
    /* JADX WARNING: Missing block: B:28:0x0050, code skipped:
            if (defpackage.cpz.a(r11.T, r11.V) != false) goto L_0x002a;
     */
    public final void a(int r15, int r16, int[] r17, boolean r18) {
        /*
        r14 = this;
        r11 = r14;
        monitor-enter(r14);
        r0 = 1;
        r11.W = r0;	 Catch:{ all -> 0x00ef }
        r4 = r15;
        r11.S = r4;	 Catch:{ all -> 0x00ef }
        r5 = r16;
        r11.T = r5;	 Catch:{ all -> 0x00ef }
        r14.m();	 Catch:{ all -> 0x00ef }
        r1 = r11.w;	 Catch:{ all -> 0x00ef }
        r12 = 0;
        if (r1 == 0) goto L_0x0056;
    L_0x0014:
        r2 = r11.S;	 Catch:{ all -> 0x00ef }
        r3 = r11.T;	 Catch:{ all -> 0x00ef }
        r1 = a(r1, r2, r3);	 Catch:{ all -> 0x00ef }
        if (r1 == 0) goto L_0x0056;
    L_0x001e:
        r1 = r11.w;	 Catch:{ all -> 0x00ef }
        r2 = r11.v;	 Catch:{ all -> 0x00ef }
        r2 = r2.j;	 Catch:{ all -> 0x00ef }
        r1 = r1.a(r2);	 Catch:{ all -> 0x00ef }
        if (r1 == 0) goto L_0x002c;
    L_0x002a:
        r1 = 0;
        goto L_0x0057;
    L_0x002c:
        r1 = r11.q;	 Catch:{ all -> 0x00ef }
        monitor-enter(r1);	 Catch:{ all -> 0x00ef }
        r2 = r11.r;	 Catch:{ all -> 0x0053 }
        if (r2 == 0) goto L_0x0035;
    L_0x0033:
        monitor-exit(r1);	 Catch:{ all -> 0x0053 }
        goto L_0x002a;
    L_0x0035:
        monitor-exit(r1);	 Catch:{ all -> 0x0053 }
        r1 = r11.U;	 Catch:{ all -> 0x00ef }
        r2 = -1;
        if (r1 == r2) goto L_0x0056;
    L_0x003b:
        r3 = r11.V;	 Catch:{ all -> 0x00ef }
        if (r3 != r2) goto L_0x0040;
    L_0x003f:
        goto L_0x0056;
    L_0x0040:
        r2 = r11.S;	 Catch:{ all -> 0x00ef }
        r1 = defpackage.cpz.a(r2, r1);	 Catch:{ all -> 0x00ef }
        if (r1 == 0) goto L_0x0056;
    L_0x0048:
        r1 = r11.T;	 Catch:{ all -> 0x00ef }
        r2 = r11.V;	 Catch:{ all -> 0x00ef }
        r1 = defpackage.cpz.a(r1, r2);	 Catch:{ all -> 0x00ef }
        if (r1 != 0) goto L_0x002a;
    L_0x0052:
        goto L_0x0056;
    L_0x0053:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0053 }
        throw r0;	 Catch:{ all -> 0x00ef }
    L_0x0056:
        r1 = 1;
    L_0x0057:
        r13 = 0;
        if (r18 == 0) goto L_0x005b;
    L_0x005a:
        goto L_0x0060;
    L_0x005b:
        if (r1 != 0) goto L_0x0060;
    L_0x005d:
        r3 = r13;
        r8 = r3;
        goto L_0x006e;
    L_0x0060:
        r1 = r11.v;	 Catch:{ all -> 0x00ef }
        r1 = r1.g();	 Catch:{ all -> 0x00ef }
        r2 = r11.R;	 Catch:{ all -> 0x00ef }
        r2 = defpackage.csq.a(r2);	 Catch:{ all -> 0x00ef }
        r3 = r1;
        r8 = r2;
    L_0x006e:
        monitor-exit(r14);	 Catch:{ all -> 0x00ef }
        if (r3 == 0) goto L_0x00b6;
    L_0x0071:
        r1 = r11.w;
        if (r1 == 0) goto L_0x007d;
    L_0x0075:
        monitor-enter(r14);
        r11.w = r13;	 Catch:{ all -> 0x007a }
        monitor-exit(r14);	 Catch:{ all -> 0x007a }
        goto L_0x007d;
    L_0x007a:
        r0 = move-exception;
        monitor-exit(r14);	 Catch:{ all -> 0x007a }
        throw r0;
    L_0x007d:
        r2 = r11.h;
        r6 = r11.N;
        r7 = 0;
        r9 = 3;
        r10 = 0;
        r1 = r14;
        r4 = r15;
        r5 = r16;
        r1 = r1.b(r2, r3, r4, r5, r6, r7, r8, r9, r10);
        monitor-enter(r14);
        r2 = r1.f();	 Catch:{ all -> 0x00b3 }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x00b3 }
        r4 = r1.a;	 Catch:{ all -> 0x00b3 }
        r3.<init>(r4);	 Catch:{ all -> 0x00b3 }
        if (r2 == 0) goto L_0x00a1;
    L_0x009a:
        r4 = r11.y;	 Catch:{ all -> 0x00b3 }
        r5 = r11.i;	 Catch:{ all -> 0x00b3 }
        r4.a(r2, r5);	 Catch:{ all -> 0x00b3 }
    L_0x00a1:
        r1.a();	 Catch:{ all -> 0x00b3 }
        r11.w = r1;	 Catch:{ all -> 0x00b3 }
        monitor-exit(r14);	 Catch:{ all -> 0x00b3 }
        r14.a(r3);
        r1 = r11.n;
        r1.p();
        r14.o();
        goto L_0x00b6;
    L_0x00b3:
        r0 = move-exception;
        monitor-exit(r14);	 Catch:{ all -> 0x00b3 }
        throw r0;
    L_0x00b6:
        r1 = r11.w;
        r2 = r1.j;
        r17[r12] = r2;
        r1 = r1.k;
        r17[r0] = r1;
        monitor-enter(r14);
        r11.W = r12;	 Catch:{ all -> 0x00ec }
        r1 = r11.X;	 Catch:{ all -> 0x00ec }
        if (r1 != 0) goto L_0x00cb;
    L_0x00c7:
        r2 = r13;
        r9 = r2;
        r1 = 0;
        goto L_0x00da;
    L_0x00cb:
        r11.X = r12;	 Catch:{ all -> 0x00ec }
        r2 = r11.v;	 Catch:{ all -> 0x00ec }
        r2 = r2.g();	 Catch:{ all -> 0x00ec }
        r3 = r11.R;	 Catch:{ all -> 0x00ec }
        r3 = defpackage.csq.a(r3);	 Catch:{ all -> 0x00ec }
        r9 = r3;
    L_0x00da:
        monitor-exit(r14);	 Catch:{ all -> 0x00ec }
        if (r1 == 0) goto L_0x00eb;
    L_0x00dd:
        if (r1 != r0) goto L_0x00e1;
    L_0x00df:
        r5 = 1;
        goto L_0x00e2;
    L_0x00e1:
        r5 = 0;
    L_0x00e2:
        r3 = -1;
        r4 = -1;
        r6 = 0;
        r7 = 3;
        r8 = 0;
        r1 = r14;
        r1.a(r2, r3, r4, r5, r6, r7, r8, r9);
    L_0x00eb:
        return;
    L_0x00ec:
        r0 = move-exception;
        monitor-exit(r14);	 Catch:{ all -> 0x00ec }
        throw r0;
    L_0x00ef:
        r0 = move-exception;
        monitor-exit(r14);	 Catch:{ all -> 0x00ef }
        goto L_0x00f3;
    L_0x00f2:
        throw r0;
    L_0x00f3:
        goto L_0x00f2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.a(int, int, int[], boolean):void");
    }

    public final synchronized cma g() {
        return this.v;
    }

    public final synchronized void a(String str, cmq cmq) {
        if (this.v != null) {
            this.y.a(str, cmq);
        }
    }

    public final void a(boolean z, String str) {
        synchronized (this) {
            cma cma = this.v;
            if (cma == null) {
            } else if (this.W) {
                int i = 2;
                if (this.X == 2) {
                    return;
                }
                if (z) {
                    i = 1;
                }
                this.X = i;
            } else {
                cma g = cma.g();
                csq a = csq.a(this.R);
                a(g, -1, -1, z, null, 2, str, a);
            }
        }
    }

    private final void p() {
        this.Y.a();
    }

    public final synchronized void a(int i, int i2, int i3) {
        cpg cpg = !n() ? this.x : this.w;
        if (cpg != null) {
            csz csz = this.Z;
            csy csy = cpg.r;
            if (csy != null) {
                Map map = csy.a;
                if (map != null) {
                    for (String str : map.keySet()) {
                        csx csx = (csx) csy.a.get(str);
                        for (cma cma : csx.c) {
                            if (!csz.a(csx.a, cma)) {
                                if (csx.b.a(i, i2, i3)) {
                                    cma.a(csx.a);
                                    csz.a(csx.a, cma, 1);
                                }
                            }
                            if (csz.a(csx.a, cma) && csx.b.b(i, i2, i3)) {
                                cma.b(csx.a);
                                csz.a(csx.a, cma, 2);
                            }
                        }
                    }
                }
            }
        }
    }

    private final synchronized void q() {
        cpg cpg = !n() ? this.x : this.w;
        if (cpg != null) {
            csz csz = this.Z;
            csy csy = cpg.r;
            if (csy != null) {
                Map map = csy.a;
                if (map != null) {
                    for (String str : map.keySet()) {
                        csx csx = (csx) csy.a.get(str);
                        for (cma cma : csx.c) {
                            if (csz.a(csx.a, cma)) {
                                cma.b(csx.a);
                            }
                        }
                    }
                }
            }
        }
        this.Z.a.clear();
    }

    public final void a(cma cma, int i, int i2, crd crd) {
        if (cma != null) {
            a(cma, i, i2, false, crd, null);
            return;
        }
        throw new IllegalArgumentException("Root component can't be null");
    }

    public cpq getLithoView() {
        return this.n;
    }

    public final synchronized crg h() {
        return crg.a(this.y);
    }

    public final synchronized void a(List list, String str) {
        crg crg = this.y;
        if (crg != null) {
            crg.a(list, str);
        }
    }

    public final void a(cma cma, int i, int i2, boolean z, crd crd, csq csq) {
        a(cma, i, i2, z, crd, 0, null, csq);
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00b7 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00b7 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00b7 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0084  */
    /* JADX WARNING: Missing block: B:90:0x00d7, code skipped:
            if (r24 != false) goto L_0x00dd;
     */
    /* JADX WARNING: Missing block: B:91:0x00d9, code skipped:
            a(r9, r10, r11, r12);
     */
    /* JADX WARNING: Missing block: B:92:0x00dc, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:93:0x00dd, code skipped:
            if (r9 != null) goto L_0x00fe;
     */
    /* JADX WARNING: Missing block: B:94:0x00df, code skipped:
            r2 = r1.q;
     */
    /* JADX WARNING: Missing block: B:95:0x00e1, code skipped:
            monitor-enter(r2);
     */
    /* JADX WARNING: Missing block: B:97:?, code skipped:
            r0 = r1.r;
     */
    /* JADX WARNING: Missing block: B:98:0x00e4, code skipped:
            if (r0 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Missing block: B:99:0x00e6, code skipped:
            r1.o.removeCallbacks(r0);
     */
    /* JADX WARNING: Missing block: B:100:0x00eb, code skipped:
            r1.r = new defpackage.cmx(r1, r10, r12, r11);
            r1.o.post(r1.r);
     */
    /* JADX WARNING: Missing block: B:101:0x00f9, code skipped:
            monitor-exit(r2);
     */
    /* JADX WARNING: Missing block: B:102:0x00fa, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:107:0x0105, code skipped:
            throw new java.lang.IllegalArgumentException("The layout can't be calculated asynchronously if we need the Size back");
     */
    private final void a(defpackage.cma r21, int r22, int r23, boolean r24, defpackage.crd r25, int r26, java.lang.String r27, defpackage.csq r28) {
        /*
        r20 = this;
        r1 = r20;
        r0 = r22;
        r8 = r23;
        r9 = r25;
        r10 = r26;
        r11 = r27;
        r12 = r28;
        monitor-enter(r20);
        r2 = r1.D;	 Catch:{ all -> 0x0106 }
        if (r2 == 0) goto L_0x0015;
    L_0x0013:
        monitor-exit(r20);	 Catch:{ all -> 0x0106 }
        return;
    L_0x0015:
        r2 = r1.y;	 Catch:{ all -> 0x0106 }
        if (r2 == 0) goto L_0x001e;
    L_0x0019:
        r2 = r2.a();	 Catch:{ all -> 0x0106 }
        goto L_0x001f;
    L_0x001e:
        r2 = 0;
    L_0x001f:
        if (r2 == 0) goto L_0x0039;
    L_0x0021:
        r2 = r2.size();	 Catch:{ all -> 0x0106 }
        if (r2 > 0) goto L_0x0028;
    L_0x0027:
        goto L_0x0039;
    L_0x0028:
        if (r21 != 0) goto L_0x002b;
    L_0x002a:
        goto L_0x0039;
    L_0x002b:
        r2 = r21.g();	 Catch:{ all -> 0x0106 }
        r3 = defpackage.cma.h;	 Catch:{ all -> 0x0106 }
        r3 = r3.incrementAndGet();	 Catch:{ all -> 0x0106 }
        r2.j = r3;	 Catch:{ all -> 0x0106 }
        r13 = r2;
        goto L_0x003b;
    L_0x0039:
        r13 = r21;
    L_0x003b:
        r15 = 0;
        if (r13 != 0) goto L_0x0041;
    L_0x003e:
        r16 = 0;
        goto L_0x0043;
    L_0x0041:
        r16 = 1;
    L_0x0043:
        r2 = -1;
        if (r0 != r2) goto L_0x0049;
    L_0x0046:
        r17 = 0;
        goto L_0x004b;
    L_0x0049:
        r17 = 1;
    L_0x004b:
        if (r8 != r2) goto L_0x0050;
    L_0x004d:
        r18 = 0;
        goto L_0x0052;
    L_0x0050:
        r18 = 1;
    L_0x0052:
        if (r17 == 0) goto L_0x005b;
    L_0x0054:
        r3 = r1.S;	 Catch:{ all -> 0x0106 }
        if (r0 != r3) goto L_0x0059;
    L_0x0058:
        goto L_0x005b;
    L_0x0059:
        r3 = 0;
        goto L_0x005c;
    L_0x005b:
        r3 = 1;
    L_0x005c:
        if (r18 == 0) goto L_0x0065;
    L_0x005e:
        r4 = r1.T;	 Catch:{ all -> 0x0106 }
        if (r8 != r4) goto L_0x0063;
    L_0x0062:
        goto L_0x0065;
    L_0x0063:
        r4 = 0;
        goto L_0x0066;
    L_0x0065:
        r4 = 1;
    L_0x0066:
        if (r3 != 0) goto L_0x006a;
    L_0x0068:
        r3 = 0;
        goto L_0x006e;
    L_0x006a:
        if (r4 != 0) goto L_0x006d;
    L_0x006c:
        goto L_0x0068;
    L_0x006d:
        r3 = 1;
    L_0x006e:
        r4 = r1.x;	 Catch:{ all -> 0x0106 }
        if (r4 != 0) goto L_0x0074;
    L_0x0072:
        r4 = r1.w;	 Catch:{ all -> 0x0106 }
    L_0x0074:
        r7 = r4;
        if (r0 != r2) goto L_0x0079;
    L_0x0077:
        r2 = 0;
        goto L_0x0085;
    L_0x0079:
        if (r18 == 0) goto L_0x0077;
    L_0x007b:
        r4 = r1.S;	 Catch:{ all -> 0x0106 }
        if (r4 == r2) goto L_0x0077;
    L_0x007f:
        r4 = r1.T;	 Catch:{ all -> 0x0106 }
        if (r4 != r2) goto L_0x0084;
    L_0x0083:
        goto L_0x0077;
    L_0x0084:
        r2 = 1;
    L_0x0085:
        if (r3 == 0) goto L_0x008a;
    L_0x0087:
        r14 = r7;
    L_0x0088:
        r15 = 1;
        goto L_0x00a9;
    L_0x008a:
        if (r2 == 0) goto L_0x00a8;
    L_0x008c:
        if (r7 == 0) goto L_0x00a8;
    L_0x008e:
        r2 = r1.S;	 Catch:{ all -> 0x0106 }
        r3 = r1.T;	 Catch:{ all -> 0x0106 }
        r4 = r7.j;	 Catch:{ all -> 0x0106 }
        r6 = (float) r4;	 Catch:{ all -> 0x0106 }
        r4 = r7.k;	 Catch:{ all -> 0x0106 }
        r5 = (float) r4;	 Catch:{ all -> 0x0106 }
        r4 = r22;
        r19 = r5;
        r5 = r23;
        r14 = r7;
        r7 = r19;
        r2 = defpackage.cpg.a(r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0106 }
        if (r2 == 0) goto L_0x00a9;
    L_0x00a7:
        goto L_0x0088;
    L_0x00a8:
        r14 = r7;
    L_0x00a9:
        if (r16 == 0) goto L_0x00b3;
    L_0x00ab:
        r2 = r13.j;	 Catch:{ all -> 0x0106 }
        r3 = r1.v;	 Catch:{ all -> 0x0106 }
        r3 = r3.j;	 Catch:{ all -> 0x0106 }
        if (r2 != r3) goto L_0x00c6;
    L_0x00b3:
        if (r15 == 0) goto L_0x00c6;
    L_0x00b5:
        if (r9 != 0) goto L_0x00b9;
    L_0x00b7:
        monitor-exit(r20);	 Catch:{ all -> 0x0106 }
        return;
    L_0x00b9:
        if (r14 != 0) goto L_0x00bc;
    L_0x00bb:
        goto L_0x00c6;
    L_0x00bc:
        r0 = r14.k;	 Catch:{ all -> 0x0106 }
        r9.b = r0;	 Catch:{ all -> 0x0106 }
        r0 = r14.j;	 Catch:{ all -> 0x0106 }
        r9.a = r0;	 Catch:{ all -> 0x0106 }
        monitor-exit(r20);	 Catch:{ all -> 0x0106 }
        return;
    L_0x00c6:
        if (r17 == 0) goto L_0x00ca;
    L_0x00c8:
        r1.S = r0;	 Catch:{ all -> 0x0106 }
    L_0x00ca:
        if (r18 == 0) goto L_0x00ce;
    L_0x00cc:
        r1.T = r8;	 Catch:{ all -> 0x0106 }
    L_0x00ce:
        if (r16 == 0) goto L_0x00d2;
    L_0x00d0:
        r1.v = r13;	 Catch:{ all -> 0x0106 }
    L_0x00d2:
        if (r12 == 0) goto L_0x00d6;
    L_0x00d4:
        r1.R = r12;	 Catch:{ all -> 0x0106 }
    L_0x00d6:
        monitor-exit(r20);	 Catch:{ all -> 0x0106 }
        if (r24 != 0) goto L_0x00dd;
    L_0x00d9:
        r1.a(r9, r10, r11, r12);
        return;
    L_0x00dd:
        if (r9 != 0) goto L_0x00fe;
    L_0x00df:
        r2 = r1.q;
        monitor-enter(r2);
        r0 = r1.r;	 Catch:{ all -> 0x00fb }
        if (r0 == 0) goto L_0x00eb;
    L_0x00e6:
        r3 = r1.o;	 Catch:{ all -> 0x00fb }
        r3.removeCallbacks(r0);	 Catch:{ all -> 0x00fb }
    L_0x00eb:
        r0 = new cmx;	 Catch:{ all -> 0x00fb }
        r0.<init>(r1, r10, r12, r11);	 Catch:{ all -> 0x00fb }
        r1.r = r0;	 Catch:{ all -> 0x00fb }
        r0 = r1.o;	 Catch:{ all -> 0x00fb }
        r3 = r1.r;	 Catch:{ all -> 0x00fb }
        r0.post(r3);	 Catch:{ all -> 0x00fb }
        monitor-exit(r2);	 Catch:{ all -> 0x00fb }
        return;
    L_0x00fb:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00fb }
        throw r0;
    L_0x00fe:
        r0 = new java.lang.IllegalArgumentException;
        r2 = "The layout can't be calculated asynchronously if we need the Size back";
        r0.<init>(r2);
        throw r0;
    L_0x0106:
        r0 = move-exception;
        monitor-exit(r20);	 Catch:{ all -> 0x0106 }
        goto L_0x010a;
    L_0x0109:
        throw r0;
    L_0x010a:
        goto L_0x0109;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.a(cma, int, int, boolean, crd, int, java.lang.String, csq):void");
    }

    /* JADX WARNING: Missing block: B:23:0x0040, code skipped:
            r1 = r11.h;
            r14 = r1.d;
     */
    /* JADX WARNING: Missing block: B:24:0x0044, code skipped:
            if (r14 != null) goto L_0x0048;
     */
    /* JADX WARNING: Missing block: B:25:0x0046, code skipped:
            r15 = null;
     */
    /* JADX WARNING: Missing block: B:26:0x0048, code skipped:
            r15 = defpackage.cpt.a(r1, r14, r14.d());
     */
    /* JADX WARNING: Missing block: B:27:0x0051, code skipped:
            if (r15 == null) goto L_0x0065;
     */
    /* JADX WARNING: Missing block: B:28:0x0053, code skipped:
            r3.b();
            r15.a();
            defpackage.cro.a();
            r15.c();
            r15.c();
            r15.a();
     */
    /* JADX WARNING: Missing block: B:29:0x0065, code skipped:
            r1 = b(r11.h, r3, r4, r5, r11.N, r7, r20, r18, r19);
     */
    /* JADX WARNING: Missing block: B:30:0x0075, code skipped:
            if (r0 != null) goto L_0x0078;
     */
    /* JADX WARNING: Missing block: B:31:0x0078, code skipped:
            r0.a = r1.j;
            r0.b = r1.k;
     */
    /* JADX WARNING: Missing block: B:32:0x0080, code skipped:
            monitor-enter(r16);
     */
    /* JADX WARNING: Missing block: B:34:?, code skipped:
            r11.U = -1;
            r11.V = -1;
            r3 = 0;
     */
    /* JADX WARNING: Missing block: B:35:0x008b, code skipped:
            if (r() != false) goto L_0x009a;
     */
    /* JADX WARNING: Missing block: B:37:0x0095, code skipped:
            if (a(r1, r11.S, r11.T) != false) goto L_0x0098;
     */
    /* JADX WARNING: Missing block: B:39:0x0098, code skipped:
            r0 = 1;
     */
    /* JADX WARNING: Missing block: B:40:0x009a, code skipped:
            r0 = null;
     */
    /* JADX WARNING: Missing block: B:41:0x009b, code skipped:
            if (r0 != null) goto L_0x00a0;
     */
    /* JADX WARNING: Missing block: B:42:0x009d, code skipped:
            r1 = null;
            r4 = 0;
     */
    /* JADX WARNING: Missing block: B:43:0x00a0, code skipped:
            if (r1 != null) goto L_0x00a4;
     */
    /* JADX WARNING: Missing block: B:44:0x00a2, code skipped:
            r4 = 0;
     */
    /* JADX WARNING: Missing block: B:45:0x00a4, code skipped:
            r4 = r1.f();
     */
    /* JADX WARNING: Missing block: B:46:0x00a8, code skipped:
            if (r4 == null) goto L_0x00b3;
     */
    /* JADX WARNING: Missing block: B:47:0x00aa, code skipped:
            r5 = r11.y;
     */
    /* JADX WARNING: Missing block: B:48:0x00ac, code skipped:
            if (r5 == null) goto L_0x00b3;
     */
    /* JADX WARNING: Missing block: B:49:0x00ae, code skipped:
            r5.a(r4, r11.i);
     */
    /* JADX WARNING: Missing block: B:51:0x00b5, code skipped:
            if (r11.F != null) goto L_0x00b9;
     */
    /* JADX WARNING: Missing block: B:52:0x00b7, code skipped:
            r4 = 0;
     */
    /* JADX WARNING: Missing block: B:53:0x00b9, code skipped:
            r3 = r1.j;
            r4 = r1.k;
     */
    /* JADX WARNING: Missing block: B:54:0x00bd, code skipped:
            r5 = new java.util.ArrayList(r1.a);
            r1.a();
            r12 = r5;
     */
    /* JADX WARNING: Missing block: B:55:0x00c8, code skipped:
            r11.x = r1;
            r1 = 1;
     */
    /* JADX WARNING: Missing block: B:56:0x00cb, code skipped:
            monitor-exit(r16);
     */
    /* JADX WARNING: Missing block: B:57:0x00cc, code skipped:
            if (r0 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Missing block: B:58:0x00ce, code skipped:
            r0 = r11.F;
     */
    /* JADX WARNING: Missing block: B:59:0x00d0, code skipped:
            if (r0 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Missing block: B:60:0x00d2, code skipped:
            r0.a(r3, r4);
     */
    /* JADX WARNING: Missing block: B:61:0x00d5, code skipped:
            if (r12 == null) goto L_0x00da;
     */
    /* JADX WARNING: Missing block: B:62:0x00d7, code skipped:
            a(r12);
     */
    /* JADX WARNING: Missing block: B:63:0x00da, code skipped:
            if (r1 != null) goto L_0x00dd;
     */
    /* JADX WARNING: Missing block: B:65:0x00e1, code skipped:
            if (defpackage.cro.a() == false) goto L_0x00e7;
     */
    /* JADX WARNING: Missing block: B:66:0x00e3, code skipped:
            b();
     */
    /* JADX WARNING: Missing block: B:67:0x00e7, code skipped:
            H.obtainMessage(1, r11).sendToTarget();
     */
    /* JADX WARNING: Missing block: B:68:0x00f0, code skipped:
            r0 = r11.M;
     */
    /* JADX WARNING: Missing block: B:69:0x00f2, code skipped:
            if (r0 == null) goto L_0x0100;
     */
    /* JADX WARNING: Missing block: B:70:0x00f4, code skipped:
            r0.removeCallbacks(r11.L);
            r11.M.post(r11.L);
     */
    /* JADX WARNING: Missing block: B:71:0x0100, code skipped:
            if (r15 == null) goto L_0x0105;
     */
    /* JADX WARNING: Missing block: B:72:0x0102, code skipped:
            r14.e();
     */
    /* JADX WARNING: Missing block: B:73:0x0105, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:85:0x011b, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:87:0x011d, code skipped:
            return;
     */
    public final void a(defpackage.crd r17, int r18, java.lang.String r19, defpackage.csq r20) {
        /*
        r16 = this;
        r11 = r16;
        r0 = r17;
        r1 = r11.q;
        monitor-enter(r1);
        r2 = r11.r;	 Catch:{ all -> 0x0121 }
        r12 = 0;
        if (r2 == 0) goto L_0x0013;
    L_0x000c:
        r3 = r11.o;	 Catch:{ all -> 0x0121 }
        r3.removeCallbacks(r2);	 Catch:{ all -> 0x0121 }
        r11.r = r12;	 Catch:{ all -> 0x0121 }
    L_0x0013:
        monitor-exit(r1);	 Catch:{ all -> 0x0121 }
        monitor-enter(r16);
        r1 = r11.S;	 Catch:{ all -> 0x011e }
        r13 = -1;
        if (r1 == r13) goto L_0x011c;
    L_0x001a:
        r1 = r11.T;	 Catch:{ all -> 0x011e }
        if (r1 != r13) goto L_0x0020;
    L_0x001e:
        goto L_0x011c;
    L_0x0020:
        r1 = r11.v;	 Catch:{ all -> 0x011e }
        if (r1 == 0) goto L_0x011c;
    L_0x0024:
        r1 = r16.r();	 Catch:{ all -> 0x011e }
        if (r1 != 0) goto L_0x0109;
    L_0x002a:
        r4 = r11.S;	 Catch:{ all -> 0x011e }
        r5 = r11.T;	 Catch:{ all -> 0x011e }
        r11.U = r4;	 Catch:{ all -> 0x011e }
        r11.V = r5;	 Catch:{ all -> 0x011e }
        r1 = r11.v;	 Catch:{ all -> 0x011e }
        r3 = r1.g();	 Catch:{ all -> 0x011e }
        r1 = r11.w;	 Catch:{ all -> 0x011e }
        if (r1 == 0) goto L_0x003e;
    L_0x003c:
        r7 = r1;
        goto L_0x003f;
    L_0x003e:
        r7 = r12;
    L_0x003f:
        monitor-exit(r16);	 Catch:{ all -> 0x011e }
        r1 = r11.h;
        r14 = r1.d;
        if (r14 != 0) goto L_0x0048;
    L_0x0046:
        r15 = r12;
        goto L_0x0051;
    L_0x0048:
        r2 = r14.d();
        r1 = defpackage.cpt.a(r1, r14, r2);
        r15 = r1;
    L_0x0051:
        if (r15 == 0) goto L_0x0065;
    L_0x0053:
        r3.b();
        r15.a();
        defpackage.cro.a();
        r15.c();
        r15.c();
        r15.a();
    L_0x0065:
        r2 = r11.h;
        r6 = r11.N;
        r1 = r16;
        r8 = r20;
        r9 = r18;
        r10 = r19;
        r1 = r1.b(r2, r3, r4, r5, r6, r7, r8, r9, r10);
        if (r0 != 0) goto L_0x0078;
    L_0x0077:
        goto L_0x0080;
    L_0x0078:
        r2 = r1.j;
        r0.a = r2;
        r2 = r1.k;
        r0.b = r2;
    L_0x0080:
        monitor-enter(r16);
        r11.U = r13;	 Catch:{ all -> 0x0106 }
        r11.V = r13;	 Catch:{ all -> 0x0106 }
        r0 = r16.r();	 Catch:{ all -> 0x0106 }
        r2 = 1;
        r3 = 0;
        if (r0 != 0) goto L_0x009a;
    L_0x008d:
        r0 = r11.S;	 Catch:{ all -> 0x0106 }
        r4 = r11.T;	 Catch:{ all -> 0x0106 }
        r0 = a(r1, r0, r4);	 Catch:{ all -> 0x0106 }
        if (r0 != 0) goto L_0x0098;
    L_0x0097:
        goto L_0x009a;
    L_0x0098:
        r0 = 1;
        goto L_0x009b;
    L_0x009a:
        r0 = 0;
    L_0x009b:
        if (r0 != 0) goto L_0x00a0;
    L_0x009d:
        r1 = 0;
        r4 = 0;
        goto L_0x00cb;
    L_0x00a0:
        if (r1 != 0) goto L_0x00a4;
    L_0x00a2:
        r4 = 0;
        goto L_0x00c8;
    L_0x00a4:
        r4 = r1.f();	 Catch:{ all -> 0x0106 }
        if (r4 == 0) goto L_0x00b3;
    L_0x00aa:
        r5 = r11.y;	 Catch:{ all -> 0x0106 }
        if (r5 == 0) goto L_0x00b3;
    L_0x00ae:
        r6 = r11.i;	 Catch:{ all -> 0x0106 }
        r5.a(r4, r6);	 Catch:{ all -> 0x0106 }
    L_0x00b3:
        r4 = r11.F;	 Catch:{ all -> 0x0106 }
        if (r4 != 0) goto L_0x00b9;
    L_0x00b7:
        r4 = 0;
        goto L_0x00bd;
    L_0x00b9:
        r3 = r1.j;	 Catch:{ all -> 0x0106 }
        r4 = r1.k;	 Catch:{ all -> 0x0106 }
    L_0x00bd:
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0106 }
        r6 = r1.a;	 Catch:{ all -> 0x0106 }
        r5.<init>(r6);	 Catch:{ all -> 0x0106 }
        r1.a();	 Catch:{ all -> 0x0106 }
        r12 = r5;
    L_0x00c8:
        r11.x = r1;	 Catch:{ all -> 0x0106 }
        r1 = 1;
    L_0x00cb:
        monitor-exit(r16);	 Catch:{ all -> 0x0106 }
        if (r0 == 0) goto L_0x00d5;
    L_0x00ce:
        r0 = r11.F;
        if (r0 == 0) goto L_0x00d5;
    L_0x00d2:
        r0.a(r3, r4);
    L_0x00d5:
        if (r12 == 0) goto L_0x00da;
    L_0x00d7:
        r11.a(r12);
    L_0x00da:
        if (r1 != 0) goto L_0x00dd;
    L_0x00dc:
        goto L_0x00f0;
    L_0x00dd:
        r0 = defpackage.cro.a();
        if (r0 == 0) goto L_0x00e7;
    L_0x00e3:
        r16.b();
        goto L_0x00f0;
    L_0x00e7:
        r0 = H;
        r0 = r0.obtainMessage(r2, r11);
        r0.sendToTarget();
    L_0x00f0:
        r0 = r11.M;
        if (r0 == 0) goto L_0x0100;
    L_0x00f4:
        r1 = r11.L;
        r0.removeCallbacks(r1);
        r0 = r11.M;
        r1 = r11.L;
        r0.post(r1);
    L_0x0100:
        if (r15 == 0) goto L_0x0105;
    L_0x0102:
        r14.e();
    L_0x0105:
        return;
    L_0x0106:
        r0 = move-exception;
        monitor-exit(r16);	 Catch:{ all -> 0x0106 }
        throw r0;
    L_0x0109:
        if (r0 != 0) goto L_0x010c;
    L_0x010b:
        goto L_0x011a;
    L_0x010c:
        r1 = r11.x;	 Catch:{ all -> 0x011e }
        if (r1 != 0) goto L_0x0112;
    L_0x0110:
        r1 = r11.w;	 Catch:{ all -> 0x011e }
    L_0x0112:
        r2 = r1.j;	 Catch:{ all -> 0x011e }
        r0.a = r2;	 Catch:{ all -> 0x011e }
        r1 = r1.k;	 Catch:{ all -> 0x011e }
        r0.b = r1;	 Catch:{ all -> 0x011e }
    L_0x011a:
        monitor-exit(r16);	 Catch:{ all -> 0x011e }
        return;
    L_0x011c:
        monitor-exit(r16);	 Catch:{ all -> 0x011e }
        return;
    L_0x011e:
        r0 = move-exception;
        monitor-exit(r16);	 Catch:{ all -> 0x011e }
        throw r0;
    L_0x0121:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0121 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.a(crd, int, java.lang.String, csq):void");
    }

    private final void a(List list) {
        p();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cma cma = (cma) list.get(i);
            this.B.a(cma.p, cma, cma.l);
            synchronized (this.Y) {
                cma.k();
            }
        }
        this.B.a();
    }

    public final void i() {
        if (this.j) {
            throw new IllegalStateException("Releasing a ComponentTree that is currently being mounted");
        }
        synchronized (this) {
            H.removeMessages(1, this);
            synchronized (this.q) {
                cmx cmx = this.r;
                if (cmx != null) {
                    this.o.removeCallbacks(cmx);
                    this.r = null;
                }
            }
            synchronized (this.f) {
                cnf cnf = this.g;
                if (cnf != null) {
                    this.o.removeCallbacks(cnf);
                    this.g = null;
                }
            }
            synchronized (this.P) {
                for (int i = 0; i < this.Q.size(); i++) {
                    ((cnb) this.Q.get(i)).a();
                }
                this.Q.clear();
            }
            cpe cpe = this.M;
            if (cpe != null) {
                cpe.removeCallbacks(this.L);
            }
            this.D = true;
            this.E = this.v.b();
            cpq cpq = this.n;
            if (cpq != null) {
                cpq.a(null);
            }
            this.v = null;
            q();
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
        }
        synchronized (this.Y) {
            p();
        }
    }

    private final boolean a(cpg cpg) {
        cma cma = this.v;
        if (cma != null) {
            int i = cma.j;
            int i2 = this.S;
            int i3 = this.T;
            if (cpg != null && cpg.c.j == i && cpg.a(i2, i3) && cpg.b()) {
                return true;
            }
        }
        return false;
    }

    private final boolean r() {
        return a(this.w) || a(this.x);
    }

    public final synchronized String j() {
        cma cma = this.v;
        if (cma == null) {
            return null;
        }
        return cma.b();
    }

    private static synchronized Looper s() {
        Looper looper;
        synchronized (ComponentTree.class) {
            if (I == null) {
                HandlerThread handlerThread = new HandlerThread("ComponentLayoutThread", 5);
                handlerThread.start();
                I = handlerThread.getLooper();
            }
            looper = I;
        }
        return looper;
    }

    private static synchronized Looper t() {
        Looper looper;
        synchronized (ComponentTree.class) {
            if (J == null) {
                HandlerThread handlerThread = new HandlerThread("PreallocateMountContentThread");
                handlerThread.start();
                J = handlerThread.getLooper();
            }
            looper = J;
        }
        return looper;
    }

    private static boolean a(cpg cpg, int i, int i2) {
        return cpg != null && cpg.a(i, i2) && cpg.b();
    }

    private static boolean a(cpg cpg, int i, int i2, int i3) {
        return cpg != null && cpg.a(i) && cpg.j == i2 && cpg.k == i3 && cpg.b();
    }

    public final synchronized boolean k() {
        return this.D;
    }

    public final synchronized String l() {
        return this.E;
    }

    private final cpg b(cmg cmg, cma cma, int i, int i2, boolean z, cpg cpg, csq csq, int i3, String str) {
        if (!this.O) {
            return a(cmg, cma, i, i2, z, cpg, csq, i3, str);
        }
        Object obj;
        cnb cnb = new cnb(this, cmg, cma, i, i2, z, cpg, csq, i3, str);
        synchronized (this.P) {
            Object obj2 = null;
            for (int i4 = 0; i4 < this.Q.size(); i4++) {
                if (((cnb) this.Q.get(i4)).equals(cnb)) {
                    obj = (cnb) this.Q.get(i4);
                    obj2 = 1;
                    break;
                }
            }
            if (obj2 == null) {
                this.Q.add(obj);
            }
            obj.a++;
        }
        cpg b = obj.b();
        synchronized (this.P) {
            obj.a--;
            if (obj.a >= 0) {
                if (obj.a == 0) {
                    obj.a();
                    if (this.Q.contains(obj)) {
                        this.Q.remove(obj);
                    }
                }
            } else {
                throw new IllegalStateException("LayoutStateFuture ref count is below 0");
            }
        }
        return b;
    }

    public final cpg a(cmg cmg, cma cma, int i, int i2, boolean z, cpg cpg, csq csq, int i3, String str) {
        cmg cmg2;
        synchronized (this) {
            cmg cmg3 = cmg;
            cmg2 = new cmg(cmg, crg.a(this.y), cuj.f ? new cpb(this.h.d) : null, csq);
        }
        return cpg.a(cmg2, cma, this.A, i, i2, z, cpg, i3, str, this.aa);
    }

    public final synchronized void a(cnd cnd) {
        this.F = cnd;
    }
}

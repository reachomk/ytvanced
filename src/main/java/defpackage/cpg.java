package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityManager;
import com.facebook.yoga.YogaDirection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cpg */
public final class cpg {
    private static final Object S = new Object();
    private static final Comparator s = new cpf();
    private static final Comparator t = new cpi();
    private static final AtomicInteger u = new AtomicInteger(1);
    private cph A;
    private final List B;
    private cnz C;
    private int D;
    private int E;
    private int F = 0;
    private long G = -1;
    private int H = -1;
    private boolean I = true;
    private int J = 0;
    private boolean K = false;
    private AccessibilityManager L;
    private boolean M = false;
    private crg N;
    private csd O;
    private cqo P;
    private final Set Q = new HashSet();
    private final int R;
    public final List a = new ArrayList();
    public final cmg b;
    public cma c;
    public final List d = new ArrayList(8);
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public coz g;
    public csd h;
    public String i;
    public int j;
    public int k;
    public int l = -1;
    public final int m;
    public int n = -1;
    public List o;
    public final Map p = new LinkedHashMap();
    public List q;
    public csy r;
    private final Map v = new HashMap();
    private int w;
    private int x;
    private final List y = new ArrayList(8);
    private final zr z = new zr(8);

    private cpg(cmg cmg) {
        this.b = cmg;
        this.m = u.getAndIncrement();
        this.N = this.b.e;
        this.B = cuj.d ? new ArrayList(8) : null;
        this.R = cmg.b().getConfiguration().orientation;
        this.A = new cph();
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01a9  */
    private static defpackage.cpd a(defpackage.cma r21, defpackage.cpg r22, defpackage.coz r23, boolean r24, int r25, boolean r26, boolean r27, boolean r28) {
        /*
        r0 = r21;
        r1 = r22;
        r2 = r23;
        r3 = defpackage.cno.d();
        if (r3 == 0) goto L_0x0028;
    L_0x000c:
        r4 = r21.b();
        r4 = java.lang.String.valueOf(r4);
        r5 = "createLayoutOutput:";
        r6 = r4.length();
        if (r6 != 0) goto L_0x0022;
    L_0x001c:
        r4 = new java.lang.String;
        r4.<init>(r5);
        goto L_0x0025;
    L_0x0022:
        r5.concat(r4);
    L_0x0025:
        defpackage.cno.a();
    L_0x0028:
        r4 = defpackage.cma.e(r21);
        r5 = new cpd;
        r5.<init>();
        if (r0 == 0) goto L_0x01bd;
    L_0x0033:
        r5.d = r0;
        r0 = r25;
        r5.l = r0;
        r0 = r1.R;
        r5.m = r0;
        r6 = r1.G;
        r5.i = r6;
        r0 = r1.H;
        if (r0 < 0) goto L_0x0058;
    L_0x0045:
        r7 = r1.d;
        r0 = r7.get(r0);
        r0 = (defpackage.cpd) r0;
        r0 = r0.e;
        r7 = r0.left;
        r0 = r0.top;
        r5.f = r7;
        r5.g = r0;
        goto L_0x005a;
    L_0x0058:
        r0 = 0;
        r7 = 0;
    L_0x005a:
        r8 = r1.D;
        r9 = r23.i();
        r8 = r8 + r9;
        r9 = r1.E;
        r10 = r23.j();
        r9 = r9 + r10;
        r10 = r23.a();
        r10 = r10 + r8;
        r11 = r23.b();
        r11 = r11 + r9;
        if (r24 == 0) goto L_0x0079;
    L_0x0074:
        r12 = r23.f();
        goto L_0x007a;
    L_0x0079:
        r12 = 0;
    L_0x007a:
        if (r24 == 0) goto L_0x0081;
    L_0x007c:
        r13 = r23.c();
        goto L_0x0082;
    L_0x0081:
        r13 = 0;
    L_0x0082:
        if (r24 == 0) goto L_0x0089;
    L_0x0084:
        r14 = r23.d();
        goto L_0x008a;
    L_0x0089:
        r14 = 0;
    L_0x008a:
        if (r24 == 0) goto L_0x0091;
    L_0x008c:
        r15 = r23.e();
        goto L_0x0092;
    L_0x0091:
        r15 = 0;
    L_0x0092:
        r6 = r2.p;
        r16 = r3;
        r3 = 2;
        if (r4 != 0) goto L_0x00aa;
    L_0x0099:
        r8 = r8 + r12;
        r9 = r9 + r13;
        r10 = r10 - r14;
        r11 = r11 - r15;
        if (r6 != 0) goto L_0x00a3;
    L_0x009f:
        r6 = r5;
    L_0x00a0:
        r3 = 0;
        goto L_0x018f;
    L_0x00a3:
        r0 = r6.A;
        if (r0 != r3) goto L_0x009f;
    L_0x00a7:
        r6 = r5;
        goto L_0x018f;
    L_0x00aa:
        r3 = r5.a;
        if (r3 != 0) goto L_0x01b5;
    L_0x00ae:
        if (r6 == 0) goto L_0x00b2;
    L_0x00b0:
        r5.a = r6;
    L_0x00b2:
        r3 = new css;
        r3.<init>();
        r17 = 0;
        if (r24 != 0) goto L_0x00bd;
    L_0x00bb:
        r6 = r5;
        goto L_0x00e1;
    L_0x00bd:
        r6 = r5;
        r4 = r2.h;
        r19 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r4 = r4 & r19;
        r19 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1));
        if (r19 == 0) goto L_0x00e1;
    L_0x00c8:
        r4 = r3.c;
        if (r4 != 0) goto L_0x00d9;
    L_0x00cc:
        r4 = new android.graphics.Rect;
        r4.<init>();
        r3.c = r4;
        r4 = r3.c;
        r4.set(r12, r13, r14, r15);
        goto L_0x00e1;
    L_0x00d9:
        r0 = new java.lang.IllegalStateException;
        r1 = "Padding already initialized for this ViewNodeInfo.";
        r0.<init>(r1);
        throw r0;
    L_0x00e1:
        r4 = r23.h();
        r3.e = r4;
        r4 = r8 - r7;
        r5 = r9 - r0;
        r7 = r10 - r7;
        r0 = r11 - r0;
        r12 = r2.h;
        r14 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r12 = r12 & r14;
        r14 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1));
        if (r14 == 0) goto L_0x0187;
    L_0x00f9:
        r12 = r23.o();
        if (r12 == 0) goto L_0x0118;
    L_0x00ff:
        r12 = r2.D;
        r12 = defpackage.ddl.a(r12);
        if (r12 == 0) goto L_0x0111;
    L_0x0107:
        r12 = r2.C;
        r13 = com.facebook.yoga.YogaEdge.LEFT;
        r12 = r2.a(r12, r13);
        r2.D = r12;
    L_0x0111:
        r12 = r2.D;
        r12 = defpackage.con.a(r12);
        goto L_0x0119;
    L_0x0118:
        r12 = 0;
    L_0x0119:
        r13 = r23.o();
        if (r13 == 0) goto L_0x012c;
    L_0x011f:
        r13 = r2.C;
        r14 = com.facebook.yoga.YogaEdge.TOP;
        r13 = r13.a(r14);
        r13 = defpackage.con.a(r13);
        goto L_0x012d;
    L_0x012c:
        r13 = 0;
    L_0x012d:
        r14 = r23.o();
        if (r14 == 0) goto L_0x014c;
    L_0x0133:
        r14 = r2.E;
        r14 = defpackage.ddl.a(r14);
        if (r14 == 0) goto L_0x0145;
    L_0x013b:
        r14 = r2.C;
        r15 = com.facebook.yoga.YogaEdge.RIGHT;
        r14 = r2.a(r14, r15);
        r2.E = r14;
    L_0x0145:
        r14 = r2.E;
        r14 = defpackage.con.a(r14);
        goto L_0x014d;
    L_0x014c:
        r14 = 0;
    L_0x014d:
        r15 = r23.o();
        if (r15 == 0) goto L_0x0160;
    L_0x0153:
        r2 = r2.C;
        r15 = com.facebook.yoga.YogaEdge.BOTTOM;
        r2 = r2.a(r15);
        r2 = defpackage.con.a(r2);
        goto L_0x0161;
    L_0x0160:
        r2 = 0;
    L_0x0161:
        if (r12 != 0) goto L_0x016a;
    L_0x0163:
        if (r13 != 0) goto L_0x016a;
    L_0x0165:
        if (r14 != 0) goto L_0x016a;
    L_0x0167:
        if (r2 != 0) goto L_0x016a;
    L_0x0169:
        goto L_0x0187;
    L_0x016a:
        r15 = r3.d;
        if (r15 != 0) goto L_0x017f;
    L_0x016e:
        r15 = new android.graphics.Rect;
        r15.<init>();
        r3.d = r15;
        r15 = r3.d;
        r4 = r4 - r12;
        r5 = r5 - r13;
        r7 = r7 + r14;
        r0 = r0 + r2;
        r15.set(r4, r5, r7, r0);
        goto L_0x0187;
    L_0x017f:
        r0 = new java.lang.IllegalStateException;
        r1 = "ExpandedTouchBounds already initialized for this ViewNodeInfo.";
        r0.<init>(r1);
        throw r0;
    L_0x0187:
        r0 = r6.b;
        if (r0 != 0) goto L_0x01ad;
    L_0x018b:
        r6.b = r3;
        goto L_0x00a0;
    L_0x018f:
        r0 = r6.e;
        r0.set(r8, r9, r10, r11);
        if (r26 == 0) goto L_0x0198;
    L_0x0196:
        r3 = r3 | 1;
    L_0x0198:
        if (r27 == 0) goto L_0x019d;
    L_0x019a:
        r3 = r3 | 4;
        goto L_0x01a1;
    L_0x019d:
        r0 = r1.O;
        r6.n = r0;
    L_0x01a1:
        if (r28 == 0) goto L_0x01a5;
    L_0x01a3:
        r3 = r3 | 8;
    L_0x01a5:
        r6.h = r3;
        if (r16 == 0) goto L_0x01ac;
    L_0x01a9:
        defpackage.cno.c();
    L_0x01ac:
        return r6;
    L_0x01ad:
        r0 = new java.lang.IllegalStateException;
        r1 = "Try to set a new ViewNodeInfo in a LayoutOutput that is already initialized with one.";
        r0.<init>(r1);
        throw r0;
    L_0x01b5:
        r0 = new java.lang.IllegalStateException;
        r1 = "NodeInfo set more than once on the same LayoutOutput.";
        r0.<init>(r1);
        throw r0;
    L_0x01bd:
        r0 = new java.lang.RuntimeException;
        r1 = "Trying to set a null Component on a LayoutOutput!";
        r0.<init>(r1);
        goto L_0x01c6;
    L_0x01c5:
        throw r0;
    L_0x01c6:
        goto L_0x01c5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpg.a(cma, cpg, coz, boolean, int, boolean, boolean, boolean):cpd");
    }

    /* JADX WARNING: Removed duplicated region for block: B:141:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x08fe A:{LOOP_END, LOOP:2: B:290:0x04e5->B:469:0x08fe} */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x06d3  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x06e1  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x06ee  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x08fe A:{LOOP_END, LOOP:2: B:290:0x04e5->B:469:0x08fe} */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x063e  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x06d3  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x06e1  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x06ee  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x06f8  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x08fe A:{LOOP_END, LOOP:2: B:290:0x04e5->B:469:0x08fe} */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x063e  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x06d3  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x06e1  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x06ee  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x06f8  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x037b A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x08fe A:{LOOP_END, LOOP:2: B:290:0x04e5->B:469:0x08fe} */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x063e  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x06d3  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x06e1  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x06ee  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x06f8  */
    /* JADX WARNING: Missing block: B:151:0x0227, code skipped:
            if (r8.q == false) goto L_0x022a;
     */
    private static void a(defpackage.cmg r34, defpackage.coz r35, defpackage.cpg r36, defpackage.cnz r37) {
        /*
        r8 = r35;
        r9 = r36;
        r0 = r37;
        r1 = r35.u();
        if (r1 == 0) goto L_0x000f;
    L_0x000c:
        r35.v();
    L_0x000f:
        r10 = r35.B();
        r11 = defpackage.cno.d();
        if (r11 == 0) goto L_0x0035;
    L_0x0019:
        r1 = r10.b();
        r1 = java.lang.String.valueOf(r1);
        r2 = "collectResults:";
        r3 = r1.length();
        if (r3 != 0) goto L_0x002f;
    L_0x0029:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x0032;
    L_0x002f:
        r2.concat(r1);
    L_0x0032:
        defpackage.cno.a();
    L_0x0035:
        r1 = r8.f;
        r12 = 0;
        if (r1 == 0) goto L_0x00c6;
    L_0x003a:
        if (r11 != 0) goto L_0x003d;
    L_0x003c:
        goto L_0x006c;
    L_0x003d:
        r1 = r10.b();
        r1 = java.lang.String.valueOf(r1);
        r2 = "resolveNestedTree:";
        r3 = r1.length();
        if (r3 != 0) goto L_0x0053;
    L_0x004d:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x0056;
    L_0x0053:
        r2.concat(r1);
    L_0x0056:
        r1 = defpackage.cno.b();
        r35.a();
        r1 = r1.a();
        r35.b();
        if (r1 == 0) goto L_0x00c5;
    L_0x0066:
        r1 = r35.B();
        r1 = r1.j;
    L_0x006c:
        r1 = r34.g();
        if (r1 != 0) goto L_0x0075;
    L_0x0072:
        r1 = r8.b;
        goto L_0x0077;
    L_0x0075:
        r1 = r34;
    L_0x0077:
        r2 = r35.a();
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3);
        r4 = r35.b();
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3);
        r1 = defpackage.cpg.a(r1, r8, r2, r3);
        if (r11 == 0) goto L_0x0092;
    L_0x008f:
        defpackage.cno.c();
    L_0x0092:
        r2 = defpackage.cmg.a;
        if (r1 == r2) goto L_0x00c4;
    L_0x0096:
        r2 = r9.D;
        r3 = r35.i();
        r2 = r2 + r3;
        r9.D = r2;
        r2 = r9.E;
        r3 = r35.j();
        r2 = r2 + r3;
        r9.E = r2;
        r2 = r34;
        defpackage.cpg.a(r2, r1, r9, r0);
        r0 = r9.D;
        r1 = r35.i();
        r0 = r0 - r1;
        r9.D = r0;
        r0 = r9.E;
        r1 = r35.j();
        r0 = r0 - r1;
        r9.E = r0;
        if (r11 == 0) goto L_0x00c4;
    L_0x00c1:
        defpackage.cno.c();
    L_0x00c4:
        return;
    L_0x00c5:
        throw r12;
    L_0x00c6:
        r1 = r8.d;
        r2 = 8;
        r13 = 0;
        r14 = 1;
        if (r1 == r2) goto L_0x00cf;
    L_0x00ce:
        goto L_0x00e4;
    L_0x00cf:
        r8.d(r14);
        r1 = r35.y();
        r2 = 0;
    L_0x00d7:
        if (r2 >= r1) goto L_0x00e4;
    L_0x00d9:
        r3 = r8.k(r2);
        r4 = 4;
        r3.d(r4);
        r2 = r2 + 1;
        goto L_0x00d7;
    L_0x00e4:
        r1 = r9.K;
        r15 = r8.H;
        r2 = defpackage.cma.d(r10);
        if (r2 != 0) goto L_0x00f1;
    L_0x00ee:
        r16 = 0;
        goto L_0x00f6;
    L_0x00f1:
        if (r15 != 0) goto L_0x00f4;
    L_0x00f3:
        goto L_0x00ee;
    L_0x00f4:
        r16 = 1;
    L_0x00f6:
        if (r16 == 0) goto L_0x0100;
    L_0x00f8:
        r2 = r8.K;
        if (r2 != 0) goto L_0x00fd;
    L_0x00fc:
        goto L_0x0100;
    L_0x00fd:
        r17 = 1;
        goto L_0x0102;
    L_0x0100:
        r17 = 0;
    L_0x0102:
        if (r1 != 0) goto L_0x0106;
    L_0x0104:
        r7 = r12;
        goto L_0x0154;
    L_0x0106:
        if (r11 == 0) goto L_0x0124;
    L_0x0108:
        r1 = r10.b();
        r1 = java.lang.String.valueOf(r1);
        r2 = "createDiffNode:";
        r3 = r1.length();
        if (r3 != 0) goto L_0x011e;
    L_0x0118:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x0121;
    L_0x011e:
        r2.concat(r1);
    L_0x0121:
        defpackage.cno.a();
    L_0x0124:
        r1 = new cnz;
        r1.<init>();
        r2 = r35.l();
        r1.i = r2;
        r2 = r35.m();
        r1.j = r2;
        r2 = r8.F;
        r1.g = r2;
        r2 = r8.G;
        r1.h = r2;
        r2 = r35.B();
        r1.f = r2;
        if (r0 == 0) goto L_0x014a;
    L_0x0145:
        r2 = r0.k;
        r2.add(r1);
    L_0x014a:
        if (r11 == 0) goto L_0x014f;
    L_0x014c:
        defpackage.cno.c();
    L_0x014f:
        if (r0 != 0) goto L_0x0153;
    L_0x0151:
        r9.C = r1;
    L_0x0153:
        r7 = r1;
    L_0x0154:
        r0 = r9.J;
        r6 = 2;
        if (r0 != r6) goto L_0x015c;
    L_0x0159:
        r8.b(r13);
    L_0x015c:
        r0 = r9.a(r8);
        if (r0 != 0) goto L_0x0233;
    L_0x0162:
        r0 = r35.B();
        r0 = defpackage.cma.e(r0);
        if (r0 == 0) goto L_0x0170;
    L_0x016c:
        r37 = r7;
        goto L_0x022a;
    L_0x0170:
        r0 = r35.B();
        r1 = r8.p;
        if (r1 != 0) goto L_0x0179;
    L_0x0178:
        goto L_0x0181;
    L_0x0179:
        r2 = r1.c();
        if (r2 == 0) goto L_0x0181;
    L_0x017f:
        r0 = 1;
        goto L_0x018b;
    L_0x0181:
        if (r0 == 0) goto L_0x018a;
    L_0x0183:
        r0 = r0.s();
        if (r0 == 0) goto L_0x018a;
    L_0x0189:
        goto L_0x017f;
    L_0x018a:
        r0 = 0;
    L_0x018b:
        r2 = r8.d;
        r3 = r9.M;
        if (r3 != 0) goto L_0x0193;
    L_0x0191:
        r0 = 0;
        goto L_0x01a7;
    L_0x0193:
        if (r2 == r6) goto L_0x0191;
    L_0x0195:
        if (r0 != 0) goto L_0x01a6;
    L_0x0197:
        if (r1 != 0) goto L_0x019a;
    L_0x0199:
        goto L_0x01a3;
    L_0x019a:
        r0 = r1.a;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x01a3;
    L_0x01a2:
        goto L_0x01a6;
    L_0x01a3:
        if (r2 != 0) goto L_0x01a6;
    L_0x01a5:
        goto L_0x0191;
    L_0x01a6:
        r0 = 1;
    L_0x01a7:
        if (r1 == 0) goto L_0x01b0;
    L_0x01a9:
        r2 = r1.l;
        if (r2 != 0) goto L_0x01ae;
    L_0x01ad:
        goto L_0x01b0;
    L_0x01ae:
        r2 = 1;
        goto L_0x01b1;
    L_0x01b0:
        r2 = 0;
    L_0x01b1:
        if (r1 != 0) goto L_0x01b5;
    L_0x01b3:
        r3 = 0;
        goto L_0x01c1;
    L_0x01b5:
        r3 = r1.b();
        if (r3 == 0) goto L_0x01b3;
    L_0x01bb:
        r3 = r1.A;
        if (r3 != r6) goto L_0x01c0;
    L_0x01bf:
        goto L_0x01b3;
    L_0x01c0:
        r3 = 1;
    L_0x01c1:
        if (r1 == 0) goto L_0x01ca;
    L_0x01c3:
        r4 = r1.b;
        if (r4 != 0) goto L_0x01c8;
    L_0x01c7:
        goto L_0x01ca;
    L_0x01c8:
        r4 = 1;
        goto L_0x01cb;
    L_0x01ca:
        r4 = 0;
    L_0x01cb:
        if (r1 == 0) goto L_0x01d4;
    L_0x01cd:
        r5 = r1.c;
        if (r5 != 0) goto L_0x01d2;
    L_0x01d1:
        goto L_0x01d4;
    L_0x01d2:
        r5 = 1;
        goto L_0x01d5;
    L_0x01d4:
        r5 = 0;
    L_0x01d5:
        if (r1 == 0) goto L_0x01e2;
    L_0x01d7:
        r6 = r1.d;
        r18 = 0;
        r6 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1));
        if (r6 != 0) goto L_0x01e0;
    L_0x01df:
        goto L_0x01e2;
    L_0x01e0:
        r6 = 1;
        goto L_0x01e3;
    L_0x01e2:
        r6 = 0;
    L_0x01e3:
        if (r1 == 0) goto L_0x01ec;
    L_0x01e5:
        r12 = r1.e;
        if (r12 != 0) goto L_0x01ea;
    L_0x01e9:
        goto L_0x01ec;
    L_0x01ea:
        r12 = 1;
        goto L_0x01ed;
    L_0x01ec:
        r12 = 0;
    L_0x01ed:
        if (r1 == 0) goto L_0x01f6;
    L_0x01ef:
        r13 = r1.f;
        if (r13 != 0) goto L_0x01f4;
    L_0x01f3:
        goto L_0x01f6;
    L_0x01f4:
        r13 = 1;
        goto L_0x01f7;
    L_0x01f6:
        r13 = 0;
    L_0x01f7:
        if (r1 == 0) goto L_0x0202;
    L_0x01f9:
        r37 = r7;
        r7 = r1.z;
        if (r7 == r14) goto L_0x0200;
    L_0x01ff:
        goto L_0x0204;
    L_0x0200:
        r7 = 1;
        goto L_0x0205;
    L_0x0202:
        r37 = r7;
    L_0x0204:
        r7 = 0;
    L_0x0205:
        if (r1 == 0) goto L_0x0210;
    L_0x0207:
        r1 = r1.a();
        if (r1 != 0) goto L_0x020e;
    L_0x020d:
        goto L_0x0210;
    L_0x020e:
        r1 = 1;
        goto L_0x0211;
    L_0x0210:
        r1 = 0;
    L_0x0211:
        if (r2 != 0) goto L_0x0235;
    L_0x0213:
        if (r3 != 0) goto L_0x0235;
    L_0x0215:
        if (r4 != 0) goto L_0x0235;
    L_0x0217:
        if (r5 != 0) goto L_0x0235;
    L_0x0219:
        if (r6 != 0) goto L_0x0235;
    L_0x021b:
        if (r12 != 0) goto L_0x0235;
    L_0x021d:
        if (r13 != 0) goto L_0x0235;
    L_0x021f:
        if (r1 != 0) goto L_0x0235;
    L_0x0221:
        if (r0 != 0) goto L_0x0235;
    L_0x0223:
        if (r7 != 0) goto L_0x0235;
    L_0x0225:
        r0 = r8.q;
        if (r0 == 0) goto L_0x022a;
    L_0x0229:
        goto L_0x0230;
    L_0x022a:
        r0 = defpackage.cpg.b(r35);
        if (r0 == 0) goto L_0x0231;
    L_0x0230:
        goto L_0x0235;
    L_0x0231:
        r0 = 0;
        goto L_0x0236;
    L_0x0233:
        r37 = r7;
    L_0x0235:
        r0 = 1;
    L_0x0236:
        if (r0 != 0) goto L_0x0241;
    L_0x0238:
        r1 = defpackage.cpg.b(r35);
        if (r1 != 0) goto L_0x023f;
    L_0x023e:
        goto L_0x0241;
    L_0x023f:
        r7 = 1;
        goto L_0x0242;
    L_0x0241:
        r7 = 0;
    L_0x0242:
        if (r0 == 0) goto L_0x0246;
    L_0x0244:
        r12 = 1;
        goto L_0x024a;
    L_0x0246:
        if (r7 == 0) goto L_0x0249;
    L_0x0248:
        goto L_0x0244;
    L_0x0249:
        r12 = 0;
    L_0x024a:
        r5 = r9.G;
        r13 = r9.H;
        r4 = r9.O;
        r3 = r9.P;
        r0 = defpackage.cpg.c(r35);
        r9.O = r0;
        r0 = r9.O;
        if (r0 == 0) goto L_0x0262;
    L_0x025c:
        r0 = new cqo;
        r0.<init>();
        goto L_0x0263;
    L_0x0262:
        r0 = 0;
    L_0x0263:
        r9.P = r0;
        r20 = -1;
        if (r12 != 0) goto L_0x0278;
    L_0x0269:
        r32 = r37;
        r28 = r3;
        r29 = r4;
        r30 = r5;
        r26 = r15;
        r6 = 2;
        r14 = 0;
        goto L_0x0375;
    L_0x0278:
        r0 = r35.B();
        r21 = defpackage.cno.d();
        if (r21 == 0) goto L_0x029e;
    L_0x0282:
        r22 = r0.b();
        r1 = java.lang.String.valueOf(r22);
        r2 = "addHostLayoutOutput:";
        r22 = r1.length();
        if (r22 != 0) goto L_0x0298;
    L_0x0292:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x029b;
    L_0x0298:
        r2.concat(r1);
    L_0x029b:
        defpackage.cno.a();
    L_0x029e:
        r0 = defpackage.cma.e(r0);
        if (r0 == 0) goto L_0x02b3;
    L_0x02a4:
        r0 = r9.a(r8);
        if (r0 == 0) goto L_0x02ab;
    L_0x02aa:
        goto L_0x02b3;
    L_0x02ab:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "We shouldn't insert a host as a parent of a View";
        r0.<init>(r1);
        throw r0;
    L_0x02b3:
        r22 = defpackage.cno.d();
        if (r22 == 0) goto L_0x02d9;
    L_0x02b9:
        r0 = r35.B();
        r0 = r0.b();
        r0 = java.lang.String.valueOf(r0);
        r1 = "createHostLayoutOutput:";
        r2 = r0.length();
        if (r2 != 0) goto L_0x02d3;
    L_0x02cd:
        r0 = new java.lang.String;
        r0.<init>(r1);
        goto L_0x02d6;
    L_0x02d3:
        r1.concat(r0);
    L_0x02d6:
        defpackage.cno.a();
    L_0x02d9:
        r0 = defpackage.cot.B();
        r24 = 0;
        r2 = r8.d;
        r1 = r8.e;
        r25 = 0;
        r23 = r1;
        r26 = r15;
        r14 = 0;
        r1 = r36;
        r27 = r2;
        r2 = r35;
        r28 = r3;
        r3 = r24;
        r29 = r4;
        r4 = r27;
        r30 = r5;
        r5 = r23;
        r6 = r25;
        r32 = r37;
        r7 = defpackage.cpg.a(r0, r1, r2, r3, r4, r5, r6, r7);
        r0 = r7.b;
        r1 = r8.h;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = r1 & r3;
        r3 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1));
        if (r3 == 0) goto L_0x0316;
    L_0x0311:
        r1 = r8.o;
        r0.g = r1;
        goto L_0x031a;
    L_0x0316:
        r1 = r8.n;
        r0.f = r1;
    L_0x031a:
        if (r22 == 0) goto L_0x031f;
    L_0x031c:
        defpackage.cno.c();
    L_0x031f:
        defpackage.cpg.a(r9, r7);
        r0 = r9.d;
        r0 = r0.size();
        r6 = r0 + -1;
        r0 = r9.a(r8);
        if (r0 != 0) goto L_0x0343;
    L_0x0330:
        r2 = r9.F;
        r3 = 3;
        r4 = -1;
        r22 = 0;
        r0 = r36;
        r1 = r7;
        r33 = r6;
        r6 = r22;
        r0.a(r1, r2, r3, r4, r6);
        r6 = 2;
        goto L_0x034c;
    L_0x0343:
        r33 = r6;
        r7.c = r14;
        r7.i = r14;
        r6 = 2;
        r7.k = r6;
    L_0x034c:
        r0 = r9.z;
        r1 = r33;
        defpackage.cpg.a(r0, r7, r1);
        r0 = r9.P;
        r2 = 3;
        defpackage.cpg.a(r0, r2, r7);
        if (r21 == 0) goto L_0x035e;
    L_0x035b:
        defpackage.cno.c();
    L_0x035e:
        defpackage.cpg.a(r36);
        r0 = r9.F;
        r2 = 1;
        r0 = r0 + r2;
        r9.F = r0;
        r0 = r9.d;
        r0 = r0.get(r1);
        r0 = (defpackage.cpd) r0;
        r2 = r0.c;
        r9.G = r2;
        r9.H = r1;
    L_0x0375:
        r7 = r9.I;
        if (r12 == 0) goto L_0x037b;
    L_0x0379:
        r0 = 1;
        goto L_0x0384;
    L_0x037b:
        if (r7 != 0) goto L_0x037f;
    L_0x037d:
        r0 = 0;
        goto L_0x0384;
    L_0x037f:
        r0 = r8.e;
        if (r0 == 0) goto L_0x037d;
    L_0x0383:
        goto L_0x0379;
    L_0x0384:
        r9.I = r0;
        r0 = r35.B();
        if (r0 == 0) goto L_0x03ad;
    L_0x038c:
        r1 = r0.A();
        r2 = 1;
        if (r1 != r2) goto L_0x0397;
    L_0x0393:
        r15 = r7;
        r7 = 0;
        r14 = 2;
        goto L_0x03b0;
    L_0x0397:
        r3 = 1;
        r4 = r8.d;
        r5 = r9.I;
        r21 = 0;
        r1 = r36;
        r2 = r35;
        r14 = 2;
        r6 = r12;
        r15 = r7;
        r7 = r21;
        r0 = defpackage.cpg.a(r0, r1, r2, r3, r4, r5, r6, r7);
        r7 = r0;
        goto L_0x03b0;
    L_0x03ad:
        r15 = r7;
        r14 = 2;
        r7 = 0;
    L_0x03b0:
        r24 = -1;
        if (r7 != 0) goto L_0x03b7;
    L_0x03b4:
        r14 = r26;
        goto L_0x03d1;
    L_0x03b7:
        if (r16 != 0) goto L_0x03be;
    L_0x03b9:
        r4 = r24;
        r6 = r26;
        goto L_0x03c5;
    L_0x03be:
        r6 = r26;
        r0 = r6.a;
        r0 = r0.c;
        r4 = r0;
    L_0x03c5:
        r2 = r9.F;
        r3 = 0;
        r0 = r36;
        r1 = r7;
        r14 = r6;
        r6 = r17;
        r0.a(r1, r2, r3, r4, r6);
    L_0x03d1:
        r3 = r8.i;
        if (r3 != 0) goto L_0x03d8;
    L_0x03d5:
        r6 = r32;
        goto L_0x041f;
    L_0x03d8:
        if (r7 == 0) goto L_0x03e5;
    L_0x03da:
        r0 = r7.h();
        if (r0 == 0) goto L_0x03e5;
    L_0x03e0:
        r0 = r7.b;
        r0.a = r3;
        goto L_0x03d5;
    L_0x03e5:
        if (r14 == 0) goto L_0x03eb;
    L_0x03e7:
        r0 = r14.b;
        r2 = r0;
        goto L_0x03ec;
    L_0x03eb:
        r2 = 0;
    L_0x03ec:
        if (r11 == 0) goto L_0x040a;
    L_0x03ee:
        r0 = r10.b();
        r0 = java.lang.String.valueOf(r0);
        r1 = "addBgDrawableComponent:";
        r4 = r0.length();
        if (r4 != 0) goto L_0x0404;
    L_0x03fe:
        r0 = new java.lang.String;
        r0.<init>(r1);
        goto L_0x0407;
    L_0x0404:
        r1.concat(r0);
    L_0x0407:
        defpackage.cno.a();
    L_0x040a:
        r4 = 1;
        r0 = r35;
        r1 = r36;
        r5 = r12;
        r0 = defpackage.cpg.a(r0, r1, r2, r3, r4, r5);
        r6 = r32;
        if (r6 == 0) goto L_0x041a;
    L_0x0418:
        r6.b = r0;
    L_0x041a:
        if (r11 == 0) goto L_0x041f;
    L_0x041c:
        defpackage.cno.c();
    L_0x041f:
        r0 = defpackage.cma.d(r10);
        if (r0 == 0) goto L_0x0469;
    L_0x0425:
        if (r11 != 0) goto L_0x0428;
    L_0x0427:
        goto L_0x0444;
    L_0x0428:
        r0 = r10.b();
        r0 = java.lang.String.valueOf(r0);
        r1 = "onBoundsDefined:";
        r2 = r0.length();
        if (r2 != 0) goto L_0x043e;
    L_0x0438:
        r0 = new java.lang.String;
        r0.<init>(r1);
        goto L_0x0441;
    L_0x043e:
        r1.concat(r0);
    L_0x0441:
        defpackage.cno.a();
    L_0x0444:
        r0 = r9.b;
        r10.a(r0, r8);
        if (r11 == 0) goto L_0x044e;
    L_0x044b:
        defpackage.cno.c();
    L_0x044e:
        defpackage.cpg.a(r9, r7);
        r0 = r9.z;
        r1 = r9.d;
        r1 = r1.size();
        r1 = r1 + -1;
        defpackage.cpg.a(r0, r7, r1);
        r0 = r9.P;
        r1 = 0;
        defpackage.cpg.a(r0, r1, r7);
        if (r6 != 0) goto L_0x0467;
    L_0x0466:
        goto L_0x0469;
    L_0x0467:
        r6.a = r7;
    L_0x0469:
        r0 = r10.p;
        if (r0 == 0) goto L_0x0470;
    L_0x046d:
        r0 = r0.b;
        goto L_0x0471;
    L_0x0470:
        r0 = 0;
    L_0x0471:
        r0 = defpackage.csn.a(r0);
        if (r0 != 0) goto L_0x0478;
    L_0x0477:
        goto L_0x04c2;
    L_0x0478:
        if (r11 == 0) goto L_0x0496;
    L_0x047a:
        r0 = r10.b();
        r0 = java.lang.String.valueOf(r0);
        r1 = "extractTransitions:";
        r2 = r0.length();
        if (r2 != 0) goto L_0x0490;
    L_0x048a:
        r0 = new java.lang.String;
        r0.<init>(r1);
        goto L_0x0493;
    L_0x0490:
        r1.concat(r0);
    L_0x0493:
        defpackage.cno.a();
    L_0x0496:
        r0 = r8.I;
        if (r0 != 0) goto L_0x049b;
    L_0x049a:
        goto L_0x04bd;
    L_0x049b:
        r1 = r0.size();
        r2 = 0;
    L_0x04a0:
        if (r2 >= r1) goto L_0x04bd;
    L_0x04a2:
        r3 = r0.get(r2);
        r3 = (defpackage.crr) r3;
        r4 = r9.q;
        if (r4 != 0) goto L_0x04b3;
    L_0x04ac:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r9.q = r4;
    L_0x04b3:
        r4 = r9.q;
        r5 = r9.i;
        defpackage.csn.a(r3, r4, r5);
        r2 = r2 + 1;
        goto L_0x04a0;
    L_0x04bd:
        if (r11 == 0) goto L_0x04c2;
    L_0x04bf:
        defpackage.cno.c();
    L_0x04c2:
        r0 = r9.D;
        r1 = r35.i();
        r0 = r0 + r1;
        r9.D = r0;
        r0 = r9.E;
        r1 = r35.j();
        r0 = r0 + r1;
        r9.E = r0;
        r0 = r9.J;
        r1 = r8.p;
        if (r1 == 0) goto L_0x04dd;
    L_0x04da:
        r1 = r1.A;
        goto L_0x04de;
    L_0x04dd:
        r1 = 0;
    L_0x04de:
        r9.J = r1;
        r1 = r35.y();
        r2 = 0;
    L_0x04e5:
        if (r2 < r1) goto L_0x08fe;
    L_0x04e7:
        r9.J = r0;
        r0 = r9.D;
        r1 = r35.i();
        r0 = r0 - r1;
        r9.D = r0;
        r0 = r9.E;
        r1 = r35.j();
        r0 = r0 - r1;
        r9.E = r0;
        r0 = r35.C();
        if (r0 == 0) goto L_0x05e2;
    L_0x0501:
        if (r14 == 0) goto L_0x0507;
    L_0x0503:
        r0 = r14.d;
        r2 = r0;
        goto L_0x0508;
    L_0x0507:
        r2 = 0;
    L_0x0508:
        if (r11 == 0) goto L_0x0526;
    L_0x050a:
        r0 = r10.b();
        r0 = java.lang.String.valueOf(r0);
        r1 = "addBorderDrawableComponent:";
        r3 = r0.length();
        if (r3 != 0) goto L_0x0520;
    L_0x051a:
        r0 = new java.lang.String;
        r0.<init>(r1);
        goto L_0x0523;
    L_0x0520:
        r1.concat(r0);
    L_0x0523:
        defpackage.cno.a();
    L_0x0526:
        r0 = r35.C();
        if (r0 == 0) goto L_0x05da;
    L_0x052c:
        r0 = r8.a;
    L_0x052e:
        if (r0 == 0) goto L_0x053b;
    L_0x0530:
        r1 = r0.b();
        r3 = com.facebook.yoga.YogaDirection.INHERIT;
        if (r1 != r3) goto L_0x053b;
    L_0x0538:
        r0 = r0.a;
        goto L_0x052e;
    L_0x053b:
        if (r0 == 0) goto L_0x0542;
    L_0x053d:
        r0 = r0.b();
        goto L_0x0544;
    L_0x0542:
        r0 = com.facebook.yoga.YogaDirection.INHERIT;
    L_0x0544:
        r1 = com.facebook.yoga.YogaDirection.RTL;
        r3 = r8.l;
        r4 = r8.k;
        if (r0 == r1) goto L_0x054f;
    L_0x054c:
        r5 = com.facebook.yoga.YogaEdge.LEFT;
        goto L_0x0551;
    L_0x054f:
        r5 = com.facebook.yoga.YogaEdge.RIGHT;
    L_0x0551:
        if (r0 == r1) goto L_0x0556;
    L_0x0553:
        r0 = com.facebook.yoga.YogaEdge.RIGHT;
        goto L_0x0558;
    L_0x0556:
        r0 = com.facebook.yoga.YogaEdge.LEFT;
    L_0x0558:
        r1 = new cvj;
        r1.<init>();
        r17 = r15;
        r15 = r8.m;
        r21 = r13;
        r13 = r1.a;
        r13.i = r15;
        r13 = defpackage.clo.a(r4, r5);
        r15 = r1.a;
        r15.e = r13;
        r13 = com.facebook.yoga.YogaEdge.TOP;
        r13 = defpackage.clo.a(r4, r13);
        r15 = r1.a;
        r15.f = r13;
        r13 = defpackage.clo.a(r4, r0);
        r15 = r1.a;
        r15.g = r13;
        r13 = com.facebook.yoga.YogaEdge.BOTTOM;
        r4 = defpackage.clo.a(r4, r13);
        r13 = r1.a;
        r13.h = r4;
        r4 = r8.b(r5);
        r5 = r1.a;
        r4 = (float) r4;
        r5.a = r4;
        r4 = com.facebook.yoga.YogaEdge.TOP;
        r4 = r8.b(r4);
        r5 = r1.a;
        r4 = (float) r4;
        r5.b = r4;
        r0 = r8.b(r0);
        r4 = r1.a;
        r0 = (float) r0;
        r4.c = r0;
        r0 = com.facebook.yoga.YogaEdge.BOTTOM;
        r0 = r8.b(r0);
        r4 = r1.a;
        r0 = (float) r0;
        r4.d = r0;
        r0 = r3.length;
        r0 = java.util.Arrays.copyOf(r3, r0);
        r4.j = r0;
        r0 = new cvk;
        r1 = r1.a;
        r0.<init>(r1);
        r3 = defpackage.cvs.a(r0);
        r4 = 4;
        r0 = r35;
        r1 = r36;
        r5 = r12;
        r0 = defpackage.cpg.a(r0, r1, r2, r3, r4, r5);
        if (r6 == 0) goto L_0x05d3;
    L_0x05d1:
        r6.d = r0;
    L_0x05d3:
        if (r11 != 0) goto L_0x05d6;
    L_0x05d5:
        goto L_0x05e6;
    L_0x05d6:
        defpackage.cno.c();
        goto L_0x05e6;
    L_0x05da:
        r0 = new java.lang.RuntimeException;
        r1 = "This node does not support drawing border color";
        r0.<init>(r1);
        throw r0;
    L_0x05e2:
        r21 = r13;
        r17 = r15;
    L_0x05e6:
        r0 = r8.j;
        if (r0 != 0) goto L_0x05eb;
    L_0x05ea:
        goto L_0x063a;
    L_0x05eb:
        if (r7 == 0) goto L_0x05fe;
    L_0x05ed:
        r1 = r7.h();
        if (r1 == 0) goto L_0x05fe;
    L_0x05f3:
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 23;
        if (r1 < r2) goto L_0x05fe;
    L_0x05f9:
        r1 = r7.b;
        r1.b = r0;
        goto L_0x063a;
    L_0x05fe:
        if (r14 == 0) goto L_0x0604;
    L_0x0600:
        r1 = r14.c;
        r2 = r1;
        goto L_0x0605;
    L_0x0604:
        r2 = 0;
    L_0x0605:
        if (r11 == 0) goto L_0x0623;
    L_0x0607:
        r1 = r10.b();
        r1 = java.lang.String.valueOf(r1);
        r3 = "addFgDrawableComponent:";
        r4 = r1.length();
        if (r4 != 0) goto L_0x061d;
    L_0x0617:
        r1 = new java.lang.String;
        r1.<init>(r3);
        goto L_0x0620;
    L_0x061d:
        r3.concat(r1);
    L_0x0620:
        defpackage.cno.a();
    L_0x0623:
        r3 = defpackage.cvs.a(r0);
        r4 = 2;
        r0 = r35;
        r1 = r36;
        r5 = r12;
        r0 = defpackage.cpg.a(r0, r1, r2, r3, r4, r5);
        if (r6 == 0) goto L_0x0635;
    L_0x0633:
        r6.c = r0;
    L_0x0635:
        if (r11 == 0) goto L_0x063a;
    L_0x0637:
        defpackage.cno.c();
    L_0x063a:
        r0 = r8.u;
        if (r0 != 0) goto L_0x065f;
    L_0x063e:
        r0 = r8.v;
        if (r0 != 0) goto L_0x065f;
    L_0x0642:
        r0 = r8.w;
        if (r0 != 0) goto L_0x065f;
    L_0x0646:
        r0 = r8.x;
        if (r0 != 0) goto L_0x065f;
    L_0x064a:
        r0 = r8.y;
        if (r0 != 0) goto L_0x065f;
    L_0x064e:
        r0 = r8.z;
        if (r0 != 0) goto L_0x065f;
    L_0x0652:
        r0 = r8.A;
        if (r0 != 0) goto L_0x065f;
    L_0x0656:
        r34 = r7;
        r26 = r10;
        r27 = r11;
        r6 = 0;
        goto L_0x0758;
    L_0x065f:
        if (r11 == 0) goto L_0x067d;
    L_0x0661:
        r0 = r10.b();
        r0 = java.lang.String.valueOf(r0);
        r1 = "addVisibilityHandlers:";
        r2 = r0.length();
        if (r2 != 0) goto L_0x0677;
    L_0x0671:
        r0 = new java.lang.String;
        r0.<init>(r1);
        goto L_0x067a;
    L_0x0677:
        r1.concat(r0);
    L_0x067a:
        defpackage.cno.a();
    L_0x067d:
        r0 = r9.D;
        r1 = r35.i();
        r0 = r0 + r1;
        r1 = r9.E;
        r2 = r35.j();
        r1 = r1 + r2;
        r2 = r35.a();
        r3 = r35.b();
        r4 = r8.u;
        r5 = r8.v;
        r12 = r8.w;
        r13 = r8.x;
        r15 = r8.y;
        r26 = r10;
        r10 = r8.z;
        r34 = r7;
        r7 = r8.A;
        r27 = r11;
        r11 = new cst;
        r11.<init>();
        r32 = r6;
        r6 = r35.B();
        r11.b = r6;
        r6 = r11.c;
        r2 = r2 + r0;
        r3 = r3 + r1;
        r6.set(r0, r1, r2, r3);
        r0 = r8.s;
        r11.d = r0;
        r0 = r8.t;
        r11.e = r0;
        r11.f = r4;
        r11.g = r5;
        r11.h = r12;
        r11.i = r13;
        r11.j = r15;
        r11.k = r10;
        r11.l = r7;
        if (r16 == 0) goto L_0x06db;
    L_0x06d3:
        r0 = r14.e;
        if (r0 == 0) goto L_0x06db;
    L_0x06d7:
        r0 = r0.a;
        r24 = r0;
    L_0x06db:
        r0 = r9.F;
        r1 = r9.A;
        if (r1 != 0) goto L_0x06e8;
    L_0x06e1:
        r1 = new cph;
        r1.<init>();
        r9.A = r1;
    L_0x06e8:
        r1 = r9.A;
        r2 = r1.b;
        if (r2 != 0) goto L_0x06f6;
    L_0x06ee:
        r2 = new zr;
        r3 = 2;
        r2.<init>(r3);
        r1.b = r2;
    L_0x06f6:
        if (r0 < 0) goto L_0x08e5;
    L_0x06f8:
        r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r0 > r2) goto L_0x08e5;
    L_0x06fc:
        r2 = r11.b;
        if (r2 == 0) goto L_0x0704;
    L_0x0700:
        r2 = r2.t;
        r2 = (long) r2;
        goto L_0x0706;
    L_0x0704:
        r2 = 0;
    L_0x0706:
        r4 = 26;
        r2 = r2 << r4;
        r4 = (long) r0;
        r6 = 18;
        r4 = r4 << r6;
        r2 = r2 | r4;
        r4 = 0;
        r6 = (r24 > r4 ? 1 : (r24 == r4 ? 0 : -1));
        if (r6 > 0) goto L_0x0716;
    L_0x0714:
        r0 = -1;
        goto L_0x0720;
    L_0x0716:
        r4 = defpackage.cph.b(r24);
        if (r4 != r0) goto L_0x0714;
    L_0x071c:
        r0 = defpackage.cph.a(r24);
    L_0x0720:
        r4 = r1.b;
        r6 = 0;
        r5 = java.lang.Integer.valueOf(r6);
        r4 = r4.a(r2, r5);
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        if (r0 >= r4) goto L_0x0737;
    L_0x0733:
        r7 = 1;
        r0 = r4 + 1;
        goto L_0x0738;
    L_0x0737:
        r7 = 1;
    L_0x0738:
        r4 = defpackage.cph.a(r2, r0);
        r11.a = r4;
        r1 = r1.b;
        r0 = r0 + r7;
        r0 = java.lang.Integer.valueOf(r0);
        r1.b(r2, r0);
        r0 = r9.y;
        r0.add(r11);
        if (r32 == 0) goto L_0x0753;
    L_0x074f:
        r10 = r32;
        r10.e = r11;
    L_0x0753:
        if (r27 == 0) goto L_0x0758;
    L_0x0755:
        defpackage.cno.c();
    L_0x0758:
        r0 = r9.B;
        if (r0 != 0) goto L_0x075f;
    L_0x075c:
        r11 = r34;
        goto L_0x079e;
    L_0x075f:
        r0 = r8.B;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x075c;
    L_0x0767:
        r0 = r9.D;
        r1 = r35.i();
        r0 = r0 + r1;
        r1 = r9.E;
        r2 = r35.j();
        r1 = r1 + r2;
        r2 = r35.a();
        r3 = r35.b();
        r4 = new crj;
        r4.<init>();
        r5 = r8.B;
        r4.a = r5;
        r5 = r4.d;
        r2 = r2 + r0;
        r3 = r3 + r1;
        r5.set(r0, r1, r2, r3);
        r0 = r9.G;
        r4.b = r0;
        r11 = r34;
        if (r34 == 0) goto L_0x0799;
    L_0x0795:
        r0 = r11.c;
        r4.c = r0;
    L_0x0799:
        r0 = r9.B;
        r0.add(r4);
    L_0x079e:
        r0 = r8.J;
        if (r0 != 0) goto L_0x07a4;
    L_0x07a2:
        goto L_0x0836;
    L_0x07a4:
        r1 = r0.isEmpty();
        if (r1 != 0) goto L_0x0836;
    L_0x07aa:
        if (r27 == 0) goto L_0x07c8;
    L_0x07ac:
        r1 = r26.b();
        r1 = java.lang.String.valueOf(r1);
        r2 = "extractWorkingRanges:";
        r3 = r1.length();
        if (r3 != 0) goto L_0x07c2;
    L_0x07bc:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x07c5;
    L_0x07c2:
        r2.concat(r1);
    L_0x07c5:
        defpackage.cno.a();
    L_0x07c8:
        r1 = r9.r;
        if (r1 != 0) goto L_0x07d3;
    L_0x07cc:
        r1 = new csy;
        r1.<init>();
        r9.r = r1;
    L_0x07d3:
        r1 = r0.size();
    L_0x07d7:
        if (r6 >= r1) goto L_0x0831;
    L_0x07d9:
        r2 = r0.get(r6);
        r2 = (defpackage.cta) r2;
        r3 = r9.r;
        r4 = r2.a;
        r5 = r2.b;
        r2 = r2.c;
        r7 = r3.a;
        if (r7 != 0) goto L_0x07f2;
    L_0x07eb:
        r7 = new java.util.LinkedHashMap;
        r7.<init>();
        r3.a = r7;
    L_0x07f2:
        r7 = r5.hashCode();
        r10 = java.lang.String.valueOf(r4);
        r10 = r10.length();
        r12 = new java.lang.StringBuilder;
        r10 = r10 + 12;
        r12.<init>(r10);
        r12.append(r4);
        r10 = "_";
        r12.append(r10);
        r12.append(r7);
        r7 = r12.toString();
        r10 = r3.a;
        r10 = r10.get(r7);
        r10 = (defpackage.csx) r10;
        if (r10 != 0) goto L_0x0829;
    L_0x081e:
        r3 = r3.a;
        r10 = new csx;
        r10.<init>(r4, r5, r2);
        r3.put(r7, r10);
        goto L_0x082e;
    L_0x0829:
        r3 = r10.c;
        r3.add(r2);
    L_0x082e:
        r6 = r6 + 1;
        goto L_0x07d7;
    L_0x0831:
        if (r27 == 0) goto L_0x0836;
    L_0x0833:
        defpackage.cno.c();
    L_0x0836:
        r0 = new android.graphics.Rect;
        r0.<init>();
        if (r11 != 0) goto L_0x0862;
    L_0x083d:
        r1 = r9.D;
        r2 = r35.i();
        r1 = r1 + r2;
        r0.left = r1;
        r1 = r9.E;
        r2 = r35.j();
        r1 = r1 + r2;
        r0.top = r1;
        r1 = r0.left;
        r2 = r35.a();
        r1 = r1 + r2;
        r0.right = r1;
        r1 = r0.top;
        r2 = r35.b();
        r1 = r1 + r2;
        r0.bottom = r1;
        goto L_0x0867;
    L_0x0862:
        r1 = r11.e;
        r0.set(r1);
    L_0x0867:
        if (r27 == 0) goto L_0x0885;
    L_0x0869:
        r1 = r26.b();
        r1 = java.lang.String.valueOf(r1);
        r2 = "keepComponentDelegates:";
        r3 = r1.length();
        if (r3 != 0) goto L_0x087f;
    L_0x0879:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x0882;
    L_0x087f:
        r2.concat(r1);
    L_0x0882:
        defpackage.cno.a();
    L_0x0885:
        r1 = r8.c;
        r1 = r1.iterator();
    L_0x088b:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x08b7;
    L_0x0891:
        r2 = r1.next();
        r2 = (defpackage.cma) r2;
        r3 = new android.graphics.Rect;
        r3.<init>();
        r3.set(r0);
        r4 = r2.p;
        if (r4 != 0) goto L_0x08a4;
    L_0x08a3:
        goto L_0x08ad;
    L_0x08a4:
        r4 = r4.m;
        if (r4 == 0) goto L_0x08ad;
    L_0x08a8:
        r4 = r9.a;
        r4.add(r2);
    L_0x08ad:
        r2 = r2.l;
        if (r2 == 0) goto L_0x088b;
    L_0x08b1:
        r4 = r9.v;
        r4.put(r2, r3);
        goto L_0x088b;
    L_0x08b7:
        if (r27 == 0) goto L_0x08bc;
    L_0x08b9:
        defpackage.cno.c();
    L_0x08bc:
        r0 = r9.G;
        r2 = r30;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 == 0) goto L_0x08d0;
    L_0x08c4:
        r9.G = r2;
        r13 = r21;
        r9.H = r13;
        r0 = r9.F;
        r0 = r0 + -1;
        r9.F = r0;
    L_0x08d0:
        r15 = r17;
        r9.I = r15;
        defpackage.cpg.a(r36);
        r0 = r29;
        r9.O = r0;
        r0 = r28;
        r9.P = r0;
        if (r27 == 0) goto L_0x08e4;
    L_0x08e1:
        defpackage.cno.c();
    L_0x08e4:
        return;
    L_0x08e5:
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r3 = 75;
        r2.<init>(r3);
        r3 = "Level must be non-negative and no greater than 255 actual level ";
        r2.append(r3);
        r2.append(r0);
        r0 = r2.toString();
        r1.<init>(r0);
        throw r1;
    L_0x08fe:
        r26 = r10;
        r27 = r11;
        r19 = r28;
        r17 = r29;
        r21 = r30;
        r4 = 0;
        r10 = r6;
        r11 = r7;
        r6 = 0;
        r7 = 1;
        r3 = r8.b;
        r4 = r8.k(r2);
        defpackage.cpg.a(r3, r4, r9, r10);
        r2 = r2 + 1;
        r6 = r10;
        r7 = r11;
        r10 = r26;
        r11 = r27;
        goto L_0x04e5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpg.a(cmg, coz, cpg, cnz):void");
    }

    public final void a() {
        this.a.clear();
    }

    private static cpd a(coz coz, cpg cpg, cpd cpd, cvu cvu, int i, boolean z) {
        String valueOf;
        String str;
        cma coe = new coe(cvu);
        coe.p = cmg.a(coz.b, coe);
        boolean a = cpd != null ? coe.a(cpd.d, coe) ^ 1 : false;
        long j = cpd == null ? -1 : cpd.c;
        boolean d = cno.d();
        if (d) {
            valueOf = String.valueOf(coz.B().b());
            str = "onBoundsDefined:";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            cno.a();
        }
        coe.a(cpg.b, (cmn) coz);
        if (d) {
            cno.c();
        }
        d = cno.d();
        if (d) {
            try {
                valueOf = "createDrawableLayoutOutput:";
                str = String.valueOf(coe.b());
                if (str.length() == 0) {
                    str = new String(valueOf);
                } else {
                    valueOf.concat(str);
                }
                cno.a();
            } catch (Throwable th) {
                if (d) {
                    cno.c();
                }
            }
        }
        cpd a2 = cpg.a(coe, cpg, coz, false, 2, cpg.I, z, false);
        if (d) {
            cno.c();
        }
        cpg.a(a2, cpg.F, i, j, a);
        cpg.a(cpg, a2);
        cpg.a(cpg.z, a2, cpg.d.size() - 1);
        cpg.a(cpg.P, i, a2);
        return a2;
    }

    private static void a(zr zrVar, cpd cpd, int i) {
        if (zrVar != null) {
            zrVar.b(cpd.c, Integer.valueOf(i));
        }
    }

    private static void a(cqo cqo, int i, cpd cpd) {
        if (cqo != null) {
            cqo.a(i, cpd);
        }
    }

    private static void a(cpg cpg) {
        cqo cqo = cpg.P;
        if (cqo != null && cqo.b != (short) 0) {
            csd csd = cpg.O;
            if (csd != null) {
                if (csd.a == 3 || cuj.p) {
                    if (!(cpg.Q.contains(csd) || cpg.p.put(csd, cqo) == null)) {
                        cpg.p.remove(csd);
                        cpg.Q.add(csd);
                    }
                } else if (cpg.p.put(csd, cqo) != null) {
                    Object stringBuilder;
                    String valueOf = String.valueOf(csd);
                    coz coz = cpg.g;
                    if (coz != null) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        LinkedList linkedList = new LinkedList();
                        linkedList.addLast(null);
                        linkedList.addLast(coz);
                        int i = 0;
                        while (!linkedList.isEmpty()) {
                            coz coz2 = (coz) linkedList.removeLast();
                            if (coz2 == null) {
                                i--;
                            } else {
                                cma B = coz2.B();
                                if (B != null) {
                                    if (coz2 != coz) {
                                        stringBuilder2.append(10);
                                        Iterator it = linkedList.iterator();
                                        it.next();
                                        it.next();
                                        for (int i2 = 0; i2 < i - 1; i2++) {
                                            Object obj;
                                            if (it.next() != null) {
                                                do {
                                                } while (it.next() != null);
                                                obj = "│";
                                            } else {
                                                obj = Character.valueOf(' ');
                                            }
                                            stringBuilder2.append(obj);
                                            stringBuilder2.append(' ');
                                        }
                                        stringBuilder2.append(linkedList.getLast() != null ? "├╴" : "└╴");
                                    }
                                    stringBuilder2.append(B.b());
                                    if (B.n || coz2.t() || coz2.B != null) {
                                        stringBuilder2.append('[');
                                        if (B.n) {
                                            stringBuilder2.append("manual.key=\"");
                                            stringBuilder2.append(B.f());
                                            stringBuilder2.append("\";");
                                        }
                                        if (coz2.t()) {
                                            stringBuilder2.append("trans.key=\"");
                                            stringBuilder2.append(coz2.r);
                                            stringBuilder2.append("\";");
                                        }
                                        if (coz2.B != null) {
                                            stringBuilder2.append("test.key=\"");
                                            stringBuilder2.append(coz2.B);
                                            stringBuilder2.append("\";");
                                        }
                                        stringBuilder2.append(']');
                                    }
                                    if (coz2.y() != 0) {
                                        linkedList.addLast(null);
                                        int y = coz2.y();
                                        while (true) {
                                            y--;
                                            if (y < 0) {
                                                break;
                                            }
                                            linkedList.addLast(coz2.k(y));
                                        }
                                        i++;
                                    }
                                }
                            }
                        }
                        stringBuilder = stringBuilder2.toString();
                    } else {
                        stringBuilder = "null";
                    }
                    StringBuilder stringBuilder3 = new StringBuilder((valueOf.length() + 102) + String.valueOf(stringBuilder).length());
                    stringBuilder3.append("The transitionId '");
                    stringBuilder3.append(valueOf);
                    stringBuilder3.append("' is defined multiple times in the same layout. TransitionIDs must be unique.\nTree:\n");
                    stringBuilder3.append(stringBuilder);
                    valueOf = stringBuilder3.toString();
                    if (cnm.a == null) {
                        synchronized (cnm.class) {
                            if (cnm.a == null) {
                                cnm.a = new cnw();
                            }
                        }
                    }
                    cnm.a.a(valueOf);
                }
                cpg.P = null;
                cpg.O = null;
            }
        }
    }

    public static cpg a(cmg cmg, cma cma, int i, int i2, int i3, boolean z, cpg cpg, int i4, String str, boolean z2) {
        cqq cqq;
        cmg cmg2 = cmg;
        cma cma2 = cma;
        cpg cpg2 = cpg;
        String str2 = str;
        cnh cnh = cmg2.d;
        boolean d = cno.d();
        if (d) {
            if (str2 != null) {
                String str3 = "extra:";
                if (str.length() == 0) {
                    String str4 = new String(str3);
                } else {
                    str3.concat(str2);
                }
                cno.a();
            }
            StringBuilder stringBuilder = new StringBuilder("LayoutState.calculate_");
            stringBuilder.append(cma.b());
            stringBuilder.append("_");
            stringBuilder.append(cpg.e(i4));
            stringBuilder.toString();
            cnn b = cno.b().b();
            int i5 = cma2.j;
            if (b != null) {
                MeasureSpec.toString(i2);
                MeasureSpec.toString(i3);
            } else {
                throw null;
            }
        }
        if (cnh == null) {
            cqq = null;
        } else {
            try {
                cqq = cpt.a(cmg, cnh, cnh.d());
            } catch (Throwable th) {
                if (d) {
                    cno.c();
                    if (str2 != null) {
                        cno.c();
                    }
                }
            }
        }
        if (cqq != null) {
            cma.b();
            cqq.a();
            cpg.e(i4);
            cqq.a();
        }
        cma.e();
        cpg cpg3 = new cpg(cmg);
        cpg3.K = z;
        cpg3.l = i;
        cpg3.n = cpg2 != null ? cpg2.m : -1;
        cpg3.L = (AccessibilityManager) cmg2.b.getSystemService("accessibility");
        cpg3.M = clj.a(cpg3.L);
        cpg3.c = cma2;
        cpg3.w = i2;
        cpg3.x = i3;
        cpg3.i = cma.b();
        coz a = cpg.a(cmg, cma, null, i2, i3, cpg2 != null ? cpg2.C : null);
        int mode = MeasureSpec.getMode(i2);
        if (mode == aocf.UNSET_ENUM_VALUE) {
            cpg3.j = Math.min(a.a(), MeasureSpec.getSize(i2));
        } else if (mode == 0) {
            cpg3.j = a.a();
        } else if (mode == 1073741824) {
            cpg3.j = MeasureSpec.getSize(i2);
        }
        mode = MeasureSpec.getMode(i3);
        if (mode == aocf.UNSET_ENUM_VALUE) {
            cpg3.k = Math.min(a.b(), MeasureSpec.getSize(i3));
        } else if (mode == 0) {
            cpg3.k = a.b();
        } else if (mode == 1073741824) {
            cpg3.k = MeasureSpec.getSize(i3);
        }
        cph cph = cpg3.A;
        if (cph != null) {
            zr zrVar = cph.a;
            if (zrVar != null) {
                zrVar.c();
            }
            zr zrVar2 = cph.b;
            if (zrVar2 != null) {
                zrVar2.c();
            }
        }
        cpg3.G = -1;
        if (a != cmg.a) {
            cqq cqq2;
            cpg3.g = a;
            cpg3.h = cpg.c(a);
            if (cnh == null) {
                cqq2 = null;
            } else {
                cqq2 = cpt.a(cmg, cnh, cnh.d());
            }
            cpg.a(cmg, a, cpg3, null);
            if (d) {
                cno.a();
            }
            Collections.sort(cpg3.e, s);
            Collections.sort(cpg3.f, t);
            if (d) {
                cno.c();
            }
            if (cqq2 != null) {
                a.B().b();
                cqq2.a();
                cnh.e();
            }
            if (!(z2 || cuj.d || cpg3.g == null)) {
                cpg3.g = null;
            }
            if (cqq != null) {
                cnh.e();
            }
            if (d) {
                cno.c();
                if (str2 != null) {
                    cno.c();
                }
            }
            return cpg3;
        }
        if (d) {
            cno.c();
            if (str2 != null) {
                cno.c();
            }
        }
        return cpg3;
    }

    private static String e(int i) {
        if (i == -2) {
            return "test";
        }
        if (i == -1) {
            return "none";
        }
        if (i == 0) {
            return "setRoot";
        }
        if (i == 1) {
            return "setSizeSpec";
        }
        if (i == 2) {
            return "updateState";
        }
        if (i == 3) {
            return "measure";
        }
        StringBuilder stringBuilder = new StringBuilder(44);
        stringBuilder.append("Unknown calculate layout source: ");
        stringBuilder.append(i);
        throw new RuntimeException(stringBuilder.toString());
    }

    private final void a(cpd cpd, int i, int i2, long j, boolean z) {
        if (this.A == null) {
            this.A = new cph();
        }
        cph cph = this.A;
        if (cph.a == null) {
            cph.a = new zr(2);
        }
        if (i < 0 || i > 255) {
            StringBuilder stringBuilder = new StringBuilder(75);
            stringBuilder.append("Level must be non-negative and no greater than 255 actual level ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        cma cma = cpd.d;
        long j2 = (((cma != null ? (long) cma.t : 0) << 26) | (((long) i) << 18)) | (((long) i2) << 16);
        i2 = -1;
        if (j > 0 && cph.b(j) == i) {
            i2 = cph.a(j);
        }
        int i3 = 0;
        i = ((Integer) cph.a.a(j2, Integer.valueOf(0))).intValue();
        if (i2 < i) {
            i2 = i + 1;
        } else {
            i3 = !z ? 2 : 1;
        }
        cpd.k = i3;
        cpd.c = cph.a(j2, i2);
        cph.a.b(j2, Integer.valueOf(i2 + 1));
    }

    /* JADX WARNING: Missing block: B:3:0x0025, code skipped:
            if (defpackage.cpg.a(r0.l(), r0.m(), r19, r20, r0.F, r0.G) != false) goto L_0x00b1;
     */
    /* JADX WARNING: Missing block: B:13:0x0062, code skipped:
            if (r3 == false) goto L_0x0064;
     */
    static defpackage.coz a(defpackage.cmg r17, defpackage.coz r18, int r19, int r20) {
        /*
        r6 = r18;
        r1 = r18.B();
        r0 = r6.g;
        r7 = 1;
        r8 = 0;
        r9 = 0;
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0029;
    L_0x000f:
        r11 = r0.l();
        r12 = r0.m();
        r15 = r0.F;
        r2 = r0.G;
        r13 = r19;
        r14 = r20;
        r16 = r2;
        r2 = defpackage.cpg.a(r11, r12, r13, r14, r15, r16);
        if (r2 == 0) goto L_0x0029;
    L_0x0027:
        goto L_0x00b1;
    L_0x0029:
        r0 = r1.h();
        if (r0 == 0) goto L_0x0064;
    L_0x002f:
        r1.i();
        r2 = r0.h;
        r4 = r0.h();
        r5 = r18.h();
        r11 = 1;
        r2 = r2 & r11;
        r11 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1));
        if (r11 == 0) goto L_0x0045;
    L_0x0043:
        r2 = 1;
        goto L_0x0049;
    L_0x0045:
        if (r4 != r5) goto L_0x0048;
    L_0x0047:
        goto L_0x0043;
    L_0x0048:
        r2 = 0;
    L_0x0049:
        r11 = r0.l();
        r12 = r0.m();
        r15 = r0.F;
        r3 = r0.G;
        r13 = r19;
        r14 = r20;
        r16 = r3;
        r3 = defpackage.cpg.a(r11, r12, r13, r14, r15, r16);
        if (r2 != 0) goto L_0x0062;
    L_0x0061:
        goto L_0x0064;
    L_0x0062:
        if (r3 != 0) goto L_0x0065;
    L_0x0064:
        r0 = r8;
    L_0x0065:
        if (r0 == 0) goto L_0x0068;
    L_0x0067:
        goto L_0x00ae;
    L_0x0068:
        r0 = r18.B();
        r2 = r17.g();
        if (r2 == 0) goto L_0x0086;
    L_0x0072:
        if (r0 == 0) goto L_0x0086;
    L_0x0074:
        r2 = r0.g();
        r0 = r0.l;
        r2.l = r0;
        r0 = r6.c;
        r0.clear();
        r0 = r6.c;
        r0.add(r2);
    L_0x0086:
        r5 = r6.H;
        r0 = r17;
        r2 = r18;
        r3 = r19;
        r4 = r20;
        r0 = defpackage.cpg.a(r0, r1, r2, r3, r4, r5);
        r1 = r19;
        r0.a(r1);
        r1 = r20;
        r0.b(r1);
        r1 = r0.b();
        r1 = (float) r1;
        r0.b(r1);
        r1 = r0.a();
        r1 = (float) r1;
        r0.a(r1);
    L_0x00ae:
        r6.b(r0);
    L_0x00b1:
        r1 = r0.h;
        r3 = 2;
        r1 = r1 & r3;
        r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1));
        if (r3 == 0) goto L_0x00c0;
    L_0x00ba:
        r1 = "alignSelf";
        r8 = defpackage.coz.a(r8, r1);
    L_0x00c0:
        r1 = r0.h;
        r3 = 4;
        r1 = r1 & r3;
        r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1));
        if (r3 == 0) goto L_0x00cf;
    L_0x00c9:
        r1 = "positionType";
        r8 = defpackage.coz.a(r8, r1);
    L_0x00cf:
        r1 = r0.h;
        r3 = 8;
        r1 = r1 & r3;
        r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1));
        if (r3 == 0) goto L_0x00de;
    L_0x00d8:
        r1 = "flex";
        r8 = defpackage.coz.a(r8, r1);
    L_0x00de:
        r1 = r0.h;
        r3 = 16;
        r1 = r1 & r3;
        r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1));
        if (r3 == 0) goto L_0x00ed;
    L_0x00e7:
        r1 = "flexGrow";
        r8 = defpackage.coz.a(r8, r1);
    L_0x00ed:
        r1 = r0.h;
        r3 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r1 = r1 & r3;
        r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1));
        if (r3 == 0) goto L_0x00fc;
    L_0x00f6:
        r1 = "margin";
        r8 = defpackage.coz.a(r8, r1);
    L_0x00fc:
        if (r8 == 0) goto L_0x0141;
    L_0x00fe:
        r1 = ", ";
        r1 = android.text.TextUtils.join(r1, r8);
        r2 = r0.b;
        r2 = r2.d;
        if (r2 == 0) goto L_0x0141;
    L_0x010a:
        r1 = java.lang.String.valueOf(r1);
        r3 = r0.B();
        r3 = r3.getClass();
        r3 = r3.getSimpleName();
        r4 = r1.length();
        r5 = r3.length();
        r6 = new java.lang.StringBuilder;
        r4 = r4 + 40;
        r4 = r4 + r5;
        r6.<init>(r4);
        r4 = "You should not set ";
        r6.append(r4);
        r6.append(r1);
        r1 = " to a root layout in ";
        r6.append(r1);
        r6.append(r3);
        r1 = r6.toString();
        r2.a(r7, r1);
    L_0x0141:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpg.a(cmg, coz, int, int):coz");
    }

    static coz a(cmg cmg, cma cma, coz coz, int i, int i2, cnz cnz) {
        cqq cqq;
        cma.d(cmg);
        cmg = cma.p;
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            cmg = cmg.a();
        }
        if (coz != null) {
            cmg.a(coz.L);
        }
        int i3 = cmg.j;
        int i4 = cmg.k;
        cmg.j = i;
        cmg.k = i2;
        cnh cnh = cmg.d;
        cqq cqq2 = null;
        if (cnh == null) {
            cqq = null;
        } else {
            cqq = cpt.a(cmg, cnh, cnh.d());
        }
        if (cqq != null) {
            cma.b();
            cqq.a();
        }
        coz b = cma.b(cmg, true);
        if (cqq != null) {
            cnh.e();
        }
        cmg.a(null);
        cmg.j = i3;
        cmg.k = i4;
        if (b != cmg.a) {
            if (coz != null && cma.f(cma)) {
                coz.c(b);
                cnz = coz.H;
            } else if (b.z() == YogaDirection.INHERIT) {
                Context context = cmg.b;
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (VERSION.SDK_INT >= 17 && (applicationInfo.flags & 4194304) != 0 && context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    b.a(YogaDirection.RTL);
                }
            }
            cmg = b.b;
            cma = b.B();
            boolean d = cno.d();
            if (d) {
                String valueOf = String.valueOf(cma.b());
                String str = "measureTree:";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    str.concat(valueOf);
                }
                cno.a();
            }
            if (ddl.a(b.w())) {
                b.l(i);
            }
            if (ddl.a(b.x())) {
                b.m(i2);
            }
            if (cnz != null) {
                cno.a();
                cpg.a(b, cnz);
                cno.c();
            }
            cnh cnh2 = cmg.d;
            if (cnh2 != null) {
                cqq2 = cpt.a(cmg, cnh2, cnh2.d());
            }
            if (cqq2 != null) {
                cqq2.c();
                b.B().b();
                cqq2.a();
            }
            float f = Float.NaN;
            float size = MeasureSpec.getMode(i) != 0 ? (float) MeasureSpec.getSize(i) : Float.NaN;
            if (MeasureSpec.getMode(i2) != 0) {
                f = (float) MeasureSpec.getSize(i2);
            }
            b.a(size, f);
            if (cqq2 != null) {
                cnh2.e();
            }
            if (d) {
                cno.c();
            }
        }
        return b;
    }

    public final boolean a(int i, int i2) {
        return cpz.a(this.w, i, this.j) && cpz.a(this.x, i2, this.k);
    }

    public final boolean b() {
        return clj.a(this.L) == this.M;
    }

    private static void a(coz coz, cnz cnz) {
        coz A = coz.A();
        if (!cma.f(coz.B()) || A == null) {
            if (cnz != null) {
                cma B = coz.B();
                cma cma = cnz.f;
                if (B == cma || !(B == null || cma == null || !B.getClass().equals(cma.getClass()))) {
                    coz.a(cnz);
                    int y = coz.y();
                    List list = cnz.k;
                    int i = 0;
                    int size = list != null ? list.size() : 0;
                    if (y == 0 || size == 0) {
                        B = coz.B();
                        if (!(B == null || B.a(B, cnz.f))) {
                            B = coz.B();
                            if (B != null) {
                                B.b(cnz.f);
                            }
                            coz.k();
                        }
                    } else {
                        while (i < y && i < size) {
                            cpg.a(coz.k(i), (cnz) cnz.k.get(i));
                            i++;
                        }
                    }
                }
            }
            return;
        }
        coz.a(cnz);
    }

    public final boolean a(int i) {
        return this.c.j == i;
    }

    public final int c() {
        return this.d.size();
    }

    public final cpd b(int i) {
        return (cpd) this.d.get(i);
    }

    public final int d() {
        return this.y.size();
    }

    public final cst c(int i) {
        return (cst) this.y.get(i);
    }

    public final int e() {
        List list = this.B;
        return list != null ? list.size() : 0;
    }

    public final crj d(int i) {
        List list = this.B;
        return list != null ? (crj) list.get(i) : null;
    }

    public final crg f() {
        crg crg = this.N;
        this.N = null;
        return crg;
    }

    private final boolean a(coz coz) {
        coz coz2 = this.g;
        if (coz2.f) {
            if (coz == coz2.g) {
                return true;
            }
        } else if (coz == coz2) {
            return true;
        }
        return false;
    }

    public static boolean a(int i, int i2, int i3, int i4, float f, float f2) {
        return cpz.a(i, i3, (int) f) && cpz.a(i2, i4, (int) f2);
    }

    private static boolean b(coz coz) {
        return (TextUtils.isEmpty(coz.r) || cma.e(coz.B())) ? false : true;
    }

    public final int a(long j) {
        return ((Integer) this.z.a(j, Integer.valueOf(-1))).intValue();
    }

    public final cpd b(long j) {
        int a = a(j);
        if (a < 0) {
            return null;
        }
        return b(a);
    }

    private static void a(cpg cpg, cpd cpd) {
        cpd.j = cpg.d.size();
        cpg.d.add(cpd);
        cpg.e.add(cpd);
        cpg.f.add(cpd);
    }

    private static csd c(coz coz) {
        if (!coz.t()) {
            return null;
        }
        String str;
        int i = coz.N;
        int i2 = 2;
        if (i == 1) {
            str = null;
            i2 = 1;
        } else if (i != 2) {
            str = i != 1 ? i != 2 ? "null" : "LOCAL" : "GLOBAL";
            StringBuilder stringBuilder = new StringBuilder(str.length() + 30);
            stringBuilder.append("Unhandled transition key type ");
            stringBuilder.append(str);
            throw new RuntimeException(stringBuilder.toString());
        } else {
            str = coz.B().k;
        }
        String str2 = coz.r;
        if (str2 != null) {
            return new csd(i2, str2, str);
        }
        return null;
    }
}

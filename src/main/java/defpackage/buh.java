package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: buh */
final class buh implements buf, cid, Comparable, Runnable {
    private bsv A;
    private volatile boolean B;
    private int C;
    private int D;
    public final bui a = new bui();
    public final bul b;
    public final buo c = new buo();
    public brb d;
    public bsm e;
    public bre f;
    public bvj g;
    public int h;
    public int i;
    public bup j;
    public bsq k;
    public buk l;
    public int m;
    public boolean n;
    public Object o;
    public volatile bug p;
    public volatile boolean q;
    public int r;
    private final List s = new ArrayList();
    private final cif t = cif.a();
    private final zy u;
    private final bum v = new bum();
    private Thread w;
    private bsm x;
    private bsm y;
    private Object z;

    buh(bul bul, zy zyVar) {
        this.b = bul;
        this.u = zyVar;
    }

    public final void a() {
        this.c.d();
        bum bum = this.v;
        bum.a = null;
        bum.b = null;
        bum.c = null;
        bui bui = this.a;
        bui.c = null;
        bui.d = null;
        bui.n = null;
        bui.g = null;
        bui.k = null;
        bui.i = null;
        bui.o = null;
        bui.j = null;
        bui.p = null;
        bui.a.clear();
        bui.l = false;
        bui.b.clear();
        bui.m = false;
        this.B = false;
        this.d = null;
        this.e = null;
        this.k = null;
        this.f = null;
        this.g = null;
        this.l = null;
        this.C = 0;
        this.p = null;
        this.w = null;
        this.x = null;
        this.z = null;
        this.D = 0;
        this.A = null;
        this.q = false;
        this.o = null;
        this.s.clear();
        this.u.a(this);
    }

    private final int d() {
        return this.f.ordinal();
    }

    public final void run() {
        bsv bsv = this.A;
        try {
            if (this.q) {
                g();
                if (bsv != null) {
                    bsv.a();
                }
                return;
            }
            int i = this.r;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 0) {
                    this.C = a(1);
                    this.p = e();
                    f();
                } else if (i2 == 1) {
                    f();
                } else if (i2 != 2) {
                    String str = i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE";
                    StringBuilder stringBuilder = new StringBuilder(str.length() + 25);
                    stringBuilder.append("Unrecognized run reason: ");
                    stringBuilder.append(str);
                    throw new IllegalStateException(stringBuilder.toString());
                } else {
                    i();
                }
                if (bsv != null) {
                    bsv.a();
                }
                return;
            }
            throw null;
        } catch (buc e) {
            throw e;
        } catch (Throwable th) {
            if (bsv != null) {
                bsv.a();
            }
        }
    }

    private final bug e() {
        int i = this.C;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            return new bvv(this.a, this);
        } else {
            if (i2 == 2) {
                return new bub(this.a, this);
            }
            if (i2 == 3) {
                return new bvz(this.a, this);
            }
            if (i2 == 5) {
                return null;
            }
            String a = bun.a(i);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 20);
            stringBuilder.append("Unrecognized stage: ");
            stringBuilder.append(a);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private final void f() {
        this.w = Thread.currentThread();
        chs.a();
        boolean z = false;
        while (!this.q && this.p != null) {
            z = this.p.a();
            if (z) {
                break;
            }
            this.C = a(this.C);
            this.p = e();
            if (this.C == 4) {
                c();
                return;
            }
        }
        if ((this.C == 6 || this.q) && !r0) {
            g();
        }
    }

    private final void g() {
        h();
        this.l.a(new bvn("Failed to load resource", new ArrayList(this.s)));
        if (this.c.c()) {
            a();
        }
    }

    private final void h() {
        this.t.b();
        if (this.B) {
            Throwable th;
            if (this.s.isEmpty()) {
                th = null;
            } else {
                List list = this.s;
                th = (Throwable) list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.B = true;
    }

    public final void c() {
        this.r = 2;
        this.l.a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:163:0x0213 A:{SYNTHETIC, EDGE_INSN: B:163:0x0213->B:105:0x0213 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0204 A:{LOOP_END, LOOP:2: B:25:0x007d->B:104:0x0204} */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0204 A:{LOOP_END, LOOP:2: B:25:0x007d->B:104:0x0204} */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0213 A:{SYNTHETIC, EDGE_INSN: B:163:0x0213->B:105:0x0213 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02c4 A:{REMOVE} */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0213 A:{SYNTHETIC, EDGE_INSN: B:163:0x0213->B:105:0x0213 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0204 A:{LOOP_END, LOOP:2: B:25:0x007d->B:104:0x0204} */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0204 A:{LOOP_END, LOOP:2: B:25:0x007d->B:104:0x0204} */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0213 A:{SYNTHETIC, EDGE_INSN: B:163:0x0213->B:105:0x0213 ?: BREAK  } */
    private final void i() {
        /*
        r33 = this;
        r1 = r33;
        r3 = r1.A;	 Catch:{ bvn -> 0x0249 }
        r0 = r1.z;	 Catch:{ bvn -> 0x0249 }
        r4 = r1.D;	 Catch:{ bvn -> 0x0249 }
        if (r0 == 0) goto L_0x0241;
    L_0x000a:
        defpackage.chs.a();	 Catch:{ all -> 0x023c }
        r5 = r1.a;	 Catch:{ all -> 0x023c }
        r6 = r0.getClass();	 Catch:{ all -> 0x023c }
        r5 = r5.b(r6);	 Catch:{ all -> 0x023c }
        r6 = r1.k;	 Catch:{ all -> 0x023c }
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x023c }
        r8 = 26;
        r9 = 4;
        if (r7 >= r8) goto L_0x0021;
    L_0x0020:
        goto L_0x0052;
    L_0x0021:
        if (r4 != r9) goto L_0x0025;
    L_0x0023:
        r7 = 1;
        goto L_0x002d;
    L_0x0025:
        r7 = r1.a;	 Catch:{ all -> 0x023c }
        r7 = r7.r;	 Catch:{ all -> 0x023c }
        if (r7 == 0) goto L_0x002c;
    L_0x002b:
        goto L_0x0023;
    L_0x002c:
        r7 = 0;
    L_0x002d:
        r8 = defpackage.ccb.a;	 Catch:{ all -> 0x023c }
        r8 = r6.a(r8);	 Catch:{ all -> 0x023c }
        r8 = (java.lang.Boolean) r8;	 Catch:{ all -> 0x023c }
        if (r8 == 0) goto L_0x003f;
    L_0x0037:
        r8 = r8.booleanValue();	 Catch:{ all -> 0x023c }
        if (r8 == 0) goto L_0x0052;
    L_0x003d:
        if (r7 != 0) goto L_0x0052;
    L_0x003f:
        r6 = new bsq;	 Catch:{ all -> 0x023c }
        r6.<init>();	 Catch:{ all -> 0x023c }
        r8 = r1.k;	 Catch:{ all -> 0x023c }
        r6.a(r8);	 Catch:{ all -> 0x023c }
        r8 = defpackage.ccb.a;	 Catch:{ all -> 0x023c }
        r7 = java.lang.Boolean.valueOf(r7);	 Catch:{ all -> 0x023c }
        r6.a(r8, r7);	 Catch:{ all -> 0x023c }
    L_0x0052:
        r7 = r1.d;	 Catch:{ all -> 0x023c }
        r7 = r7.c;	 Catch:{ all -> 0x023c }
        r7 = r7.e;	 Catch:{ all -> 0x023c }
        r7 = r7.a(r0);	 Catch:{ all -> 0x023c }
        r8 = r1.h;	 Catch:{ all -> 0x0237 }
        r15 = r1.i;	 Catch:{ all -> 0x0237 }
        r14 = new buj;	 Catch:{ all -> 0x0237 }
        r14.<init>(r1, r4);	 Catch:{ all -> 0x0237 }
        r0 = r5.a;	 Catch:{ all -> 0x0237 }
        r0 = r0.a();	 Catch:{ all -> 0x0237 }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x0237 }
        r0 = defpackage.chw.a(r0);	 Catch:{ all -> 0x0237 }
        r4 = r0;
        r4 = (java.util.List) r4;	 Catch:{ all -> 0x0237 }
        r0 = r5.b;	 Catch:{ all -> 0x0230 }
        r13 = r0.size();	 Catch:{ all -> 0x0230 }
        r12 = 0;
        r18 = 0;
    L_0x007d:
        if (r12 >= r13) goto L_0x0213;
    L_0x007f:
        r0 = r5.b;	 Catch:{ all -> 0x0230 }
        r0 = r0.get(r12);	 Catch:{ all -> 0x0230 }
        r10 = r0;
        r10 = (defpackage.buq) r10;	 Catch:{ all -> 0x0230 }
        r0 = r10.b;	 Catch:{ bvn -> 0x01f4 }
        r0 = r0.a();	 Catch:{ bvn -> 0x01f4 }
        r0 = (java.util.List) r0;	 Catch:{ bvn -> 0x01f4 }
        r0 = defpackage.chw.a(r0);	 Catch:{ bvn -> 0x01f4 }
        r2 = r0;
        r2 = (java.util.List) r2;	 Catch:{ bvn -> 0x01f4 }
        r19 = r12;
        r12 = r10;
        r20 = r13;
        r13 = r7;
        r11 = r14;
        r14 = r8;
        r22 = r15;
        r16 = r6;
        r17 = r2;
        r0 = r12.a(r13, r14, r15, r16, r17);	 Catch:{ all -> 0x01e6 }
        r12 = r10.b;	 Catch:{ bvn -> 0x01e0 }
        r12.a(r2);	 Catch:{ bvn -> 0x01e0 }
        r2 = r11.a;	 Catch:{ bvn -> 0x01e0 }
        r12 = r11.b;	 Catch:{ bvn -> 0x01e0 }
        r13 = r0.b();	 Catch:{ bvn -> 0x01e0 }
        r13 = r13.getClass();	 Catch:{ bvn -> 0x01e0 }
        if (r12 == r9) goto L_0x00d1;
    L_0x00bc:
        r14 = r2.a;	 Catch:{ bvn -> 0x01e0 }
        r14 = r14.c(r13);	 Catch:{ bvn -> 0x01e0 }
        r15 = r2.d;	 Catch:{ bvn -> 0x01e0 }
        r9 = r2.h;	 Catch:{ bvn -> 0x01e0 }
        r17 = r8;
        r8 = r2.i;	 Catch:{ bvn -> 0x01de }
        r8 = r14.a(r15, r0, r9, r8);	 Catch:{ bvn -> 0x01de }
        r29 = r14;
        goto L_0x00d6;
    L_0x00d1:
        r17 = r8;
        r8 = r0;
        r29 = 0;
    L_0x00d6:
        r9 = r0.equals(r8);	 Catch:{ bvn -> 0x01de }
        if (r9 != 0) goto L_0x00df;
    L_0x00dc:
        r0.d();	 Catch:{ bvn -> 0x01de }
    L_0x00df:
        r0 = r2.a;	 Catch:{ bvn -> 0x01de }
        r0 = r0.c;	 Catch:{ bvn -> 0x01de }
        r0 = r0.c;	 Catch:{ bvn -> 0x01de }
        r0 = r0.d;	 Catch:{ bvn -> 0x01de }
        r9 = r8.a();	 Catch:{ bvn -> 0x01de }
        r0 = r0.a(r9);	 Catch:{ bvn -> 0x01de }
        if (r0 == 0) goto L_0x0114;
    L_0x00f1:
        r0 = r2.a;	 Catch:{ bvn -> 0x01de }
        r0 = r0.c;	 Catch:{ bvn -> 0x01de }
        r0 = r0.c;	 Catch:{ bvn -> 0x01de }
        r0 = r0.d;	 Catch:{ bvn -> 0x01de }
        r14 = r8.a();	 Catch:{ bvn -> 0x01de }
        r0 = r0.a(r14);	 Catch:{ bvn -> 0x01de }
        if (r0 == 0) goto L_0x010a;
    L_0x0103:
        r14 = r2.k;	 Catch:{ bvn -> 0x01de }
        r14 = r0.a(r14);	 Catch:{ bvn -> 0x01de }
        goto L_0x0116;
    L_0x010a:
        r0 = new brh;	 Catch:{ bvn -> 0x01de }
        r2 = r8.a();	 Catch:{ bvn -> 0x01de }
        r0.<init>(r2);	 Catch:{ bvn -> 0x01de }
        throw r0;	 Catch:{ bvn -> 0x01de }
    L_0x0114:
        r0 = 0;
        r14 = 3;
    L_0x0116:
        r15 = r2.a;	 Catch:{ bvn -> 0x01de }
        r9 = r2.x;	 Catch:{ bvn -> 0x01de }
        r15 = r15.c();	 Catch:{ bvn -> 0x01de }
        r32 = r11;
        r11 = r15.size();	 Catch:{ bvn -> 0x01f2 }
        r1 = 0;
    L_0x0125:
        if (r1 >= r11) goto L_0x0142;
    L_0x0127:
        r24 = r15.get(r1);	 Catch:{ bvn -> 0x01f2 }
        r25 = r11;
        r11 = r24;
        r11 = (defpackage.bzp) r11;	 Catch:{ bvn -> 0x01f2 }
        r11 = r11.a;	 Catch:{ bvn -> 0x01f2 }
        r11 = r11.equals(r9);	 Catch:{ bvn -> 0x01f2 }
        if (r11 != 0) goto L_0x013e;
    L_0x0139:
        r1 = r1 + 1;
        r11 = r25;
        goto L_0x0125;
    L_0x013e:
        r1 = 1;
        r21 = 1;
        goto L_0x0145;
    L_0x0142:
        r1 = 1;
        r21 = 0;
    L_0x0145:
        r9 = r21 ^ 1;
        r1 = r2.j;	 Catch:{ bvn -> 0x01f2 }
        r1 = r1.a(r9, r12, r14);	 Catch:{ bvn -> 0x01f2 }
        if (r1 != 0) goto L_0x0151;
    L_0x014f:
        goto L_0x01c5;
    L_0x0151:
        if (r0 == 0) goto L_0x01d0;
    L_0x0153:
        r1 = r14 + -1;
        if (r14 == 0) goto L_0x01ce;
    L_0x0157:
        if (r1 == 0) goto L_0x01b0;
    L_0x0159:
        r9 = 1;
        if (r1 == r9) goto L_0x018c;
    L_0x015c:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ bvn -> 0x01f2 }
        if (r14 == r9) goto L_0x016f;
    L_0x0160:
        r1 = 2;
        if (r14 == r1) goto L_0x016c;
    L_0x0163:
        r1 = 3;
        if (r14 == r1) goto L_0x0169;
    L_0x0166:
        r1 = "null";
        goto L_0x0171;
    L_0x0169:
        r1 = "NONE";
        goto L_0x0171;
    L_0x016c:
        r1 = "TRANSFORMED";
        goto L_0x0171;
    L_0x016f:
        r1 = "SOURCE";
    L_0x0171:
        r2 = r1.length();	 Catch:{ bvn -> 0x01f2 }
        r2 = r2 + 18;
        r8 = new java.lang.StringBuilder;	 Catch:{ bvn -> 0x01f2 }
        r8.<init>(r2);	 Catch:{ bvn -> 0x01f2 }
        r2 = "Unknown strategy: ";
        r8.append(r2);	 Catch:{ bvn -> 0x01f2 }
        r8.append(r1);	 Catch:{ bvn -> 0x01f2 }
        r1 = r8.toString();	 Catch:{ bvn -> 0x01f2 }
        r0.<init>(r1);	 Catch:{ bvn -> 0x01f2 }
        throw r0;	 Catch:{ bvn -> 0x01f2 }
    L_0x018c:
        r1 = new bvy;	 Catch:{ bvn -> 0x01f2 }
        r11 = r2.a;	 Catch:{ bvn -> 0x01f2 }
        r24 = r11.b();	 Catch:{ bvn -> 0x01f2 }
        r11 = r2.x;	 Catch:{ bvn -> 0x01f2 }
        r12 = r2.e;	 Catch:{ bvn -> 0x01f2 }
        r14 = r2.h;	 Catch:{ bvn -> 0x01f2 }
        r15 = r2.i;	 Catch:{ bvn -> 0x01f2 }
        r9 = r2.k;	 Catch:{ bvn -> 0x01f2 }
        r23 = r1;
        r25 = r11;
        r26 = r12;
        r27 = r14;
        r28 = r15;
        r30 = r13;
        r31 = r9;
        r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31);	 Catch:{ bvn -> 0x01f2 }
        goto L_0x01b9;
    L_0x01b0:
        r1 = new bue;	 Catch:{ bvn -> 0x01f2 }
        r9 = r2.x;	 Catch:{ bvn -> 0x01f2 }
        r11 = r2.e;	 Catch:{ bvn -> 0x01f2 }
        r1.<init>(r9, r11);	 Catch:{ bvn -> 0x01f2 }
    L_0x01b9:
        r8 = defpackage.bvu.a(r8);	 Catch:{ bvn -> 0x01f2 }
        r2 = r2.v;	 Catch:{ bvn -> 0x01f2 }
        r2.a = r1;	 Catch:{ bvn -> 0x01f2 }
        r2.b = r0;	 Catch:{ bvn -> 0x01f2 }
        r2.c = r8;	 Catch:{ bvn -> 0x01f2 }
    L_0x01c5:
        r0 = r10.a;	 Catch:{ bvn -> 0x01f2 }
        r0 = r0.a(r8, r6);	 Catch:{ bvn -> 0x01f2 }
        r18 = r0;
        goto L_0x0202;
    L_0x01ce:
        r1 = 0;
        throw r1;	 Catch:{ bvn -> 0x01f2 }
    L_0x01d0:
        r0 = new brh;	 Catch:{ bvn -> 0x01f2 }
        r1 = r8.b();	 Catch:{ bvn -> 0x01f2 }
        r1 = r1.getClass();	 Catch:{ bvn -> 0x01f2 }
        r0.<init>(r1);	 Catch:{ bvn -> 0x01f2 }
        throw r0;	 Catch:{ bvn -> 0x01f2 }
    L_0x01de:
        r0 = move-exception;
        goto L_0x01e3;
    L_0x01e0:
        r0 = move-exception;
        r17 = r8;
    L_0x01e3:
        r32 = r11;
        goto L_0x01ff;
    L_0x01e6:
        r0 = move-exception;
        r17 = r8;
        r32 = r11;
        r1 = r0;
        r0 = r10.b;	 Catch:{ bvn -> 0x01f2 }
        r0.a(r2);	 Catch:{ bvn -> 0x01f2 }
        throw r1;	 Catch:{ bvn -> 0x01f2 }
    L_0x01f2:
        r0 = move-exception;
        goto L_0x01ff;
    L_0x01f4:
        r0 = move-exception;
        r17 = r8;
        r19 = r12;
        r20 = r13;
        r32 = r14;
        r22 = r15;
    L_0x01ff:
        r4.add(r0);	 Catch:{ all -> 0x0230 }
    L_0x0202:
        if (r18 != 0) goto L_0x0213;
    L_0x0204:
        r12 = r19 + 1;
        r9 = 4;
        r1 = r33;
        r8 = r17;
        r13 = r20;
        r15 = r22;
        r14 = r32;
        goto L_0x007d;
    L_0x0213:
        r2 = r18;
        if (r2 == 0) goto L_0x0223;
    L_0x0217:
        r0 = r5.a;	 Catch:{ all -> 0x0237 }
        r0.a(r4);	 Catch:{ all -> 0x0237 }
        r7.b();	 Catch:{ all -> 0x023c }
        r3.a();	 Catch:{ bvn -> 0x0249 }
        goto L_0x0245;
    L_0x0223:
        r0 = new bvn;	 Catch:{ all -> 0x0230 }
        r1 = r5.c;	 Catch:{ all -> 0x0230 }
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0230 }
        r2.<init>(r4);	 Catch:{ all -> 0x0230 }
        r0.<init>(r1, r2);	 Catch:{ all -> 0x0230 }
        throw r0;	 Catch:{ all -> 0x0230 }
    L_0x0230:
        r0 = move-exception;
        r1 = r5.a;	 Catch:{ all -> 0x0237 }
        r1.a(r4);	 Catch:{ all -> 0x0237 }
        throw r0;	 Catch:{ all -> 0x0237 }
    L_0x0237:
        r0 = move-exception;
        r7.b();	 Catch:{ all -> 0x023c }
        throw r0;	 Catch:{ all -> 0x023c }
    L_0x023c:
        r0 = move-exception;
        r3.a();	 Catch:{ bvn -> 0x0249 }
        throw r0;	 Catch:{ bvn -> 0x0249 }
    L_0x0241:
        r3.a();	 Catch:{ bvn -> 0x0249 }
        r2 = 0;
    L_0x0245:
        r4 = 0;
        r1 = r33;
        goto L_0x025a;
    L_0x0249:
        r0 = move-exception;
        r1 = r33;
        r2 = r1.y;
        r3 = r1.D;
        r4 = 0;
        r0.a(r2, r3, r4);
        r2 = r1.s;
        r2.add(r0);
        r2 = r4;
    L_0x025a:
        if (r2 == 0) goto L_0x02c5;
    L_0x025c:
        r0 = r1.D;
        r3 = r2 instanceof defpackage.bvp;
        if (r3 == 0) goto L_0x0268;
    L_0x0262:
        r3 = r2;
        r3 = (defpackage.bvp) r3;
        r3.e();
    L_0x0268:
        r3 = r1.v;
        r3 = r3.a();
        if (r3 == 0) goto L_0x0275;
    L_0x0270:
        r2 = defpackage.bvu.a(r2);
        r4 = r2;
    L_0x0275:
        r33.h();
        r3 = r1.l;
        r3.a(r2, r0);
        r0 = 5;
        r1.C = r0;
        r0 = r1.v;	 Catch:{ all -> 0x02be }
        r0 = r0.a();	 Catch:{ all -> 0x02be }
        if (r0 == 0) goto L_0x02ad;
    L_0x0288:
        r2 = r1.v;	 Catch:{ all -> 0x02be }
        r0 = r1.b;	 Catch:{ all -> 0x02be }
        r3 = r1.k;	 Catch:{ all -> 0x02be }
        r0 = r0.a();	 Catch:{ all -> 0x02a6 }
        r5 = r2.a;	 Catch:{ all -> 0x02a6 }
        r6 = new bud;	 Catch:{ all -> 0x02a6 }
        r7 = r2.b;	 Catch:{ all -> 0x02a6 }
        r8 = r2.c;	 Catch:{ all -> 0x02a6 }
        r6.<init>(r7, r8, r3);	 Catch:{ all -> 0x02a6 }
        r0.a(r5, r6);	 Catch:{ all -> 0x02a6 }
        r0 = r2.c;	 Catch:{ all -> 0x02be }
        r0.e();	 Catch:{ all -> 0x02be }
        goto L_0x02ad;
    L_0x02a6:
        r0 = move-exception;
        r2 = r2.c;	 Catch:{ all -> 0x02be }
        r2.e();	 Catch:{ all -> 0x02be }
        throw r0;	 Catch:{ all -> 0x02be }
    L_0x02ad:
        if (r4 == 0) goto L_0x02b2;
    L_0x02af:
        r4.e();
    L_0x02b2:
        r0 = r1.c;
        r0 = r0.b();
        if (r0 == 0) goto L_0x02bd;
    L_0x02ba:
        r33.a();
    L_0x02bd:
        return;
    L_0x02be:
        r0 = move-exception;
        if (r4 == 0) goto L_0x02c4;
    L_0x02c1:
        r4.e();
    L_0x02c4:
        throw r0;
    L_0x02c5:
        r33.f();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buh.i():void");
    }

    public final cif h_() {
        return this.t;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        buh buh = (buh) obj;
        int d = d() - buh.d();
        return d == 0 ? this.m - buh.m : d;
    }

    public final int a(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3 || i2 == 5) {
                        return 6;
                    }
                    String a = bun.a(i);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 20);
                    stringBuilder.append("Unrecognized stage: ");
                    stringBuilder.append(a);
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else if (this.n) {
                    return 6;
                } else {
                    return 4;
                }
            } else if (this.j.b()) {
                return 3;
            } else {
                return a(3);
            }
        } else if (this.j.a()) {
            return 2;
        } else {
            return a(2);
        }
    }

    public final void a(bsm bsm, Object obj, bsv bsv, int i, bsm bsm2) {
        this.x = bsm;
        this.z = obj;
        this.A = bsv;
        this.D = i;
        this.y = bsm2;
        if (Thread.currentThread() != this.w) {
            this.r = 3;
            this.l.a(this);
            return;
        }
        i();
    }

    public final void a(bsm bsm, Exception exception, bsv bsv, int i) {
        bsv.a();
        bvn bvn = new bvn("Fetching data failed", (Throwable) exception);
        bvn.a(bsm, i, bsv.d());
        this.s.add(bvn);
        if (Thread.currentThread() != this.w) {
            this.r = 2;
            this.l.a(this);
            return;
        }
        f();
    }
}

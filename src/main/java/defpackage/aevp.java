package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

/* renamed from: aevp */
public final class aevp implements afhi, nok {
    private static final long m = TimeUnit.HOURS.toMicros(4);
    private Long A;
    private final long B;
    private long C;
    private final long D;
    private boolean E = false;
    private int F;
    private final int G;
    public final boolean a;
    public final Handler b;
    public final aevv c;
    public final int d;
    public final Exchanger e;
    public Integer f;
    public boolean g;
    public Long h;
    public boolean i;
    public Long j;
    public aevx k;
    private final String n;
    private final aahr[] o;
    private final nvo p;
    private final noo q;
    private final boolean r;
    private final int s;
    private final afgp t;
    private final non u;
    private final nnx[] v;
    private final nom[] w;
    private final nwi x;
    private final aajj y;
    private nni z;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad A:{SYNTHETIC, EDGE_INSN: B:38:0x00ad->B:28:0x00ad ?: BREAK  , EDGE_INSN: B:38:0x00ad->B:28:0x00ad ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092 A:{LOOP_END, LOOP:0: B:25:0x008f->B:27:0x0092} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bd  */
    public aevp(java.lang.String r2, defpackage.aahr[] r3, defpackage.afhg r4, defpackage.noo r5, defpackage.afgp r6, defpackage.nwi r7, boolean r8, int r9, java.util.concurrent.Exchanger r10, android.os.Handler r11, defpackage.aevv r12, int r13, defpackage.aajj r14, boolean r15) {
        /*
        r1 = this;
        r1.<init>();
        r0 = 0;
        r1.E = r0;
        r1.n = r2;
        r1.o = r3;
        r2 = new afiw;
        r4 = r4.a(r1);
        r2.<init>(r4);
        r1.p = r2;
        r1.q = r5;
        r1.r = r8;
        r1.s = r9;
        r1.t = r6;
        r1.x = r7;
        r1.e = r10;
        r1.b = r11;
        r1.c = r12;
        r1.d = r13;
        r2 = new non;
        r2.<init>();
        r1.u = r2;
        r2 = 1;
        r1.i = r2;
        r1.y = r14;
        r4 = r14.c;
        r5 = r4.a;
        r6 = 2;
        r5 = r5 & r6;
        if (r5 == 0) goto L_0x0061;
    L_0x003b:
        r4 = r4.d;
        if (r4 != 0) goto L_0x0041;
    L_0x003f:
        r4 = defpackage.arhh.bv;
    L_0x0041:
        r4 = r4.bb;
        r4 = defpackage.aouc.a(r4);
        if (r4 == 0) goto L_0x004a;
    L_0x0049:
        goto L_0x004b;
    L_0x004a:
        r4 = 1;
    L_0x004b:
        r4 = r4 + -1;
        if (r4 <= 0) goto L_0x0061;
    L_0x004f:
        r4 = r14.c;
        r4 = r4.d;
        if (r4 != 0) goto L_0x0057;
    L_0x0055:
        r4 = defpackage.arhh.bv;
    L_0x0057:
        r4 = r4.bb;
        r4 = defpackage.aouc.a(r4);
        if (r4 == 0) goto L_0x0062;
    L_0x005f:
        r2 = r4;
        goto L_0x0062;
    L_0x0061:
        r2 = 2;
    L_0x0062:
        r1.G = r2;
        r1.a = r15;
        r2 = r3.length;
        r4 = new defpackage.nnx[r2];
        r1.v = r4;
        r2 = new defpackage.nom[r2];
        r1.w = r2;
        r2 = r14.c;
        r4 = r2.a;
        r4 = r4 & r6;
        if (r4 == 0) goto L_0x007f;
    L_0x0076:
        r2 = r2.d;
        if (r2 != 0) goto L_0x007c;
    L_0x007a:
        r2 = defpackage.arhh.bv;
    L_0x007c:
        r2 = r2.bs;
        goto L_0x0080;
    L_0x007f:
        r2 = 0;
    L_0x0080:
        r4 = (double) r2;
        r6 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        java.lang.Double.isNaN(r4);
        r4 = r4 * r6;
        r4 = (long) r4;
        r1.D = r4;
        r2 = 0;
    L_0x008f:
        r4 = r3.length;
        if (r2 >= r4) goto L_0x00ad;
    L_0x0092:
        r4 = r1.w;
        r5 = r3[r2];
        r5 = defpackage.aajy.a(r5);
        r4[r2] = r5;
        r4 = r1.v;
        r5 = new aevs;
        r5.<init>(r1);
        r8 = new aevt;
        r8.<init>(r1, r5);
        r4[r2] = r8;
        r2 = r2 + 1;
        goto L_0x008f;
    L_0x00ad:
        r8 = 0;
        if (r4 <= 0) goto L_0x00b8;
    L_0x00b1:
        r2 = r3[r0];
        r2 = r2.s();
        goto L_0x00b9;
    L_0x00b8:
        r2 = r8;
    L_0x00b9:
        r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r4 <= 0) goto L_0x00c1;
    L_0x00bd:
        r2 = r2 * r6;
        r2 = (long) r2;
        goto L_0x00c3;
    L_0x00c1:
        r2 = m;
    L_0x00c3:
        r1.B = r2;
        r2 = new nnk;
        r3 = 0;
        r2.<init>(r3, r3);
        r1.z = r2;
        r1.d();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aevp.<init>(java.lang.String, aahr[], afhg, noo, afgp, nwi, boolean, int, java.util.concurrent.Exchanger, android.os.Handler, aevv, int, aajj, boolean):void");
    }

    public final void a() {
    }

    public final void a(long j) {
    }

    public final void a(nny nny) {
    }

    public final boolean b() {
        return true;
    }

    public final int c() {
        return !e() ? this.w.length : 1;
    }

    public final nmx a(int i) {
        return aevp.b(this.w[i]);
    }

    public final void b(int i) {
        this.F = i;
        if (e()) {
            this.q.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0118  */
    public final void a(java.util.List r29, long r30, defpackage.nnz r32) {
        /*
        r28 = this;
        r0 = r28;
        r7 = r30;
        r9 = r32;
        r1 = r29.isEmpty();
        r10 = -1;
        r11 = 0;
        r12 = 0;
        r13 = 1;
        if (r1 == 0) goto L_0x002b;
    L_0x0010:
        r1 = r0.c(r7);
        r0.f = r1;
        r1 = r0.f;
        if (r1 == 0) goto L_0x0025;
    L_0x001a:
        r1 = r1.intValue();
        r1 = r1 + r10;
        r1 = java.lang.Integer.valueOf(r1);
        r0.f = r1;
    L_0x0025:
        r0.h = r12;
        r0.i = r13;
        r0.g = r11;
    L_0x002b:
        r1 = r0.g;
        if (r1 == 0) goto L_0x0032;
    L_0x002f:
        r9.c = r13;
        return;
    L_0x0032:
        r1 = r0.u;
        r2 = r29.size();
        r1.a = r2;
        r1 = r28.e();
        r14 = 2;
        if (r1 == 0) goto L_0x004f;
    L_0x0041:
        r1 = r0.q;
        r5 = r0.w;
        r6 = r0.u;
        r2 = r29;
        r3 = r30;
        r1.a(r2, r3, r5, r6);
        goto L_0x005b;
    L_0x004f:
        r1 = r0.u;
        r2 = r0.w;
        r3 = r0.F;
        r2 = r2[r3];
        r1.c = r2;
        r1.b = r14;
    L_0x005b:
        r1 = r0.u;
        r2 = r1.c;
        r1 = r1.a;
        r9.a = r1;
        if (r2 != 0) goto L_0x0068;
    L_0x0065:
        r9.b = r12;
        return;
    L_0x0068:
        r3 = r29.size();
        if (r1 != r3) goto L_0x007c;
    L_0x006e:
        r1 = r9.b;
        if (r1 == 0) goto L_0x007c;
    L_0x0072:
        r1 = r1.f;
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x007b;
    L_0x007a:
        goto L_0x007c;
    L_0x007b:
        return;
    L_0x007c:
        r1 = r29.isEmpty();
        if (r1 != 0) goto L_0x008e;
    L_0x0082:
        r1 = r9.a;
        r1 = r1 + r10;
        r3 = r29;
        r1 = r3.get(r1);
        r1 = (defpackage.nos) r1;
        goto L_0x008f;
    L_0x008e:
        r1 = r12;
    L_0x008f:
        if (r1 == 0) goto L_0x009a;
    L_0x0091:
        r3 = r1.l;
        if (r3 < 0) goto L_0x009a;
    L_0x0095:
        r3 = java.lang.Integer.valueOf(r3);
        goto L_0x009c;
    L_0x009a:
        r3 = r0.f;
    L_0x009c:
        if (r3 == 0) goto L_0x00a7;
    L_0x009e:
        r3 = r3.intValue();
        r3 = r3 + r13;
        r12 = java.lang.Integer.valueOf(r3);
    L_0x00a7:
        r0.f = r12;
        r3 = r0.a;
        if (r3 == 0) goto L_0x00cf;
    L_0x00ad:
        r3 = r0.c(r7);
        r4 = r0.f;
        if (r4 != 0) goto L_0x00b7;
    L_0x00b5:
        r3 = 0;
        goto L_0x00c9;
    L_0x00b7:
        if (r3 == 0) goto L_0x00c3;
    L_0x00b9:
        r4 = r4.intValue();
        r5 = r3.intValue();
        if (r4 < r5) goto L_0x00c5;
    L_0x00c3:
        r3 = r0.f;
    L_0x00c5:
        r3 = r3.intValue();
    L_0x00c9:
        r3 = java.lang.Integer.valueOf(r3);
        r0.f = r3;
    L_0x00cf:
        r3 = r0.f;
        r4 = 0;
        if (r3 == 0) goto L_0x00ea;
    L_0x00d5:
        r3 = r1 instanceof defpackage.aevx;
        if (r3 == 0) goto L_0x00ea;
    L_0x00d9:
        r1 = (defpackage.aevx) r1;
        r4 = r1.i();
        r6 = r1.i();
        r15 = r1.h();
        r6 = r6 - r15;
        r6 = r6 + r4;
        goto L_0x00eb;
    L_0x00ea:
        r6 = r4;
    L_0x00eb:
        r1 = new nnk;
        r1.<init>(r4, r6);
        r3 = r0.u;
        r3 = r3.b;
        r2 = r0.a(r2);
        r4 = new long[r14];
        r1.a(r4);
        r1 = new aevx;
        r5 = r0.p;
        r6 = new nvq;
        r7 = r0.f;
        r7 = r0.a(r2, r7);
        r6.<init>(r7);
        r7 = r0.w;
        r19 = r7[r2];
        r20 = r4[r11];
        r22 = r4[r13];
        r4 = r0.f;
        if (r4 == 0) goto L_0x011f;
    L_0x0118:
        r10 = r4.intValue();
        r24 = r10;
        goto L_0x0121;
    L_0x011f:
        r24 = -1;
    L_0x0121:
        r4 = r0.v;
        r25 = r4[r2];
        r4 = r0.w;
        r2 = r4[r2];
        r26 = defpackage.aevp.b(r2);
        r2 = r0.G;
        r15 = r1;
        r16 = r5;
        r17 = r6;
        r18 = r3;
        r27 = r2;
        r15.<init>(r16, r17, r18, r19, r20, r22, r24, r25, r26, r27);
        r0.k = r1;
        r1 = r0.k;
        r9.b = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aevp.a(java.util.List, long, nnz):void");
    }

    private final synchronized Integer c(long j) {
        if (this.r && this.s > 0) {
            Long l = this.j;
            if (l != null && l.longValue() > 0) {
                l = this.A;
                if (l != null && l.longValue() > 0 && j > 0) {
                    double longValue = (double) (this.A.longValue() - j);
                    double toMicros = (double) TimeUnit.MILLISECONDS.toMicros((long) this.s);
                    Double.isNaN(longValue);
                    Double.isNaN(toMicros);
                    return Integer.valueOf((int) (this.j.longValue() - ((long) Math.ceil(longValue / toMicros))));
                }
            }
        }
        return null;
    }

    private final int a(nom nom) {
        int i = 0;
        while (true) {
            nom[] nomArr = this.w;
            if (i >= nomArr.length) {
                return 0;
            }
            if (nomArr[i].a.equals(nom.a)) {
                return i;
            }
            i++;
        }
    }

    private final synchronized void d() {
        if (!(this.b == null || this.c == null)) {
            this.C = f();
            this.b.post(new aevo(this, this.z, g()));
        }
    }

    private final Uri a(int i, Integer num) {
        aahr aahr = this.o[i];
        aahs a = aahr.a();
        a.a(this.n);
        a.a(afix.a(aahr, this.y));
        if (num != null) {
            a.b((long) num.intValue());
        } else {
            a.a(this.t.a());
        }
        return a.a();
    }

    public final void a(nny nny, Exception exception) {
        if (!(exception.getCause() instanceof aevu)) {
            if (!(exception instanceof owb)) {
                return;
            }
            if (!((exception instanceof owd) && ((owd) exception).a == 416)) {
                if (((owb) exception).b == 2 && (nny instanceof aevx)) {
                    aevx aevx = (aevx) nny;
                    if (aevx.l >= 0 || this.f == null || !aevx.g.a.toString().contains("headm")) {
                        return;
                    }
                }
                return;
            }
        }
        aevx aevx2 = (aevx) nny;
        aevx2.m = new nvq(a(a(this.u.c), this.f));
        aevx2.o = 0;
    }

    public final void a(List list) {
        if (e()) {
            this.q.b();
        }
        this.u.c = null;
    }

    private final boolean e() {
        return this.q != null;
    }

    public final void a(Map map) {
        afja afja = new afja(map);
        Long b = afja.b();
        Long a = afja.a();
        if (a != null) {
            synchronized (this) {
                if (b != null) {
                    if (!a.equals(this.A)) {
                        this.j = b;
                        this.A = a;
                        this.t.h = a.longValue();
                    }
                }
                b(a.longValue());
            }
        }
        aevx aevx = this.k;
        if (aevx != null && aevx.r == 3) {
            Long c = new afja(map).c();
            long longValue = c != null ? c.longValue() : -1;
            long j = aevx.n;
            if (j == -1 || j == longValue) {
                aevx.n = longValue;
                return;
            }
            aevx.n = Math.max(j, longValue);
            aevx.o = 0;
            throw new afhy(aevx.g, "x-segment-lmt");
        }
    }

    public final synchronized void b(long j) {
        long f = f();
        long j2 = this.D;
        boolean z = false;
        if (j2 > 0) {
            if (j2 + j < f) {
                z = true;
            }
        }
        this.E = z;
        if (j >= f) {
            if (!this.a) {
                if (!this.g) {
                    nni nnk;
                    if (j <= 0) {
                        nnk = new nnk(0, 0);
                    } else {
                        nnk = new aewk(0, j, this.x, false);
                    }
                    this.z = nnk;
                }
            }
            this.z = new nnk(0, j + TimeUnit.MILLISECONDS.toMicros((long) this.s));
        } else if (z) {
            this.z = new nnk(0, j);
        }
        if (f() - this.C > 300000) {
            d();
        }
    }

    private final synchronized long f() {
        return this.z.a(null)[1];
    }

    /* JADX WARNING: Missing block: B:17:0x0040, code skipped:
            return r0;
     */
    private final synchronized defpackage.nni g() {
        /*
        r14 = this;
        monitor-enter(r14);
        r0 = r14.f();	 Catch:{ all -> 0x0048 }
        r2 = 0;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 <= 0) goto L_0x0041;
    L_0x000b:
        r4 = r14.a;	 Catch:{ all -> 0x0048 }
        r5 = 1;
        if (r4 != 0) goto L_0x001a;
    L_0x0010:
        r4 = r14.g;	 Catch:{ all -> 0x0048 }
        if (r4 != 0) goto L_0x001a;
    L_0x0014:
        r4 = r14.E;	 Catch:{ all -> 0x0048 }
        if (r4 == 0) goto L_0x0019;
    L_0x0018:
        goto L_0x001a;
    L_0x0019:
        r5 = 0;
    L_0x001a:
        r4 = r14.t;	 Catch:{ all -> 0x0048 }
        r6 = r4.c();	 Catch:{ all -> 0x0048 }
        r6 = r0 - r6;
        r11 = java.lang.Math.max(r6, r2);	 Catch:{ all -> 0x0048 }
        r6 = r14.B;	 Catch:{ all -> 0x0048 }
        r6 = r0 - r6;
        r9 = java.lang.Math.max(r2, r6);	 Catch:{ all -> 0x0048 }
        if (r5 == 0) goto L_0x0037;
    L_0x0030:
        r2 = new nnk;	 Catch:{ all -> 0x0048 }
        r2.<init>(r9, r0);	 Catch:{ all -> 0x0048 }
        r0 = r2;
        goto L_0x003f;
    L_0x0037:
        r0 = new aewk;	 Catch:{ all -> 0x0048 }
        r13 = r14.x;	 Catch:{ all -> 0x0048 }
        r8 = r0;
        r8.<init>(r9, r11, r13);	 Catch:{ all -> 0x0048 }
    L_0x003f:
        monitor-exit(r14);
        return r0;
    L_0x0041:
        r0 = new nnk;	 Catch:{ all -> 0x0048 }
        r0.<init>(r2, r2);	 Catch:{ all -> 0x0048 }
        monitor-exit(r14);
        return r0;
    L_0x0048:
        r0 = move-exception;
        monitor-exit(r14);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aevp.g():nni");
    }

    private static nmx b(nom nom) {
        if (aaja.a(nom.b)) {
            return nmx.a(nom.a, "video/avc", nom.c, -1, nom.d, nom.e);
        }
        return nmx.a(nom.a, "audio/mp4a-latm", nom.c, -1, -1, nom.g, nom.h, null, nom.j);
    }
}

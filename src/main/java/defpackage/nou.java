package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: nou */
public class nou implements nok, npc {
    public final now a;
    public final int b;
    private final Handler c;
    private final nvo d;
    private final noo e;
    private final non f;
    private final nwn g;
    private final noz h;
    private final ArrayList i;
    private final SparseArray j;
    private final nwi k;
    private final long l;
    private final long[] m;
    private final boolean n;
    private npf o;
    private npf p;
    private nov q;
    private int r;
    private nni s;
    private boolean t;
    private boolean u;
    private boolean v;
    private IOException w;

    public nou(noz noz, nvo nvo, noo noo, long j, int i, npm... npmArr) {
        long j2 = j;
        npf npf = new npf(-1, j2, false, -1, -1, null, Collections.singletonList(new npk(0, Collections.singletonList(new npe(i, Arrays.asList(npmArr))))));
        this(null, npf, noz, nvo, noo, new nxe(), 0, false, null, null, 0);
    }

    public final void a(nny nny, Exception exception) {
    }

    public nou(nwn nwn, noz noz, nvo nvo, noo noo, long j, Handler handler, now now, int i) {
        nwn nwn2 = nwn;
        this(nwn2, (npf) nwn2.l, noz, nvo, noo, new nxe(), j * 1000, true, handler, now, i);
    }

    private nou(nwn nwn, npf npf, noz noz, nvo nvo, noo noo, nwi nwi, long j, boolean z, Handler handler, now now, int i) {
        this.g = nwn;
        this.o = npf;
        this.h = noz;
        this.d = nvo;
        this.e = noo;
        this.k = nwi;
        this.l = j;
        this.u = z;
        this.c = handler;
        this.a = now;
        this.b = i;
        this.f = new non();
        this.m = new long[2];
        this.j = new SparseArray();
        this.i = new ArrayList();
        this.n = npf.c;
    }

    public final void a() {
        IOException iOException = this.w;
        if (iOException == null) {
            nwn nwn = this.g;
            if (nwn != null) {
                nws nws = nwn.k;
                if (nws != null && nwn.i > nwn.c) {
                    throw nws;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final boolean b() {
        if (!this.t) {
            this.t = true;
            try {
                this.h.a(this.o, this);
            } catch (IOException e) {
                this.w = e;
            }
        }
        if (this.w == null) {
            return true;
        }
        return false;
    }

    public final int c() {
        return this.i.size();
    }

    public final nmx a(int i) {
        return ((nov) this.i.get(i)).a;
    }

    public final void b(int i) {
        this.q = (nov) this.i.get(i);
        if (this.q.a()) {
            this.e.a();
        }
        nwn nwn = this.g;
        if (nwn == null) {
            a(this.o);
            return;
        }
        int i2 = nwn.e;
        nwn.e = i2 + 1;
        if (i2 == 0) {
            nwn.i = 0;
            nwn.k = null;
        }
        a((npf) nwn.l);
    }

    public final void a(long j) {
        nwn nwn = this.g;
        if (nwn != null && this.o.c && this.w == null) {
            npf npf = (npf) nwn.l;
            if (!(npf == null || npf == this.p)) {
                a(npf);
                this.p = npf;
            }
            j = this.o.d;
            if (j == 0) {
                j = 5000;
            }
            if (SystemClock.elapsedRealtime() > this.g.m + j) {
                nwn = this.g;
                if (nwn.k == null || SystemClock.elapsedRealtime() >= nwn.j + Math.min((((long) nwn.i) - 1) * 1000, 5000)) {
                    if (nwn.f == null) {
                        nwn.f = new nvy("manifestLoader");
                    }
                    if (!nwn.f.b) {
                        nwn.g = new nwe(nwn.d, nwn.b, nwn.a);
                        nwn.h = SystemClock.elapsedRealtime();
                        nwn.f.a(nwn.g, nwn);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x021f  */
    public final void a(java.util.List r24, long r25, defpackage.nnz r27) {
        /*
        r23 = this;
        r9 = r23;
        r6 = r24;
        r7 = r25;
        r10 = r27;
        r0 = r9.w;
        r11 = 0;
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        r10.b = r11;
        return;
    L_0x0010:
        r0 = r9.f;
        r1 = r24.size();
        r0.a = r1;
        r0 = r9.f;
        r0 = r0.c;
        if (r0 == 0) goto L_0x0022;
    L_0x001e:
        r0 = r9.v;
        if (r0 != 0) goto L_0x0045;
    L_0x0022:
        r0 = r9.q;
        r0 = r0.a();
        if (r0 == 0) goto L_0x003a;
    L_0x002a:
        r0 = r9.e;
        r1 = r9.q;
        r4 = r1.f;
        r5 = r9.f;
        r1 = r24;
        r2 = r25;
        r0.a(r1, r2, r4, r5);
        goto L_0x0045;
    L_0x003a:
        r0 = r9.f;
        r1 = r9.q;
        r1 = r1.e;
        r0.c = r1;
        r1 = 2;
        r0.b = r1;
    L_0x0045:
        r0 = r9.f;
        r1 = r0.c;
        r0 = r0.a;
        r10.a = r0;
        if (r1 != 0) goto L_0x0052;
    L_0x004f:
        r10.b = r11;
        return;
    L_0x0052:
        r2 = r24.size();
        if (r0 != r2) goto L_0x0066;
    L_0x0058:
        r0 = r10.b;
        if (r0 == 0) goto L_0x0066;
    L_0x005c:
        r0 = r0.f;
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x0065;
    L_0x0064:
        goto L_0x0066;
    L_0x0065:
        return;
    L_0x0066:
        r10.b = r11;
        r0 = r9.s;
        r2 = r9.m;
        r0.a(r2);
        r0 = r24.isEmpty();
        r2 = -1;
        r4 = 1;
        r12 = 0;
        if (r0 == 0) goto L_0x00f5;
    L_0x0079:
        r0 = r9.n;
        if (r0 == 0) goto L_0x00aa;
    L_0x007d:
        r13 = 0;
        r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1));
        if (r0 == 0) goto L_0x0085;
    L_0x0083:
        r9.u = r12;
    L_0x0085:
        r0 = r9.u;
        if (r0 == 0) goto L_0x0097;
    L_0x0089:
        r0 = r9.m;
        r7 = r0[r12];
        r13 = r0[r4];
        r11 = r9.l;
        r13 = r13 - r11;
        r7 = java.lang.Math.max(r7, r13);
        goto L_0x00aa;
    L_0x0097:
        r5 = r9.m;
        r11 = r5[r4];
        r11 = r11 + r2;
        r7 = java.lang.Math.min(r7, r11);
        r5 = r9.m;
        r11 = 0;
        r12 = r5[r11];
        r7 = java.lang.Math.max(r7, r12);
        goto L_0x00ab;
    L_0x00aa:
        r11 = 0;
    L_0x00ab:
        r5 = r9.j;
        r5 = r5.valueAt(r11);
        r5 = (defpackage.noy) r5;
        r11 = r5.g;
        r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1));
        if (r5 < 0) goto L_0x00e9;
    L_0x00b9:
        r5 = 0;
    L_0x00ba:
        r11 = r9.j;
        r11 = r11.size();
        r11 = r11 + -1;
        if (r5 >= r11) goto L_0x00d7;
    L_0x00c4:
        r11 = r9.j;
        r11 = r11.valueAt(r5);
        r11 = (defpackage.noy) r11;
        r12 = r11.a();
        r14 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1));
        if (r14 < 0) goto L_0x00e6;
    L_0x00d4:
        r5 = r5 + 1;
        goto L_0x00ba;
    L_0x00d7:
        r5 = r9.j;
        r11 = r5.size();
        r11 = r11 + -1;
        r5 = r5.valueAt(r11);
        r11 = r5;
        r11 = (defpackage.noy) r11;
    L_0x00e6:
        r5 = r11;
        r11 = 0;
        goto L_0x00f2;
    L_0x00e9:
        r5 = r9.j;
        r11 = 0;
        r5 = r5.valueAt(r11);
        r5 = (defpackage.noy) r5;
    L_0x00f2:
        r11 = 1;
        goto L_0x01a1;
    L_0x00f5:
        r11 = 0;
        r5 = r9.u;
        if (r5 == 0) goto L_0x00fc;
    L_0x00fa:
        r9.u = r11;
    L_0x00fc:
        r5 = r10.a;
        r5 = r5 + -1;
        r5 = r6.get(r5);
        r5 = (defpackage.nos) r5;
        r12 = r5.k;
        r14 = r9.n;
        if (r14 == 0) goto L_0x011d;
    L_0x010c:
        r14 = r9.m;
        r16 = r14[r11];
        r11 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1));
        if (r11 < 0) goto L_0x0115;
    L_0x0114:
        goto L_0x011d;
    L_0x0115:
        r0 = new nli;
        r0.<init>();
        r9.w = r0;
        return;
    L_0x011d:
        r11 = r9.o;
        r11 = r11.c;
        if (r11 == 0) goto L_0x012d;
    L_0x0123:
        r11 = r9.m;
        r16 = r11[r4];
        r11 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1));
        if (r11 >= 0) goto L_0x012c;
    L_0x012b:
        goto L_0x012d;
    L_0x012c:
        return;
    L_0x012d:
        r11 = r9.j;
        r12 = r11.size();
        r12 = r12 + -1;
        r11 = r11.valueAt(r12);
        r11 = (defpackage.noy) r11;
        r12 = r5.h;
        r13 = r11.a;
        if (r12 != r13) goto L_0x0160;
    L_0x0141:
        r11 = r11.c;
        r12 = r5.f;
        r12 = r12.a;
        r11 = r11.get(r12);
        r11 = (defpackage.nox) r11;
        r12 = r5.g();
        r11 = r11.c(r12);
        if (r11 == 0) goto L_0x0160;
    L_0x0157:
        r0 = r9.o;
        r0 = r0.c;
        if (r0 != 0) goto L_0x015f;
    L_0x015d:
        r10.c = r4;
    L_0x015f:
        return;
    L_0x0160:
        r11 = r9.j;
        r12 = r5.h;
        r11 = r11.get(r12);
        r11 = (defpackage.noy) r11;
        if (r11 != 0) goto L_0x0177;
    L_0x016c:
        r5 = r9.j;
        r11 = 0;
        r5 = r5.valueAt(r11);
        r5 = (defpackage.noy) r5;
        goto L_0x00f2;
    L_0x0177:
        r12 = r11.e;
        if (r12 == 0) goto L_0x017e;
    L_0x017b:
        r5 = r11;
        r11 = 0;
        goto L_0x01a1;
    L_0x017e:
        r12 = r11.c;
        r13 = r5.f;
        r13 = r13.a;
        r12 = r12.get(r13);
        r12 = (defpackage.nox) r12;
        r13 = r5.g();
        r12 = r12.c(r13);
        if (r12 == 0) goto L_0x017b;
    L_0x0194:
        r11 = r9.j;
        r5 = r5.h;
        r5 = r5 + r4;
        r5 = r11.get(r5);
        r5 = (defpackage.noy) r5;
        goto L_0x00f2;
    L_0x01a1:
        r12 = r5.c;
        r1 = r1.a;
        r1 = r12.get(r1);
        r12 = r1;
        r12 = (defpackage.nox) r12;
        r1 = r12.c;
        r13 = r12.e;
        if (r13 != 0) goto L_0x01b5;
    L_0x01b2:
        r14 = r1.f;
        goto L_0x01b6;
    L_0x01b5:
        r14 = 0;
    L_0x01b6:
        r0 = r12.d;
        if (r0 != 0) goto L_0x01bf;
    L_0x01ba:
        r0 = r1.c();
        goto L_0x01c0;
    L_0x01bf:
        r0 = 0;
    L_0x01c0:
        if (r14 == 0) goto L_0x01c3;
    L_0x01c2:
        goto L_0x0213;
    L_0x01c3:
        if (r0 != 0) goto L_0x0213;
    L_0x01c5:
        r0 = r24.isEmpty();
        if (r0 != 0) goto L_0x01e5;
    L_0x01cb:
        if (r11 != 0) goto L_0x01dc;
    L_0x01cd:
        r0 = r10.a;
        r0 = r0 + -1;
        r0 = r6.get(r0);
        r0 = (defpackage.nos) r0;
        r0 = r0.g();
        goto L_0x01f3;
    L_0x01dc:
        r0 = r12.d;
        r0 = r0.a();
        r1 = r12.h;
        goto L_0x01f2;
    L_0x01e5:
        r0 = r12.d;
        r1 = r12.f;
        r7 = r7 - r1;
        r1 = r12.g;
        r0 = r0.a(r7, r1);
        r1 = r12.h;
    L_0x01f2:
        r0 = r0 + r1;
    L_0x01f3:
        r6 = r0;
        r3 = r9.d;
        r7 = r9.q;
        r0 = r9.f;
        r8 = r0.b;
        if (r13 == 0) goto L_0x0200;
    L_0x01fe:
        r11 = 1;
        goto L_0x0201;
    L_0x0200:
        r11 = 0;
    L_0x0201:
        r0 = r23;
        r1 = r5;
        r2 = r12;
        r4 = r13;
        r5 = r7;
        r7 = r8;
        r8 = r11;
        r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8);
        r1 = 0;
        r9.v = r1;
        r10.b = r0;
        return;
    L_0x0213:
        r6 = r12.b;
        r12 = r9.d;
        r5 = r5.a;
        r7 = r9.f;
        r7 = r7.b;
        if (r14 == 0) goto L_0x02a0;
    L_0x021f:
        r8 = r1.d;
        r11 = r14.b(r8);
        if (r0 == 0) goto L_0x0294;
    L_0x0227:
        r8 = r0.b(r8);
        r8 = r11.equals(r8);
        if (r8 == 0) goto L_0x0294;
    L_0x0231:
        r24 = r5;
        r4 = r14.b;
        r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r13 == 0) goto L_0x0263;
    L_0x0239:
        r8 = r14.a;
        r17 = r8 + r4;
        r2 = r0.a;
        r13 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1));
        if (r13 != 0) goto L_0x0263;
    L_0x0243:
        r2 = new npj;
        r3 = r6;
        r15 = r7;
        r6 = r0.b;
        r16 = -1;
        r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1));
        if (r0 == 0) goto L_0x0253;
    L_0x024f:
        r4 = r4 + r6;
        r21 = r4;
        goto L_0x0255;
    L_0x0253:
        r21 = -1;
    L_0x0255:
        r17 = r2;
        r18 = r11;
        r19 = r8;
        r17.<init>(r18, r19, r21);
        r16 = r2;
        r26 = r3;
        goto L_0x029b;
    L_0x0263:
        r3 = r6;
        r15 = r7;
        r6 = r0.b;
        r8 = -1;
        r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r2 == 0) goto L_0x0291;
    L_0x026d:
        r8 = r0.a;
        r17 = r8 + r6;
        r26 = r3;
        r2 = r14.a;
        r0 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0299;
    L_0x0279:
        r0 = new npj;
        r2 = -1;
        r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r13 == 0) goto L_0x0283;
    L_0x0281:
        r2 = r6 + r4;
    L_0x0283:
        r21 = r2;
        r17 = r0;
        r18 = r11;
        r19 = r8;
        r17.<init>(r18, r19, r21);
        r16 = r0;
        goto L_0x029b;
    L_0x0291:
        r26 = r3;
        goto L_0x0299;
    L_0x0294:
        r24 = r5;
        r26 = r6;
        r15 = r7;
    L_0x0299:
        r16 = 0;
    L_0x029b:
        if (r16 == 0) goto L_0x02a6;
    L_0x029d:
        r14 = r16;
        goto L_0x02a6;
    L_0x02a0:
        r24 = r5;
        r26 = r6;
        r15 = r7;
        r14 = r0;
    L_0x02a6:
        r0 = new nvq;
        r2 = r1.d;
        r3 = r14.a(r2);
        r4 = r14.a;
        r6 = r14.b;
        r8 = r1.e;
        r2 = r0;
        r2.<init>(r3, r4, r6, r8);
        r2 = new nop;
        r1 = r1.b;
        r11 = r2;
        r13 = r0;
        r14 = r15;
        r15 = r1;
        r16 = r26;
        r17 = r24;
        r11.<init>(r12, r13, r14, r15, r16, r17);
        r1 = 1;
        r0 = r23;
        r0.v = r1;
        r10.b = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nou.a(java.util.List, long, nnz):void");
    }

    public void a(nny nny) {
        if (nny instanceof nop) {
            nop nop = (nop) nny;
            String str = nop.f.a;
            noy noy = (noy) this.j.get(nop.h);
            if (noy != null) {
                nox nox = (nox) noy.c.get(str);
                nmx nmx = nop.a;
                if (nmx != null) {
                    nox.e = nmx;
                }
                if (nox.d == null) {
                    nrq nrq = nop.c;
                    if (nrq != null) {
                        nqy nqy = (nqy) nrq;
                        nop.g.a.toString();
                        nox.d = new npb(nqy);
                    }
                }
                if (noy.d == null) {
                    npv npv = nop.b;
                    if (npv != null) {
                        noy.d = npv;
                    }
                }
            }
        }
    }

    public final void a(List list) {
        if (this.q.a()) {
            this.e.b();
        }
        nwn nwn = this.g;
        if (nwn != null) {
            int i = nwn.e - 1;
            nwn.e = i;
            if (i == 0) {
                nvy nvy = nwn.f;
                if (nvy != null) {
                    nvy.b();
                    nwn.f = null;
                }
            }
        }
        this.j.clear();
        this.f.c = null;
        this.s = null;
        this.w = null;
        this.q = null;
    }

    public final void a(npf npf, int i, int[] iArr) {
        npf npf2 = npf;
        int[] iArr2 = iArr;
        String str = "DashChunkSource";
        if (this.e == null) {
            Log.w(str, "Skipping adaptive track (missing format evaluator)");
            return;
        }
        int i2 = 0;
        npe npe = (npe) npf2.a(0).b.get(i);
        nom[] nomArr = new nom[iArr2.length];
        nom nom = null;
        int i3 = 0;
        int i4 = 0;
        while (i2 < nomArr.length) {
            nom nom2 = ((npm) npe.b.get(iArr2[i2])).b;
            if (nom == null || nom2.e > i4) {
                nom = nom2;
            }
            i3 = Math.max(i3, nom2.d);
            i4 = Math.max(i4, nom2.e);
            nomArr[i2] = nom2;
            i2++;
        }
        Arrays.sort(nomArr, new nol());
        long j = !this.n ? npf2.b * 1000 : -1;
        String a = nou.a(nom);
        if (a == null) {
            Log.w(str, "Skipped adaptive track (unknown media mime type)");
            return;
        }
        nmx a2 = nou.a(npe.a, nom, a, j);
        if (a2 == null) {
            Log.w(str, "Skipped adaptive track (unknown media format)");
        } else {
            this.i.add(new nov(new nmx(null, a2.b, -1, -1, a2.e, -1, -1, -1, -1.0f, -1, -1, null, Long.MAX_VALUE, null, true, a2.j, a2.k, -1, -1, -1, null, a2.n, a2.p), i, nomArr, i3, i4));
        }
    }

    public final void a(npf npf, int i, int i2) {
        npe npe = (npe) npf.a(0).b.get(i);
        nom nom = ((npm) npe.b.get(i2)).b;
        String a = nou.a(nom);
        String str = "DashChunkSource";
        String str2 = "Skipped track ";
        String str3;
        StringBuilder stringBuilder;
        if (a == null) {
            str3 = nom.a;
            stringBuilder = new StringBuilder(String.valueOf(str3).length() + 40);
            stringBuilder.append(str2);
            stringBuilder.append(str3);
            stringBuilder.append(" (unknown media mime type)");
            Log.w(str, stringBuilder.toString());
            return;
        }
        nmx a2 = nou.a(npe.a, nom, a, !npf.c ? npf.b * 1000 : -1);
        if (a2 == null) {
            str3 = nom.a;
            stringBuilder = new StringBuilder(String.valueOf(str3).length() + 37);
            stringBuilder.append(str2);
            stringBuilder.append(str3);
            stringBuilder.append(" (unknown media format)");
            Log.w(str, stringBuilder.toString());
            return;
        }
        this.i.add(new nov(a2, i, nom));
    }

    private static nmx a(int i, nom nom, String str, long j) {
        if (i == 0) {
            return nmx.a(nom.a, str, nom.c, j, nom.d, nom.e);
        } else if (i == 1) {
            return nmx.a(nom.a, str, nom.c, -1, j, nom.g, nom.h, null, nom.j);
        } else if (i != 2) {
            return null;
        } else {
            return nmx.a(nom.a, str, nom.c, j, nom.j);
        }
    }

    private static String a(nom nom) {
        String str = nom.b;
        int i = 0;
        String str2 = ",";
        String str3;
        String[] split;
        int length;
        if (nwt.a(str)) {
            str3 = nom.i;
            str = "audio/x-unknown";
            if (str3 != null) {
                split = str3.split(str2);
                length = split.length;
                while (i < length) {
                    str2 = split[i].trim();
                    if (!str2.startsWith("mp4a")) {
                        if (!str2.startsWith("ac-3") && !str2.startsWith("dac3")) {
                            if (!str2.startsWith("ec-3") && !str2.startsWith("dec3")) {
                                if (!str2.startsWith("dtsc")) {
                                    if (!str2.startsWith("dtsh") && !str2.startsWith("dtsl")) {
                                        if (!str2.startsWith("dtse")) {
                                            if (!str2.startsWith("opus")) {
                                                if (str2.startsWith("vorbis")) {
                                                    str = "audio/vorbis";
                                                    break;
                                                }
                                                i++;
                                            } else {
                                                str = "audio/opus";
                                                break;
                                            }
                                        }
                                        str = "audio/vnd.dts.hd;profile=lbr";
                                        break;
                                    }
                                    str = "audio/vnd.dts.hd";
                                    break;
                                }
                                str = "audio/vnd.dts";
                                break;
                            }
                            str = "audio/eac3";
                            break;
                        }
                        str = "audio/ac3";
                        break;
                    }
                    str = "audio/mp4a-latm";
                    break;
                }
            }
            return str;
        } else if (nwt.b(str)) {
            str3 = nom.i;
            str = "video/x-unknown";
            if (str3 != null) {
                split = str3.split(str2);
                length = split.length;
                while (i < length) {
                    str2 = split[i].trim();
                    if (!str2.startsWith("avc1") && !str2.startsWith("avc3")) {
                        if (!str2.startsWith("hev1") && !str2.startsWith("hvc1")) {
                            if (!str2.startsWith("vp9")) {
                                if (str2.startsWith("vp8")) {
                                    str = "video/x-vnd.on2.vp8";
                                    break;
                                }
                                i++;
                            } else {
                                str = "video/x-vnd.on2.vp9";
                                break;
                            }
                        }
                        str = "video/hevc";
                        break;
                    }
                    str = "video/avc";
                    break;
                }
            }
            return str;
        } else if (nou.b(str)) {
            return str;
        } else {
            if ("application/mp4".equals(str)) {
                if ("stpp".equals(nom.i)) {
                    return "application/ttml+xml";
                }
                if ("wvtt".equals(nom.i)) {
                    return "application/x-mp4vtt";
                }
            }
            return null;
        }
    }

    protected static boolean d_(String str) {
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm");
    }

    static boolean b(String str) {
        return "text/vtt".equals(str) || "application/ttml+xml".equals(str);
    }

    /* Access modifiers changed, original: protected */
    public nny a(noy noy, nox nox, nvo nvo, nmx nmx, nov nov, int i, int i2, boolean z) {
        noy noy2 = noy;
        nox nox2 = nox;
        nov nov2 = nov;
        int i3 = i;
        npm npm = nox2.c;
        nom nom = npm.b;
        long a = nox2.a(i3);
        long b = nox2.b(i3);
        npj d = nox2.d(i3);
        long j = b;
        long j2 = a;
        nvq nvq = new nvq(d.a(npm.d), d.a, d.b, npm.e);
        long j3 = noy2.b - npm.c;
        if (nou.b(nom.b)) {
            return new nor(nvo, nvq, nom, j2, j, i, nov2.a, noy2.a);
        }
        return new noj(nvo, nvq, i2, nom, j2, j, i, j3, nox2.b, nmx, nov2.b, nov2.c, noy2.d, z, noy2.a);
    }

    /* Access modifiers changed, original: protected */
    public nrc c(String str) {
        if (nou.d_(str)) {
            return new nuz((byte) 0);
        }
        return new nsr();
    }

    private final void a(npf npf) {
        npf npf2 = npf;
        npk a = npf2.a(0);
        while (this.j.size() > 0 && ((noy) this.j.valueAt(0)).b < a.a * 1000) {
            this.j.remove(((noy) this.j.valueAt(0)).a);
        }
        if (this.j.size() <= npf.b()) {
            try {
                Object nnh;
                int size = this.j.size();
                if (size > 0) {
                    ((noy) this.j.valueAt(0)).a(npf2, 0, this.q);
                    if (size > 1) {
                        size--;
                        ((noy) this.j.valueAt(size)).a(npf2, size, this.q);
                    }
                }
                for (int size2 = this.j.size(); size2 < npf.b(); size2++) {
                    this.j.put(this.r, new noy(this, this.r, npf, size2, this.q));
                    this.r++;
                }
                long currentTimeMillis = System.currentTimeMillis() * 1000;
                noy noy = (noy) this.j.valueAt(0);
                SparseArray sparseArray = this.j;
                noy noy2 = (noy) sparseArray.valueAt(sparseArray.size() - 1);
                if (this.o.c && !noy2.f) {
                    long j = noy.g;
                    long a2 = !noy2.e ? noy2.a() : Long.MAX_VALUE;
                    long a3 = this.k.a();
                    npf npf3 = this.o;
                    long j2 = a2;
                    currentTimeMillis = (a3 * 1000) - (currentTimeMillis - (npf3.a * 1000));
                    a3 = npf3.e;
                    nnh = new nnh(j, j2, currentTimeMillis, a3 != -1 ? a3 * 1000 : -1, this.k);
                } else {
                    nnh = new nnk(noy.g, noy2.a());
                }
                nni nni = this.s;
                if (nni == null || !nni.equals(nnh)) {
                    this.s = nnh;
                    nni nni2 = this.s;
                    Handler handler = this.c;
                    if (!(handler == null || this.a == null)) {
                        handler.post(new not(this, nni2));
                    }
                }
                this.o = npf2;
            } catch (nli e) {
                this.w = e;
            }
        }
    }
}

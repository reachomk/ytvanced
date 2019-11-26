package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cwo */
public final class cwo {
    public static final Handler b = new cww();
    private static volatile Looper i;
    public volatile boolean a = false;
    public final boolean c;
    public cwf d;
    public final cwu e;
    public cwh f;
    public cwh g;
    private final cxd h = new cwi();
    private final cwj j;
    private final cvv k;
    private final cwd l;
    private final String m;
    private final Map n = new HashMap();
    private final boolean o;
    private final cwv p;
    private final List q;
    private final com r = new com();
    private final coo s = new coo();

    private final synchronized void c(cwh cwh) {
        List list = cwh.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                c((cwh) list.get(i));
            }
        }
    }

    public static cwr a(cwj cwj, cwy cwy) {
        return new cwr(cwj, cwy);
    }

    public final void a(cwh cwh) {
        cwj cwj = cwh.c;
        if (!cwh.b()) {
            List list = cwh.h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a((cwh) list.get(i));
            }
        }
    }

    public final void b(cwh cwh) {
        cwj cwj = cwh.c;
        if (!cwh.b()) {
            List list = cwh.h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                b((cwh) list.get(i));
            }
        }
    }

    public final void a(cwh cwh, boolean z, boolean z2, long j, cwc cwc) {
        cwh cwh2 = cwh;
        if (cwh.b()) {
            return;
        }
        this.n.get(cwh2.i);
        cwj cwj = cwh2.c;
        List list = cwh2.h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((cwh) list.get(i), z, z2, j, cwc);
        }
    }

    public final void a(cwh cwh, int i, int i2, int i3, int i4, int i5) {
        cwh cwh2 = cwh;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        cwt cwt = (cwt) this.n.get(cwh2.i);
        int i10 = cwh2.g;
        int i11;
        if (cwt == null) {
            i11 = i5;
            cwt = new cwt();
            this.n.put(cwh2.i, cwt);
        } else if (cwt.a != i6 || cwt.b != i7 || cwt.c != i8 || cwt.d != i9 || cwt.e != i10) {
            i11 = i5;
        } else if (i5 != 1) {
            return;
        }
        cwt.b = i7;
        cwt.a = i6;
        cwt.c = i8;
        cwt.d = i9;
        cwt.e = i10;
        cwj cwj = cwh2.c;
        if (!cwh.b()) {
            List list = cwh2.h;
            int size = list.size();
            int i12 = 0;
            int i13 = 0;
            while (i13 < size) {
                cwh cwh3 = (cwh) list.get(i13);
                i10 = i6 - i12;
                int i14 = i7 - i12;
                int i15 = i8 - i12;
                int i16 = i9 - i12;
                if (i10 < cwh3.g && i14 >= 0) {
                    i10 = Math.max(i10, 0);
                    i14 = Math.min(i14, cwh3.g - 1);
                } else {
                    i10 = -1;
                    i14 = -1;
                }
                if (i15 < cwh3.g && i16 >= 0) {
                    i15 = Math.max(i15, 0);
                    i16 = Math.min(i16, cwh3.g - 1);
                } else {
                    i15 = -1;
                    i16 = -1;
                }
                int i17 = cwh3.g + i12;
                int i18 = i13;
                a(cwh3, i10, i14, i15, i16, i5);
                i13 = i18 + 1;
                i12 = i17;
            }
        }
    }

    public static cwh a(cwh cwh, boolean z) {
        return cwh != null ? cwh.a(z) : null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0230 A:{Catch:{ all -> 0x0385, all -> 0x037e, all -> 0x03a2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e3 A:{Catch:{ all -> 0x0385, all -> 0x037e, all -> 0x03a2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01df A:{Catch:{ all -> 0x0385, all -> 0x037e, all -> 0x03a2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01de A:{Catch:{ all -> 0x0385, all -> 0x037e, all -> 0x03a2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01c8 A:{Catch:{ all -> 0x0385, all -> 0x037e, all -> 0x03a2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01de A:{Catch:{ all -> 0x0385, all -> 0x037e, all -> 0x03a2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01df A:{Catch:{ all -> 0x0385, all -> 0x037e, all -> 0x03a2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01c8 A:{Catch:{ all -> 0x0385, all -> 0x037e, all -> 0x03a2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01df A:{Catch:{ all -> 0x0385, all -> 0x037e, all -> 0x03a2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01de A:{Catch:{ all -> 0x0385, all -> 0x037e, all -> 0x03a2 }} */
    public final void a(int r29, java.lang.Throwable r30) {
        /*
        r28 = this;
        r1 = r28;
        r2 = r1.m;
        r3 = defpackage.cno.d();
        if (r3 != 0) goto L_0x000b;
    L_0x000a:
        goto L_0x005a;
    L_0x000b:
        if (r2 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0022;
    L_0x000e:
        r0 = "extra:";
        r4 = r2.length();
        if (r4 != 0) goto L_0x001c;
    L_0x0016:
        r4 = new java.lang.String;
        r4.<init>(r0);
        goto L_0x001f;
    L_0x001c:
        r0.concat(r2);
    L_0x001f:
        defpackage.cno.a();
    L_0x0022:
        monitor-enter(r28);
        r0 = r1.g;	 Catch:{ all -> 0x03ae }
        if (r0 != 0) goto L_0x002a;
    L_0x0027:
        r0 = "<null>";
        goto L_0x002c;
    L_0x002a:
        r0 = r0.e;	 Catch:{ all -> 0x03ae }
    L_0x002c:
        monitor-exit(r28);	 Catch:{ all -> 0x03ae }
        r4 = defpackage.cxa.a(r29);
        r5 = java.lang.String.valueOf(r0);
        r5 = r5.length();
        r6 = java.lang.String.valueOf(r4);
        r6 = r6.length();
        r7 = new java.lang.StringBuilder;
        r5 = r5 + 19;
        r5 = r5 + r6;
        r7.<init>(r5);
        r7.append(r0);
        r0 = "_applyNewChangeSet_";
        r7.append(r0);
        r7.append(r4);
        r7.toString();
        defpackage.cno.a();
    L_0x005a:
        monitor-enter(r28);	 Catch:{ all -> 0x03a2 }
        r0 = r1.a;	 Catch:{ all -> 0x039f }
        r0 = r1.f;	 Catch:{ all -> 0x039f }
        r4 = 1;
        r0 = defpackage.cwo.a(r0, r4);	 Catch:{ all -> 0x039f }
        r5 = r1.g;	 Catch:{ all -> 0x039f }
        r6 = 0;
        r5 = defpackage.cwo.a(r5, r6);	 Catch:{ all -> 0x039f }
        r7 = r1.j;	 Catch:{ all -> 0x039f }
        r7 = r7.d;	 Catch:{ all -> 0x039f }
        r8 = r1.p;	 Catch:{ all -> 0x039f }
        r8 = r8.a();	 Catch:{ all -> 0x039f }
        monitor-exit(r28);	 Catch:{ all -> 0x039f }
        r9 = r1.j;	 Catch:{ all -> 0x03a2 }
        r9 = defpackage.cxa.a(r9, r0, r5);	 Catch:{ all -> 0x03a2 }
        if (r7 == 0) goto L_0x0083;
    L_0x007e:
        if (r9 == 0) goto L_0x0083;
    L_0x0080:
        r7.g();	 Catch:{ all -> 0x03a2 }
    L_0x0083:
        if (r9 == 0) goto L_0x0094;
    L_0x0085:
        r9.a();	 Catch:{ all -> 0x03a2 }
        defpackage.cxa.a(r29);	 Catch:{ all -> 0x03a2 }
        r9.a();	 Catch:{ all -> 0x03a2 }
        defpackage.cro.a();	 Catch:{ all -> 0x03a2 }
        r9.c();	 Catch:{ all -> 0x03a2 }
    L_0x0094:
        r10 = r1.s;	 Catch:{ all -> 0x03a2 }
        r10.a();	 Catch:{ all -> 0x03a2 }
    L_0x0099:
        if (r5 == 0) goto L_0x038d;
    L_0x009b:
        if (r3 == 0) goto L_0x00a0;
    L_0x009d:
        defpackage.cno.a();	 Catch:{ all -> 0x03a2 }
    L_0x00a0:
        r10 = r1.j;	 Catch:{ all -> 0x03a2 }
        r14 = r8.a;	 Catch:{ all -> 0x03a2 }
        r15 = r1.h;	 Catch:{ all -> 0x03a2 }
        r13 = r1.m;	 Catch:{ all -> 0x03a2 }
        r11 = r5.j;	 Catch:{ all -> 0x03a2 }
        r5.i = r11;	 Catch:{ all -> 0x03a2 }
        r12 = r10.d;	 Catch:{ all -> 0x03a2 }
        r17 = defpackage.cxa.a(r10, r0, r5);	 Catch:{ all -> 0x03a2 }
        r20 = defpackage.cno.d();	 Catch:{ all -> 0x03a2 }
        if (r20 == 0) goto L_0x00bb;
    L_0x00b8:
        defpackage.cno.a();	 Catch:{ all -> 0x03a2 }
    L_0x00bb:
        r11 = r10;
        r18 = r12;
        r12 = r0;
        r19 = r13;
        r13 = r5;
        r21 = r15;
        r16 = r19;
        defpackage.cwo.a(r11, r12, r13, r14, r15, r16);	 Catch:{ all -> 0x0385 }
        if (r20 == 0) goto L_0x00ce;
    L_0x00cb:
        defpackage.cno.c();	 Catch:{ all -> 0x03a2 }
    L_0x00ce:
        if (r18 == 0) goto L_0x00d5;
    L_0x00d0:
        if (r17 == 0) goto L_0x00d5;
    L_0x00d2:
        r18.e();	 Catch:{ all -> 0x03a2 }
    L_0x00d5:
        if (r20 == 0) goto L_0x00da;
    L_0x00d7:
        defpackage.cno.a();	 Catch:{ all -> 0x03a2 }
    L_0x00da:
        r22 = "";
        r23 = "";
        r15 = new cvz;	 Catch:{ all -> 0x037e }
        r15.<init>();	 Catch:{ all -> 0x037e }
        r14 = r10.d;	 Catch:{ all -> 0x037e }
        r24 = defpackage.cxa.a(r10, r0, r5);	 Catch:{ all -> 0x037e }
        if (r0 != 0) goto L_0x00f1;
    L_0x00eb:
        r25 = r10;
        r26 = r14;
        r6 = r15;
        goto L_0x013b;
    L_0x00f1:
        r11 = r0.e;	 Catch:{ all -> 0x037e }
        r12 = r5.e;	 Catch:{ all -> 0x037e }
        r11 = r11.equals(r12);	 Catch:{ all -> 0x037e }
        if (r11 != 0) goto L_0x00eb;
    L_0x00fb:
        r13 = r15.b;	 Catch:{ all -> 0x037e }
        r11 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x037e }
        r18 = r11.getName();	 Catch:{ all -> 0x037e }
        r12 = 0;
        r25 = r10;
        r11 = r0;
        r26 = r14;
        r14 = r21;
        r6 = r15;
        r15 = r19;
        r16 = r22;
        r17 = r23;
        r10 = defpackage.cvz.a(r10, r11, r12, r13, r14, r15, r16, r17, r18);	 Catch:{ all -> 0x037e }
        r14 = r6.b;	 Catch:{ all -> 0x037e }
        r11 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x037e }
        r27 = r11.getName();	 Catch:{ all -> 0x037e }
        r12 = 0;
        r11 = r25;
        r13 = r5;
        r15 = r21;
        r16 = r19;
        r17 = r22;
        r18 = r23;
        r19 = r27;
        r11 = defpackage.cvz.a(r11, r12, r13, r14, r15, r16, r17, r18, r19);	 Catch:{ all -> 0x037e }
        r10 = defpackage.cvx.a(r10, r11);	 Catch:{ all -> 0x037e }
        r6.a = r10;	 Catch:{ all -> 0x037e }
        goto L_0x0159;
    L_0x013b:
        r14 = r6.b;	 Catch:{ all -> 0x037e }
        r10 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x037e }
        r10 = r10.getName();	 Catch:{ all -> 0x037e }
        r11 = r25;
        r12 = r0;
        r13 = r5;
        r15 = r21;
        r16 = r19;
        r17 = r22;
        r18 = r23;
        r19 = r10;
        r10 = defpackage.cvz.a(r11, r12, r13, r14, r15, r16, r17, r18, r19);	 Catch:{ all -> 0x037e }
        r6.a = r10;	 Catch:{ all -> 0x037e }
    L_0x0159:
        if (r26 != 0) goto L_0x015c;
    L_0x015b:
        goto L_0x0194;
    L_0x015c:
        if (r24 == 0) goto L_0x0194;
    L_0x015e:
        if (r0 == 0) goto L_0x0162;
    L_0x0160:
        r10 = r0.g;	 Catch:{ all -> 0x037e }
    L_0x0162:
        r24.b();	 Catch:{ all -> 0x037e }
        r10 = r6.a;	 Catch:{ all -> 0x037e }
        r10.a();	 Catch:{ all -> 0x037e }
        r24.b();	 Catch:{ all -> 0x037e }
        r10 = r6.a;	 Catch:{ all -> 0x037e }
        r24.b();	 Catch:{ all -> 0x037e }
        r10 = r6.a;	 Catch:{ all -> 0x037e }
        r10 = r10.c;	 Catch:{ all -> 0x037e }
        if (r10 != 0) goto L_0x0179;
    L_0x0178:
        goto L_0x0191;
    L_0x0179:
        r24.b();	 Catch:{ all -> 0x037e }
        r24.b();	 Catch:{ all -> 0x037e }
        r24.b();	 Catch:{ all -> 0x037e }
        r24.b();	 Catch:{ all -> 0x037e }
        r24.b();	 Catch:{ all -> 0x037e }
        r24.b();	 Catch:{ all -> 0x037e }
        r24.b();	 Catch:{ all -> 0x037e }
        r24.b();	 Catch:{ all -> 0x037e }
    L_0x0191:
        r26.e();	 Catch:{ all -> 0x037e }
    L_0x0194:
        r10 = "Changet count is below 0! Current section: ";
        if (r0 == 0) goto L_0x019f;
    L_0x0198:
        r11 = r0.g;	 Catch:{ all -> 0x037e }
        if (r11 >= 0) goto L_0x019f;
    L_0x019c:
        r11 = 0;
        goto L_0x0286;
    L_0x019f:
        r11 = r5.g;	 Catch:{ all -> 0x037e }
        if (r11 < 0) goto L_0x019c;
    L_0x01a3:
        if (r20 == 0) goto L_0x01a8;
    L_0x01a5:
        defpackage.cno.c();	 Catch:{ all -> 0x03a2 }
    L_0x01a8:
        if (r3 != 0) goto L_0x01ab;
    L_0x01aa:
        goto L_0x01ae;
    L_0x01ab:
        defpackage.cno.c();	 Catch:{ all -> 0x03a2 }
    L_0x01ae:
        monitor-enter(r28);	 Catch:{ all -> 0x03a2 }
        r10 = r1.f;	 Catch:{ all -> 0x0283 }
        if (r0 == 0) goto L_0x01bd;
    L_0x01b3:
        if (r10 != 0) goto L_0x01b6;
    L_0x01b5:
        goto L_0x01bd;
    L_0x01b6:
        r11 = r0.f;	 Catch:{ all -> 0x0283 }
        r12 = r10.f;	 Catch:{ all -> 0x0283 }
        if (r11 != r12) goto L_0x01bd;
    L_0x01bc:
        goto L_0x01c1;
    L_0x01bd:
        if (r0 != 0) goto L_0x01c3;
    L_0x01bf:
        if (r10 != 0) goto L_0x01c3;
    L_0x01c1:
        r0 = 1;
        goto L_0x01c4;
    L_0x01c3:
        r0 = 0;
    L_0x01c4:
        r10 = r1.g;	 Catch:{ all -> 0x0283 }
        if (r10 == 0) goto L_0x01d1;
    L_0x01c8:
        r11 = r5.f;	 Catch:{ all -> 0x0283 }
        r10 = r10.f;	 Catch:{ all -> 0x0283 }
        if (r11 == r10) goto L_0x01cf;
    L_0x01ce:
        goto L_0x01d1;
    L_0x01cf:
        r10 = 1;
        goto L_0x01d2;
    L_0x01d1:
        r10 = 0;
    L_0x01d2:
        if (r0 != 0) goto L_0x01d6;
    L_0x01d4:
        r0 = 0;
        goto L_0x01e0;
    L_0x01d6:
        if (r10 == 0) goto L_0x01d4;
    L_0x01d8:
        r0 = r1.a(r8);	 Catch:{ all -> 0x0283 }
        if (r0 != 0) goto L_0x01df;
    L_0x01de:
        goto L_0x01d4;
    L_0x01df:
        r0 = 1;
    L_0x01e0:
        r10 = 0;
        if (r0 == 0) goto L_0x0230;
    L_0x01e3:
        r11 = r1.f;	 Catch:{ all -> 0x0283 }
        r1.f = r5;	 Catch:{ all -> 0x0283 }
        r1.g = r10;	 Catch:{ all -> 0x0283 }
        r10 = r1.p;	 Catch:{ all -> 0x0283 }
        r12 = r8.a;	 Catch:{ all -> 0x0283 }
        r12 = r12.isEmpty();	 Catch:{ all -> 0x0283 }
        if (r12 != 0) goto L_0x0220;
    L_0x01f3:
        r12 = r8.a;	 Catch:{ all -> 0x0283 }
        r12 = r12.keySet();	 Catch:{ all -> 0x0283 }
        r12 = r12.iterator();	 Catch:{ all -> 0x0283 }
    L_0x01fd:
        r13 = r12.hasNext();	 Catch:{ all -> 0x0283 }
        if (r13 == 0) goto L_0x0220;
    L_0x0203:
        r13 = r12.next();	 Catch:{ all -> 0x0283 }
        r13 = (java.lang.String) r13;	 Catch:{ all -> 0x0283 }
        r14 = r10.a;	 Catch:{ all -> 0x0283 }
        r14 = r14.containsKey(r13);	 Catch:{ all -> 0x0283 }
        if (r14 == 0) goto L_0x0220;
    L_0x0211:
        r14 = r10.a;	 Catch:{ all -> 0x0283 }
        r15 = r8.a;	 Catch:{ all -> 0x0283 }
        defpackage.cwv.a(r14, r15, r13);	 Catch:{ all -> 0x0283 }
        r14 = r10.b;	 Catch:{ all -> 0x0283 }
        r15 = r8.b;	 Catch:{ all -> 0x0283 }
        defpackage.cwv.a(r14, r15, r13);	 Catch:{ all -> 0x0283 }
        goto L_0x01fd;
    L_0x0220:
        r10 = r1.q;	 Catch:{ all -> 0x0283 }
        r12 = r6.a;	 Catch:{ all -> 0x0283 }
        r10.add(r12);	 Catch:{ all -> 0x0283 }
        if (r11 == 0) goto L_0x022c;
    L_0x0229:
        r1.e(r11);	 Catch:{ all -> 0x0283 }
    L_0x022c:
        r1.c(r5);	 Catch:{ all -> 0x0283 }
        goto L_0x0231;
    L_0x0230:
        r5 = r10;
    L_0x0231:
        monitor-exit(r28);	 Catch:{ all -> 0x0283 }
        if (r0 != 0) goto L_0x0237;
    L_0x0234:
        r0 = r30;
        goto L_0x025f;
    L_0x0237:
        if (r5 == 0) goto L_0x023c;
    L_0x0239:
        r1.d(r5);	 Catch:{ all -> 0x03a2 }
    L_0x023c:
        r0 = r6.b;	 Catch:{ all -> 0x03a2 }
        r5 = r0.size();	 Catch:{ all -> 0x03a2 }
        r6 = 0;
    L_0x0243:
        if (r6 >= r5) goto L_0x0255;
    L_0x0245:
        r10 = r0.get(r6);	 Catch:{ all -> 0x03a2 }
        r10 = (defpackage.cwh) r10;	 Catch:{ all -> 0x03a2 }
        r11 = r1.n;	 Catch:{ all -> 0x03a2 }
        r10 = r10.i;	 Catch:{ all -> 0x03a2 }
        r11.remove(r10);	 Catch:{ all -> 0x03a2 }
        r6 = r6 + 1;
        goto L_0x0243;
    L_0x0255:
        r0 = r1.r;	 Catch:{ all -> 0x03a2 }
        r0.a();	 Catch:{ all -> 0x03a2 }
        r0 = r30;
        r1.a(r0);	 Catch:{ all -> 0x03a2 }
    L_0x025f:
        monitor-enter(r28);	 Catch:{ all -> 0x03a2 }
        defpackage.cwz.a(r8);	 Catch:{ all -> 0x0280 }
        r5 = r1.a;	 Catch:{ all -> 0x0280 }
        r5 = r1.f;	 Catch:{ all -> 0x0280 }
        r5 = defpackage.cwo.a(r5, r4);	 Catch:{ all -> 0x0280 }
        r6 = r1.g;	 Catch:{ all -> 0x0280 }
        r11 = 0;
        r6 = defpackage.cwo.a(r6, r11);	 Catch:{ all -> 0x0280 }
        if (r6 == 0) goto L_0x027a;
    L_0x0274:
        r8 = r1.p;	 Catch:{ all -> 0x0280 }
        r8 = r8.a();	 Catch:{ all -> 0x0280 }
    L_0x027a:
        monitor-exit(r28);	 Catch:{ all -> 0x0280 }
        r0 = r5;
        r5 = r6;
        r6 = 0;
        goto L_0x0099;
    L_0x0280:
        r0 = move-exception;
        monitor-exit(r28);	 Catch:{ all -> 0x0280 }
        throw r0;	 Catch:{ all -> 0x03a2 }
    L_0x0283:
        r0 = move-exception;
        monitor-exit(r28);	 Catch:{ all -> 0x0283 }
        throw r0;	 Catch:{ all -> 0x03a2 }
    L_0x0286:
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x037e }
        r4.<init>();	 Catch:{ all -> 0x037e }
        r4.append(r10);	 Catch:{ all -> 0x037e }
        if (r0 != 0) goto L_0x0296;
    L_0x0290:
        r0 = "null; ";
        r4.append(r0);	 Catch:{ all -> 0x037e }
        goto L_0x02e1;
    L_0x0296:
        r7 = r0.e;	 Catch:{ all -> 0x037e }
        r8 = r0.i;	 Catch:{ all -> 0x037e }
        r9 = r0.g;	 Catch:{ all -> 0x037e }
        r0 = r0.h;	 Catch:{ all -> 0x037e }
        r0 = r0.size();	 Catch:{ all -> 0x037e }
        r10 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x037e }
        r10 = r10.length();	 Catch:{ all -> 0x037e }
        r10 = r10 + 54;
        r12 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x037e }
        r12 = r12.length();	 Catch:{ all -> 0x037e }
        r10 = r10 + r12;
        r12 = new java.lang.StringBuilder;	 Catch:{ all -> 0x037e }
        r12.<init>(r10);	 Catch:{ all -> 0x037e }
        r12.append(r7);	 Catch:{ all -> 0x037e }
        r7 = " , key=";
        r12.append(r7);	 Catch:{ all -> 0x037e }
        r12.append(r8);	 Catch:{ all -> 0x037e }
        r7 = ", count=";
        r12.append(r7);	 Catch:{ all -> 0x037e }
        r12.append(r9);	 Catch:{ all -> 0x037e }
        r7 = ", childrenSize=";
        r12.append(r7);	 Catch:{ all -> 0x037e }
        r12.append(r0);	 Catch:{ all -> 0x037e }
        r0 = "; ";
        r12.append(r0);	 Catch:{ all -> 0x037e }
        r0 = r12.toString();	 Catch:{ all -> 0x037e }
        r4.append(r0);	 Catch:{ all -> 0x037e }
    L_0x02e1:
        r0 = "Next section: ";
        r4.append(r0);	 Catch:{ all -> 0x037e }
        r0 = r5.e;	 Catch:{ all -> 0x037e }
        r7 = r5.i;	 Catch:{ all -> 0x037e }
        r8 = r5.g;	 Catch:{ all -> 0x037e }
        r5 = r5.h;	 Catch:{ all -> 0x037e }
        r5 = r5.size();	 Catch:{ all -> 0x037e }
        r9 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x037e }
        r9 = r9.length();	 Catch:{ all -> 0x037e }
        r9 = r9 + 54;
        r10 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x037e }
        r10 = r10.length();	 Catch:{ all -> 0x037e }
        r9 = r9 + r10;
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x037e }
        r10.<init>(r9);	 Catch:{ all -> 0x037e }
        r10.append(r0);	 Catch:{ all -> 0x037e }
        r0 = " , key=";
        r10.append(r0);	 Catch:{ all -> 0x037e }
        r10.append(r7);	 Catch:{ all -> 0x037e }
        r0 = ", count=";
        r10.append(r0);	 Catch:{ all -> 0x037e }
        r10.append(r8);	 Catch:{ all -> 0x037e }
        r0 = ", childrenSize=";
        r10.append(r0);	 Catch:{ all -> 0x037e }
        r10.append(r5);	 Catch:{ all -> 0x037e }
        r0 = "; ";
        r10.append(r0);	 Catch:{ all -> 0x037e }
        r0 = r10.toString();	 Catch:{ all -> 0x037e }
        r4.append(r0);	 Catch:{ all -> 0x037e }
        r0 = "Changes: [";
        r4.append(r0);	 Catch:{ all -> 0x037e }
        r0 = r6.a;	 Catch:{ all -> 0x037e }
    L_0x0338:
        r5 = r0.d;	 Catch:{ all -> 0x037e }
        if (r11 >= r5) goto L_0x036f;
    L_0x033c:
        r5 = r0.a(r11);	 Catch:{ all -> 0x037e }
        r6 = r5.a;	 Catch:{ all -> 0x037e }
        r7 = r5.b;	 Catch:{ all -> 0x037e }
        r5 = r5.c;	 Catch:{ all -> 0x037e }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x037e }
        r9 = 35;
        r8.<init>(r9);	 Catch:{ all -> 0x037e }
        r8.append(r6);	 Catch:{ all -> 0x037e }
        r6 = " ";
        r8.append(r6);	 Catch:{ all -> 0x037e }
        r8.append(r7);	 Catch:{ all -> 0x037e }
        r6 = " ";
        r8.append(r6);	 Catch:{ all -> 0x037e }
        r8.append(r5);	 Catch:{ all -> 0x037e }
        r5 = r8.toString();	 Catch:{ all -> 0x037e }
        r4.append(r5);	 Catch:{ all -> 0x037e }
        r5 = ", ";
        r4.append(r5);	 Catch:{ all -> 0x037e }
        r11 = r11 + 1;
        goto L_0x0338;
    L_0x036f:
        r0 = "]";
        r4.append(r0);	 Catch:{ all -> 0x037e }
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x037e }
        r4 = r4.toString();	 Catch:{ all -> 0x037e }
        r0.<init>(r4);	 Catch:{ all -> 0x037e }
        throw r0;	 Catch:{ all -> 0x037e }
    L_0x037e:
        r0 = move-exception;
        if (r20 == 0) goto L_0x0384;
    L_0x0381:
        defpackage.cno.c();	 Catch:{ all -> 0x03a2 }
    L_0x0384:
        throw r0;	 Catch:{ all -> 0x03a2 }
    L_0x0385:
        r0 = move-exception;
        r4 = r0;
        if (r20 == 0) goto L_0x038c;
    L_0x0389:
        defpackage.cno.c();	 Catch:{ all -> 0x03a2 }
    L_0x038c:
        throw r4;	 Catch:{ all -> 0x03a2 }
    L_0x038d:
        if (r7 == 0) goto L_0x0394;
    L_0x038f:
        if (r9 == 0) goto L_0x0394;
    L_0x0391:
        r7.e();	 Catch:{ all -> 0x03a2 }
    L_0x0394:
        if (r3 == 0) goto L_0x039e;
    L_0x0396:
        defpackage.cno.c();
        if (r2 == 0) goto L_0x039e;
    L_0x039b:
        defpackage.cno.c();
    L_0x039e:
        return;
    L_0x039f:
        r0 = move-exception;
        monitor-exit(r28);	 Catch:{ all -> 0x039f }
        throw r0;	 Catch:{ all -> 0x03a2 }
    L_0x03a2:
        r0 = move-exception;
        if (r3 == 0) goto L_0x03ad;
    L_0x03a5:
        defpackage.cno.c();
        if (r2 == 0) goto L_0x03ad;
    L_0x03aa:
        defpackage.cno.c();
    L_0x03ad:
        throw r0;
    L_0x03ae:
        r0 = move-exception;
        monitor-exit(r28);	 Catch:{ all -> 0x03ae }
        goto L_0x03b2;
    L_0x03b1:
        throw r0;
    L_0x03b2:
        goto L_0x03b1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwo.a(int, java.lang.Throwable):void");
    }

    private final synchronized boolean a(cwv cwv) {
        return cwv.b.equals(this.p.b);
    }

    private final void d(cwh cwh) {
        this.r.a(cwh.c, cwh, cwh.i);
        if (!cwh.b()) {
            List list = cwh.h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                d((cwh) list.get(i));
            }
        }
    }

    private final void e(cwh cwh) {
        cwj cwj = cwh.c;
        if (!cwh.b()) {
            List list = cwh.h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                e((cwh) list.get(i));
            }
        }
    }

    private final void a(Throwable th) {
        if (this.o) {
            boolean d = cno.d();
            if (d) {
                cno.a();
            }
            try {
                synchronized (this) {
                    boolean z = this.a;
                    a(this.f, this.q);
                    this.q.clear();
                }
                if (cro.a()) {
                    b();
                } else {
                    b.post(new cwp(this));
                }
                if (d) {
                    cno.c();
                }
            } catch (Throwable th2) {
                if (d) {
                    cno.c();
                }
            }
        } else if (cro.a()) {
            try {
                a();
            } catch (IndexOutOfBoundsException e) {
                String valueOf = String.valueOf(cwo.a(this));
                String valueOf2 = String.valueOf(e.getMessage());
                if (valueOf2.length() == 0) {
                    valueOf2 = new String(valueOf);
                } else {
                    valueOf2 = valueOf.concat(valueOf2);
                }
                throw new RuntimeException(valueOf2, e);
            }
        } else {
            b.obtainMessage(1, new cwq(this, th)).sendToTarget();
        }
    }

    public final void a() {
        if (this.o) {
            throw new IllegalStateException("Cannot use UIThread-only variant when background change sets are enabled.");
        }
        boolean d = cno.d();
        if (d) {
            cno.a();
        }
        try {
            List arrayList;
            cwh cwh;
            synchronized (this) {
                boolean z = this.a;
                arrayList = new ArrayList(this.q);
                this.q.clear();
                cwh = this.f;
            }
            a(cwh, arrayList);
            b();
            if (d) {
                cno.c();
            }
        } catch (Throwable th) {
            if (d) {
                cno.c();
            }
        }
    }

    public final void b() {
        cwd cwd = this.l;
        int i = cwd.b;
        if (i == 0 || i == 4 || i == 3) {
            cwd.a = false;
        }
    }

    private final void a(cwh cwh, List list) {
        boolean d = cno.d();
        if (d) {
            cno.a();
        }
        try {
            int size = list.size();
            cvx cvx = null;
            boolean z = false;
            for (int i = 0; i < size; i++) {
                cvx cvx2 = (cvx) list.get(i);
                if (cvx2.a() > 0) {
                    int a = cvx2.a();
                    boolean z2 = z;
                    for (int i2 = 0; i2 < a; i2++) {
                        cvy a2 = cvx2.a(i2);
                        switch (a2.a) {
                            case -3:
                                this.k.a(a2.b, a2.d);
                                break;
                            case -2:
                                this.k.b(a2.b, a2.d, a2.f);
                                break;
                            case -1:
                                this.k.a(a2.b, a2.d, a2.f);
                                break;
                            case 0:
                                this.k.b(a2.b, a2.c);
                                break;
                            case 1:
                                this.k.a(a2.b, a2.e);
                                break;
                            case 2:
                                this.k.b(a2.b, a2.e);
                                break;
                            case 3:
                                this.k.a(a2.b);
                                break;
                            default:
                                break;
                        }
                        z2 = true;
                    }
                    this.k.b();
                    z = z2;
                }
                cvx = cvx.a(cvx, cvx2);
            }
            if (cvx == null) {
                list = Collections.emptyList();
            } else {
                list = cvx.a;
            }
            this.k.a(z, new cws(this, z, d, cwh, new cwc(list)));
            if (d) {
                cno.c();
            }
        } catch (Throwable th) {
            if (d) {
                cno.c();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f A:{Catch:{ all -> 0x01af }} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0082 A:{Catch:{ all -> 0x01af }} */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c A:{Catch:{ all -> 0x01af }} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b A:{Catch:{ all -> 0x01af }} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f A:{Catch:{ all -> 0x01af }} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0082 A:{Catch:{ all -> 0x01af }} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A:{SYNTHETIC, RETURN} */
    private static void a(defpackage.cwj r17, defpackage.cwh r18, defpackage.cwh r19, java.util.Map r20, defpackage.cxd r21, java.lang.String r22) {
        /*
        r0 = r17;
        r1 = r18;
        r7 = r19;
        if (r7 == 0) goto L_0x01b7;
    L_0x0008:
        r8 = defpackage.cno.d();
        if (r8 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0029;
    L_0x000f:
        r2 = r7.e;
        r2 = java.lang.String.valueOf(r2);
        r3 = "createChildren:";
        r4 = r2.length();
        if (r4 != 0) goto L_0x0023;
    L_0x001d:
        r2 = new java.lang.String;
        r2.<init>(r3);
        goto L_0x0026;
    L_0x0023:
        r3.concat(r2);
    L_0x0026:
        defpackage.cno.a();
    L_0x0029:
        r2 = defpackage.cwj.a(r0, r7);	 Catch:{ all -> 0x01af }
        r7.c = r2;	 Catch:{ all -> 0x01af }
        if (r1 == 0) goto L_0x0035;
    L_0x0031:
        r2 = r1.g;	 Catch:{ all -> 0x01af }
        r7.g = r2;	 Catch:{ all -> 0x01af }
    L_0x0035:
        if (r1 == 0) goto L_0x0048;
    L_0x0037:
        r2 = r18.getClass();	 Catch:{ all -> 0x01af }
        r3 = r19.getClass();	 Catch:{ all -> 0x01af }
        r2 = r2.equals(r3);	 Catch:{ all -> 0x01af }
        if (r2 != 0) goto L_0x0046;
    L_0x0045:
        goto L_0x0048;
    L_0x0046:
        r2 = 1;
        goto L_0x0049;
    L_0x0048:
        r2 = 0;
    L_0x0049:
        if (r1 != 0) goto L_0x004c;
    L_0x004b:
        goto L_0x0051;
    L_0x004c:
        if (r2 == 0) goto L_0x0051;
    L_0x004e:
        r2 = r7.c;	 Catch:{ all -> 0x01af }
        goto L_0x0053;
    L_0x0051:
        r2 = r7.c;	 Catch:{ all -> 0x01af }
    L_0x0053:
        r2 = r7.i;	 Catch:{ all -> 0x01af }
        r10 = r20;
        r2 = r10.get(r2);	 Catch:{ all -> 0x01af }
        r2 = (java.util.List) r2;	 Catch:{ all -> 0x01af }
        if (r2 == 0) goto L_0x007c;
    L_0x005f:
        r3 = r2.size();	 Catch:{ all -> 0x01af }
        r4 = 0;
    L_0x0064:
        if (r4 >= r3) goto L_0x0072;
    L_0x0066:
        r5 = r2.get(r4);	 Catch:{ all -> 0x01af }
        r5 = (defpackage.cwl) r5;	 Catch:{ all -> 0x01af }
        r5.a();	 Catch:{ all -> 0x01af }
        r4 = r4 + 1;
        goto L_0x0064;
    L_0x0072:
        r2 = defpackage.cwm.a(r18, r19);	 Catch:{ all -> 0x01af }
        if (r2 != 0) goto L_0x0079;
    L_0x0078:
        goto L_0x007c;
    L_0x0079:
        defpackage.cwh.a(r19);	 Catch:{ all -> 0x01af }
    L_0x007c:
        r2 = r19.b();	 Catch:{ all -> 0x01af }
        if (r2 != 0) goto L_0x01a9;
    L_0x0082:
        r11 = 0;
        if (r1 == 0) goto L_0x0091;
    L_0x0085:
        r2 = r18.b();	 Catch:{ all -> 0x01af }
        if (r2 != 0) goto L_0x0091;
    L_0x008b:
        r1 = defpackage.cwh.c(r18);	 Catch:{ all -> 0x01af }
        r12 = r1;
        goto L_0x0092;
    L_0x0091:
        r12 = r11;
    L_0x0092:
        r13 = r0.l;	 Catch:{ all -> 0x01af }
        r1 = r0.d;	 Catch:{ all -> 0x01af }
        r2 = defpackage.cxa.a(r0, r11, r7);	 Catch:{ all -> 0x01af }
        r3 = r7.c;	 Catch:{ all -> 0x01af }
        r3 = r7.a(r3);	 Catch:{ all -> 0x01af }
        if (r3 != 0) goto L_0x00a8;
    L_0x00a2:
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x01af }
        r3.<init>();	 Catch:{ all -> 0x01af }
        goto L_0x00aa;
    L_0x00a8:
        r3 = r3.b;	 Catch:{ all -> 0x01af }
    L_0x00aa:
        r7.h = r3;	 Catch:{ all -> 0x01af }
        if (r1 != 0) goto L_0x00af;
    L_0x00ae:
        goto L_0x00b4;
    L_0x00af:
        if (r2 == 0) goto L_0x00b4;
    L_0x00b1:
        r1.e();	 Catch:{ all -> 0x01af }
    L_0x00b4:
        r14 = r7.h;	 Catch:{ all -> 0x01af }
        r15 = r14.size();	 Catch:{ all -> 0x01af }
        r6 = 0;
    L_0x00bb:
        if (r6 >= r15) goto L_0x01a3;
    L_0x00bd:
        r1 = r14.get(r6);	 Catch:{ all -> 0x01af }
        r3 = r1;
        r3 = (defpackage.cwh) r3;	 Catch:{ all -> 0x01af }
        r3.a = r7;	 Catch:{ all -> 0x01af }
        r1 = r3.j;	 Catch:{ all -> 0x01af }
        r2 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x01af }
        if (r2 != 0) goto L_0x0179;
    L_0x00ce:
        r2 = r7.i;	 Catch:{ all -> 0x01af }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x01af }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x01af }
        r4 = r1.length();	 Catch:{ all -> 0x01af }
        if (r4 != 0) goto L_0x00e4;
    L_0x00de:
        r1 = new java.lang.String;	 Catch:{ all -> 0x01af }
        r1.<init>(r2);	 Catch:{ all -> 0x01af }
        goto L_0x00e8;
    L_0x00e4:
        r1 = r2.concat(r1);	 Catch:{ all -> 0x01af }
    L_0x00e8:
        r2 = r7.c;	 Catch:{ all -> 0x01af }
        r4 = r2.i();	 Catch:{ all -> 0x01af }
        if (r4 == 0) goto L_0x0143;
    L_0x00f0:
        r5 = r4.c;	 Catch:{ all -> 0x01af }
        r5 = r5.p;	 Catch:{ all -> 0x01af }
        r5 = r5.a;	 Catch:{ all -> 0x01af }
        r5 = r5.contains(r1);	 Catch:{ all -> 0x01af }
        if (r5 == 0) goto L_0x0143;
    L_0x00fc:
        r5 = r3.e;	 Catch:{ all -> 0x01af }
        r9 = r4.d;	 Catch:{ all -> 0x01af }
        if (r9 != 0) goto L_0x0109;
    L_0x0102:
        r9 = new java.util.HashMap;	 Catch:{ all -> 0x01af }
        r9.<init>();	 Catch:{ all -> 0x01af }
        r4.d = r9;	 Catch:{ all -> 0x01af }
    L_0x0109:
        r9 = r4.d;	 Catch:{ all -> 0x01af }
        r9 = r9.containsKey(r5);	 Catch:{ all -> 0x01af }
        if (r9 == 0) goto L_0x011e;
    L_0x0111:
        r9 = r4.d;	 Catch:{ all -> 0x01af }
        r9 = r9.get(r5);	 Catch:{ all -> 0x01af }
        r9 = (java.lang.Integer) r9;	 Catch:{ all -> 0x01af }
        r9 = r9.intValue();	 Catch:{ all -> 0x01af }
        goto L_0x011f;
    L_0x011e:
        r9 = 0;
    L_0x011f:
        r4 = r4.d;	 Catch:{ all -> 0x01af }
        r16 = r9 + 1;
        r11 = java.lang.Integer.valueOf(r16);	 Catch:{ all -> 0x01af }
        r4.put(r5, r11);	 Catch:{ all -> 0x01af }
        r4 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x01af }
        r4 = r4.length();	 Catch:{ all -> 0x01af }
        r4 = r4 + 11;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01af }
        r5.<init>(r4);	 Catch:{ all -> 0x01af }
        r5.append(r1);	 Catch:{ all -> 0x01af }
        r5.append(r9);	 Catch:{ all -> 0x01af }
        r1 = r5.toString();	 Catch:{ all -> 0x01af }
    L_0x0143:
        r3.i = r1;	 Catch:{ all -> 0x01af }
        r2 = r2.p;	 Catch:{ all -> 0x01af }
        r2 = r2.a;	 Catch:{ all -> 0x01af }
        r2.add(r1);	 Catch:{ all -> 0x01af }
        r1 = defpackage.cwj.a(r0, r3);	 Catch:{ all -> 0x01af }
        r3.c = r1;	 Catch:{ all -> 0x01af }
        if (r12 == 0) goto L_0x015e;
    L_0x0154:
        r1 = r3.i;	 Catch:{ all -> 0x01af }
        r1 = r12.get(r1);	 Catch:{ all -> 0x01af }
        r11 = r1;
        r11 = (defpackage.zz) r11;	 Catch:{ all -> 0x01af }
        goto L_0x015f;
    L_0x015e:
        r11 = 0;
    L_0x015f:
        if (r11 == 0) goto L_0x0167;
    L_0x0161:
        r1 = r11.a;	 Catch:{ all -> 0x01af }
        r1 = (defpackage.cwh) r1;	 Catch:{ all -> 0x01af }
        r2 = r1;
        goto L_0x0168;
    L_0x0167:
        r2 = 0;
    L_0x0168:
        r1 = r17;
        r4 = r20;
        r5 = r21;
        r9 = r6;
        r6 = r22;
        defpackage.cwo.a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x01af }
        r6 = r9 + 1;
        r11 = 0;
        goto L_0x00bb;
    L_0x0179:
        r0 = r3.getClass();	 Catch:{ all -> 0x01af }
        r0 = r0.getSimpleName();	 Catch:{ all -> 0x01af }
        r1 = r0.length();	 Catch:{ all -> 0x01af }
        r1 = r1 + 53;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01af }
        r2.<init>(r1);	 Catch:{ all -> 0x01af }
        r1 = "Your Section ";
        r2.append(r1);	 Catch:{ all -> 0x01af }
        r2.append(r0);	 Catch:{ all -> 0x01af }
        r0 = " has an empty key. Please specify a key.";
        r2.append(r0);	 Catch:{ all -> 0x01af }
        r0 = r2.toString();	 Catch:{ all -> 0x01af }
        r1 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x01af }
        r1.<init>(r0);	 Catch:{ all -> 0x01af }
        throw r1;	 Catch:{ all -> 0x01af }
    L_0x01a3:
        r1 = r0.l;	 Catch:{ all -> 0x01af }
        if (r1 == r13) goto L_0x01a9;
    L_0x01a7:
        r0.l = r13;	 Catch:{ all -> 0x01af }
    L_0x01a9:
        if (r8 == 0) goto L_0x01ae;
    L_0x01ab:
        defpackage.cno.c();
    L_0x01ae:
        return;
    L_0x01af:
        r0 = move-exception;
        if (r8 != 0) goto L_0x01b3;
    L_0x01b2:
        goto L_0x01b6;
    L_0x01b3:
        defpackage.cno.c();
    L_0x01b6:
        throw r0;
    L_0x01b7:
        r0 = new java.lang.IllegalStateException;
        r1 = "Can't generate a subtree with a null root";
        r0.<init>(r1);
        goto L_0x01c0;
    L_0x01bf:
        throw r0;
    L_0x01c0:
        goto L_0x01bf;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwo.a(cwj, cwh, cwh, java.util.Map, cxd, java.lang.String):void");
    }

    private static synchronized Looper c() {
        Looper looper;
        synchronized (cwo.class) {
            if (i == null) {
                HandlerThread handlerThread = new HandlerThread("SectionChangeSetThread", cuj.g);
                handlerThread.start();
                i = handlerThread.getLooper();
            }
            looper = i;
        }
        return looper;
    }

    public static String a(cwo cwo) {
        String stringBuilder;
        synchronized (cwo) {
            Object obj;
            boolean z = cwo.a;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("tag: ");
            stringBuilder2.append(cwo.m);
            stringBuilder2.append(", currentSection.size: ");
            cwh cwh = cwo.f;
            String str = null;
            if (cwh == null) {
                obj = null;
            } else {
                obj = Integer.valueOf(cwh.g);
            }
            stringBuilder2.append(obj);
            stringBuilder2.append(", currentSection.name: ");
            cwh = cwo.f;
            stringBuilder2.append(cwh != null ? cwh.e : null);
            stringBuilder2.append(", nextSection.size: ");
            cwh = cwo.g;
            if (cwh == null) {
                obj = null;
            } else {
                obj = Integer.valueOf(cwh.g);
            }
            stringBuilder2.append(obj);
            stringBuilder2.append(", nextSection.name: ");
            cwh = cwo.g;
            if (cwh != null) {
                str = cwh.e;
            }
            stringBuilder2.append(str);
            stringBuilder2.append(", pendingChangeSets.size: ");
            stringBuilder2.append(cwo.q.size());
            stringBuilder2.append(", pendingStateUpdates.size: ");
            stringBuilder2.append(cwo.p.a.size());
            stringBuilder2.append(", pendingNonLazyStateUpdates.size: ");
            stringBuilder2.append(cwo.p.b.size());
            stringBuilder2.append("\n");
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    public /* synthetic */ cwo(cwr cwr) {
        boolean z = cwr.c;
        this.c = cwr.d;
        this.m = cwr.e;
        this.k = new cvv(cwr.b, this.h, this.m);
        this.o = this.k.a();
        this.l = new cwd();
        cwj cwj = new cwj(cwr.a);
        cwj.n = this;
        cwj.o = new cwx(this);
        this.j = cwj;
        this.q = new ArrayList();
        this.p = cwz.a();
        this.e = new cwu(this, new Handler(cwo.c()));
        cwu cwu = new cwu(this, b);
    }

    public final void a(int i) {
        this.l.b = 0;
    }
}

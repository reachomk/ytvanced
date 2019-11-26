package defpackage;

import android.os.Handler;

/* renamed from: aezw */
final class aezw {
    public final Handler a;
    public final aezx b;
    public final /* synthetic */ aezu c;
    private final Handler d;

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:15:0x0049, code skipped:
            if (java.lang.Math.abs(r1) < r5) goto L_0x004b;
     */
    /* JADX WARNING: Missing block: B:22:0x005e, code skipped:
            if (java.lang.Math.abs(r3) < r5) goto L_0x0060;
     */
    public final synchronized void a(defpackage.aezk r13) {
        /*
        r12 = this;
        monitor-enter(r12);
        r0 = r12.c;	 Catch:{ all -> 0x0090 }
        r0 = r0.c;	 Catch:{ all -> 0x0090 }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        goto L_0x0080;
    L_0x0009:
        r1 = r13.l;	 Catch:{ all -> 0x0090 }
        r3 = r0.l;	 Catch:{ all -> 0x0090 }
        r1 = defpackage.afan.b(r1, r3);	 Catch:{ all -> 0x0090 }
        r3 = r13.m;	 Catch:{ all -> 0x0090 }
        r5 = r0.m;	 Catch:{ all -> 0x0090 }
        r3 = defpackage.afan.b(r3, r5);	 Catch:{ all -> 0x0090 }
        r5 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x0090 }
        r6 = 50;
        r5 = r5.toMicros(r6);	 Catch:{ all -> 0x0090 }
        r7 = r13.g;	 Catch:{ all -> 0x0090 }
        r9 = r0.g;	 Catch:{ all -> 0x0090 }
        r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r11 != 0) goto L_0x0080;
    L_0x0029:
        r7 = r13.h;	 Catch:{ all -> 0x0090 }
        r9 = r0.h;	 Catch:{ all -> 0x0090 }
        r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r11 != 0) goto L_0x0080;
    L_0x0031:
        r7 = r13.i;	 Catch:{ all -> 0x0090 }
        r9 = r0.i;	 Catch:{ all -> 0x0090 }
        r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r11 != 0) goto L_0x0080;
    L_0x0039:
        r7 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r9 != 0) goto L_0x0043;
    L_0x0042:
        goto L_0x004b;
    L_0x0043:
        r1 = java.lang.Math.abs(r1);	 Catch:{ all -> 0x0090 }
        r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r9 >= 0) goto L_0x0080;
    L_0x004b:
        r1 = r13.m;	 Catch:{ all -> 0x0090 }
        r9 = r0.m;	 Catch:{ all -> 0x0090 }
        r11 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1));
        if (r11 != 0) goto L_0x0054;
    L_0x0053:
        goto L_0x0060;
    L_0x0054:
        r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r1 == 0) goto L_0x0080;
    L_0x0058:
        r1 = java.lang.Math.abs(r3);	 Catch:{ all -> 0x0090 }
        r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r3 >= 0) goto L_0x0080;
    L_0x0060:
        r1 = r13.n;	 Catch:{ all -> 0x0090 }
        r3 = r0.n;	 Catch:{ all -> 0x0090 }
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 != 0) goto L_0x0080;
    L_0x0068:
        r1 = r13.k;	 Catch:{ all -> 0x0090 }
        r2 = r0.k;	 Catch:{ all -> 0x0090 }
        if (r1 != r2) goto L_0x0080;
    L_0x006e:
        r1 = r13.b;	 Catch:{ all -> 0x0090 }
        r2 = r0.b;	 Catch:{ all -> 0x0090 }
        r1 = defpackage.amqq.a(r1, r2);	 Catch:{ all -> 0x0090 }
        if (r1 == 0) goto L_0x0080;
    L_0x0078:
        r1 = r13.o;	 Catch:{ all -> 0x0090 }
        r0 = r0.o;	 Catch:{ all -> 0x0090 }
        if (r1 != r0) goto L_0x0080;
    L_0x007e:
        monitor-exit(r12);
        return;
    L_0x0080:
        r0 = r12.c;	 Catch:{ all -> 0x0090 }
        r0.c = r13;	 Catch:{ all -> 0x0090 }
        r0 = r12.d;	 Catch:{ all -> 0x0090 }
        r1 = new aezz;	 Catch:{ all -> 0x0090 }
        r1.<init>(r12, r13);	 Catch:{ all -> 0x0090 }
        r0.post(r1);	 Catch:{ all -> 0x0090 }
        monitor-exit(r12);
        return;
    L_0x0090:
        r13 = move-exception;
        monitor-exit(r12);
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aezw.a(aezk):void");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(aezf aezf) {
        aezf aezf2 = this.c.b;
        if (aezf2 != null) {
            String str = aezf.b;
            if (str != null && str.equals(aezf2.b)) {
                str = aezf.a;
                if (str != null && str.equals(aezf2.a) && aezf.c == aezf2.c && aezf.d == aezf2.d && aezf.e == aezf2.e && aezf.g != -9223372036854775807L && aezf2.g != -9223372036854775807L && Math.abs(aezf.g - aezf2.g) < 100) {
                    return;
                }
            }
        }
        this.c.b = aezf;
        if (this.d.equals(this.a)) {
            this.a.post(new afab(this, aezf));
        } else {
            this.d.post(new afaa(this, aezf));
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, aevf aevf) {
        this.a.post(new afad(this, str, aevf));
    }

    /* synthetic */ aezw(aezu aezu, Handler handler, aezx aezx, Handler handler2) {
        this.c = aezu;
        this.a = handler;
        this.b = aezx;
        this.d = handler2;
    }
}

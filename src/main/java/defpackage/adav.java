package defpackage;

import java.util.concurrent.Callable;

/* renamed from: adav */
final /* synthetic */ class adav implements Callable {
    private final adas a;

    adav(adas adas) {
        this.a = adas;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e7 A:{SYNTHETIC, Splitter:B:22:0x00e7} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009a A:{Catch:{ Exception -> 0x00fa, all -> 0x0198 }} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0190 A:{Catch:{ Exception -> 0x00fa, all -> 0x0198 }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0092 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|(2:12|13)|14|15|(3:17|(1:19)(1:20)|21)(5:22|23|(1:25)|29|(1:31)(1:32))|33|(1:35)) */
    public final java.lang.Object call() {
        /*
        r14 = this;
        r0 = r14.a;
        r1 = r0.h;	 Catch:{ all -> 0x0198 }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0198 }
        r4 = r1.c;	 Catch:{ all -> 0x0198 }
        r2 = r2 - r4;
        r4 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r1 = ": ";
        r6 = 0;
        r7 = 1;
        r8 = 2;
        r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r9 <= 0) goto L_0x0066;
    L_0x0016:
        r2 = defpackage.adas.a;	 Catch:{ all -> 0x0198 }
        r3 = java.util.Locale.US;	 Catch:{ all -> 0x0198 }
        r4 = "Message: %s is older than %dms. Dropping.";
        r5 = new java.lang.Object[r8];	 Catch:{ all -> 0x0198 }
        r9 = r0.h;	 Catch:{ all -> 0x0198 }
        r9 = r9.a;	 Catch:{ all -> 0x0198 }
        r9 = java.lang.String.valueOf(r9);	 Catch:{ all -> 0x0198 }
        r10 = r0.h;	 Catch:{ all -> 0x0198 }
        r10 = r10.b;	 Catch:{ all -> 0x0198 }
        r10 = r10.toString();	 Catch:{ all -> 0x0198 }
        r11 = r9.length();	 Catch:{ all -> 0x0198 }
        r11 = r11 + r8;
        r8 = java.lang.String.valueOf(r10);	 Catch:{ all -> 0x0198 }
        r8 = r8.length();	 Catch:{ all -> 0x0198 }
        r11 = r11 + r8;
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0198 }
        r8.<init>(r11);	 Catch:{ all -> 0x0198 }
        r8.append(r9);	 Catch:{ all -> 0x0198 }
        r8.append(r1);	 Catch:{ all -> 0x0198 }
        r8.append(r10);	 Catch:{ all -> 0x0198 }
        r1 = r8.toString();	 Catch:{ all -> 0x0198 }
        r5[r6] = r1;	 Catch:{ all -> 0x0198 }
        r1 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ all -> 0x0198 }
        r5[r7] = r1;	 Catch:{ all -> 0x0198 }
        r1 = java.lang.String.format(r3, r4, r5);	 Catch:{ all -> 0x0198 }
        defpackage.xtl.c(r2, r1);	 Catch:{ all -> 0x0198 }
        r1 = r0.d;	 Catch:{ all -> 0x0198 }
        r1.poll();	 Catch:{ all -> 0x0198 }
        goto L_0x0193;
    L_0x0066:
        r2 = r0.h;	 Catch:{ all -> 0x0198 }
        r3 = r2.a;	 Catch:{ all -> 0x0198 }
        r2 = r2.b;	 Catch:{ all -> 0x0198 }
        r9 = r0.q;	 Catch:{ all -> 0x0198 }
        r9 = r9.getCount();	 Catch:{ all -> 0x0198 }
        r11 = 0;
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 != 0) goto L_0x0082;
    L_0x0078:
        r9 = r0.r;	 Catch:{ all -> 0x0198 }
        r9 = r9.getCount();	 Catch:{ all -> 0x0198 }
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 == 0) goto L_0x0092;
    L_0x0082:
        r9 = r0.r;	 Catch:{ InterruptedException -> 0x0092 }
        r10 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x0092 }
        r9.await(r4, r10);	 Catch:{ InterruptedException -> 0x0092 }
        r4 = r0.q;	 Catch:{ InterruptedException -> 0x0092 }
        r5 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x0092 }
        r9 = 5;
        r4.await(r9, r5);	 Catch:{ InterruptedException -> 0x0092 }
    L_0x0092:
        r4 = r0.n;	 Catch:{ all -> 0x0198 }
        r4 = r4.get();	 Catch:{ all -> 0x0198 }
        if (r4 != 0) goto L_0x00e7;
    L_0x009a:
        r4 = r0.d;	 Catch:{ all -> 0x0198 }
        r4.poll();	 Catch:{ all -> 0x0198 }
        r4 = defpackage.adas.a;	 Catch:{ all -> 0x0198 }
        r5 = java.util.Locale.US;	 Catch:{ all -> 0x0198 }
        r9 = "Dropping call for method: %s, because %s.";
        r10 = new java.lang.Object[r8];	 Catch:{ all -> 0x0198 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0198 }
        r2 = r2.toString();	 Catch:{ all -> 0x0198 }
        r11 = r3.length();	 Catch:{ all -> 0x0198 }
        r11 = r11 + r8;
        r8 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0198 }
        r8 = r8.length();	 Catch:{ all -> 0x0198 }
        r11 = r11 + r8;
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0198 }
        r8.<init>(r11);	 Catch:{ all -> 0x0198 }
        r8.append(r3);	 Catch:{ all -> 0x0198 }
        r8.append(r1);	 Catch:{ all -> 0x0198 }
        r8.append(r2);	 Catch:{ all -> 0x0198 }
        r1 = r8.toString();	 Catch:{ all -> 0x0198 }
        r10[r6] = r1;	 Catch:{ all -> 0x0198 }
        r1 = r0.f();	 Catch:{ all -> 0x0198 }
        if (r1 == 0) goto L_0x00da;
    L_0x00d7:
        r1 = " still connecting, but not done";
        goto L_0x00dc;
    L_0x00da:
        r1 = " not connected";
    L_0x00dc:
        r10[r7] = r1;	 Catch:{ all -> 0x0198 }
        r1 = java.lang.String.format(r5, r9, r10);	 Catch:{ all -> 0x0198 }
        defpackage.xtl.c(r4, r1);	 Catch:{ all -> 0x0198 }
        goto L_0x018c;
    L_0x00e7:
        r4 = r0.i;	 Catch:{ Exception -> 0x00fa }
        r4 = r4.a(r3, r2);	 Catch:{ Exception -> 0x00fa }
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r4 != r5) goto L_0x012e;
    L_0x00f1:
        r4 = r0.d;	 Catch:{ Exception -> 0x00fa }
        r4.poll();	 Catch:{ Exception -> 0x00fa }
        r0.p = r6;	 Catch:{ Exception -> 0x00fa }
        goto L_0x018c;
    L_0x00fa:
        r4 = move-exception;
        r5 = defpackage.adas.a;	 Catch:{ all -> 0x0198 }
        r9 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0198 }
        r10 = r2.toString();	 Catch:{ all -> 0x0198 }
        r11 = r9.length();	 Catch:{ all -> 0x0198 }
        r11 = r11 + 35;
        r12 = java.lang.String.valueOf(r10);	 Catch:{ all -> 0x0198 }
        r12 = r12.length();	 Catch:{ all -> 0x0198 }
        r11 = r11 + r12;
        r12 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0198 }
        r12.<init>(r11);	 Catch:{ all -> 0x0198 }
        r11 = "Exception while sending message: ";
        r12.append(r11);	 Catch:{ all -> 0x0198 }
        r12.append(r9);	 Catch:{ all -> 0x0198 }
        r12.append(r1);	 Catch:{ all -> 0x0198 }
        r12.append(r10);	 Catch:{ all -> 0x0198 }
        r9 = r12.toString();	 Catch:{ all -> 0x0198 }
        defpackage.xtl.a(r5, r9, r4);	 Catch:{ all -> 0x0198 }
    L_0x012e:
        r4 = r0.p;	 Catch:{ all -> 0x0198 }
        r4 = r4 + r7;
        r0.p = r4;	 Catch:{ all -> 0x0198 }
        if (r4 >= r8) goto L_0x0150;
    L_0x0135:
        r1 = defpackage.adas.a;	 Catch:{ all -> 0x0198 }
        r2 = r0.p;	 Catch:{ all -> 0x0198 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0198 }
        r4 = 50;
        r3.<init>(r4);	 Catch:{ all -> 0x0198 }
        r4 = "Increasing recent errors and retrying: ";
        r3.append(r4);	 Catch:{ all -> 0x0198 }
        r3.append(r2);	 Catch:{ all -> 0x0198 }
        r2 = r3.toString();	 Catch:{ all -> 0x0198 }
        defpackage.xtl.c(r1, r2);	 Catch:{ all -> 0x0198 }
        goto L_0x018c;
    L_0x0150:
        r4 = defpackage.adas.a;	 Catch:{ all -> 0x0198 }
        r5 = java.util.Locale.US;	 Catch:{ all -> 0x0198 }
        r9 = "Too many errors on sending %s. Reconnecting...";
        r10 = new java.lang.Object[r7];	 Catch:{ all -> 0x0198 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0198 }
        r2 = r2.toString();	 Catch:{ all -> 0x0198 }
        r11 = r3.length();	 Catch:{ all -> 0x0198 }
        r11 = r11 + r8;
        r8 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0198 }
        r8 = r8.length();	 Catch:{ all -> 0x0198 }
        r11 = r11 + r8;
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0198 }
        r8.<init>(r11);	 Catch:{ all -> 0x0198 }
        r8.append(r3);	 Catch:{ all -> 0x0198 }
        r8.append(r1);	 Catch:{ all -> 0x0198 }
        r8.append(r2);	 Catch:{ all -> 0x0198 }
        r1 = r8.toString();	 Catch:{ all -> 0x0198 }
        r10[r6] = r1;	 Catch:{ all -> 0x0198 }
        r1 = java.lang.String.format(r5, r9, r10);	 Catch:{ all -> 0x0198 }
        defpackage.xtl.c(r4, r1);	 Catch:{ all -> 0x0198 }
        r0.i();	 Catch:{ all -> 0x0198 }
    L_0x018c:
        r1 = r0.s;	 Catch:{ all -> 0x0198 }
        if (r1 == 0) goto L_0x0193;
    L_0x0190:
        r1.cancel(r7);	 Catch:{ all -> 0x0198 }
    L_0x0193:
        r0.h();
        r0 = 0;
        return r0;
    L_0x0198:
        r1 = move-exception;
        r0.h();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adav.call():java.lang.Object");
    }
}

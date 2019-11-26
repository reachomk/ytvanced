package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bcwd */
final class bcwd extends AtomicLong implements bcuc, bcuo {
    public static final long serialVersionUID = -2557562030197141021L;
    private final bcup a;
    private final bcvy b;
    private Object[] c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;

    public bcwd(bcup bcup, bcvy bcvy) {
        this.a = bcup;
        this.b = bcvy;
    }

    public final void a(long j) {
        long j2;
        long j3;
        do {
            j2 = get();
            if (j2 >= 0) {
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } else {
                return;
            }
        } while (!compareAndSet(j2, j3));
        a();
    }

    public final boolean c() {
        return get() < 0;
    }

    public final void b() {
        if (get() >= 0 && getAndSet(-1) >= 0) {
            bcvy bcvy = this.b;
            synchronized (bcvy.b) {
                bcwd[] bcwdArr = bcvy.c;
                int length = bcwdArr.length;
                int i = 0;
                while (i < length) {
                    if (bcwdArr[i].equals(this)) {
                        break;
                    }
                    i++;
                }
                i = -1;
                if (i < 0) {
                } else if (length != 1) {
                    bcwd[] bcwdArr2 = new bcwd[(length - 1)];
                    System.arraycopy(bcwdArr, 0, bcwdArr2, 0, i);
                    System.arraycopy(bcwdArr, i + 1, bcwdArr2, i, (length - i) - 1);
                    bcvy.c = bcwdArr2;
                } else {
                    bcvy.c = bcvy.d;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:99:0x00df  */
    /* JADX WARNING: Missing block: B:11:?, code skipped:
            r2 = r15.a;
     */
    /* JADX WARNING: Missing block: B:12:0x0010, code skipped:
            r3 = get();
     */
    /* JADX WARNING: Missing block: B:13:0x0018, code skipped:
            if (r3 < 0) goto L_0x00d9;
     */
    /* JADX WARNING: Missing block: B:14:0x001a, code skipped:
            r7 = r15.b.g;
     */
    /* JADX WARNING: Missing block: B:15:0x001e, code skipped:
            if (r7 == 0) goto L_0x00c4;
     */
    /* JADX WARNING: Missing block: B:16:0x0020, code skipped:
            r8 = r15.c;
     */
    /* JADX WARNING: Missing block: B:17:0x0022, code skipped:
            if (r8 != null) goto L_0x002a;
     */
    /* JADX WARNING: Missing block: B:18:0x0024, code skipped:
            r8 = r15.b.f;
            r15.c = r8;
     */
    /* JADX WARNING: Missing block: B:19:0x002a, code skipped:
            r9 = r8.length - 1;
            r10 = r15.e;
            r11 = r15.d;
     */
    /* JADX WARNING: Missing block: B:20:0x0033, code skipped:
            if (r3 != 0) goto L_0x0058;
     */
    /* JADX WARNING: Missing block: B:21:0x0035, code skipped:
            r3 = r8[r11];
     */
    /* JADX WARNING: Missing block: B:22:0x003b, code skipped:
            if (defpackage.bcwf.b(r3) == false) goto L_0x0047;
     */
    /* JADX WARNING: Missing block: B:23:0x003d, code skipped:
            r2.bM_();
     */
    /* JADX WARNING: Missing block: B:25:?, code skipped:
            b();
     */
    /* JADX WARNING: Missing block: B:26:0x0043, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:27:0x0044, code skipped:
            r2 = th;
     */
    /* JADX WARNING: Missing block: B:30:0x004b, code skipped:
            if (defpackage.bcwf.c(r3) == false) goto L_0x00c4;
     */
    /* JADX WARNING: Missing block: B:31:0x004d, code skipped:
            r2.a(defpackage.bcwf.f(r3));
     */
    /* JADX WARNING: Missing block: B:33:?, code skipped:
            b();
     */
    /* JADX WARNING: Missing block: B:34:0x0057, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:36:0x005a, code skipped:
            if (r3 <= 0) goto L_0x00c4;
     */
    /* JADX WARNING: Missing block: B:37:0x005c, code skipped:
            r12 = 0;
     */
    /* JADX WARNING: Missing block: B:38:0x005d, code skipped:
            if (r10 < r7) goto L_0x0060;
     */
    /* JADX WARNING: Missing block: B:40:0x0062, code skipped:
            if (r3 <= 0) goto L_0x00b1;
     */
    /* JADX WARNING: Missing block: B:43:0x0068, code skipped:
            if (r2.c() != false) goto L_0x00b0;
     */
    /* JADX WARNING: Missing block: B:44:0x006a, code skipped:
            if (r11 == r9) goto L_0x006d;
     */
    /* JADX WARNING: Missing block: B:46:0x006d, code skipped:
            r8 = (java.lang.Object[]) r8[r9];
            r11 = 0;
     */
    /* JADX WARNING: Missing block: B:47:0x0074, code skipped:
            r13 = r8[r11];
     */
    /* JADX WARNING: Missing block: B:50:0x007a, code skipped:
            if (defpackage.bcwf.a(r2, r13) != false) goto L_0x0086;
     */
    /* JADX WARNING: Missing block: B:51:0x007c, code skipped:
            r11 = r11 + 1;
            r10 = r10 + 1;
            r3 = r3 - 1;
            r12 = r12 + 1;
     */
    /* JADX WARNING: Missing block: B:53:?, code skipped:
            b();
     */
    /* JADX WARNING: Missing block: B:54:0x0089, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:55:0x008a, code skipped:
            r3 = th;
     */
    /* JADX WARNING: Missing block: B:56:0x008b, code skipped:
            r4 = true;
     */
    /* JADX WARNING: Missing block: B:57:0x008d, code skipped:
            r3 = th;
     */
    /* JADX WARNING: Missing block: B:58:0x008e, code skipped:
            r4 = false;
     */
    /* JADX WARNING: Missing block: B:60:?, code skipped:
            defpackage.bcva.b(r3);
     */
    /* JADX WARNING: Missing block: B:62:?, code skipped:
            b();
     */
    /* JADX WARNING: Missing block: B:66:0x00a1, code skipped:
            r2.a(defpackage.bcvh.a(r3, defpackage.bcwf.e(r13)));
     */
    /* JADX WARNING: Missing block: B:67:0x00ac, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:68:0x00ad, code skipped:
            r2 = th;
     */
    /* JADX WARNING: Missing block: B:69:0x00ae, code skipped:
            r1 = r4;
     */
    /* JADX WARNING: Missing block: B:70:0x00b0, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:73:0x00b5, code skipped:
            if (r2.c() != false) goto L_0x00c3;
     */
    /* JADX WARNING: Missing block: B:74:0x00b7, code skipped:
            r15.e = r10;
            r15.d = r11;
            r15.c = r8;
            addAndGet(-((long) r12));
     */
    /* JADX WARNING: Missing block: B:75:0x00c3, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:76:0x00c4, code skipped:
            monitor-enter(r15);
     */
    /* JADX WARNING: Missing block: B:79:0x00c7, code skipped:
            if (r15.g != false) goto L_0x00cf;
     */
    /* JADX WARNING: Missing block: B:80:0x00c9, code skipped:
            r15.f = false;
     */
    /* JADX WARNING: Missing block: B:82:?, code skipped:
            monitor-exit(r15);
     */
    /* JADX WARNING: Missing block: B:83:0x00cc, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:84:0x00cd, code skipped:
            r2 = th;
     */
    /* JADX WARNING: Missing block: B:86:?, code skipped:
            r15.g = false;
     */
    /* JADX WARNING: Missing block: B:87:0x00d1, code skipped:
            monitor-exit(r15);
     */
    /* JADX WARNING: Missing block: B:89:0x00d4, code skipped:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:90:0x00d5, code skipped:
            r2 = r1;
            r1 = false;
     */
    /* JADX WARNING: Missing block: B:92:?, code skipped:
            monitor-exit(r15);
     */
    /* JADX WARNING: Missing block: B:94:?, code skipped:
            throw r2;
     */
    /* JADX WARNING: Missing block: B:95:0x00d9, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:96:0x00da, code skipped:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:97:0x00db, code skipped:
            r2 = r1;
            r1 = false;
     */
    /* JADX WARNING: Missing block: B:98:0x00dd, code skipped:
            if (r1 == false) goto L_0x00df;
     */
    /* JADX WARNING: Missing block: B:99:0x00df, code skipped:
            monitor-enter(r15);
     */
    /* JADX WARNING: Missing block: B:101:?, code skipped:
            r15.f = false;
     */
    /* JADX WARNING: Missing block: B:107:0x00e7, code skipped:
            throw r2;
     */
    public final void a() {
        /*
        r15 = this;
        monitor-enter(r15);
        r0 = r15.f;	 Catch:{ all -> 0x00e8 }
        r1 = 1;
        if (r0 == 0) goto L_0x000a;
    L_0x0006:
        r15.g = r1;	 Catch:{ all -> 0x00e8 }
        monitor-exit(r15);	 Catch:{ all -> 0x00e8 }
        return;
    L_0x000a:
        r15.f = r1;	 Catch:{ all -> 0x00e8 }
        monitor-exit(r15);	 Catch:{ all -> 0x00e8 }
        r0 = 0;
        r2 = r15.a;	 Catch:{ all -> 0x00da }
    L_0x0010:
        r3 = r15.get();	 Catch:{ all -> 0x00da }
        r5 = 0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 < 0) goto L_0x00d9;
    L_0x001a:
        r7 = r15.b;	 Catch:{ all -> 0x00da }
        r7 = r7.g;	 Catch:{ all -> 0x00da }
        if (r7 == 0) goto L_0x00c4;
    L_0x0020:
        r8 = r15.c;	 Catch:{ all -> 0x00da }
        if (r8 != 0) goto L_0x002a;
    L_0x0024:
        r8 = r15.b;	 Catch:{ all -> 0x00da }
        r8 = r8.f;	 Catch:{ all -> 0x00da }
        r15.c = r8;	 Catch:{ all -> 0x00da }
    L_0x002a:
        r9 = r8.length;	 Catch:{ all -> 0x00da }
        r9 = r9 + -1;
        r10 = r15.e;	 Catch:{ all -> 0x00da }
        r11 = r15.d;	 Catch:{ all -> 0x00da }
        r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r12 != 0) goto L_0x0058;
    L_0x0035:
        r3 = r8[r11];	 Catch:{ all -> 0x00da }
        r4 = defpackage.bcwf.b(r3);	 Catch:{ all -> 0x00da }
        if (r4 == 0) goto L_0x0047;
    L_0x003d:
        r2.bM_();	 Catch:{ all -> 0x00da }
        r15.b();	 Catch:{ all -> 0x0044 }
        return;
    L_0x0044:
        r2 = move-exception;
        goto L_0x00dd;
    L_0x0047:
        r4 = defpackage.bcwf.c(r3);	 Catch:{ all -> 0x00da }
        if (r4 == 0) goto L_0x00c4;
    L_0x004d:
        r3 = defpackage.bcwf.f(r3);	 Catch:{ all -> 0x00da }
        r2.a(r3);	 Catch:{ all -> 0x00da }
        r15.b();	 Catch:{ all -> 0x0044 }
        return;
    L_0x0058:
        r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r12 <= 0) goto L_0x00c4;
    L_0x005c:
        r12 = 0;
    L_0x005d:
        if (r10 < r7) goto L_0x0060;
    L_0x005f:
        goto L_0x00b1;
    L_0x0060:
        r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r13 <= 0) goto L_0x00b1;
    L_0x0064:
        r13 = r2.c();	 Catch:{ all -> 0x00da }
        if (r13 != 0) goto L_0x00b0;
    L_0x006a:
        if (r11 == r9) goto L_0x006d;
    L_0x006c:
        goto L_0x0074;
    L_0x006d:
        r8 = r8[r9];	 Catch:{ all -> 0x00da }
        r8 = (java.lang.Object[]) r8;	 Catch:{ all -> 0x00da }
        r8 = (java.lang.Object[]) r8;	 Catch:{ all -> 0x00da }
        r11 = 0;
    L_0x0074:
        r13 = r8[r11];	 Catch:{ all -> 0x00da }
        r14 = defpackage.bcwf.a(r2, r13);	 Catch:{ all -> 0x008d }
        if (r14 != 0) goto L_0x0086;
    L_0x007c:
        r11 = r11 + 1;
        r10 = r10 + 1;
        r13 = -1;
        r3 = r3 + r13;
        r12 = r12 + 1;
        goto L_0x005d;
    L_0x0086:
        r15.b();	 Catch:{ all -> 0x008a }
        return;
    L_0x008a:
        r3 = move-exception;
        r4 = 1;
        goto L_0x008f;
    L_0x008d:
        r3 = move-exception;
        r4 = 0;
    L_0x008f:
        defpackage.bcva.b(r3);	 Catch:{ all -> 0x00ad }
        r15.b();	 Catch:{ all -> 0x0044 }
        r4 = defpackage.bcwf.c(r13);	 Catch:{ all -> 0x0044 }
        if (r4 != 0) goto L_0x00ac;
    L_0x009b:
        r4 = defpackage.bcwf.b(r13);	 Catch:{ all -> 0x0044 }
        if (r4 != 0) goto L_0x00ac;
    L_0x00a1:
        r4 = defpackage.bcwf.e(r13);	 Catch:{ all -> 0x0044 }
        r3 = defpackage.bcvh.a(r3, r4);	 Catch:{ all -> 0x0044 }
        r2.a(r3);	 Catch:{ all -> 0x0044 }
    L_0x00ac:
        return;
    L_0x00ad:
        r2 = move-exception;
        r1 = r4;
        goto L_0x00dd;
    L_0x00b0:
        return;
    L_0x00b1:
        r3 = r2.c();	 Catch:{ all -> 0x00da }
        if (r3 != 0) goto L_0x00c3;
    L_0x00b7:
        r15.e = r10;	 Catch:{ all -> 0x00da }
        r15.d = r11;	 Catch:{ all -> 0x00da }
        r15.c = r8;	 Catch:{ all -> 0x00da }
        r3 = (long) r12;	 Catch:{ all -> 0x00da }
        r3 = -r3;
        r15.addAndGet(r3);	 Catch:{ all -> 0x00da }
        goto L_0x00c4;
    L_0x00c3:
        return;
    L_0x00c4:
        monitor-enter(r15);	 Catch:{ all -> 0x00da }
        r3 = r15.g;	 Catch:{ all -> 0x00d4 }
        if (r3 != 0) goto L_0x00cf;
    L_0x00c9:
        r15.f = r0;	 Catch:{ all -> 0x00d4 }
        monitor-exit(r15);	 Catch:{ all -> 0x00cd }
        return;
    L_0x00cd:
        r2 = move-exception;
        goto L_0x00d7;
    L_0x00cf:
        r15.g = r0;	 Catch:{ all -> 0x00d4 }
        monitor-exit(r15);	 Catch:{ all -> 0x00d4 }
        goto L_0x0010;
    L_0x00d4:
        r1 = move-exception;
        r2 = r1;
        r1 = 0;
    L_0x00d7:
        monitor-exit(r15);	 Catch:{ all -> 0x00cd }
        throw r2;	 Catch:{ all -> 0x0044 }
    L_0x00d9:
        return;
    L_0x00da:
        r1 = move-exception;
        r2 = r1;
        r1 = 0;
    L_0x00dd:
        if (r1 != 0) goto L_0x00e7;
    L_0x00df:
        monitor-enter(r15);
        r15.f = r0;	 Catch:{ all -> 0x00e4 }
        monitor-exit(r15);	 Catch:{ all -> 0x00e4 }
        goto L_0x00e7;
    L_0x00e4:
        r0 = move-exception;
        monitor-exit(r15);	 Catch:{ all -> 0x00e4 }
        throw r0;
    L_0x00e7:
        throw r2;
    L_0x00e8:
        r0 = move-exception;
        monitor-exit(r15);	 Catch:{ all -> 0x00e8 }
        goto L_0x00ec;
    L_0x00eb:
        throw r0;
    L_0x00ec:
        goto L_0x00eb;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcwd.a():void");
    }
}

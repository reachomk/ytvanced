package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bcwz */
final class bcwz extends AtomicLong implements bcuc {
    public static final long serialVersionUID = -8730475647105475802L;
    private final bcup a;
    private final Iterator b;

    bcwz(bcup bcup, Iterator it) {
        this.a = bcup;
        this.b = it;
    }

    /* JADX WARNING: Missing block: B:55:0x0099, code skipped:
            r4 = defpackage.bcvu.b((java.util.concurrent.atomic.AtomicLong) r8, r9);
     */
    /* JADX WARNING: Missing block: B:56:0x009f, code skipped:
            if (r4 == 0) goto L_0x00a2;
     */
    public final void a(long r9) {
        /*
        r8 = this;
        r0 = r8.get();
        r2 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 == 0) goto L_0x00a2;
    L_0x000d:
        r0 = 0;
        r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x004a;
    L_0x0013:
        r2 = r8.compareAndSet(r0, r2);
        if (r2 == 0) goto L_0x004a;
    L_0x0019:
        r9 = r8.a;
        r10 = r8.b;
    L_0x001d:
        r0 = r9.c();
        if (r0 != 0) goto L_0x00a2;
    L_0x0023:
        r0 = r10.next();	 Catch:{ all -> 0x0045 }
        r9.e_(r0);
        r0 = r9.c();
        if (r0 != 0) goto L_0x00a2;
    L_0x0030:
        r0 = r10.hasNext();	 Catch:{ all -> 0x0040 }
        if (r0 != 0) goto L_0x001d;
    L_0x0036:
        r10 = r9.c();
        if (r10 != 0) goto L_0x00a2;
    L_0x003c:
        r9.bM_();
        goto L_0x00a2;
    L_0x0040:
        r10 = move-exception;
        defpackage.bcva.a(r10, r9);
        return;
    L_0x0045:
        r10 = move-exception;
        defpackage.bcva.a(r10, r9);
        return;
    L_0x004a:
        r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x00a2;
    L_0x004e:
        r2 = defpackage.bcvu.a(r8, r9);
        r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r4 != 0) goto L_0x00a2;
    L_0x0056:
        r2 = r8.a;
        r3 = r8.b;
        r4 = r9;
    L_0x005b:
        r9 = r0;
    L_0x005c:
        r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));
        if (r6 == 0) goto L_0x0091;
    L_0x0060:
        r6 = r2.c();
        if (r6 != 0) goto L_0x00a2;
    L_0x0066:
        r6 = r3.next();	 Catch:{ all -> 0x008c }
        r2.e_(r6);
        r6 = r2.c();
        if (r6 != 0) goto L_0x00a2;
    L_0x0073:
        r6 = r3.hasNext();	 Catch:{ all -> 0x0087 }
        if (r6 == 0) goto L_0x007d;
    L_0x0079:
        r6 = 1;
        r9 = r9 + r6;
        goto L_0x005c;
    L_0x007d:
        r9 = r2.c();
        if (r9 != 0) goto L_0x00a2;
    L_0x0083:
        r2.bM_();
        return;
    L_0x0087:
        r9 = move-exception;
        defpackage.bcva.a(r9, r2);
        return;
    L_0x008c:
        r9 = move-exception;
        defpackage.bcva.a(r9, r2);
        return;
    L_0x0091:
        r4 = r8.get();
        r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));
        if (r6 != 0) goto L_0x005c;
    L_0x0099:
        r4 = defpackage.bcvu.b(r8, r9);
        r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r9 == 0) goto L_0x00a2;
    L_0x00a1:
        goto L_0x005b;
    L_0x00a2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcwz.a(long):void");
    }
}

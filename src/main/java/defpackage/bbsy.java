package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbsy */
final class bbsy extends AtomicReference implements bbmo {
    public static final long serialVersionUID = -4823716997131257941L;
    private final bbsx a;
    private final int b;

    bbsy(bbsx bbsx, int i) {
        this.a = bbsx;
        this.b = i;
    }

    public final void a(bbnc bbnc) {
        bbnz.b(this, bbnc);
    }

    public final void b_(Object obj) {
        this.a.a(this.b, obj);
    }

    public final void a(Throwable th) {
        bbsx bbsx = this.a;
        if (bbyw.a(bbsx.g, th)) {
            bbsx.a();
            bbsx.b();
            return;
        }
        bbzf.a(th);
    }

    /* JADX WARNING: Missing block: B:10:0x0016, code skipped:
            if (r4 == r2.length) goto L_0x0018;
     */
    /* JADX WARNING: Missing block: B:13:0x001b, code skipped:
            if (r1 != null) goto L_0x0020;
     */
    /* JADX WARNING: Missing block: B:14:0x001d, code skipped:
            r0.a();
     */
    /* JADX WARNING: Missing block: B:15:0x0020, code skipped:
            r0.b();
     */
    /* JADX WARNING: Missing block: B:16:0x0023, code skipped:
            return;
     */
    public final void a() {
        /*
        r5 = this;
        r0 = r5.a;
        r1 = r5.b;
        monitor-enter(r0);
        r2 = r0.c;	 Catch:{ all -> 0x0024 }
        if (r2 != 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r0);	 Catch:{ all -> 0x0024 }
        return;
    L_0x000b:
        r1 = r2[r1];	 Catch:{ all -> 0x0024 }
        r3 = 1;
        if (r1 == 0) goto L_0x0018;
    L_0x0010:
        r4 = r0.h;	 Catch:{ all -> 0x0024 }
        r4 = r4 + r3;
        r0.h = r4;	 Catch:{ all -> 0x0024 }
        r2 = r2.length;	 Catch:{ all -> 0x0024 }
        if (r4 != r2) goto L_0x001a;
    L_0x0018:
        r0.f = r3;	 Catch:{ all -> 0x0024 }
    L_0x001a:
        monitor-exit(r0);	 Catch:{ all -> 0x0024 }
        if (r1 != 0) goto L_0x0020;
    L_0x001d:
        r0.a();
    L_0x0020:
        r0.b();
        return;
    L_0x0024:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0024 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbsy.a():void");
    }
}

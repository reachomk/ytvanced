package defpackage;

import java.util.concurrent.Callable;

/* renamed from: cne */
final class cne implements Callable {
    private final /* synthetic */ cmg a;
    private final /* synthetic */ cma b;
    private final /* synthetic */ int c;
    private final /* synthetic */ int d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ cpg f;
    private final /* synthetic */ csq g;
    private final /* synthetic */ int h;
    private final /* synthetic */ String i;
    private final /* synthetic */ cnb j;

    cne(cnb cnb, cmg cmg, cma cma, int i, int i2, boolean z, cpg cpg, csq csq, int i3, String str) {
        this.j = cnb;
        this.a = cmg;
        this.b = cma;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = cpg;
        this.g = csq;
        this.h = i3;
        this.i = str;
    }

    /* JADX WARNING: Missing block: B:8:0x000d, code skipped:
            r0 = r13.j.d.a(r13.a, r13.b, r13.c, r13.d, r13.e, r13.f, r13.g, r13.h, r13.i);
            r1 = r13.j;
     */
    /* JADX WARNING: Missing block: B:9:0x0029, code skipped:
            monitor-enter(r1);
     */
    /* JADX WARNING: Missing block: B:12:0x002e, code skipped:
            if (r13.j.b == false) goto L_0x0032;
     */
    /* JADX WARNING: Missing block: B:13:0x0030, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:15:0x0032, code skipped:
            r13.j.c = r0;
     */
    /* JADX WARNING: Missing block: B:16:0x0036, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            return r0;
     */
    /* JADX WARNING: Missing block: B:30:?, code skipped:
            return null;
     */
    public final /* synthetic */ java.lang.Object call() {
        /*
        r13 = this;
        r0 = r13.j;
        monitor-enter(r0);
        r1 = r13.j;	 Catch:{ all -> 0x003c }
        r1 = r1.b;	 Catch:{ all -> 0x003c }
        r2 = 0;
        if (r1 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r0);	 Catch:{ all -> 0x003c }
        goto L_0x0038;
    L_0x000c:
        monitor-exit(r0);	 Catch:{ all -> 0x003c }
        r0 = r13.j;
        r3 = r0.d;
        r4 = r13.a;
        r5 = r13.b;
        r6 = r13.c;
        r7 = r13.d;
        r8 = r13.e;
        r9 = r13.f;
        r10 = r13.g;
        r11 = r13.h;
        r12 = r13.i;
        r0 = r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12);
        r1 = r13.j;
        monitor-enter(r1);
        r3 = r13.j;	 Catch:{ all -> 0x0039 }
        r3 = r3.b;	 Catch:{ all -> 0x0039 }
        if (r3 == 0) goto L_0x0032;
    L_0x0030:
        monitor-exit(r1);	 Catch:{ all -> 0x0039 }
        goto L_0x0038;
    L_0x0032:
        r2 = r13.j;	 Catch:{ all -> 0x0039 }
        r2.c = r0;	 Catch:{ all -> 0x0039 }
        monitor-exit(r1);	 Catch:{ all -> 0x0039 }
        r2 = r0;
    L_0x0038:
        return r2;
    L_0x0039:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0039 }
        throw r0;
    L_0x003c:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003c }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cne.call():java.lang.Object");
    }
}

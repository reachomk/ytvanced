package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: aecm */
public final class aecm implements aeci, aike, aikg {
    private final bcaa a;
    private final Set b = new CopyOnWriteArraySet();
    private boolean c;

    public aecm(bcaa bcaa) {
        this.a = bcaa;
    }

    public final void a(aech aech) {
        this.b.add(aech);
        c(aech);
        a();
    }

    public final void b(aech aech) {
        this.b.remove(aech);
        b();
    }

    public final void a(int i, int i2) {
        c();
    }

    public final void a(int i, int i2, int i3) {
        if (i == 0) {
            c();
        }
    }

    public final void a(int i) {
        c();
    }

    public final void b(int i, int i2, int i3) {
        if (i == 0) {
            c();
        }
    }

    /* JADX WARNING: Missing block: B:10:0x0021, code skipped:
            return;
     */
    private final synchronized void a() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.c;	 Catch:{ all -> 0x0022 }
        if (r0 != 0) goto L_0x0020;
    L_0x0005:
        r0 = r1.b;	 Catch:{ all -> 0x0022 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0022 }
        if (r0 != 0) goto L_0x0020;
    L_0x000d:
        r0 = r1.a;	 Catch:{ all -> 0x0022 }
        r0 = r0.get();	 Catch:{ all -> 0x0022 }
        r0 = (defpackage.aikc) r0;	 Catch:{ all -> 0x0022 }
        r0.a(r1);	 Catch:{ all -> 0x0022 }
        r0.a(r1);	 Catch:{ all -> 0x0022 }
        r0 = 1;
        r1.c = r0;	 Catch:{ all -> 0x0022 }
        monitor-exit(r1);
        return;
    L_0x0020:
        monitor-exit(r1);
        return;
    L_0x0022:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aecm.a():void");
    }

    /* JADX WARNING: Missing block: B:10:0x0021, code skipped:
            return;
     */
    private final synchronized void b() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.c;	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x0020;
    L_0x0005:
        r0 = r1.b;	 Catch:{ all -> 0x0022 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x0020;
    L_0x000d:
        r0 = r1.a;	 Catch:{ all -> 0x0022 }
        r0 = r0.get();	 Catch:{ all -> 0x0022 }
        r0 = (defpackage.aikc) r0;	 Catch:{ all -> 0x0022 }
        r0.b(r1);	 Catch:{ all -> 0x0022 }
        r0.b(r1);	 Catch:{ all -> 0x0022 }
        r0 = 0;
        r1.c = r0;	 Catch:{ all -> 0x0022 }
        monitor-exit(r1);
        return;
    L_0x0020:
        monitor-exit(r1);
        return;
    L_0x0022:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aecm.b():void");
    }

    private final void c() {
        for (aech c : this.b) {
            c(c);
        }
    }

    private final void c(aech aech) {
        aikc aikc = (aikc) this.a.get();
        aech.a(Math.max(0, aikc.e()), aikc.a(0));
    }
}

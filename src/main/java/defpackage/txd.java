package defpackage;

import android.util.Log;

/* renamed from: txd */
public final class txd {
    private static final txd b = new txd(new twu());
    private static volatile boolean c = true;
    private static volatile txd d = b;
    public final txg a;

    private txd(txg txg) {
        this.a = (txg) uhy.a((Object) txg);
    }

    /* JADX WARNING: Missing block: B:9:0x0022, code skipped:
            return r1;
     */
    public static synchronized defpackage.txd a(defpackage.tti r3) {
        /*
        r0 = defpackage.txd.class;
        monitor-enter(r0);
        r1 = d;	 Catch:{ all -> 0x0038 }
        r2 = b;	 Catch:{ all -> 0x0038 }
        if (r1 != r2) goto L_0x002a;
    L_0x0009:
        r1 = defpackage.tyo.b;	 Catch:{ all -> 0x0023 }
        r2 = defpackage.tup.b();	 Catch:{ all -> 0x0023 }
        r1.a = r2;	 Catch:{ all -> 0x0023 }
        r1 = new txd;	 Catch:{ all -> 0x0023 }
        r3 = r3.a();	 Catch:{ all -> 0x0023 }
        r1.<init>(r3);	 Catch:{ all -> 0x0023 }
        d = r1;	 Catch:{ all -> 0x0023 }
        r3 = defpackage.tyo.b;	 Catch:{ all -> 0x0038 }
        r3.a();	 Catch:{ all -> 0x0038 }
        monitor-exit(r0);
        return r1;
    L_0x0023:
        r3 = move-exception;
        r1 = defpackage.tyo.b;	 Catch:{ all -> 0x0038 }
        r1.a();	 Catch:{ all -> 0x0038 }
        throw r3;	 Catch:{ all -> 0x0038 }
    L_0x002a:
        r3 = "Primes";
        r1 = "Primes.initialize() is called more than once. This call will be ignored.";
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0038 }
        defpackage.tyv.b(r3, r1, r2);	 Catch:{ all -> 0x0038 }
        r3 = d;	 Catch:{ all -> 0x0038 }
        monitor-exit(r0);
        return r3;
    L_0x0038:
        r3 = move-exception;
        monitor-exit(r0);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txd.a(tti):txd");
    }

    public static txd a() {
        if (d == b && c) {
            c = false;
            Log.w("Primes", tyv.a("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.", new Object[0]));
        }
        return d;
    }
}

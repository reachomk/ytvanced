package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aecx */
public final class aecx implements aepl, amro {
    private final zzf a;
    private final bcaa b;
    private final xta c;
    private final bapu d;
    private final SharedPreferences e;
    private final Map f;
    private amro g = aeda.a;

    aecx(zzf zzf, bcaa bcaa, xta xta, bapu bapu, SharedPreferences sharedPreferences) {
        this.a = zzf;
        this.b = bcaa;
        this.c = xta;
        this.d = bapu;
        this.e = sharedPreferences;
        this.f = new HashMap();
    }

    public final long a() {
        return ((Long) this.g.get()).longValue();
    }

    /* JADX WARNING: Missing block: B:35:0x00ab, code skipped:
            return r3;
     */
    /* renamed from: b */
    public final synchronized defpackage.oww get() {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r9.a;	 Catch:{ all -> 0x00b0 }
        r0 = r0.k();	 Catch:{ all -> 0x00b0 }
        r1 = r0.c;	 Catch:{ all -> 0x00b0 }
        r1 = defpackage.arhd.a(r1);	 Catch:{ all -> 0x00b0 }
        r2 = 0;
        if (r1 == 0) goto L_0x0016;
    L_0x0010:
        r3 = 2;
        if (r1 == r3) goto L_0x0014;
    L_0x0013:
        goto L_0x0016;
    L_0x0014:
        monitor-exit(r9);
        return r2;
    L_0x0016:
        r1 = r9.b;	 Catch:{ all -> 0x00b0 }
        if (r1 == 0) goto L_0x00ae;
    L_0x001a:
        r1 = r1.get();	 Catch:{ all -> 0x00b0 }
        r1 = (java.io.File) r1;	 Catch:{ all -> 0x00b0 }
        if (r1 == 0) goto L_0x00ac;
    L_0x0022:
        r3 = r9.f;	 Catch:{ all -> 0x00b0 }
        r3 = r3.get(r1);	 Catch:{ all -> 0x00b0 }
        r3 = (defpackage.oww) r3;	 Catch:{ all -> 0x00b0 }
        if (r3 != 0) goto L_0x00aa;
    L_0x002c:
        r3 = new java.io.File;	 Catch:{ all -> 0x00b0 }
        r4 = "exo";
        r3.<init>(r1, r4);	 Catch:{ all -> 0x00b0 }
        defpackage.afhs.a(r3);	 Catch:{ all -> 0x00b0 }
        r3 = new oxu;	 Catch:{ all -> 0x00b0 }
        r4 = new java.io.File;	 Catch:{ all -> 0x00b0 }
        r5 = "exo";
        r4.<init>(r1, r5);	 Catch:{ all -> 0x00b0 }
        r5 = r9.a;	 Catch:{ all -> 0x00b0 }
        r5 = r5.k();	 Catch:{ all -> 0x00b0 }
        r6 = r5.c;	 Catch:{ all -> 0x00b0 }
        r6 = defpackage.arhd.a(r6);	 Catch:{ all -> 0x00b0 }
        if (r6 == 0) goto L_0x004e;
    L_0x004d:
        goto L_0x004f;
    L_0x004e:
        r6 = 1;
    L_0x004f:
        r6 = r6 + -1;
        r7 = 3;
        if (r6 == r7) goto L_0x0065;
    L_0x0054:
        r6 = new aedb;	 Catch:{ all -> 0x00b0 }
        r6.<init>(r9, r5);	 Catch:{ all -> 0x00b0 }
        r9.g = r6;	 Catch:{ all -> 0x00b0 }
        r6 = new oxs;	 Catch:{ all -> 0x00b0 }
        r7 = r9.a(r5);	 Catch:{ all -> 0x00b0 }
        r6.<init>(r7);	 Catch:{ all -> 0x00b0 }
        goto L_0x008a;
    L_0x0065:
        r6 = new aevk;	 Catch:{ all -> 0x00b0 }
        r7 = r9.b;	 Catch:{ all -> 0x00b0 }
        r7.getClass();	 Catch:{ all -> 0x00b0 }
        r8 = new aecz;	 Catch:{ all -> 0x00b0 }
        r8.<init>(r7);	 Catch:{ all -> 0x00b0 }
        r7 = r5.d;	 Catch:{ all -> 0x00b0 }
        if (r7 != 0) goto L_0x0077;
    L_0x0075:
        r7 = defpackage.argz.e;	 Catch:{ all -> 0x00b0 }
    L_0x0077:
        r5 = r5.e;	 Catch:{ all -> 0x00b0 }
        if (r5 != 0) goto L_0x007d;
    L_0x007b:
        r5 = defpackage.argz.e;	 Catch:{ all -> 0x00b0 }
    L_0x007d:
        r6.<init>(r8, r7, r5);	 Catch:{ all -> 0x00b0 }
        r6.getClass();	 Catch:{ all -> 0x00b0 }
        r5 = new aedc;	 Catch:{ all -> 0x00b0 }
        r5.<init>(r6);	 Catch:{ all -> 0x00b0 }
        r9.g = r5;	 Catch:{ all -> 0x00b0 }
    L_0x008a:
        r5 = r0.f;	 Catch:{ all -> 0x00b0 }
        if (r5 == 0) goto L_0x00a0;
    L_0x008e:
        r2 = r9.d;	 Catch:{ all -> 0x00b0 }
        r2 = r2.get();	 Catch:{ all -> 0x00b0 }
        r2 = (defpackage.xsf) r2;	 Catch:{ all -> 0x00b0 }
        r5 = r9.e;	 Catch:{ all -> 0x00b0 }
        r2 = r2.a(r5);	 Catch:{ all -> 0x00b0 }
        r2 = r2.getEncoded();	 Catch:{ all -> 0x00b0 }
    L_0x00a0:
        r0 = r0.g;	 Catch:{ all -> 0x00b0 }
        r3.<init>(r4, r6, r2, r0);	 Catch:{ all -> 0x00b0 }
        r0 = r9.f;	 Catch:{ all -> 0x00b0 }
        r0.put(r1, r3);	 Catch:{ all -> 0x00b0 }
    L_0x00aa:
        monitor-exit(r9);
        return r3;
    L_0x00ac:
        monitor-exit(r9);
        return r2;
    L_0x00ae:
        monitor-exit(r9);
        return r2;
    L_0x00b0:
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aecx.get():oww");
    }

    public final long a(arhb arhb) {
        long a = xvw.a(arhb.b, 67108864);
        long a2 = xvw.a(arhb.b, 268435456);
        double a3 = (double) xta.a();
        Double.isNaN(a3);
        return a3 * 0.1d > ((double) a2) ? a2 : a;
    }
}

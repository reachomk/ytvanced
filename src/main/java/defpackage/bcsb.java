package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: bcsb */
public final class bcsb extends bcpn implements Serializable {
    private static HashMap a = null;
    public static final long serialVersionUID = -1934618396111902255L;
    private final bcpm b;
    private final bcpx c;

    /* JADX WARNING: Missing block: B:10:0x001e, code skipped:
            if (r1.c == r5) goto L_0x0020;
     */
    public static synchronized defpackage.bcsb a(defpackage.bcpm r4, defpackage.bcpx r5) {
        /*
        r0 = defpackage.bcsb.class;
        monitor-enter(r0);
        r1 = a;	 Catch:{ all -> 0x0031 }
        r2 = 0;
        if (r1 != 0) goto L_0x0011;
    L_0x0008:
        r1 = new java.util.HashMap;	 Catch:{ all -> 0x0031 }
        r3 = 7;
        r1.<init>(r3);	 Catch:{ all -> 0x0031 }
        a = r1;	 Catch:{ all -> 0x0031 }
        goto L_0x0021;
    L_0x0011:
        r1 = a;	 Catch:{ all -> 0x0031 }
        r1 = r1.get(r4);	 Catch:{ all -> 0x0031 }
        r1 = (defpackage.bcsb) r1;	 Catch:{ all -> 0x0031 }
        if (r1 != 0) goto L_0x001c;
    L_0x001b:
        goto L_0x0020;
    L_0x001c:
        r3 = r1.c;	 Catch:{ all -> 0x0031 }
        if (r3 != r5) goto L_0x0021;
    L_0x0020:
        r2 = r1;
    L_0x0021:
        if (r2 != 0) goto L_0x002f;
    L_0x0023:
        r1 = new bcsb;	 Catch:{ all -> 0x0031 }
        r1.<init>(r4, r5);	 Catch:{ all -> 0x0031 }
        r5 = a;	 Catch:{ all -> 0x0031 }
        r5.put(r4, r1);	 Catch:{ all -> 0x0031 }
        monitor-exit(r0);
        return r1;
    L_0x002f:
        monitor-exit(r0);
        return r2;
    L_0x0031:
        r4 = move-exception;
        monitor-exit(r0);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcsb.a(bcpm, bcpx):bcsb");
    }

    public final boolean c() {
        return false;
    }

    public final bcpx e() {
        return null;
    }

    public final bcpx f() {
        return null;
    }

    public final String toString() {
        return "UnsupportedDateTimeField";
    }

    private bcsb(bcpm bcpm, bcpx bcpx) {
        if (bcpm == null || bcpx == null) {
            throw new IllegalArgumentException();
        }
        this.b = bcpm;
        this.c = bcpx;
    }

    public final bcpm a() {
        return this.b;
    }

    public final String b() {
        return this.b.x;
    }

    public final int a(long j) {
        throw i();
    }

    public final String a(long j, Locale locale) {
        throw i();
    }

    public final String a(int i, Locale locale) {
        throw i();
    }

    public final String b(long j, Locale locale) {
        throw i();
    }

    public final String b(int i, Locale locale) {
        throw i();
    }

    public final long a(long j, int i) {
        return this.c.a(j, i);
    }

    public final long b(long j, int i) {
        throw i();
    }

    public final long a(long j, String str, Locale locale) {
        throw i();
    }

    public final bcpx d() {
        return this.c;
    }

    public final boolean b(long j) {
        throw i();
    }

    public final int g() {
        throw i();
    }

    public final int h() {
        throw i();
    }

    public final int a(Locale locale) {
        throw i();
    }

    public final long c(long j) {
        throw i();
    }

    public final long d(long j) {
        throw i();
    }

    private final Object readResolve() {
        return bcsb.a(this.b, this.c);
    }

    private final UnsupportedOperationException i() {
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 21);
        stringBuilder.append(valueOf);
        stringBuilder.append(" field is unsupported");
        return new UnsupportedOperationException(stringBuilder.toString());
    }
}
